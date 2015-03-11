package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"NewApi"})
public class AdMarvelVideoActivity extends Activity
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, j.a
{
  static int a = 103444;
  static int b = 123124;
  static int c = 23232;
  private static Activity l;
  private boolean A = false;
  private boolean B = false;
  private boolean C = false;
  private RelativeLayout D = null;
  private long E;
  private boolean F = false;
  private boolean G = false;
  private boolean H = false;
  private boolean I = false;
  private String J;
  private ImageView K;
  private j L;
  private WeakReference<s> M;
  private Handler N;
  private r O;
  private String P;
  private Map<AdMarvelVideoActivity.k, List<String>> Q;
  private List<AdMarvelVideoActivity.f> R;
  private List<AdMarvelVideoActivity.j> S;
  private TextView T = null;
  private LinearLayout U = null;
  private AdMarvelVideoActivity.h V;
  private AdMarvelVideoActivity.h W;
  private AdMarvelVideoActivity.h X;
  private AdMarvelVideoActivity.h Y;
  private AdMarvelVideoActivity.h Z;
  private long aa;
  private boolean ab = false;
  private BroadcastReceiver ac;
  private int ad = 0;
  private Runnable ae = new Runnable()
  {
    public void run()
    {
      if ((AdMarvelVideoActivity.a(AdMarvelVideoActivity.this) == null) || (AdMarvelVideoActivity.b(AdMarvelVideoActivity.this)))
        return;
      if (AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition() == 0);
      for (int i = AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).f(); ; i = AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition())
      {
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.this.k - AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, i), AdMarvelVideoActivity.c(AdMarvelVideoActivity.this));
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition()));
        if (AdMarvelVideoActivity.d(AdMarvelVideoActivity.this))
          break;
        AdMarvelVideoActivity.this.g();
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, true);
        return;
      }
    }
  };
  private Runnable af = new Runnable()
  {
    public void run()
    {
      while (true)
      {
        int i;
        try
        {
          if (AdMarvelVideoActivity.f(AdMarvelVideoActivity.this) != null)
          {
            s locals = (s)AdMarvelVideoActivity.f(AdMarvelVideoActivity.this).get();
            if ((locals != null) && ((locals instanceof LinearLayout)))
            {
              if ((locals != null) && (AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)))
              {
                i = 0;
                if (i < locals.getChildCount())
                {
                  if (!(locals.getChildAt(i) instanceof s.d))
                    break label260;
                  s.d locald = (s.d)locals.getChildAt(i);
                  if ((locald == null) || (!locald.c.equalsIgnoreCase("done")))
                    break label260;
                  locald.setClickable(true);
                  locald.setEnabled(true);
                  if (!(locald.getChildAt(0) instanceof ImageView))
                    break label260;
                  if ((AdMarvelVideoActivity.e(AdMarvelVideoActivity.this) != null) && (AdMarvelVideoActivity.e(AdMarvelVideoActivity.this).c()))
                    AdMarvelVideoActivity.e(AdMarvelVideoActivity.this).b();
                  ImageView localImageView = (ImageView)locald.getChildAt(0);
                  if (localImageView.getDrawable() == null)
                    break label260;
                  localImageView.getDrawable().setAlpha(255);
                  localImageView.invalidate();
                  break label260;
                }
              }
              AdMarvelVideoActivity.b(AdMarvelVideoActivity.this, false);
              if (AdMarvelVideoActivity.h(AdMarvelVideoActivity.this) != null)
              {
                AdMarvelVideoActivity.h(AdMarvelVideoActivity.this).b();
                AdMarvelVideoActivity.c(AdMarvelVideoActivity.this, false);
                AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).setVisibility(8);
                AdMarvelVideoActivity.j(AdMarvelVideoActivity.this);
              }
            }
          }
          return;
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
          return;
        }
        label260: i++;
      }
    }
  };
  private Runnable ag = new Runnable()
  {
    public void run()
    {
      if ((!AdMarvelVideoActivity.k(AdMarvelVideoActivity.this)) || (AdMarvelVideoActivity.i(AdMarvelVideoActivity.this) == null))
        return;
      while (true)
      {
        int i;
        try
        {
          AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).setVisibility(0);
          i = AdMarvelVideoActivity.l(AdMarvelVideoActivity.this) - AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, System.currentTimeMillis() - AdMarvelVideoActivity.m(AdMarvelVideoActivity.this));
          if ((AdMarvelVideoActivity.n(AdMarvelVideoActivity.this) != null) && (AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).length() > 0) && (AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).contains("@seconds")))
          {
            localObject = AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).replace("@seconds", String.valueOf(i));
            ((TextView)AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).getChildAt(0)).setText((CharSequence)localObject);
            return;
          }
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
          return;
        }
        String str = "You Can Skip Ad in " + i + " seconds";
        Object localObject = str;
      }
    }
  };
  private Runnable ah = new Runnable()
  {
    public void run()
    {
      LinearLayout localLinearLayout = (LinearLayout)AdMarvelVideoActivity.this.findViewById(AdMarvelVideoActivity.b);
      if ((AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)) && (localLinearLayout != null) && (localLinearLayout.getVisibility() == 0) && (System.currentTimeMillis() - AdMarvelVideoActivity.o(AdMarvelVideoActivity.this) >= 3000L))
        AdMarvelVideoActivity.this.b(false);
      AdMarvelVideoActivity.p(AdMarvelVideoActivity.this).b();
    }
  };
  private View.OnTouchListener ai = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if (paramAnonymousMotionEvent.getAction() == 0)
        AdMarvelVideoActivity.this.onUserInteraction();
      return false;
    }
  };
  private View.OnTouchListener aj = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if (paramAnonymousMotionEvent.getAction() == 0)
      {
        LinearLayout localLinearLayout = (LinearLayout)AdMarvelVideoActivity.this.findViewById(AdMarvelVideoActivity.b);
        if ((AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)) && (localLinearLayout != null) && (AdMarvelVideoActivity.q(AdMarvelVideoActivity.this)) && (AdMarvelVideoActivity.this.i != AdMarvelVideoActivity.j.d) && (AdMarvelVideoActivity.this.i != AdMarvelVideoActivity.j.e))
          AdMarvelVideoActivity.this.onUserInteraction();
      }
      return false;
    }
  };
  public boolean d = false;
  AdMarvelXMLReader e;
  AdMarvelXMLElement f;
  LinearLayout g;
  ProgressBar h;
  public AdMarvelVideoActivity.j i;
  public AdMarvelVideoActivity.l j = AdMarvelVideoActivity.l.c;
  public int k = -1;
  private WeakReference<AdMarvelAd> m;
  private AdMarvelAd n;
  private RelativeLayout o;
  private String p;
  private boolean q = false;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = true;
  private boolean v = false;
  private int w = -1;
  private String x;
  private String y;
  private boolean z = false;

  private int a(long paramLong)
  {
    return (int)paramLong / 1000;
  }

  private ProgressBar a(Context paramContext)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics()));
    localLayoutParams.addRule(12);
    ShapeDrawable localShapeDrawable = new ShapeDrawable();
    localShapeDrawable.getPaint().setColor(Color.parseColor("#33B5E5"));
    ClipDrawable localClipDrawable = new ClipDrawable(localShapeDrawable, 3, 1);
    ProgressBar localProgressBar = new ProgressBar(paramContext, null, 16842872);
    localProgressBar.setLayoutParams(localLayoutParams);
    localProgressBar.setTag(this.P + "PROGRESS_BAR");
    localProgressBar.setBackgroundColor(0);
    localProgressBar.setIndeterminate(true);
    localProgressBar.setIndeterminateDrawable(localClipDrawable);
    localProgressBar.setVisibility(8);
    return localProgressBar;
  }

  private void a(int paramInt)
  {
    label7: if (this.R == null)
      break label7;
    label129: 
    while (true)
    {
      return;
      if (this.O != null)
        while (true)
        {
          if (this.R.size() <= 0)
            break label129;
          int i1 = ((AdMarvelVideoActivity.f)this.R.get(0)).a;
          if (paramInt != i1)
            break;
          if (paramInt == i1)
          {
            List localList = ((AdMarvelVideoActivity.f)this.R.get(0)).b;
            if (localList == null)
              break;
            Iterator localIterator = localList.iterator();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              this.O.b(str);
            }
            this.R.remove(0);
          }
        }
    }
  }

  private void a(int paramInt, TextView paramTextView)
  {
    new String();
    int i1 = paramInt / 60;
    int i2 = paramInt % 60;
    String str;
    if (paramInt == 0)
    {
      str = " 00:00";
      if (paramTextView != null)
      {
        if ((paramTextView.getVisibility() != 0) || (this.U.getVisibility() != 0))
        {
          paramTextView.setVisibility(0);
          this.U.setVisibility(0);
        }
        paramTextView.setText(str);
      }
      return;
    }
    StringBuilder localStringBuilder1 = new StringBuilder().append("-");
    Object localObject1;
    label115: StringBuilder localStringBuilder2;
    if (i1 < 10)
    {
      localObject1 = "0" + i1;
      localStringBuilder2 = localStringBuilder1.append(localObject1).append(":");
      if (i2 >= 10)
        break label185;
    }
    label185: for (Object localObject2 = "0" + i2; ; localObject2 = Integer.valueOf(i2))
    {
      str = localObject2;
      break;
      localObject1 = Integer.valueOf(i1);
      break label115;
    }
  }

  private void a(LinearLayout paramLinearLayout, boolean paramBoolean)
  {
    AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation1.setInterpolator(new DecelerateInterpolator());
    localAlphaAnimation1.setDuration(800L);
    AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation2.setInterpolator(new AccelerateInterpolator());
    localAlphaAnimation2.setDuration(500L);
    if (paramBoolean)
    {
      paramLinearLayout.setAnimation(localAlphaAnimation1);
      return;
    }
    paramLinearLayout.setAnimation(localAlphaAnimation2);
  }

  private void a(RelativeLayout paramRelativeLayout)
  {
    this.D = new RelativeLayout(this);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(10);
    localLayoutParams1.addRule(11);
    this.D.setLayoutParams(localLayoutParams1);
    this.D.setBackgroundColor(0);
    TextView localTextView = new TextView(this);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localTextView.setLayoutParams(localLayoutParams2);
    localTextView.setTypeface(Typeface.DEFAULT_BOLD);
    this.D.addView(localTextView);
    this.D.setVisibility(4);
    paramRelativeLayout.addView(this.D);
  }

  private void a(AdMarvelXMLElement paramAdMarvelXMLElement, AdMarvelVideoActivity.k paramk)
  {
    if (this.Q == null);
    while ((paramAdMarvelXMLElement == null) || (!paramAdMarvelXMLElement.getChildren().containsKey("pixel")))
      return;
    ArrayList localArrayList1 = (ArrayList)paramAdMarvelXMLElement.getChildren().get("pixel");
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.clear();
    for (int i1 = 0; i1 < localArrayList1.size(); i1++)
      localArrayList2.add(((AdMarvelXMLElement)localArrayList1.get(i1)).getData());
    this.Q.put(paramk, localArrayList2);
  }

  private void b(RelativeLayout paramRelativeLayout)
  {
    this.K = new ImageView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(13);
    this.K.setLayoutParams(localLayoutParams);
    if (Version.getAndroidSDKVersion() >= 11)
    {
      this.N.post(new AdMarvelVideoActivity.c(this, this.K, this.y));
      if ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.j.a)))
        break label156;
      this.K.setVisibility(4);
    }
    while (true)
    {
      paramRelativeLayout.addView(this.K);
      return;
      AdMarvelVideoActivity.b localb = new AdMarvelVideoActivity.b(this, this.K);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.y;
      localb.execute(arrayOfString);
      break;
      label156: this.K.setVisibility(0);
    }
  }

  private LinearLayout d(String paramString)
  {
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setId(b);
    localLinearLayout.setGravity(80);
    s locals = new s(this.L, this, this, paramString, this.P);
    this.M = new WeakReference(locals);
    localLinearLayout.addView(locals);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    return localLinearLayout;
  }

  private String e(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    AdMarvelVideoActivity.i locali = new AdMarvelVideoActivity.i(this);
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("<videoTrackingEvents>");
    locali.a(paramString);
    Iterator localIterator1 = locali.a().iterator();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    List localList = null;
    while (localIterator1.hasNext())
    {
      AdMarvelVideoActivity.i.a locala = (AdMarvelVideoActivity.i.a)localIterator1.next();
      if ("xml".equalsIgnoreCase(locala.a))
        return (String)locala.b.get(0);
      if ("video".equalsIgnoreCase(locala.a))
        str1 = c((String)locala.b.get(0));
      else if ("duration".equalsIgnoreCase(locala.a))
        str2 = (String)locala.b.get(0);
      else if ("poster".equalsIgnoreCase(locala.a))
        str4 = (String)locala.b.get(0);
      else if ("force_quit".equalsIgnoreCase(locala.a))
        str3 = (String)locala.b.get(0);
      else if ("open_url".equalsIgnoreCase(locala.a))
        str5 = (String)locala.b.get(0);
      else if (locala.a.startsWith("track_"))
        if (locala.a.startsWith("track_pr_"))
        {
          String str11 = locala.a.replaceFirst("track_pr_", "");
          localStringBuffer1.append("<videoTracking event=\"progress\" offset=\"" + str11 + "\"><pixels>");
          Iterator localIterator4 = locala.b.iterator();
          while (localIterator4.hasNext())
          {
            String str12 = (String)localIterator4.next();
            if ((str12 != null) && (str12.length() > 0))
              localStringBuffer1.append("<pixel>" + str12 + "</pixel>");
          }
          localStringBuffer1.append("</pixels></videoTracking>");
        }
        else if ("track_open_url".equalsIgnoreCase(locala.a))
        {
          new ArrayList();
          localList = locala.b;
        }
        else
        {
          String str9 = locala.a.replaceFirst("track_", "");
          localStringBuffer1.append("<videoTracking event=\"" + str9 + "\" ><pixels>");
          Iterator localIterator3 = locala.b.iterator();
          while (localIterator3.hasNext())
          {
            String str10 = (String)localIterator3.next();
            if ((str10 != null) && (str10.length() > 0))
              localStringBuffer1.append("<pixel>" + str10 + "</pixel>");
          }
          localStringBuffer1.append("</pixels></videoTracking>");
        }
    }
    localStringBuffer1.append("</videoTrackingEvents>");
    String str6;
    if ((str4 != null) && (str4.length() > 0))
      str6 = "<loadingimage>" + str4 + "</loadingimage>";
    while (true)
      if ((str5 != null) && (str5.length() > 0))
      {
        StringBuffer localStringBuffer2 = new StringBuffer();
        if ((localList != null) && (localList.size() > 0))
        {
          localStringBuffer2.append("<clickTracking><pixels>");
          Iterator localIterator2 = localList.iterator();
          while (true)
          {
            Object[] arrayOfObject2;
            String str7;
            Object[] arrayOfObject1;
            if (localIterator2.hasNext())
            {
              String str8 = (String)localIterator2.next();
              if ((str8 != null) && (str8.length() > 0))
              {
                localStringBuffer2.append("<pixel>" + str8 + "</pixel>");
                continue;
                str6 = "";
                break;
              }
            }
          }
          localStringBuffer2.append("</pixels></clickTracking>");
        }
        if (localStringBuffer2.length() > 0)
        {
          arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = localStringBuffer2.toString();
          arrayOfObject2[1] = str5;
          str7 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", arrayOfObject2);
          arrayOfObject1 = new Object[6];
          if (str2 == null)
            break label969;
          label878: arrayOfObject1[0] = str2;
          if (str3 == null)
            break label977;
          label889: arrayOfObject1[1] = str3;
          if (str1 == null)
            break label985;
        }
      }
    while (true)
    {
      arrayOfObject1[2] = str1;
      arrayOfObject1[3] = str6;
      arrayOfObject1[4] = str7;
      arrayOfObject1[5] = localStringBuffer1.toString();
      return String.format("<customad type=\"video\"><video duration=\"%s\" forcequit=\"%s\">%s</video>%s%s%s</customad>", arrayOfObject1);
      str7 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", new Object[] { "", str5 });
      break;
      str7 = "<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>";
      break;
      label969: str2 = "";
      break label878;
      label977: str3 = "NO";
      break label889;
      label985: str1 = "";
    }
  }

  private void o()
  {
    if (this.o != null)
      this.o.setVisibility(0);
  }

  private void p()
  {
    if (this.o != null)
      this.o.setVisibility(8);
  }

  private boolean q()
  {
    WeakReference localWeakReference = this.M;
    boolean bool1 = false;
    s locals;
    if (localWeakReference != null)
    {
      locals = (s)this.M.get();
      bool1 = false;
      if (locals != null)
      {
        boolean bool2 = locals instanceof LinearLayout;
        bool1 = false;
        if (!bool2);
      }
    }
    for (int i1 = 0; ; i1++)
    {
      int i2 = locals.getChildCount();
      bool1 = false;
      if (i1 < i2)
      {
        if ((locals.getChildAt(i1) instanceof ViewSwitcher))
        {
          ViewSwitcher localViewSwitcher = (ViewSwitcher)locals.getChildAt(i1);
          s.d locald2 = (s.d)localViewSwitcher.getCurrentView();
          s.d locald3 = (s.d)localViewSwitcher.getNextView();
          if (((locald2 == null) || (!locald2.c.equalsIgnoreCase("unmute"))) && ((locald3 == null) || (!locald3.c.equalsIgnoreCase("unmute"))))
            continue;
          bool1 = true;
        }
      }
      else
        return bool1;
      if ((locals.getChildAt(i1) instanceof s.d))
      {
        s.d locald1 = (s.d)locals.getChildAt(i1);
        if ((locald1 != null) && (locald1.c.equalsIgnoreCase("unmute")))
          return true;
      }
    }
  }

  private void r()
  {
    if (this.M != null)
    {
      s locals = (s)this.M.get();
      if ((locals != null) && ((locals instanceof LinearLayout)))
        for (int i1 = 0; i1 < locals.getChildCount(); i1++)
          if ((locals.getChildAt(i1) instanceof ViewSwitcher))
          {
            ViewSwitcher localViewSwitcher = (ViewSwitcher)locals.getChildAt(i1);
            s.d locald1 = (s.d)localViewSwitcher.getCurrentView();
            s.d locald2 = (s.d)localViewSwitcher.getNextView();
            if ((locald1 != null) && (locald1.c.equalsIgnoreCase("mute")) && (locald2 != null) && (locald2.c.equalsIgnoreCase("unmute")))
              localViewSwitcher.showNext();
          }
    }
  }

  private void s()
  {
    if (this.W != null)
      this.W.b();
    if (this.V != null)
      this.V.b();
    if (this.Y != null)
      this.Y.b();
    if (this.X != null)
      this.X.b();
  }

  public Handler a()
  {
    return this.N;
  }

  public void a(AdMarvelVideoActivity.k paramk)
  {
    if (this.Q == null);
    do
    {
      List localList;
      do
      {
        return;
        localList = (List)this.Q.get(paramk);
      }
      while ((localList == null) || (this.O == null));
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.O.b(str);
      }
    }
    while ((paramk != AdMarvelVideoActivity.k.a) && (paramk != AdMarvelVideoActivity.k.b));
    this.Q.remove(paramk);
  }

  public void a(j paramj)
  {
    if (paramj.getVisibility() != 0)
      paramj.setVisibility(0);
    if ((this.z) && (this.K != null) && (this.K.getVisibility() == 0))
      this.K.setVisibility(4);
    if ((this.k > 0) && (!this.A))
    {
      LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
      if ((localLinearLayout != null) && (this.s) && (this.T == null))
      {
        this.U = ((LinearLayout)localLinearLayout.findViewWithTag(this.P + "TIMER_BUTTON_LAYOUT"));
        if (this.U != null)
          this.T = ((TextView)this.U.getChildAt(0));
      }
      if ((this.R != null) && (this.R.size() > 0))
        Collections.sort(this.R, new Comparator()
        {
          public int a(AdMarvelVideoActivity.f paramAnonymousf1, AdMarvelVideoActivity.f paramAnonymousf2)
          {
            return paramAnonymousf1.a - paramAnonymousf2.a;
          }
        });
      if (this.W != null)
        break label225;
      this.W = new AdMarvelVideoActivity.h(this.N, this.ae, 500);
      this.W.a();
    }
    while (true)
    {
      paramj.start();
      this.i = AdMarvelVideoActivity.j.b;
      return;
      label225: if (!this.W.c())
        this.W.a();
    }
  }

  public void a(String paramString)
  {
    this.e = new AdMarvelXMLReader();
    this.e.parseXMLString(paramString);
    this.f = this.e.getParsedXMLData();
    String str12;
    if (this.f.getChildren().containsKey("video"))
    {
      AdMarvelXMLElement localAdMarvelXMLElement9 = (AdMarvelXMLElement)((ArrayList)this.f.getChildren().get("video")).get(0);
      if (localAdMarvelXMLElement9 != null)
      {
        this.x = c(localAdMarvelXMLElement9.getData());
        String str10 = (String)localAdMarvelXMLElement9.getAttributes().get("forcequit");
        if ((str10 != null) && (str10.equalsIgnoreCase("YES")))
          this.B = true;
        String str11 = (String)localAdMarvelXMLElement9.getAttributes().get("duration");
        if ((str11 != null) && (Integer.parseInt(str11) > 0))
          this.k = Integer.parseInt(str11);
        str12 = (String)localAdMarvelXMLElement9.getAttributes().get("lockOrientation");
        if (str12 != null)
        {
          if (!str12.equalsIgnoreCase("LandscapeLeft"))
            break label469;
          setRequestedOrientation(0);
        }
        String str13 = (String)localAdMarvelXMLElement9.getAttributes().get("initialMute");
        if ((str13 != null) && (str13.equalsIgnoreCase("YES")))
          this.ab = true;
        String str14 = (String)localAdMarvelXMLElement9.getAttributes().get("enableVideoPlayOnScreenLock");
        if ((str14 != null) && (str14.equalsIgnoreCase("YES")))
          this.H = true;
        String str15 = (String)localAdMarvelXMLElement9.getAttributes().get("quitVideoInBackground");
        if ((str15 != null) && (str15.equalsIgnoreCase("YES")))
          this.I = true;
      }
    }
    if (this.f.getChildren().containsKey("loadingimage"))
    {
      AdMarvelXMLElement localAdMarvelXMLElement8 = (AdMarvelXMLElement)((ArrayList)this.f.getChildren().get("loadingimage")).get(0);
      if (localAdMarvelXMLElement8 != null)
      {
        this.y = localAdMarvelXMLElement8.getData();
        this.z = true;
        String str9 = (String)localAdMarvelXMLElement8.getAttributes().get("displayEvent");
        if (str9 != null)
        {
          String[] arrayOfString = str9.split(",");
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            this.S = new ArrayList();
            int i10 = 0;
            label428: if (i10 < arrayOfString.length)
            {
              if (arrayOfString[i10].equalsIgnoreCase("loading"))
                this.S.add(AdMarvelVideoActivity.j.a);
              while (true)
              {
                i10++;
                break label428;
                label469: if (str12.equalsIgnoreCase("Portrait"))
                {
                  setRequestedOrientation(1);
                  break;
                }
                if (Version.getAndroidSDKVersion() < 11)
                  break;
                q.a(this, str12);
                break;
                if (arrayOfString[i10].equalsIgnoreCase("complete"))
                {
                  this.S.add(AdMarvelVideoActivity.j.d);
                  this.S.add(AdMarvelVideoActivity.j.e);
                }
              }
            }
          }
        }
      }
    }
    AdMarvelXMLElement localAdMarvelXMLElement7;
    String str4;
    String str5;
    label626: String str6;
    if (this.f.getChildren().containsKey("toolbar"))
    {
      localAdMarvelXMLElement7 = (AdMarvelXMLElement)((ArrayList)this.f.getChildren().get("toolbar")).get(0);
      if (localAdMarvelXMLElement7 != null)
        break label1123;
      str4 = null;
      if ((str4 != null) && (str4.equalsIgnoreCase("YES")))
        this.t = true;
      if (localAdMarvelXMLElement7 != null)
        break label1142;
      str5 = null;
      if ((str5 != null) && (str5.equalsIgnoreCase("NO")))
        this.u = false;
      if (localAdMarvelXMLElement7 != null)
        break label1161;
      str6 = null;
      label655: if (str6 != null)
      {
        this.v = true;
        this.C = true;
        this.w = Integer.parseInt(str6);
        String str7 = (String)localAdMarvelXMLElement7.getAttributes().get("showSkipMessage");
        if ((str7 != null) && (str7.equalsIgnoreCase("NO")))
          this.C = false;
        String str8 = (String)localAdMarvelXMLElement7.getAttributes().get("skipText");
        if ((str8 != null) && (str8.length() > 0) && (str8.contains("@seconds")))
          this.J = str8;
      }
      if ((localAdMarvelXMLElement7 != null) && (localAdMarvelXMLElement7.getChildren().containsKey("item")) && (((ArrayList)localAdMarvelXMLElement7.getChildren().get("item")).size() > 0))
        this.s = true;
    }
    if (this.f.getChildren().containsKey("videoTrackingEvents"))
    {
      this.R = new ArrayList();
      this.Q = new HashMap();
      AdMarvelXMLElement localAdMarvelXMLElement1 = (AdMarvelXMLElement)((ArrayList)this.f.getChildren().get("videoTrackingEvents")).get(0);
      if ((localAdMarvelXMLElement1 != null) && (localAdMarvelXMLElement1.getChildren().containsKey("videoTracking")))
      {
        ArrayList localArrayList1 = (ArrayList)localAdMarvelXMLElement1.getChildren().get("videoTracking");
        int i1 = 0;
        if (i1 < localArrayList1.size())
        {
          AdMarvelXMLElement localAdMarvelXMLElement2 = (AdMarvelXMLElement)localArrayList1.get(i1);
          String str1 = (String)localAdMarvelXMLElement2.getAttributes().get("event");
          if ("progress".equalsIgnoreCase(str1))
          {
            String str2 = (String)localAdMarvelXMLElement2.getAttributes().get("offset");
            if (str2 != null)
            {
              String str3;
              if (str2.endsWith("%"))
                str3 = str2.replace("%", "");
              ArrayList localArrayList9;
              for (int i8 = this.k * Integer.parseInt(str3) / 100; ; i8 = Integer.parseInt(str2))
              {
                AdMarvelXMLElement localAdMarvelXMLElement6 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0);
                if ((localAdMarvelXMLElement6 == null) || (!localAdMarvelXMLElement6.getChildren().containsKey("pixel")))
                  break label1212;
                ArrayList localArrayList8 = (ArrayList)localAdMarvelXMLElement6.getChildren().get("pixel");
                localArrayList9 = new ArrayList();
                localArrayList9.clear();
                for (int i9 = 0; i9 < localArrayList8.size(); i9++)
                  localArrayList9.add(((AdMarvelXMLElement)localArrayList8.get(i9)).getData());
                label1123: str4 = (String)localAdMarvelXMLElement7.getAttributes().get("initiallyVisible");
                break;
                label1142: str5 = (String)localAdMarvelXMLElement7.getAttributes().get("toggleToolbar");
                break label626;
                label1161: str6 = (String)localAdMarvelXMLElement7.getAttributes().get("delayDisplayDoneButton");
                break label655;
              }
              this.R.add(new AdMarvelVideoActivity.f(this, i8, localArrayList9));
            }
          }
          while (true)
          {
            label1212: i1++;
            break;
            if (("firstQuartile".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i6 = this.k / 4;
              if (i6 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement5 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0);
                if ((localAdMarvelXMLElement5 != null) && (localAdMarvelXMLElement5.getChildren().containsKey("pixel")))
                {
                  ArrayList localArrayList6 = (ArrayList)localAdMarvelXMLElement5.getChildren().get("pixel");
                  ArrayList localArrayList7 = new ArrayList();
                  localArrayList7.clear();
                  for (int i7 = 0; i7 < localArrayList6.size(); i7++)
                    localArrayList7.add(((AdMarvelXMLElement)localArrayList6.get(i7)).getData());
                  this.R.add(new AdMarvelVideoActivity.f(this, i6, localArrayList7));
                }
              }
            }
            else if (("midpoint".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i4 = this.k / 2;
              if (i4 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement4 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0);
                if ((localAdMarvelXMLElement4 != null) && (localAdMarvelXMLElement4.getChildren().containsKey("pixel")))
                {
                  ArrayList localArrayList4 = (ArrayList)localAdMarvelXMLElement4.getChildren().get("pixel");
                  ArrayList localArrayList5 = new ArrayList();
                  localArrayList5.clear();
                  for (int i5 = 0; i5 < localArrayList4.size(); i5++)
                    localArrayList5.add(((AdMarvelXMLElement)localArrayList4.get(i5)).getData());
                  this.R.add(new AdMarvelVideoActivity.f(this, i4, localArrayList5));
                }
              }
            }
            else if (("thirdQuartile".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i2 = 3 * (this.k / 4);
              if (i2 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement3 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0);
                if ((localAdMarvelXMLElement3 != null) && (localAdMarvelXMLElement3.getChildren().containsKey("pixel")))
                {
                  ArrayList localArrayList2 = (ArrayList)localAdMarvelXMLElement3.getChildren().get("pixel");
                  ArrayList localArrayList3 = new ArrayList();
                  localArrayList3.clear();
                  for (int i3 = 0; i3 < localArrayList2.size(); i3++)
                    localArrayList3.add(((AdMarvelXMLElement)localArrayList2.get(i3)).getData());
                  this.R.add(new AdMarvelVideoActivity.f(this, i2, localArrayList3));
                }
              }
            }
            else if ("start".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.a);
            }
            else if ("complete".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.b);
            }
            else if ("pause".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.c);
            }
            else if ("resume".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.d);
            }
            else if ("close".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.e);
            }
            else if ("stop".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0), AdMarvelVideoActivity.k.f);
            }
          }
        }
      }
    }
  }

  public void a(List<String> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      if (this.O != null)
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          this.O.b(str);
        }
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.L == null);
    while (this.i != AdMarvelVideoActivity.j.b)
      return;
    this.L.pause();
    if (paramBoolean)
    {
      this.i = AdMarvelVideoActivity.j.f;
      return;
    }
    this.i = AdMarvelVideoActivity.j.c;
  }

  public void b(String paramString)
  {
    if (this.L == null)
      return;
    if (this.L.isPlaying())
    {
      this.L.a();
      this.i = AdMarvelVideoActivity.j.d;
    }
    if (this.L.getVisibility() != 0)
    {
      this.L.setVisibility(0);
      this.L.requestFocus();
    }
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.j.a))))
      this.K.setVisibility(0);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.putAll(this.Q);
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        AdMarvelVideoActivity.k localk = (AdMarvelVideoActivity.k)localIterator.next();
        if (localk != AdMarvelVideoActivity.k.e)
          this.Q.remove(localk);
      }
    }
    if (this.h != null)
      this.h.setVisibility(0);
    if (this.B)
      this.B = false;
    this.A = true;
    if (this.T != null)
      this.T.setVisibility(4);
    this.L.a(Uri.parse(paramString));
    this.L.requestFocus();
    this.i = AdMarvelVideoActivity.j.a;
  }

  public void b(boolean paramBoolean)
  {
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null))
    {
      if (localLinearLayout.getVisibility() == 0)
        break label91;
      if (paramBoolean)
      {
        a(localLinearLayout, paramBoolean);
        localLinearLayout.setVisibility(0);
        localLinearLayout.bringToFront();
        localLinearLayout.requestLayout();
        if ((this.Y != null) && (!this.Y.c()))
        {
          this.aa = System.currentTimeMillis();
          this.Y.b();
          this.Y.a();
        }
      }
    }
    label91: 
    while (paramBoolean)
      return;
    a(localLinearLayout, paramBoolean);
    localLinearLayout.setVisibility(8);
  }

  boolean b()
  {
    return this.r;
  }

  String c(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      Object localObject = paramString;
      try
      {
        while (true)
        {
          r localr = new r(this);
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL((String)localObject).openConnection();
          localHttpURLConnection.setRequestMethod("GET");
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("User-Agent", localr.a());
          localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setRequestProperty("Content-Length", "0");
          localHttpURLConnection.setConnectTimeout(4000);
          localHttpURLConnection.setReadTimeout(5000);
          localHttpURLConnection.setInstanceFollowRedirects(false);
          localHttpURLConnection.connect();
          int i1 = localHttpURLConnection.getResponseCode();
          if ((i1 != 301) && (i1 != 302))
            break;
          String str = localHttpURLConnection.getHeaderField("Location");
          localObject = str;
        }
      }
      catch (Exception localException)
      {
        if ((localObject != null) && (((String)localObject).length() > 0))
          paramString = (String)localObject;
      }
    }
    return paramString;
  }

  public void c()
  {
    s();
    a(AdMarvelVideoActivity.k.e);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
      this.Q.clear();
    if (b() == true)
    {
      if (AdMarvelInterstitialAds.getListener() != null)
      {
        AdMarvelInterstitialAds.getListener().b();
        this.ad = (1 + this.ad);
      }
      if (this.ad <= 2)
      {
        finish();
        return;
      }
    }
    finish();
  }

  public void c(boolean paramBoolean)
  {
    if (this.M != null)
    {
      s locals = (s)this.M.get();
      if ((locals != null) && ((locals instanceof LinearLayout)))
      {
        int i1 = 0;
        if (i1 < locals.getChildCount())
        {
          ViewSwitcher localViewSwitcher;
          s.d locald;
          if ((locals.getChildAt(i1) instanceof ViewSwitcher))
          {
            localViewSwitcher = (ViewSwitcher)locals.getChildAt(i1);
            locald = (s.d)localViewSwitcher.getCurrentView();
            if ((paramBoolean) || (locald == null) || (!locald.c.equalsIgnoreCase("pause")))
              break label120;
            if (localViewSwitcher.getDisplayedChild() != 0)
              break label112;
            localViewSwitcher.showNext();
          }
          while (true)
          {
            i1++;
            break;
            label112: localViewSwitcher.showPrevious();
            continue;
            label120: if ((!paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("stop")))
            {
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
            }
            else if ((paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("replay")))
            {
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
            }
            else if ((paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("resume")))
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
          }
        }
      }
    }
  }

  public void d()
  {
    if (this.L == null)
      return;
    this.L.a();
    this.i = AdMarvelVideoActivity.j.d;
  }

  public void e()
  {
    if (this.L == null);
    do
    {
      return;
      if ((this.i == AdMarvelVideoActivity.j.f) || (this.i == AdMarvelVideoActivity.j.c))
      {
        if (this.h != null)
          this.h.setVisibility(0);
        this.L.e();
        this.i = AdMarvelVideoActivity.j.b;
        return;
      }
    }
    while ((this.i != AdMarvelVideoActivity.j.d) && (this.i != AdMarvelVideoActivity.j.e));
    f();
  }

  public void f()
  {
    if (this.L == null);
    while ((this.i != AdMarvelVideoActivity.j.e) && (this.i != AdMarvelVideoActivity.j.d) && (this.i != AdMarvelVideoActivity.j.c) && (this.i != AdMarvelVideoActivity.j.f))
      return;
    if ((this.i == AdMarvelVideoActivity.j.c) || (this.i == AdMarvelVideoActivity.j.f))
    {
      this.L.a();
      this.i = AdMarvelVideoActivity.j.d;
    }
    if (this.L.getVisibility() != 0)
      this.L.setVisibility(0);
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.j.a))))
      this.K.setVisibility(0);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.putAll(this.Q);
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        AdMarvelVideoActivity.k localk = (AdMarvelVideoActivity.k)localIterator.next();
        if (localk != AdMarvelVideoActivity.k.e)
          this.Q.remove(localk);
      }
    }
    if (this.B)
      this.B = false;
    if (this.h != null)
      this.h.setVisibility(0);
    if ((this.x != null) && (this.x.length() > 0))
    {
      this.L.a(Uri.parse(this.x));
      this.i = AdMarvelVideoActivity.j.a;
    }
    this.A = false;
    this.L.requestFocus();
  }

  public void g()
  {
    this.N.postDelayed(new AdMarvelVideoActivity.d(this.n, this), 3000L);
  }

  public void h()
  {
    a(AdMarvelVideoActivity.k.c);
  }

  public void i()
  {
    a(AdMarvelVideoActivity.k.f);
    if (this.W != null)
      this.W.b();
    if (this.Y != null)
      this.Y.b();
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.j.d))))
      this.K.setVisibility(0);
    if (this.L != null)
      this.L.setVisibility(4);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
      localLinearLayout.bringToFront();
      localLinearLayout.requestLayout();
    }
    if ((this.k > 0) && (this.T != null) && (this.T.getVisibility() == 0))
      a(0, this.T);
    c(false);
  }

  public void j()
  {
    a(AdMarvelVideoActivity.k.d);
    this.i = AdMarvelVideoActivity.j.b;
  }

  public void k()
  {
    if ((this.N != null) && (this.h != null))
      this.h.setVisibility(8);
    if ((this.W != null) && (!this.A) && (this.i != AdMarvelVideoActivity.j.e) && (this.i != AdMarvelVideoActivity.j.d))
      this.W.a();
    if ((this.z) && (this.K != null) && (this.K.getVisibility() == 0))
      this.K.setVisibility(4);
  }

  public void l()
  {
    if ((this.N != null) && (this.h != null))
      this.h.setVisibility(8);
    Toast.makeText(this, "Network Connection Unavailable", 0).show();
  }

  public void m()
  {
    c();
  }

  public void n()
  {
  }

  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.i = AdMarvelVideoActivity.j.e;
    a(AdMarvelVideoActivity.k.b);
    s();
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    Logging.log("Video onCompletion is called");
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.j.d))))
      this.K.setVisibility(0);
    if (this.L != null)
      this.L.setVisibility(4);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
      localLinearLayout.bringToFront();
      localLinearLayout.requestLayout();
    }
    if ((this.k > 0) && (this.T != null) && (this.T.getVisibility() == 0))
      a(0, this.T);
    c(false);
    s locals;
    if (this.M != null)
    {
      locals = (s)this.M.get();
      if (locals == null);
    }
    for (boolean bool = locals.b(); ; bool = false)
    {
      if ((!this.s) || (!bool) || (this.B))
      {
        if (this.L != null)
          this.L.a(true);
        c();
      }
      return;
    }
  }

  // ERROR //
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 1085	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   5: getstatic 1087	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   8: ifnonnull +1017 -> 1025
    //   11: aload_0
    //   12: putstatic 1087	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   15: getstatic 1092	android/os/Build:MODEL	Ljava/lang/String;
    //   18: ldc_w 1094
    //   21: invokevirtual 833	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   24: ifne +15 -> 39
    //   27: getstatic 1097	android/os/Build:PRODUCT	Ljava/lang/String;
    //   30: ldc_w 1094
    //   33: invokevirtual 833	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   36: ifeq +1002 -> 1038
    //   39: aload_0
    //   40: invokevirtual 1101	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   43: sipush 256
    //   46: invokevirtual 1106	android/view/Window:addFlags	(I)V
    //   49: aload_0
    //   50: invokevirtual 1101	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   53: sipush 1024
    //   56: invokevirtual 1109	android/view/Window:clearFlags	(I)V
    //   59: invokestatic 491	com/admarvel/android/ads/Version:getAndroidSDKVersion	()I
    //   62: bipush 11
    //   64: if_icmplt +7 -> 71
    //   67: aload_0
    //   68: invokestatic 1114	com/admarvel/android/ads/AdMarvelVideoActivity$e:a	(Landroid/app/Activity;)V
    //   71: aload_0
    //   72: invokevirtual 1118	com/admarvel/android/ads/AdMarvelVideoActivity:getIntent	()Landroid/content/Intent;
    //   75: invokevirtual 1124	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnull +106 -> 186
    //   83: aload_2
    //   84: ldc_w 1126
    //   87: invokevirtual 1132	android/os/Bundle:getByteArray	(Ljava/lang/String;)[B
    //   90: astore 28
    //   92: aload 28
    //   94: ifnull +51 -> 145
    //   97: aload_0
    //   98: new 1134	java/io/ObjectInputStream
    //   101: dup
    //   102: new 1136	java/io/ByteArrayInputStream
    //   105: dup
    //   106: aload 28
    //   108: invokespecial 1139	java/io/ByteArrayInputStream:<init>	([B)V
    //   111: invokespecial 1142	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   114: invokevirtual 1145	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   117: checkcast 1147	com/admarvel/android/ads/AdMarvelAd
    //   120: putfield 1039	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   123: aload_0
    //   124: getfield 1039	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   127: ifnull +18 -> 145
    //   130: aload_0
    //   131: new 542	java/lang/ref/WeakReference
    //   134: dup
    //   135: aload_0
    //   136: getfield 1039	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   139: invokespecial 544	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   142: putfield 1149	com/admarvel/android/ads/AdMarvelVideoActivity:m	Ljava/lang/ref/WeakReference;
    //   145: aload_2
    //   146: ldc_w 1151
    //   149: invokevirtual 1154	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   152: ifeq +915 -> 1067
    //   155: aload_0
    //   156: aload_0
    //   157: aload_2
    //   158: ldc_w 1156
    //   161: invokevirtual 1159	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   164: invokespecial 1161	com/admarvel/android/ads/AdMarvelVideoActivity:e	(Ljava/lang/String;)Ljava/lang/String;
    //   167: putfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   170: aload_0
    //   171: aload_2
    //   172: ldc_w 1165
    //   175: invokevirtual 1159	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   178: putfield 268	com/admarvel/android/ads/AdMarvelVideoActivity:P	Ljava/lang/String;
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield 946	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   186: aload_0
    //   187: getstatic 512	com/admarvel/android/ads/AdMarvelVideoActivity$j:a	Lcom/admarvel/android/ads/AdMarvelVideoActivity$j;
    //   190: putfield 756	com/admarvel/android/ads/AdMarvelVideoActivity:i	Lcom/admarvel/android/ads/AdMarvelVideoActivity$j;
    //   193: new 411	android/widget/RelativeLayout
    //   196: dup
    //   197: aload_0
    //   198: invokespecial 414	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   201: astore_3
    //   202: aload_3
    //   203: getstatic 109	com/admarvel/android/ads/AdMarvelVideoActivity:a	I
    //   206: invokevirtual 1166	android/widget/RelativeLayout:setId	(I)V
    //   209: aload_3
    //   210: new 1168	android/view/ViewGroup$LayoutParams
    //   213: dup
    //   214: iconst_m1
    //   215: iconst_m1
    //   216: invokespecial 1169	android/view/ViewGroup$LayoutParams:<init>	(II)V
    //   219: invokevirtual 415	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   222: aload_0
    //   223: aload_3
    //   224: invokevirtual 1172	com/admarvel/android/ads/AdMarvelVideoActivity:setContentView	(Landroid/view/View;)V
    //   227: new 353	android/widget/LinearLayout
    //   230: dup
    //   231: aload_0
    //   232: invokespecial 529	android/widget/LinearLayout:<init>	(Landroid/content/Context;)V
    //   235: astore 4
    //   237: aload 4
    //   239: getstatic 114	com/admarvel/android/ads/AdMarvelVideoActivity:c	I
    //   242: invokevirtual 532	android/widget/LinearLayout:setId	(I)V
    //   245: new 549	android/widget/LinearLayout$LayoutParams
    //   248: dup
    //   249: iconst_m1
    //   250: iconst_m1
    //   251: invokespecial 550	android/widget/LinearLayout$LayoutParams:<init>	(II)V
    //   254: astore 5
    //   256: aload 5
    //   258: ldc_w 1173
    //   261: putfield 1176	android/widget/LinearLayout$LayoutParams:weight	F
    //   264: aload 4
    //   266: aload 5
    //   268: invokevirtual 551	android/widget/LinearLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   271: aload 4
    //   273: aload_0
    //   274: getfield 197	com/admarvel/android/ads/AdMarvelVideoActivity:aj	Landroid/view/View$OnTouchListener;
    //   277: invokevirtual 1180	android/widget/LinearLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   280: aload 4
    //   282: ldc_w 1181
    //   285: invokevirtual 1182	android/widget/LinearLayout:setBackgroundColor	(I)V
    //   288: new 411	android/widget/RelativeLayout
    //   291: dup
    //   292: aload_0
    //   293: invokespecial 414	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   296: astore 6
    //   298: aload 6
    //   300: new 204	android/widget/RelativeLayout$LayoutParams
    //   303: dup
    //   304: iconst_m1
    //   305: iconst_m1
    //   306: invokespecial 224	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   309: invokevirtual 415	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   312: aload 4
    //   314: aload 6
    //   316: invokevirtual 547	android/widget/LinearLayout:addView	(Landroid/view/View;)V
    //   319: new 204	android/widget/RelativeLayout$LayoutParams
    //   322: dup
    //   323: iconst_m1
    //   324: iconst_m1
    //   325: invokespecial 224	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   328: astore 7
    //   330: aload 7
    //   332: bipush 13
    //   334: invokevirtual 228	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   337: aload_0
    //   338: new 723	com/admarvel/android/ads/j
    //   341: dup
    //   342: aload_0
    //   343: aload_0
    //   344: invokespecial 1185	com/admarvel/android/ads/j:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;Landroid/content/Context;)V
    //   347: putfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   350: aload_0
    //   351: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   354: aload 7
    //   356: invokevirtual 1186	com/admarvel/android/ads/j:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   359: aload_0
    //   360: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   363: aload_0
    //   364: invokevirtual 1189	com/admarvel/android/ads/j:a	(Lcom/admarvel/android/ads/j$a;)V
    //   367: aload 6
    //   369: aload_0
    //   370: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   373: invokevirtual 432	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   376: aload_0
    //   377: new 502	android/os/Handler
    //   380: dup
    //   381: invokespecial 1190	android/os/Handler:<init>	()V
    //   384: putfield 493	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   387: aload_0
    //   388: new 336	com/admarvel/android/ads/r
    //   391: dup
    //   392: aload_0
    //   393: invokespecial 949	com/admarvel/android/ads/r:<init>	(Landroid/content/Context;)V
    //   396: putfield 303	com/admarvel/android/ads/AdMarvelVideoActivity:O	Lcom/admarvel/android/ads/r;
    //   399: aload_0
    //   400: aload_0
    //   401: getfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   404: invokevirtual 1191	com/admarvel/android/ads/AdMarvelVideoActivity:a	(Ljava/lang/String;)V
    //   407: aload_0
    //   408: getfield 121	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   411: ifeq +24 -> 435
    //   414: aload_0
    //   415: aload_0
    //   416: aload_0
    //   417: getfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   420: invokespecial 1193	com/admarvel/android/ads/AdMarvelVideoActivity:d	(Ljava/lang/String;)Landroid/widget/LinearLayout;
    //   423: putfield 1195	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   426: aload_0
    //   427: getfield 1195	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   430: bipush 8
    //   432: invokevirtual 356	android/widget/LinearLayout:setVisibility	(I)V
    //   435: aload_3
    //   436: aload 4
    //   438: invokevirtual 432	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   441: aload_0
    //   442: getfield 774	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   445: ifnull +744 -> 1189
    //   448: aload_0
    //   449: getfield 774	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   452: invokevirtual 558	java/lang/String:length	()I
    //   455: istore 26
    //   457: iload 26
    //   459: ifle +730 -> 1189
    //   462: aload_0
    //   463: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   466: aload_0
    //   467: getfield 774	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   470: invokestatic 927	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   473: invokevirtual 930	com/admarvel/android/ads/j:a	(Landroid/net/Uri;)V
    //   476: aload_0
    //   477: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   480: aload_0
    //   481: invokevirtual 1198	com/admarvel/android/ads/j:a	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   484: aload_0
    //   485: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   488: aload_0
    //   489: invokevirtual 1201	com/admarvel/android/ads/j:a	(Landroid/media/MediaPlayer$OnPreparedListener;)V
    //   492: aload_0
    //   493: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   496: aload_0
    //   497: invokevirtual 1204	com/admarvel/android/ads/j:a	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   500: aload_0
    //   501: getfield 299	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/j;
    //   504: invokevirtual 907	com/admarvel/android/ads/j:requestFocus	()Z
    //   507: pop
    //   508: aload_0
    //   509: getfield 946	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   512: iconst_1
    //   513: if_icmpne +16 -> 529
    //   516: invokestatic 1017	com/admarvel/android/ads/AdMarvelInterstitialAds:getListener	()Lcom/admarvel/android/ads/e;
    //   519: ifnull +10 -> 529
    //   522: invokestatic 1017	com/admarvel/android/ads/AdMarvelInterstitialAds:getListener	()Lcom/admarvel/android/ads/e;
    //   525: aload_0
    //   526: invokevirtual 1206	com/admarvel/android/ads/e:a	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;)V
    //   529: aload_0
    //   530: getfield 131	com/admarvel/android/ads/AdMarvelVideoActivity:z	Z
    //   533: ifeq +25 -> 558
    //   536: aload_0
    //   537: getfield 497	com/admarvel/android/ads/AdMarvelVideoActivity:y	Ljava/lang/String;
    //   540: ifnull +18 -> 558
    //   543: aload_0
    //   544: getfield 497	com/admarvel/android/ads/AdMarvelVideoActivity:y	Ljava/lang/String;
    //   547: invokevirtual 558	java/lang/String:length	()I
    //   550: ifle +8 -> 558
    //   553: aload_0
    //   554: aload_3
    //   555: invokespecial 1208	com/admarvel/android/ads/AdMarvelVideoActivity:b	(Landroid/widget/RelativeLayout;)V
    //   558: new 353	android/widget/LinearLayout
    //   561: dup
    //   562: aload_0
    //   563: invokespecial 529	android/widget/LinearLayout:<init>	(Landroid/content/Context;)V
    //   566: astore 13
    //   568: new 204	android/widget/RelativeLayout$LayoutParams
    //   571: dup
    //   572: iconst_m1
    //   573: bipush 254
    //   575: invokespecial 224	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   578: astore 14
    //   580: aload 14
    //   582: bipush 12
    //   584: invokevirtual 228	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   587: aload 13
    //   589: iconst_1
    //   590: invokevirtual 1211	android/widget/LinearLayout:setOrientation	(I)V
    //   593: aload 13
    //   595: aload 14
    //   597: invokevirtual 551	android/widget/LinearLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   600: aload_0
    //   601: aload_0
    //   602: aload_0
    //   603: invokespecial 1213	com/admarvel/android/ads/AdMarvelVideoActivity:a	(Landroid/content/Context;)Landroid/widget/ProgressBar;
    //   606: putfield 921	com/admarvel/android/ads/AdMarvelVideoActivity:h	Landroid/widget/ProgressBar;
    //   609: aload_0
    //   610: getfield 921	com/admarvel/android/ads/AdMarvelVideoActivity:h	Landroid/widget/ProgressBar;
    //   613: ifnull +20 -> 633
    //   616: aload 13
    //   618: aload_0
    //   619: getfield 921	com/admarvel/android/ads/AdMarvelVideoActivity:h	Landroid/widget/ProgressBar;
    //   622: invokevirtual 547	android/widget/LinearLayout:addView	(Landroid/view/View;)V
    //   625: aload_0
    //   626: getfield 921	com/admarvel/android/ads/AdMarvelVideoActivity:h	Landroid/widget/ProgressBar;
    //   629: iconst_0
    //   630: invokevirtual 296	android/widget/ProgressBar:setVisibility	(I)V
    //   633: aload_0
    //   634: getfield 121	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   637: ifeq +19 -> 656
    //   640: aload_0
    //   641: getfield 1195	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   644: ifnull +12 -> 656
    //   647: aload 13
    //   649: aload_0
    //   650: getfield 1195	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   653: invokevirtual 547	android/widget/LinearLayout:addView	(Landroid/view/View;)V
    //   656: aload_3
    //   657: aload 13
    //   659: invokevirtual 432	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   662: aload_0
    //   663: getfield 546	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   666: ifnull +164 -> 830
    //   669: aload_0
    //   670: getfield 546	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   673: invokevirtual 673	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   676: checkcast 537	com/admarvel/android/ads/s
    //   679: astore 22
    //   681: aload 22
    //   683: ifnull +147 -> 830
    //   686: aload_0
    //   687: new 411	android/widget/RelativeLayout
    //   690: dup
    //   691: aload_0
    //   692: invokespecial 414	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   695: putfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   698: new 204	android/widget/RelativeLayout$LayoutParams
    //   701: dup
    //   702: bipush 254
    //   704: bipush 254
    //   706: invokespecial 224	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   709: astore 23
    //   711: aload 23
    //   713: bipush 10
    //   715: invokevirtual 228	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   718: aload 23
    //   720: bipush 11
    //   722: invokevirtual 228	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   725: aload_0
    //   726: getfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   729: aload 23
    //   731: invokevirtual 415	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   734: aload_0
    //   735: getfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   738: iconst_0
    //   739: invokevirtual 416	android/widget/RelativeLayout:setBackgroundColor	(I)V
    //   742: new 204	android/widget/RelativeLayout$LayoutParams
    //   745: dup
    //   746: bipush 254
    //   748: bipush 254
    //   750: invokespecial 224	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   753: astore 24
    //   755: iconst_1
    //   756: ldc_w 1214
    //   759: aload_0
    //   760: invokevirtual 209	com/admarvel/android/ads/AdMarvelVideoActivity:getResources	()Landroid/content/res/Resources;
    //   763: invokevirtual 215	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   766: invokestatic 221	android/util/TypedValue:applyDimension	(IFLandroid/util/DisplayMetrics;)F
    //   769: f2i
    //   770: istore 25
    //   772: aload 24
    //   774: iload 25
    //   776: iload 25
    //   778: iload 25
    //   780: iload 25
    //   782: invokevirtual 1218	android/widget/RelativeLayout$LayoutParams:setMargins	(IIII)V
    //   785: aload 24
    //   787: bipush 11
    //   789: invokevirtual 228	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   792: aload 22
    //   794: invokevirtual 1221	com/admarvel/android/ads/s:a	()Lcom/admarvel/android/ads/s$d;
    //   797: ifnull +33 -> 830
    //   800: aload_0
    //   801: getfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   804: aload 22
    //   806: invokevirtual 1221	com/admarvel/android/ads/s:a	()Lcom/admarvel/android/ads/s$d;
    //   809: aload 24
    //   811: invokevirtual 1224	android/widget/RelativeLayout:addView	(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   814: aload_0
    //   815: getfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   818: iconst_1
    //   819: invokevirtual 1227	android/widget/RelativeLayout:setClickable	(Z)V
    //   822: aload_3
    //   823: aload_0
    //   824: getfield 669	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   827: invokevirtual 432	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   830: aload_0
    //   831: getfield 137	com/admarvel/android/ads/AdMarvelVideoActivity:C	Z
    //   834: ifeq +12 -> 846
    //   837: aload_0
    //   838: aload_3
    //   839: invokespecial 1229	com/admarvel/android/ads/AdMarvelVideoActivity:a	(Landroid/widget/RelativeLayout;)V
    //   842: aload_0
    //   843: invokespecial 1231	com/admarvel/android/ads/AdMarvelVideoActivity:p	()V
    //   846: aload_0
    //   847: getfield 127	com/admarvel/android/ads/AdMarvelVideoActivity:v	Z
    //   850: ifeq +507 -> 1357
    //   853: aload_0
    //   854: getfield 129	com/admarvel/android/ads/AdMarvelVideoActivity:w	I
    //   857: ifle +500 -> 1357
    //   860: aload_0
    //   861: getfield 546	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   864: ifnull +493 -> 1357
    //   867: aload_0
    //   868: getfield 546	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   871: invokevirtual 673	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   874: checkcast 537	com/admarvel/android/ads/s
    //   877: astore 17
    //   879: aload 17
    //   881: ifnull +476 -> 1357
    //   884: aload 17
    //   886: instanceof 353
    //   889: ifeq +468 -> 1357
    //   892: aload 17
    //   894: ifnull +463 -> 1357
    //   897: aload_0
    //   898: getfield 121	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   901: ifeq +456 -> 1357
    //   904: iconst_0
    //   905: istore 18
    //   907: iload 18
    //   909: aload 17
    //   911: invokevirtual 676	android/widget/LinearLayout:getChildCount	()I
    //   914: if_icmpge +358 -> 1272
    //   917: aload 17
    //   919: iload 18
    //   921: invokevirtual 680	android/widget/LinearLayout:getChildAt	(I)Landroid/view/View;
    //   924: instanceof 688
    //   927: ifeq +92 -> 1019
    //   930: aload 17
    //   932: iload 18
    //   934: invokevirtual 680	android/widget/LinearLayout:getChildAt	(I)Landroid/view/View;
    //   937: checkcast 688	com/admarvel/android/ads/s$d
    //   940: astore 19
    //   942: aload 19
    //   944: ifnull +75 -> 1019
    //   947: aload 19
    //   949: getfield 693	com/admarvel/android/ads/s$d:c	Ljava/lang/String;
    //   952: ldc_w 1233
    //   955: invokevirtual 584	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   958: ifeq +61 -> 1019
    //   961: aload 19
    //   963: iconst_0
    //   964: invokevirtual 1234	com/admarvel/android/ads/s$d:setClickable	(Z)V
    //   967: aload 19
    //   969: iconst_0
    //   970: invokevirtual 1237	com/admarvel/android/ads/s$d:setEnabled	(Z)V
    //   973: aload 19
    //   975: iconst_0
    //   976: invokevirtual 1238	com/admarvel/android/ads/s$d:getChildAt	(I)Landroid/view/View;
    //   979: instanceof 482
    //   982: ifeq +37 -> 1019
    //   985: aload 19
    //   987: iconst_0
    //   988: invokevirtual 1238	com/admarvel/android/ads/s$d:getChildAt	(I)Landroid/view/View;
    //   991: checkcast 482	android/widget/ImageView
    //   994: astore 20
    //   996: aload 20
    //   998: ifnull +209 -> 1207
    //   1001: aload 20
    //   1003: invokevirtual 1242	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   1006: ifnull +201 -> 1207
    //   1009: aload 20
    //   1011: invokevirtual 1242	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   1014: bipush 25
    //   1016: invokevirtual 1247	android/graphics/drawable/Drawable:setAlpha	(I)V
    //   1019: iinc 18 1
    //   1022: goto -115 -> 907
    //   1025: getstatic 1087	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   1028: invokevirtual 1248	android/app/Activity:finish	()V
    //   1031: aload_0
    //   1032: putstatic 1087	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   1035: goto -1020 -> 15
    //   1038: aload_0
    //   1039: invokevirtual 1101	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   1042: sipush 512
    //   1045: sipush 512
    //   1048: invokevirtual 1251	android/view/Window:setFlags	(II)V
    //   1051: goto -992 -> 59
    //   1054: astore 29
    //   1056: aload 29
    //   1058: invokestatic 1257	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1061: invokestatic 1072	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1064: goto -919 -> 145
    //   1067: aload_2
    //   1068: ldc_w 1259
    //   1071: invokevirtual 1261	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   1074: ifeq +58 -> 1132
    //   1077: aload_0
    //   1078: aload_2
    //   1079: ldc_w 1259
    //   1082: invokevirtual 1159	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1085: putfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1088: aload_0
    //   1089: aload_2
    //   1090: ldc_w 1165
    //   1093: invokevirtual 1159	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1096: putfield 268	com/admarvel/android/ads/AdMarvelVideoActivity:P	Ljava/lang/String;
    //   1099: aload_0
    //   1100: getfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1103: ifnull +21 -> 1124
    //   1106: aload_0
    //   1107: getfield 1163	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1110: invokevirtual 558	java/lang/String:length	()I
    //   1113: ifle +11 -> 1124
    //   1116: aload_0
    //   1117: iconst_1
    //   1118: putfield 946	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   1121: goto -935 -> 186
    //   1124: aload_0
    //   1125: iconst_0
    //   1126: putfield 946	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   1129: goto -943 -> 186
    //   1132: aload_0
    //   1133: invokevirtual 1023	com/admarvel/android/ads/AdMarvelVideoActivity:finish	()V
    //   1136: goto -950 -> 186
    //   1139: astore 11
    //   1141: aload 11
    //   1143: invokevirtual 1264	java/lang/Exception:printStackTrace	()V
    //   1146: goto -739 -> 407
    //   1149: astore 10
    //   1151: aload 10
    //   1153: invokevirtual 1267	javax/xml/parsers/ParserConfigurationException:getMessage	()Ljava/lang/String;
    //   1156: invokestatic 1072	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1159: return
    //   1160: astore 27
    //   1162: new 265	java/lang/StringBuilder
    //   1165: dup
    //   1166: invokespecial 266	java/lang/StringBuilder:<init>	()V
    //   1169: ldc_w 1269
    //   1172: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1175: aload 27
    //   1177: invokevirtual 1270	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1180: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1183: invokevirtual 278	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1186: invokestatic 1072	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1189: aload_0
    //   1190: invokevirtual 1023	com/admarvel/android/ads/AdMarvelVideoActivity:finish	()V
    //   1193: goto -717 -> 476
    //   1196: astore 9
    //   1198: aload 9
    //   1200: invokevirtual 1271	org/xml/sax/SAXException:getMessage	()Ljava/lang/String;
    //   1203: invokestatic 1072	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1206: return
    //   1207: aload 20
    //   1209: ifnull -190 -> 1019
    //   1212: aload_0
    //   1213: getfield 554	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1216: ifnonnull -197 -> 1019
    //   1219: new 1273	com/admarvel/android/ads/AdMarvelVideoActivity$a
    //   1222: dup
    //   1223: aload_0
    //   1224: aload 20
    //   1226: invokespecial 1274	com/admarvel/android/ads/AdMarvelVideoActivity$a:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;Landroid/widget/ImageView;)V
    //   1229: astore 21
    //   1231: aload_0
    //   1232: new 704	com/admarvel/android/ads/AdMarvelVideoActivity$h
    //   1235: dup
    //   1236: aload_0
    //   1237: getfield 493	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1240: aload 21
    //   1242: sipush 1000
    //   1245: invokespecial 747	com/admarvel/android/ads/AdMarvelVideoActivity$h:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;I)V
    //   1248: putfield 554	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1251: aload_0
    //   1252: getfield 554	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1255: invokevirtual 749	com/admarvel/android/ads/AdMarvelVideoActivity$h:a	()V
    //   1258: goto -239 -> 1019
    //   1261: astore 8
    //   1263: aload 8
    //   1265: invokevirtual 1275	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1268: invokestatic 1072	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1271: return
    //   1272: aload_0
    //   1273: new 704	com/admarvel/android/ads/AdMarvelVideoActivity$h
    //   1276: dup
    //   1277: aload_0
    //   1278: getfield 493	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1281: aload_0
    //   1282: getfield 177	com/admarvel/android/ads/AdMarvelVideoActivity:af	Ljava/lang/Runnable;
    //   1285: sipush 1000
    //   1288: aload_0
    //   1289: getfield 129	com/admarvel/android/ads/AdMarvelVideoActivity:w	I
    //   1292: imul
    //   1293: invokespecial 747	com/admarvel/android/ads/AdMarvelVideoActivity$h:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;I)V
    //   1296: putfield 708	com/admarvel/android/ads/AdMarvelVideoActivity:V	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1299: aload_0
    //   1300: getfield 708	com/admarvel/android/ads/AdMarvelVideoActivity:V	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1303: invokevirtual 749	com/admarvel/android/ads/AdMarvelVideoActivity$h:a	()V
    //   1306: aload_0
    //   1307: getfield 137	com/admarvel/android/ads/AdMarvelVideoActivity:C	Z
    //   1310: ifeq +47 -> 1357
    //   1313: aload_0
    //   1314: getfield 655	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1317: ifnonnull +40 -> 1357
    //   1320: aload_0
    //   1321: invokestatic 944	java/lang/System:currentTimeMillis	()J
    //   1324: putfield 662	com/admarvel/android/ads/AdMarvelVideoActivity:E	J
    //   1327: aload_0
    //   1328: new 704	com/admarvel/android/ads/AdMarvelVideoActivity$h
    //   1331: dup
    //   1332: aload_0
    //   1333: getfield 493	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1336: aload_0
    //   1337: getfield 182	com/admarvel/android/ads/AdMarvelVideoActivity:ag	Ljava/lang/Runnable;
    //   1340: sipush 500
    //   1343: iconst_0
    //   1344: invokespecial 1278	com/admarvel/android/ads/AdMarvelVideoActivity$h:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;IZ)V
    //   1347: putfield 655	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1350: aload_0
    //   1351: getfield 655	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$h;
    //   1354: invokevirtual 749	com/admarvel/android/ads/AdMarvelVideoActivity$h:a	()V
    //   1357: aload_3
    //   1358: aload_0
    //   1359: getfield 192	com/admarvel/android/ads/AdMarvelVideoActivity:ai	Landroid/view/View$OnTouchListener;
    //   1362: invokevirtual 1279	android/widget/RelativeLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   1365: new 1281	android/content/IntentFilter
    //   1368: dup
    //   1369: ldc_w 1283
    //   1372: invokespecial 1284	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   1375: astore 15
    //   1377: aload 15
    //   1379: ldc_w 1286
    //   1382: invokevirtual 1289	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   1385: aload_0
    //   1386: new 1291	com/admarvel/android/ads/AdMarvelVideoActivity$g
    //   1389: dup
    //   1390: aload_0
    //   1391: invokespecial 1292	com/admarvel/android/ads/AdMarvelVideoActivity$g:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;)V
    //   1394: putfield 1294	com/admarvel/android/ads/AdMarvelVideoActivity:ac	Landroid/content/BroadcastReceiver;
    //   1397: aload_0
    //   1398: aload_0
    //   1399: getfield 1294	com/admarvel/android/ads/AdMarvelVideoActivity:ac	Landroid/content/BroadcastReceiver;
    //   1402: aload 15
    //   1404: invokevirtual 1298	com/admarvel/android/ads/AdMarvelVideoActivity:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   1407: pop
    //   1408: return
    //
    // Exception table:
    //   from	to	target	type
    //   97	145	1054	java/lang/Exception
    //   399	407	1139	java/lang/Exception
    //   399	407	1149	javax/xml/parsers/ParserConfigurationException
    //   407	435	1149	javax/xml/parsers/ParserConfigurationException
    //   435	457	1149	javax/xml/parsers/ParserConfigurationException
    //   462	476	1149	javax/xml/parsers/ParserConfigurationException
    //   476	529	1149	javax/xml/parsers/ParserConfigurationException
    //   529	558	1149	javax/xml/parsers/ParserConfigurationException
    //   558	633	1149	javax/xml/parsers/ParserConfigurationException
    //   633	656	1149	javax/xml/parsers/ParserConfigurationException
    //   656	681	1149	javax/xml/parsers/ParserConfigurationException
    //   686	830	1149	javax/xml/parsers/ParserConfigurationException
    //   830	846	1149	javax/xml/parsers/ParserConfigurationException
    //   846	879	1149	javax/xml/parsers/ParserConfigurationException
    //   884	892	1149	javax/xml/parsers/ParserConfigurationException
    //   897	904	1149	javax/xml/parsers/ParserConfigurationException
    //   907	942	1149	javax/xml/parsers/ParserConfigurationException
    //   947	996	1149	javax/xml/parsers/ParserConfigurationException
    //   1001	1019	1149	javax/xml/parsers/ParserConfigurationException
    //   1141	1146	1149	javax/xml/parsers/ParserConfigurationException
    //   1162	1189	1149	javax/xml/parsers/ParserConfigurationException
    //   1189	1193	1149	javax/xml/parsers/ParserConfigurationException
    //   1212	1258	1149	javax/xml/parsers/ParserConfigurationException
    //   1272	1357	1149	javax/xml/parsers/ParserConfigurationException
    //   1357	1408	1149	javax/xml/parsers/ParserConfigurationException
    //   462	476	1160	java/lang/Exception
    //   399	407	1196	org/xml/sax/SAXException
    //   407	435	1196	org/xml/sax/SAXException
    //   435	457	1196	org/xml/sax/SAXException
    //   462	476	1196	org/xml/sax/SAXException
    //   476	529	1196	org/xml/sax/SAXException
    //   529	558	1196	org/xml/sax/SAXException
    //   558	633	1196	org/xml/sax/SAXException
    //   633	656	1196	org/xml/sax/SAXException
    //   656	681	1196	org/xml/sax/SAXException
    //   686	830	1196	org/xml/sax/SAXException
    //   830	846	1196	org/xml/sax/SAXException
    //   846	879	1196	org/xml/sax/SAXException
    //   884	892	1196	org/xml/sax/SAXException
    //   897	904	1196	org/xml/sax/SAXException
    //   907	942	1196	org/xml/sax/SAXException
    //   947	996	1196	org/xml/sax/SAXException
    //   1001	1019	1196	org/xml/sax/SAXException
    //   1141	1146	1196	org/xml/sax/SAXException
    //   1162	1189	1196	org/xml/sax/SAXException
    //   1189	1193	1196	org/xml/sax/SAXException
    //   1212	1258	1196	org/xml/sax/SAXException
    //   1272	1357	1196	org/xml/sax/SAXException
    //   1357	1408	1196	org/xml/sax/SAXException
    //   399	407	1261	java/io/IOException
    //   407	435	1261	java/io/IOException
    //   435	457	1261	java/io/IOException
    //   462	476	1261	java/io/IOException
    //   476	529	1261	java/io/IOException
    //   529	558	1261	java/io/IOException
    //   558	633	1261	java/io/IOException
    //   633	656	1261	java/io/IOException
    //   656	681	1261	java/io/IOException
    //   686	830	1261	java/io/IOException
    //   830	846	1261	java/io/IOException
    //   846	879	1261	java/io/IOException
    //   884	892	1261	java/io/IOException
    //   897	904	1261	java/io/IOException
    //   907	942	1261	java/io/IOException
    //   947	996	1261	java/io/IOException
    //   1001	1019	1261	java/io/IOException
    //   1141	1146	1261	java/io/IOException
    //   1162	1189	1261	java/io/IOException
    //   1189	1193	1261	java/io/IOException
    //   1212	1258	1261	java/io/IOException
    //   1272	1357	1261	java/io/IOException
    //   1357	1408	1261	java/io/IOException
  }

  protected void onDestroy()
  {
    super.onDestroy();
    s();
    if (this.ac != null)
    {
      unregisterReceiver(this.ac);
      this.ac = null;
    }
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    c(false);
    this.i = AdMarvelVideoActivity.j.e;
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
    }
    if (paramMediaPlayer != null)
    {
      paramMediaPlayer.reset();
      paramMediaPlayer.release();
    }
    return false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0);
    switch (paramInt)
    {
    default:
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 4:
    }
    s locals;
    if (this.M != null)
    {
      locals = (s)this.M.get();
      if (locals == null);
    }
    for (boolean bool = locals.b(); ; bool = false)
    {
      if ((!this.s) || (!bool) || (!this.v))
        c();
      return true;
    }
  }

  protected void onPause()
  {
    super.onPause();
    if (!isFinishing());
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).pause();
      label21: Logging.log("Video Activity onPause is called");
      if (this.i == AdMarvelVideoActivity.j.b)
        if (this.L != null)
        {
          if (!this.H)
            break label95;
          this.L.d();
          this.F = true;
          this.i = AdMarvelVideoActivity.j.g;
        }
      while (true)
      {
        if ((this.Y != null) && (this.Y.c()))
          this.Y.b();
        return;
        label95: if (this.I)
        {
          this.L.d();
          this.G = true;
          this.i = AdMarvelVideoActivity.j.g;
        }
        else
        {
          this.L.pause();
          this.i = AdMarvelVideoActivity.j.c;
          continue;
          if (((this.i == AdMarvelVideoActivity.j.d) || (this.i == AdMarvelVideoActivity.j.e)) && (this.L != null) && (!this.L.isPlaying()))
            this.L.a(true);
        }
      }
    }
    catch (Exception localException)
    {
      break label21;
    }
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    try
    {
      if (this.h != null)
        this.h.setVisibility(8);
      if (this.u)
      {
        if (this.Y == null)
          this.Y = new AdMarvelVideoActivity.h(this.N, this.ah, 3100, true);
        LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
        if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() == 0))
        {
          this.Y.a();
          this.aa = System.currentTimeMillis();
        }
      }
      if (this.j == AdMarvelVideoActivity.l.a)
        this.L.b();
      if (this.ab)
      {
        if (q())
        {
          this.L.b();
          this.j = AdMarvelVideoActivity.l.a;
          r();
        }
        this.ab = false;
      }
      c(true);
      if (this.L != null)
      {
        a(this.L);
        a(AdMarvelVideoActivity.k.a);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Logging.log(Log.getStackTraceString(localException));
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
      label14: if ((this.L != null) && ((this.i == AdMarvelVideoActivity.j.c) || ((!this.L.isPlaying()) && (this.i == AdMarvelVideoActivity.j.g))))
      {
        if (this.h != null)
          this.h.setVisibility(0);
        this.L.e();
        if (this.Y != null)
          this.Y.a();
      }
      this.F = false;
      this.d = false;
      return;
    }
    catch (Exception localException)
    {
      break label14;
    }
  }

  protected void onStart()
  {
    super.onStart();
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected void onStop()
  {
    super.onStop();
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).stop();
      label14: Logging.log("Video Activity onStop is called");
      if ((this.L != null) && (!this.L.isPlaying()) && (this.i == AdMarvelVideoActivity.j.g) && (!this.I))
        a(AdMarvelVideoActivity.k.c);
      PowerManager localPowerManager = (PowerManager)getSystemService("power");
      StringBuilder localStringBuilder = new StringBuilder().append("Video Activity onStop isScreenOn: ");
      Object localObject;
      if (localPowerManager != null)
      {
        localObject = Boolean.valueOf(localPowerManager.isScreenOn());
        Logging.log(localObject);
        if ((isFinishing()) || (!this.F) || (this.i != AdMarvelVideoActivity.j.g) || (this.L == null) || (!this.L.isPlaying()) || (localPowerManager == null) || (localPowerManager.isScreenOn()))
          break label222;
        this.i = AdMarvelVideoActivity.j.b;
        this.F = false;
      }
      while (true)
      {
        if ((this.W != null) && ((!this.H) || (!this.L.isPlaying()) || (localPowerManager.isScreenOn())))
          this.W.b();
        return;
        localObject = "powermanager null";
        break;
        label222: if ((!isFinishing()) && (this.I) && (!this.d))
          c();
      }
    }
    catch (Exception localException)
    {
      break label14;
    }
  }

  public void onUserInteraction()
  {
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null))
    {
      if (localLinearLayout.getVisibility() != 0)
        break label68;
      this.aa = System.currentTimeMillis();
      if ((this.Y != null) && (this.Y.c()))
      {
        this.Y.b();
        this.Y.a();
      }
    }
    return;
    label68: b(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity
 * JD-Core Version:    0.6.2
 */