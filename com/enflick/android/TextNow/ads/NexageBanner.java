package com.enflick.android.TextNow.ads;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.INexage;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import com.mopub.mobileads.MoPubErrorCode;
import java.util.Map;

public class NexageBanner extends CustomEventBanner
{
  private INexage a;
  private CustomEventBanner.CustomEventBannerListener b;

  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.b = paramCustomEventBannerListener;
    if (!(paramContext instanceof Activity))
      this.b.onBannerFailed(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
    while (true)
    {
      return;
      if (this.a == null);
      try
      {
        this.a = ((INexage)CustomLoader.newBannerLoader(paramContext, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper").loadWrapper(INexage.class, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper"));
        label52: if (this.a == null)
          continue;
        this.a.setIsMediation(true);
        Object localObject = paramMap.get("location");
        if ((localObject instanceof Location));
        for (Location localLocation = (Location)localObject; ; localLocation = null)
        {
          this.a.initLocation(localLocation);
          this.a.fetchAds(paramContext, paramCustomEventBannerListener);
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        break label52;
      }
    }
  }

  protected void onInvalidate()
  {
    if (this.a != null)
      this.a.invalidate();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.NexageBanner
 * JD-Core Version:    0.6.2
 */