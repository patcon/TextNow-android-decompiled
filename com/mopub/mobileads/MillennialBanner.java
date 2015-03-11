package com.mopub.mobileads;

import android.content.Context;
import android.view.View;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.IMMSDK;
import java.util.Map;
import textnow.u.r;

class MillennialBanner extends CustomEventBanner
{
  public static final String AD_HEIGHT_KEY = "adHeight";
  public static final String AD_WIDTH_KEY = "adWidth";
  public static final String APID_KEY = "adUnitID";
  private CustomEventBanner.CustomEventBannerListener mBannerListener;
  private IMMSDK mMMSDK;

  private boolean extrasAreValid(Map<String, String> paramMap)
  {
    try
    {
      Integer.parseInt((String)paramMap.get("adWidth"));
      Integer.parseInt((String)paramMap.get("adHeight"));
      return paramMap.containsKey("adUnitID");
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return false;
  }

  @Deprecated
  View getMMAdView()
  {
    if (this.mMMSDK != null)
      return this.mMMSDK.getBannerView();
    return null;
  }

  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.mBannerListener = paramCustomEventBannerListener;
    String str;
    int i;
    int j;
    if (extrasAreValid(paramMap1))
    {
      str = (String)paramMap1.get("adUnitID");
      i = Integer.parseInt((String)paramMap1.get("adWidth"));
      j = Integer.parseInt((String)paramMap1.get("adHeight"));
      if (this.mMMSDK != null);
    }
    try
    {
      this.mMMSDK = ((IMMSDK)CustomLoader.newBannerLoader(paramContext, "com.enflick.android.TextNow.customloader.wrappers.banner.MMSDKWrapper").loadWrapper(IMMSDK.class, "com.enflick.android.TextNow.customloader.wrappers.banner.MMSDKWrapper"));
      label89: if (this.mMMSDK == null)
      {
        return;
        this.mBannerListener.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
        return;
      }
      r localr = new r(paramContext);
      this.mMMSDK.initialize(paramContext, str, i, j, localr.s(), localr.q());
      this.mMMSDK.setListener(this.mBannerListener);
      AdViewController.setShouldHonorServerDimensions(this.mMMSDK.getBannerView());
      this.mMMSDK.getAd();
      return;
    }
    catch (Throwable localThrowable)
    {
      break label89;
    }
  }

  protected void onInvalidate()
  {
    if (this.mMMSDK != null)
      this.mMMSDK.invalidate();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MillennialBanner
 * JD-Core Version:    0.6.2
 */