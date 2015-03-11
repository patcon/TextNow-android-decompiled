package com.mopub.mobileads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.common.util.ResponseHeader;
import com.mopub.common.util.Streams;
import com.mopub.mobileads.factories.HttpClientFactory;
import com.mopub.mobileads.util.HttpResponses;
import com.mopub.mobileads.util.Interstitials;
import com.mopub.mobileads.util.Mraids;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

class MraidDisplayController extends MraidAbstractController
{
  private static final int CLOSE_BUTTON_SIZE_DP = 50;
  private static final String[] DATE_FORMATS = { "yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ" };
  private static final String LOGTAG = "MraidDisplayController";
  private static final int MAX_NUMBER_DAYS_IN_MONTH = 31;
  private static final long VIEWABILITY_TIMER_MILLIS = 3000L;
  private FrameLayout mAdContainerLayout;
  private boolean mAdWantsCustomCloseButton;
  private ImageView mCloseButton;
  private final View.OnClickListener mCloseOnClickListener;
  protected float mDensity;
  private RelativeLayout mExpansionLayout;
  private final MraidView.ExpansionStyle mExpansionStyle;
  private Handler mHandler = new Handler();
  private final MraidView.NativeCloseButtonStyle mNativeCloseButtonStyle;
  private MraidDisplayController.OrientationBroadcastReceiver mOrientationBroadcastReceiver = new MraidDisplayController.OrientationBroadcastReceiver(this);
  private final int mOriginalRequestedOrientation;
  private FrameLayout mPlaceholderView;
  private FrameLayout mRootView;
  protected int mScreenHeight = -1;
  protected int mScreenWidth = -1;
  private MraidView mTwoPartExpansionView;
  private int mViewIndexInParent;
  private MraidView.ViewState mViewState = MraidView.ViewState.HIDDEN;

