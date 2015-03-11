package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

public class CustomEventBannerAdapter
  implements CustomEventBanner.CustomEventBannerListener
{
  public static final int DEFAULT_BANNER_TIMEOUT_DELAY = 10000;
  private Context mContext;
  private CustomEventBanner mCustomEventBanner;
  private final Handler mHandler;
  private boolean mInvalidated;
  private Map<String, Object> mLocalExtras;
  private MoPubView mMoPubView;
  private Map<String, String> mServerExtras;
  private boolean mStoredAutorefresh;
  private final Runnable mTimeout;

  // ERROR //
  public CustomEventBannerAdapter(MoPubView paramMoPubView, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 34	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 36	android/os/Handler
    //   8: dup
    //   9: invokespecial 37	android/os/Handler:<init>	()V
    //   12: putfield 39	com/mopub/mobileads/CustomEventBannerAdapter:mHandler	Landroid/os/Handler;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual 47	com/mopub/mobileads/MoPubView:getContext	()Landroid/content/Context;
    //   25: putfield 49	com/mopub/mobileads/CustomEventBannerAdapter:mContext	Landroid/content/Context;
    //   28: aload_0
    //   29: new 51	java/util/HashMap
    //   32: dup
    //   33: invokespecial 52	java/util/HashMap:<init>	()V
    //   36: putfield 54	com/mopub/mobileads/CustomEventBannerAdapter:mLocalExtras	Ljava/util/Map;
    //   39: aload_0
    //   40: new 51	java/util/HashMap
    //   43: dup
    //   44: invokespecial 52	java/util/HashMap:<init>	()V
    //   47: putfield 56	com/mopub/mobileads/CustomEventBannerAdapter:mServerExtras	Ljava/util/Map;
    //   50: aload_0
    //   51: new 58	com/mopub/mobileads/CustomEventBannerAdapter$1
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 61	com/mopub/mobileads/CustomEventBannerAdapter$1:<init>	(Lcom/mopub/mobileads/CustomEventBannerAdapter;)V
    //   59: putfield 63	com/mopub/mobileads/CustomEventBannerAdapter:mTimeout	Ljava/lang/Runnable;
    //   62: new 65	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   69: ldc 68
    //   71: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_2
    //   75: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 82	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: aload_2
    //   86: invokestatic 88	com/mopub/mobileads/factories/CustomEventBannerFactory:create	(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventBanner;
    //   89: putfield 90	com/mopub/mobileads/CustomEventBannerAdapter:mCustomEventBanner	Lcom/mopub/mobileads/CustomEventBanner;
    //   92: aload_0
    //   93: aload_3
    //   94: invokestatic 96	com/mopub/common/util/Json:jsonStringToMap	(Ljava/lang/String;)Ljava/util/Map;
    //   97: putfield 56	com/mopub/mobileads/CustomEventBannerAdapter:mServerExtras	Ljava/util/Map;
    //   100: aload_0
    //   101: aload_0
    //   102: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   105: invokevirtual 100	com/mopub/mobileads/MoPubView:getLocalExtras	()Ljava/util/Map;
    //   108: putfield 54	com/mopub/mobileads/CustomEventBannerAdapter:mLocalExtras	Ljava/util/Map;
    //   111: aload_0
    //   112: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   115: invokevirtual 104	com/mopub/mobileads/MoPubView:getLocation	()Landroid/location/Location;
    //   118: ifnull +22 -> 140
    //   121: aload_0
    //   122: getfield 54	com/mopub/mobileads/CustomEventBannerAdapter:mLocalExtras	Ljava/util/Map;
    //   125: ldc 106
    //   127: aload_0
    //   128: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   131: invokevirtual 104	com/mopub/mobileads/MoPubView:getLocation	()Landroid/location/Location;
    //   134: invokeinterface 112 3 0
    //   139: pop
    //   140: aload_0
    //   141: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   144: invokevirtual 116	com/mopub/mobileads/MoPubView:getAdViewController	()Lcom/mopub/mobileads/AdViewController;
    //   147: ifnull +25 -> 172
    //   150: aload_0
    //   151: getfield 54	com/mopub/mobileads/CustomEventBannerAdapter:mLocalExtras	Ljava/util/Map;
    //   154: ldc 118
    //   156: aload_0
    //   157: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   160: invokevirtual 116	com/mopub/mobileads/MoPubView:getAdViewController	()Lcom/mopub/mobileads/AdViewController;
    //   163: invokevirtual 124	com/mopub/mobileads/AdViewController:getAdConfiguration	()Lcom/mopub/mobileads/AdConfiguration;
    //   166: invokeinterface 112 3 0
    //   171: pop
    //   172: return
    //   173: astore 4
    //   175: new 65	java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   182: ldc 126
    //   184: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload_2
    //   188: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: ldc 128
    //   193: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokestatic 82	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   202: aload_0
    //   203: getfield 41	com/mopub/mobileads/CustomEventBannerAdapter:mMoPubView	Lcom/mopub/mobileads/MoPubView;
    //   206: getstatic 134	com/mopub/mobileads/MoPubErrorCode:ADAPTER_NOT_FOUND	Lcom/mopub/mobileads/MoPubErrorCode;
    //   209: invokevirtual 138	com/mopub/mobileads/MoPubView:loadFailUrl	(Lcom/mopub/mobileads/MoPubErrorCode;)V
    //   212: return
    //   213: astore 5
    //   215: new 65	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   222: ldc 140
    //   224: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: aload_3
    //   228: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload 5
    //   233: invokevirtual 141	java/lang/Exception:toString	()Ljava/lang/String;
    //   236: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: invokestatic 82	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   245: goto -145 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   84	92	173	java/lang/Exception
    //   92	100	213	java/lang/Exception
  }

  private void cancelTimeout()
  {
    this.mHandler.removeCallbacks(this.mTimeout);
  }

  private int getTimeoutDelayMilliseconds()
  {
    if ((this.mMoPubView == null) || (this.mMoPubView.getAdTimeoutDelay() == null) || (this.mMoPubView.getAdTimeoutDelay().intValue() < 0))
      return 10000;
    return 1000 * this.mMoPubView.getAdTimeoutDelay().intValue();
  }

  void invalidate()
  {
    if (this.mCustomEventBanner != null)
      this.mCustomEventBanner.onInvalidate();
    this.mContext = null;
    this.mCustomEventBanner = null;
    this.mLocalExtras = null;
    this.mServerExtras = null;
    this.mInvalidated = true;
  }

  boolean isInvalidated()
  {
    return this.mInvalidated;
  }

  void loadAd()
  {
    if ((isInvalidated()) || (this.mCustomEventBanner == null))
      return;
    if (getTimeoutDelayMilliseconds() > 0)
      this.mHandler.postDelayed(this.mTimeout, getTimeoutDelayMilliseconds());
    this.mCustomEventBanner.loadBanner(this.mContext, this, this.mLocalExtras, this.mServerExtras);
  }

  public void onBannerClicked()
  {
    if (isInvalidated());
    while (this.mMoPubView == null)
      return;
    this.mMoPubView.registerClick();
  }

  public void onBannerCollapsed()
  {
    if (isInvalidated())
      return;
    this.mMoPubView.setAutorefreshEnabled(this.mStoredAutorefresh);
    this.mMoPubView.adClosed();
  }

  public void onBannerExpanded()
  {
    if (isInvalidated())
      return;
    this.mStoredAutorefresh = this.mMoPubView.getAutorefreshEnabled();
    this.mMoPubView.setAutorefreshEnabled(false);
    this.mMoPubView.adPresentedOverlay();
  }

  public void onBannerFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    if (isInvalidated());
    while (this.mMoPubView == null)
      return;
    if (paramMoPubErrorCode == null)
      paramMoPubErrorCode = MoPubErrorCode.UNSPECIFIED;
    cancelTimeout();
    this.mMoPubView.loadFailUrl(paramMoPubErrorCode);
  }

  public void onBannerLoaded(View paramView)
  {
    if (isInvalidated());
    do
    {
      do
      {
        return;
        cancelTimeout();
      }
      while (this.mMoPubView == null);
      this.mMoPubView.nativeAdLoaded();
      this.mMoPubView.setAdContentView(paramView);
    }
    while ((paramView instanceof HtmlBannerWebView));
    this.mMoPubView.trackNativeImpression();
  }

  public void onLeaveApplication()
  {
    onBannerClicked();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventBannerAdapter
 * JD-Core Version:    0.6.2
 */