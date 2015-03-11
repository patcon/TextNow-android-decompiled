package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

public class CustomEventInterstitialAdapter
  implements CustomEventInterstitial.CustomEventInterstitialListener
{
  public static final int DEFAULT_INTERSTITIAL_TIMEOUT_DELAY = 30000;
  private Context mContext;
  private CustomEventInterstitial mCustomEventInterstitial;
  private CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener mCustomEventInterstitialAdapterListener;
  private final Handler mHandler;
  private boolean mInvalidated;
  private Map<String, Object> mLocalExtras;
  private final MoPubInterstitial mMoPubInterstitial;
  private Map<String, String> mServerExtras;
  private final Runnable mTimeout;

  // ERROR //
  public CustomEventInterstitialAdapter(MoPubInterstitial paramMoPubInterstitial, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 35	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 37	android/os/Handler
    //   8: dup
    //   9: invokespecial 38	android/os/Handler:<init>	()V
    //   12: putfield 40	com/mopub/mobileads/CustomEventInterstitialAdapter:mHandler	Landroid/os/Handler;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   20: aload_0
    //   21: new 44	java/util/HashMap
    //   24: dup
    //   25: invokespecial 45	java/util/HashMap:<init>	()V
    //   28: putfield 47	com/mopub/mobileads/CustomEventInterstitialAdapter:mServerExtras	Ljava/util/Map;
    //   31: aload_0
    //   32: new 44	java/util/HashMap
    //   35: dup
    //   36: invokespecial 45	java/util/HashMap:<init>	()V
    //   39: putfield 49	com/mopub/mobileads/CustomEventInterstitialAdapter:mLocalExtras	Ljava/util/Map;
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   47: invokevirtual 55	com/mopub/mobileads/MoPubInterstitial:getActivity	()Landroid/app/Activity;
    //   50: putfield 57	com/mopub/mobileads/CustomEventInterstitialAdapter:mContext	Landroid/content/Context;
    //   53: aload_0
    //   54: new 59	com/mopub/mobileads/CustomEventInterstitialAdapter$1
    //   57: dup
    //   58: aload_0
    //   59: invokespecial 62	com/mopub/mobileads/CustomEventInterstitialAdapter$1:<init>	(Lcom/mopub/mobileads/CustomEventInterstitialAdapter;)V
    //   62: putfield 64	com/mopub/mobileads/CustomEventInterstitialAdapter:mTimeout	Ljava/lang/Runnable;
    //   65: new 66	java/lang/StringBuilder
    //   68: dup
    //   69: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   72: ldc 69
    //   74: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_2
    //   78: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 83	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   87: aload_0
    //   88: aload_2
    //   89: invokestatic 89	com/mopub/mobileads/factories/CustomEventInterstitialFactory:create	(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventInterstitial;
    //   92: putfield 91	com/mopub/mobileads/CustomEventInterstitialAdapter:mCustomEventInterstitial	Lcom/mopub/mobileads/CustomEventInterstitial;
    //   95: aload_0
    //   96: aload_3
    //   97: invokestatic 97	com/mopub/common/util/Json:jsonStringToMap	(Ljava/lang/String;)Ljava/util/Map;
    //   100: putfield 47	com/mopub/mobileads/CustomEventInterstitialAdapter:mServerExtras	Ljava/util/Map;
    //   103: aload_0
    //   104: aload_0
    //   105: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   108: invokevirtual 101	com/mopub/mobileads/MoPubInterstitial:getLocalExtras	()Ljava/util/Map;
    //   111: putfield 49	com/mopub/mobileads/CustomEventInterstitialAdapter:mLocalExtras	Ljava/util/Map;
    //   114: aload_0
    //   115: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   118: invokevirtual 105	com/mopub/mobileads/MoPubInterstitial:getLocation	()Landroid/location/Location;
    //   121: ifnull +22 -> 143
    //   124: aload_0
    //   125: getfield 49	com/mopub/mobileads/CustomEventInterstitialAdapter:mLocalExtras	Ljava/util/Map;
    //   128: ldc 107
    //   130: aload_0
    //   131: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   134: invokevirtual 105	com/mopub/mobileads/MoPubInterstitial:getLocation	()Landroid/location/Location;
    //   137: invokeinterface 113 3 0
    //   142: pop
    //   143: aload_0
    //   144: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   147: invokevirtual 117	com/mopub/mobileads/MoPubInterstitial:getMoPubInterstitialView	()Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;
    //   150: invokevirtual 123	com/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView:getAdViewController	()Lcom/mopub/mobileads/AdViewController;
    //   153: astore 6
    //   155: aload 6
    //   157: ifnull +20 -> 177
    //   160: aload_0
    //   161: getfield 49	com/mopub/mobileads/CustomEventInterstitialAdapter:mLocalExtras	Ljava/util/Map;
    //   164: ldc 125
    //   166: aload 6
    //   168: invokevirtual 131	com/mopub/mobileads/AdViewController:getAdConfiguration	()Lcom/mopub/mobileads/AdConfiguration;
    //   171: invokeinterface 113 3 0
    //   176: pop
    //   177: return
    //   178: astore 4
    //   180: new 66	java/lang/StringBuilder
    //   183: dup
    //   184: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   187: ldc 133
    //   189: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: aload_2
    //   193: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: ldc 135
    //   198: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokestatic 83	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   207: aload_0
    //   208: getfield 42	com/mopub/mobileads/CustomEventInterstitialAdapter:mMoPubInterstitial	Lcom/mopub/mobileads/MoPubInterstitial;
    //   211: getstatic 141	com/mopub/mobileads/MoPubErrorCode:ADAPTER_NOT_FOUND	Lcom/mopub/mobileads/MoPubErrorCode;
    //   214: invokevirtual 145	com/mopub/mobileads/MoPubInterstitial:onCustomEventInterstitialFailed	(Lcom/mopub/mobileads/MoPubErrorCode;)V
    //   217: return
    //   218: astore 5
    //   220: new 66	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   227: ldc 147
    //   229: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: aload_3
    //   233: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokestatic 83	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   242: goto -139 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   87	95	178	java/lang/Exception
    //   95	103	218	java/lang/Exception
  }

  private void cancelTimeout()
  {
    this.mHandler.removeCallbacks(this.mTimeout);
  }

  private int getTimeoutDelayMilliseconds()
  {
    if ((this.mMoPubInterstitial == null) || (this.mMoPubInterstitial.getAdTimeoutDelay() == null) || (this.mMoPubInterstitial.getAdTimeoutDelay().intValue() < 0))
      return 30000;
    return 1000 * this.mMoPubInterstitial.getAdTimeoutDelay().intValue();
  }

  void invalidate()
  {
    if (this.mCustomEventInterstitial != null)
      this.mCustomEventInterstitial.onInvalidate();
    this.mCustomEventInterstitial = null;
    this.mContext = null;
    this.mServerExtras = null;
    this.mLocalExtras = null;
    this.mCustomEventInterstitialAdapterListener = null;
    this.mInvalidated = true;
  }

  boolean isInvalidated()
  {
    return this.mInvalidated;
  }

  void loadInterstitial()
  {
    if ((isInvalidated()) || (this.mCustomEventInterstitial == null))
      return;
    if (getTimeoutDelayMilliseconds() > 0)
      this.mHandler.postDelayed(this.mTimeout, getTimeoutDelayMilliseconds());
    this.mCustomEventInterstitial.loadInterstitial(this.mContext, this, this.mLocalExtras, this.mServerExtras);
  }

  public void onInterstitialClicked()
  {
    if (isInvalidated());
    while (this.mCustomEventInterstitialAdapterListener == null)
      return;
    this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialClicked();
  }

  public void onInterstitialDismissed()
  {
    if (isInvalidated());
    while (this.mCustomEventInterstitialAdapterListener == null)
      return;
    this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialDismissed();
  }

  public void onInterstitialFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    if (isInvalidated());
    while (this.mCustomEventInterstitialAdapterListener == null)
      return;
    if (paramMoPubErrorCode == null)
      paramMoPubErrorCode = MoPubErrorCode.UNSPECIFIED;
    cancelTimeout();
    this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialFailed(paramMoPubErrorCode);
  }

  public void onInterstitialLoaded()
  {
    if (isInvalidated());
    do
    {
      return;
      cancelTimeout();
    }
    while (this.mCustomEventInterstitialAdapterListener == null);
    this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialLoaded();
  }

  public void onInterstitialShown()
  {
    if (isInvalidated());
    while (this.mCustomEventInterstitialAdapterListener == null)
      return;
    this.mCustomEventInterstitialAdapterListener.onCustomEventInterstitialShown();
  }

  public void onLeaveApplication()
  {
    onInterstitialClicked();
  }

  void setAdapterListener(CustomEventInterstitialAdapter.CustomEventInterstitialAdapterListener paramCustomEventInterstitialAdapterListener)
  {
    this.mCustomEventInterstitialAdapterListener = paramCustomEventInterstitialAdapterListener;
  }

  @Deprecated
  void setCustomEventInterstitial(CustomEventInterstitial paramCustomEventInterstitial)
  {
    this.mCustomEventInterstitial = paramCustomEventInterstitial;
  }

  void showInterstitial()
  {
    if ((isInvalidated()) || (this.mCustomEventInterstitial == null))
      return;
    this.mCustomEventInterstitial.showInterstitial();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventInterstitialAdapter
 * JD-Core Version:    0.6.2
 */