  MraidDisplayController(MraidView paramMraidView, MraidView.ExpansionStyle paramExpansionStyle, MraidView.NativeCloseButtonStyle paramNativeCloseButtonStyle)
  {
    super(paramMraidView);
    this.mExpansionStyle = paramExpansionStyle;
    this.mNativeCloseButtonStyle = paramNativeCloseButtonStyle;
    Context localContext = getContext();
    if ((localContext instanceof Activity));
    for (int i = ((Activity)localContext).getRequestedOrientation(); ; i = -1)
    {
      this.mOriginalRequestedOrientation = i;
      initialize();
      this.mCloseOnClickListener = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          MraidDisplayController.this.close();
        }
      };
      this.mAdContainerLayout = createAdContainerLayout();
      this.mExpansionLayout = createExpansionLayout();
      this.mPlaceholderView = createPlaceholderView();
      return;
    }
  }

  private String dayNumberToDayOfMonthString(int paramInt)
  {
    if ((paramInt != 0) && (paramInt >= -31) && (paramInt <= 31))
      return "" + paramInt;
    throw new IllegalArgumentException("invalid day of month " + paramInt);
  }

  private String dayNumberToDayOfWeekString(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("invalid day of week " + paramInt);
    case 0:
      return "SU";
    case 1:
      return "MO";
    case 2:
      return "TU";
    case 3:
      return "WE";
    case 4:
      return "TH";
    case 5:
      return "FR";
    case 6:
    }
    return "SA";
  }

  private void downloadImage(final String paramString)
  {
    final File localFile = getPictureStoragePath();
    localFile.mkdirs();
    new Thread(new Runnable()
    {
      private MediaScannerConnection mediaScannerConnection;
      private InputStream pictureInputStream;
      private OutputStream pictureOutputStream;
      private URI uri;

      private void loadPictureIntoGalleryApp(String paramAnonymousString)
      {
        MraidDisplayController.MoPubMediaScannerConnectionClient localMoPubMediaScannerConnectionClient = new MraidDisplayController.MoPubMediaScannerConnectionClient(MraidDisplayController.this, paramAnonymousString, null, null);
        this.mediaScannerConnection = new MediaScannerConnection(MraidDisplayController.this.getContext().getApplicationContext(), localMoPubMediaScannerConnectionClient);
        MraidDisplayController.MoPubMediaScannerConnectionClient.access$500(localMoPubMediaScannerConnectionClient, this.mediaScannerConnection);
        this.mediaScannerConnection.connect();
      }

      public void run()
      {
        try
        {
          this.uri = URI.create(paramString);
          HttpResponse localHttpResponse = HttpClientFactory.create().execute(new HttpGet(this.uri));
          this.pictureInputStream = localHttpResponse.getEntity().getContent();
          String str1 = HttpResponses.extractHeader(localHttpResponse, ResponseHeader.LOCATION);
          if (str1 != null)
            this.uri = URI.create(str1);
          String str2 = MraidDisplayController.this.getFileNameForUriAndHttpResponse(this.uri, localHttpResponse);
          File localFile = new File(localFile, str2);
          String str3 = localFile.toString();
          this.pictureOutputStream = new FileOutputStream(localFile);
          Streams.copyContent(this.pictureInputStream, this.pictureOutputStream);
          loadPictureIntoGalleryApp(str3);
          return;
        }
        catch (Exception localException)
        {
          MraidDisplayController.this.mHandler.post(new Runnable()
          {
            public void run()
            {
              MraidDisplayController.this.showUserToast("Image failed to download.");
              MraidDisplayController.this.getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.STORE_PICTURE, "Error downloading and saving image file.");
              MoPubLog.d("Error downloading and saving image file.");
            }
          });
          return;
        }
        finally
        {
          Streams.closeStream(this.pictureInputStream);
          Streams.closeStream(this.pictureOutputStream);
        }
      }
    }).start();
  }

  private void expandLayouts(View paramView, int paramInt1, int paramInt2)
  {
    int i = (int)(0.5F + 50.0F * this.mDensity);
    if (paramInt1 < i)
      paramInt1 = i;
    if (paramInt2 < i)
      paramInt2 = i;
    View localView = new View(getContext());
    localView.setBackgroundColor(0);
    localView.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        return true;
      }
    });
    this.mExpansionLayout.addView(localView, new RelativeLayout.LayoutParams(-1, -1));
    this.mAdContainerLayout.addView(paramView, new RelativeLayout.LayoutParams(-1, -1));
    addCloseEventRegion(this.mAdContainerLayout);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams.addRule(13);
    this.mExpansionLayout.addView(this.mAdContainerLayout, localLayoutParams);
  }

  private Context getContext()
  {
    return getMraidView().getContext();
  }

  private int getDisplayRotation()
  {
    return ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getOrientation();
  }

  private String getFileNameForUriAndHttpResponse(URI paramURI, HttpResponse paramHttpResponse)
  {
    String str1 = paramURI.getPath();
    String str2;
    if (str1 == null)
      str2 = null;
    label158: 
    while (true)
    {
      return str2;
      str2 = new File(str1).getName();
      Header localHeader = paramHttpResponse.getFirstHeader("Content-Type");
      if (localHeader != null)
      {
        String[] arrayOfString = localHeader.getValue().split(";");
        int i = arrayOfString.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label158;
          String str3 = arrayOfString[j];
          if (str3.contains("image/"))
          {
            String str4 = "." + str3.split("/")[1];
            if (str2.endsWith(str4))
              break;
            return str2 + str4;
          }
        }
      }
    }
  }

  private File getPictureStoragePath()
  {
    return new File(Environment.getExternalStorageDirectory(), "Pictures");
  }

  private void initialize()
  {
    this.mViewState = MraidView.ViewState.LOADING;
    initializeScreenMetrics();
    this.mOrientationBroadcastReceiver.register(getContext());
  }

  private void initializeScreenMetrics()
  {
    Context localContext = getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.mDensity = localDisplayMetrics.density;
    int j;
    int i;
    if ((localContext instanceof Activity))
    {
      Window localWindow = ((Activity)localContext).getWindow();
      Rect localRect = new Rect();
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect);
      j = localRect.top;
      i = localWindow.findViewById(16908290).getTop() - j;
    }
    while (true)
    {
      int k = localDisplayMetrics.widthPixels;
      int m = localDisplayMetrics.heightPixels - j - i;
      this.mScreenWidth = ((int)(k * (160.0D / localDisplayMetrics.densityDpi)));
      this.mScreenHeight = ((int)(m * (160.0D / localDisplayMetrics.densityDpi)));
      return;
      i = 0;
      j = 0;
    }
  }

  private void onOrientationChanged(int paramInt)
  {
    initializeScreenMetrics();
    getMraidView().fireChangeEventForProperty(MraidScreenSizeProperty.createWithSize(this.mScreenWidth, this.mScreenHeight));
  }

  private Date parseDate(String paramString)
  {
    Object localObject = null;
    int i = 0;
    while (true)
    {
      if (i < DATE_FORMATS.length);
      try
      {
        Date localDate = new SimpleDateFormat(DATE_FORMATS[i]).parse(paramString);
        localObject = localDate;
        if (localObject != null)
          return localObject;
      }
      catch (ParseException localParseException)
      {
        i++;
      }
    }
  }

  private String parseRecurrenceRule(Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1;
    if (paramMap.containsKey("frequency"))
    {
      str1 = (String)paramMap.get("frequency");
      if (!paramMap.containsKey("interval"))
        break label405;
    }
    label405: for (int i = Integer.parseInt((String)paramMap.get("interval")); ; i = -1)
    {
      if ("daily".equals(str1))
      {
        localStringBuilder.append("FREQ=DAILY;");
        if (i != -1)
          localStringBuilder.append("INTERVAL=" + i + ";");
      }
      while (true)
      {
        return localStringBuilder.toString();
        if ("weekly".equals(str1))
        {
          localStringBuilder.append("FREQ=WEEKLY;");
          if (i != -1)
            localStringBuilder.append("INTERVAL=" + i + ";");
          if (paramMap.containsKey("daysInWeek"))
          {
            String str3 = translateWeekIntegersToDays((String)paramMap.get("daysInWeek"));
            if (str3 == null)
              throw new IllegalArgumentException("invalid ");
            localStringBuilder.append("BYDAY=" + str3 + ";");
          }
        }
        else
        {
          if (!"monthly".equals(str1))
            break;
          localStringBuilder.append("FREQ=MONTHLY;");
          if (i != -1)
            localStringBuilder.append("INTERVAL=" + i + ";");
          if (paramMap.containsKey("daysInMonth"))
          {
            String str2 = translateMonthIntegersToDays((String)paramMap.get("daysInMonth"));
            if (str2 == null)
              throw new IllegalArgumentException();
            localStringBuilder.append("BYMONTHDAY=" + str2 + ";");
          }
        }
      }
      throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
    }
  }

  private void resetViewToDefaultState()
  {
    setNativeCloseButtonEnabled(false);
    this.mAdContainerLayout.removeAllViewsInLayout();
    this.mExpansionLayout.removeAllViewsInLayout();
    this.mRootView.removeView(this.mExpansionLayout);
    getMraidView().requestLayout();
    ViewGroup localViewGroup = (ViewGroup)this.mPlaceholderView.getParent();
    localViewGroup.addView(getMraidView(), this.mViewIndexInParent);
    localViewGroup.removeView(this.mPlaceholderView);
    localViewGroup.invalidate();
  }

  private void setOrientationLockEnabled(boolean paramBoolean)
  {
    Context localContext = getContext();
    try
    {
      Activity localActivity = (Activity)localContext;
      if (paramBoolean);
      for (int i = localActivity.getResources().getConfiguration().orientation; ; i = this.mOriginalRequestedOrientation)
      {
        localActivity.setRequestedOrientation(i);
        return;
      }
    }
    catch (ClassCastException localClassCastException)
    {
    }
  }

  private void showUserDialog(final String paramString)
  {
    new AlertDialog.Builder(getContext()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", null).setPositiveButton("Okay", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        MraidDisplayController.this.downloadImage(paramString);
      }
    }).setCancelable(true).show();
  }

  private void showUserToast(final String paramString)
  {
    this.mHandler.post(new Runnable()
    {
      public void run()
      {
        Toast.makeText(MraidDisplayController.this.getContext(), paramString, 0).show();
      }
    });
  }

  private void swapViewWithPlaceholderView()
  {
    ViewGroup localViewGroup = (ViewGroup)getMraidView().getParent();
    if (localViewGroup == null)
      return;
    int i = localViewGroup.getChildCount();
    for (int j = 0; (j < i) && (localViewGroup.getChildAt(j) != getMraidView()); j++);
    this.mViewIndexInParent = j;
    localViewGroup.addView(this.mPlaceholderView, j, new ViewGroup.LayoutParams(getMraidView().getWidth(), getMraidView().getHeight()));
    localViewGroup.removeView(getMraidView());
  }

  private Map<String, Object> translateJSParamsToAndroidCalendarEventMapping(Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap();
    if ((!paramMap.containsKey("description")) || (!paramMap.containsKey("start")))
      throw new IllegalArgumentException("Missing start and description fields");
    localHashMap.put("title", paramMap.get("description"));
    if ((paramMap.containsKey("start")) && (paramMap.get("start") != null))
    {
      Date localDate1 = parseDate((String)paramMap.get("start"));
      if (localDate1 != null)
      {
        localHashMap.put("beginTime", Long.valueOf(localDate1.getTime()));
        if ((paramMap.containsKey("end")) && (paramMap.get("end") != null))
        {
          Date localDate2 = parseDate((String)paramMap.get("end"));
          if (localDate2 == null)
            break label344;
          localHashMap.put("endTime", Long.valueOf(localDate2.getTime()));
        }
        if (paramMap.containsKey("location"))
          localHashMap.put("eventLocation", paramMap.get("location"));
        if (paramMap.containsKey("summary"))
          localHashMap.put("description", paramMap.get("summary"));
        if (paramMap.containsKey("transparency"))
          if (!((String)paramMap.get("transparency")).equals("transparent"))
            break label355;
      }
    }
    label344: label355: for (int i = 1; ; i = 0)
    {
      localHashMap.put("availability", Integer.valueOf(i));
      localHashMap.put("rrule", parseRecurrenceRule(paramMap));
      return localHashMap;
      throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
      throw new IllegalArgumentException("Invalid calendar event: start is null.");
      throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
    }
  }

  private String translateMonthIntegersToDays(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    boolean[] arrayOfBoolean = new boolean[63];
    String[] arrayOfString = paramString.split(",");
    for (int i = 0; i < arrayOfString.length; i++)
    {
      int j = Integer.parseInt(arrayOfString[i]);
      if (arrayOfBoolean[(j + 31)] == 0)
      {
        localStringBuilder.append(dayNumberToDayOfMonthString(j) + ",");
        arrayOfBoolean[(j + 31)] = true;
      }
    }
    if (arrayOfString.length == 0)
      throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
    localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
    return localStringBuilder.toString();
  }

  private String translateWeekIntegersToDays(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    boolean[] arrayOfBoolean = new boolean[7];
    String[] arrayOfString = paramString.split(",");
    for (int i = 0; i < arrayOfString.length; i++)
    {
      int j = Integer.parseInt(arrayOfString[i]);
      if (j == 7)
        j = 0;
      if (arrayOfBoolean[j] == 0)
      {
        localStringBuilder.append(dayNumberToDayOfWeekString(j) + ",");
        arrayOfBoolean[j] = true;
      }
    }
    if (arrayOfString.length == 0)
      throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
    localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
    return localStringBuilder.toString();
  }

  void addCloseEventRegion(FrameLayout paramFrameLayout)
  {
    int i = Dips.dipsToIntPixels(50.0F, getContext());
    Interstitials.addCloseEventRegion(paramFrameLayout, new FrameLayout.LayoutParams(i, i, 53), this.mCloseOnClickListener);
  }

  protected void close()
  {
    if (this.mViewState == MraidView.ViewState.EXPANDED)
    {
      resetViewToDefaultState();
      setOrientationLockEnabled(false);
      this.mViewState = MraidView.ViewState.DEFAULT;
      getMraidView().fireChangeEventForProperty(MraidStateProperty.createWithViewState(this.mViewState));
    }
    while (true)
    {
      if (getMraidView().getMraidListener() != null)
        getMraidView().getMraidListener().onClose(getMraidView(), this.mViewState);
      return;
      if (this.mViewState == MraidView.ViewState.DEFAULT)
      {
        getMraidView().setVisibility(4);
        this.mViewState = MraidView.ViewState.HIDDEN;
        getMraidView().fireChangeEventForProperty(MraidStateProperty.createWithViewState(this.mViewState));
      }
    }
  }

  FrameLayout createAdContainerLayout()
  {
    return new FrameLayout(getContext());
  }

  protected void createCalendarEvent(Map<String, String> paramMap)
  {
    Context localContext = getMraidView().getContext();
    if (Mraids.isCalendarAvailable(localContext))
    {
      Intent localIntent;
      try
      {
        Map localMap = translateJSParamsToAndroidCalendarEventMapping(paramMap);
        localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
        Iterator localIterator = localMap.keySet().iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label231;
          str = (String)localIterator.next();
          localObject = localMap.get(str);
          if (!(localObject instanceof Long))
            break;
          localIntent.putExtra(str, ((Long)localObject).longValue());
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        while (true)
        {
          getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
          return;
          if (!(localObject instanceof Integer))
            break;
          localIntent.putExtra(str, ((Integer)localObject).intValue());
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          String str;
          Object localObject;
          new StringBuilder().append("create calendar: invalid parameters ").append(localIllegalArgumentException.getMessage()).toString();
          getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.CREATE_CALENDAR_EVENT, localIllegalArgumentException.getMessage());
          return;
          localIntent.putExtra(str, (String)localObject);
        }
      }
      catch (Exception localException)
      {
        getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.CREATE_CALENDAR_EVENT, "could not create calendar event");
        return;
      }
      label231: localIntent.setFlags(268435456);
      localContext.startActivity(localIntent);
      return;
    }
    getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
  }

  RelativeLayout createExpansionLayout()
  {
    return new RelativeLayout(getContext());
  }

  FrameLayout createPlaceholderView()
  {
    return new FrameLayout(getContext());
  }

  public void destroy()
  {
    try
    {
      this.mOrientationBroadcastReceiver.unregister();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (localIllegalArgumentException.getMessage().contains("Receiver not registered"));
      throw localIllegalArgumentException;
    }
  }

  protected void expand(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mExpansionStyle == MraidView.ExpansionStyle.DISABLED);
    do
    {
      return;
      if ((paramString != null) && (!URLUtil.isValidUrl(paramString)))
      {
        getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.EXPAND, "URL passed to expand() was invalid.");
        return;
      }
      this.mRootView = ((FrameLayout)getMraidView().getRootView().findViewById(16908290));
      useCustomClose(paramBoolean1);
      setOrientationLockEnabled(paramBoolean2);
      swapViewWithPlaceholderView();
      MraidView localMraidView = getMraidView();
      if (paramString != null)
      {
        this.mTwoPartExpansionView = new MraidView(getContext(), getMraidView().getAdConfiguration(), MraidView.ExpansionStyle.DISABLED, MraidView.NativeCloseButtonStyle.AD_CONTROLLED, MraidView.PlacementType.INLINE);
        this.mTwoPartExpansionView.setMraidListener(new MraidView.BaseMraidListener()
        {
          public void onClose(MraidView paramAnonymousMraidView, MraidView.ViewState paramAnonymousViewState)
          {
            MraidDisplayController.this.close();
          }
        });
        this.mTwoPartExpansionView.loadUrl(paramString);
        localMraidView = this.mTwoPartExpansionView;
      }
      expandLayouts(localMraidView, (int)(paramInt1 * this.mDensity), (int)(paramInt2 * this.mDensity));
      this.mRootView.addView(this.mExpansionLayout, new RelativeLayout.LayoutParams(-1, -1));
      if ((this.mNativeCloseButtonStyle == MraidView.NativeCloseButtonStyle.ALWAYS_VISIBLE) || ((!this.mAdWantsCustomCloseButton) && (this.mNativeCloseButtonStyle != MraidView.NativeCloseButtonStyle.ALWAYS_HIDDEN)))
        setNativeCloseButtonEnabled(true);
      this.mViewState = MraidView.ViewState.EXPANDED;
      getMraidView().fireChangeEventForProperty(MraidStateProperty.createWithViewState(this.mViewState));
    }
    while (getMraidView().getMraidListener() == null);
    getMraidView().getMraidListener().onExpand(getMraidView());
  }

  @Deprecated
  public View.OnClickListener getCloseOnClickListener()
  {
    return this.mCloseOnClickListener;
  }

  protected void getCurrentPosition()
  {
    getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.GET_CURRENT_POSITION, "Unsupported action getCurrentPosition");
  }

  protected void getDefaultPosition()
  {
    getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.GET_DEFAULT_POSITION, "Unsupported action getDefaultPosition");
  }

  protected void getMaxSize()
  {
    getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.GET_MAX_SIZE, "Unsupported action getMaxSize");
  }

  protected void getScreenSize()
  {
    getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.GET_SCREEN_SIZE, "Unsupported action getScreenSize");
  }

  protected void initializeJavaScriptState()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(MraidScreenSizeProperty.createWithSize(this.mScreenWidth, this.mScreenHeight));
    localArrayList.add(MraidViewableProperty.createWithViewable(getMraidView().getIsVisible()));
    getMraidView().fireChangeEventForProperties(localArrayList);
    this.mViewState = MraidView.ViewState.DEFAULT;
    getMraidView().fireChangeEventForProperty(MraidStateProperty.createWithViewState(this.mViewState));
    initializeSupportedFunctionsProperty();
  }

  protected void initializeSupportedFunctionsProperty()
  {
    Context localContext = getContext();
    getMraidView().fireChangeEventForProperty(new MraidSupportsProperty().withTel(Mraids.isTelAvailable(localContext)).withSms(Mraids.isSmsAvailable(localContext)).withCalendar(Mraids.isCalendarAvailable(localContext)).withInlineVideo(Mraids.isInlineVideoAvailable(localContext)).withStorePicture(Mraids.isStorePictureSupported(localContext)));
  }

  protected boolean isExpanded()
  {
    return this.mViewState == MraidView.ViewState.EXPANDED;
  }

  protected void setNativeCloseButtonEnabled(boolean paramBoolean)
  {
    if (this.mRootView == null)
      return;
    if (paramBoolean)
    {
      if (this.mCloseButton == null)
      {
        StateListDrawable localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { -16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(this.mRootView.getContext()));
        localStateListDrawable.addState(new int[] { 16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(this.mRootView.getContext()));
        this.mCloseButton = new ImageButton(getContext());
        this.mCloseButton.setImageDrawable(localStateListDrawable);
        this.mCloseButton.setBackgroundDrawable(null);
        this.mCloseButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            MraidDisplayController.this.close();
          }
        });
      }
      int i = Dips.dipsToIntPixels(50.0F, getContext());
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(i, i, 5);
      this.mAdContainerLayout.addView(this.mCloseButton, localLayoutParams);
    }
    while (true)
    {
      MraidView localMraidView = getMraidView();
      if (localMraidView.getOnCloseButtonStateChangeListener() == null)
        break;
      localMraidView.getOnCloseButtonStateChangeListener().onCloseButtonStateChange(localMraidView, paramBoolean);
      return;
      this.mAdContainerLayout.removeView(this.mCloseButton);
    }
  }

  protected void showUserDownloadImageAlert(String paramString)
  {
    Context localContext = getContext();
    if (!Mraids.isStorePictureSupported(localContext))
    {
      getMraidView().fireErrorEvent(MraidCommandFactory.MraidJavascriptCommand.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
      MoPubLog.d("Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
      return;
    }
    if ((localContext instanceof Activity))
    {
      showUserDialog(paramString);
      return;
    }
    showUserToast("Downloading image to Picture gallery...");
    downloadImage(paramString);
  }

  protected void showVideo(String paramString)
  {
    MraidVideoPlayerActivity.startMraid(getContext(), paramString, getMraidView().getAdConfiguration());
  }

  protected void useCustomClose(boolean paramBoolean)
  {
    this.mAdWantsCustomCloseButton = paramBoolean;
    MraidView localMraidView = getMraidView();
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      if (localMraidView.getOnCloseButtonStateChangeListener() != null)
        localMraidView.getOnCloseButtonStateChangeListener().onCloseButtonStateChange(localMraidView, bool);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidDisplayController
 * JD-Core Version:    0.6.2
 */