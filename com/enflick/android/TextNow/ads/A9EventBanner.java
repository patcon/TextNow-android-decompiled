package com.enflick.android.TextNow.ads;

import android.app.Activity;
import android.content.Context;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.IAmazonAds;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import com.mopub.mobileads.MoPubErrorCode;
import java.util.Map;
import textnow.u.r;

public class A9EventBanner extends CustomEventBanner
{
  private CustomEventBanner.CustomEventBannerListener a;
  private IAmazonAds b;

  public void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.a = paramCustomEventBannerListener;
    if (!(paramContext instanceof Activity))
      this.a.onBannerFailed(MoPubErrorCode.INTERNAL_ERROR);
    while (true)
    {
      return;
      if (this.b == null);
      try
      {
        this.b = ((IAmazonAds)CustomLoader.newBannerLoader(paramContext, "com.enflick.android.TextNow.customloader.wrappers.banner.AmazonAdsWrapper").loadWrapper(IAmazonAds.class, "com.enflick.android.TextNow.customloader.wrappers.banner.AmazonAdsWrapper"));
        label52: if (this.b == null)
          continue;
        try
        {
          this.b.init((Activity)paramContext);
          this.b.setListener(this.a);
          this.b.loadAd(new r(paramContext).q());
          return;
        }
        catch (Throwable localThrowable1)
        {
        }
      }
      catch (Throwable localThrowable2)
      {
        break label52;
      }
    }
  }

  public void onInvalidate()
  {
    if (this.b != null)
      this.b.invalidate();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.A9EventBanner
 * JD-Core Version:    0.6.2
 */