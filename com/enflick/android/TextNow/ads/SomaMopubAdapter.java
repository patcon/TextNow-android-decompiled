package com.enflick.android.TextNow.ads;

import android.content.Context;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.ISmaato;
import com.mopub.mobileads.CustomEventBanner;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import java.util.Map;

public class SomaMopubAdapter extends CustomEventBanner
{
  private ISmaato a;

  public void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    if (this.a == null);
    try
    {
      this.a = ((ISmaato)CustomLoader.newBannerLoader(paramContext, "com.enflick.android.TextNow.customloader.wrappers.banner.SmaatoWrapper").loadWrapper(ISmaato.class, "com.enflick.android.TextNow.customloader.wrappers.banner.SmaatoWrapper"));
      label27: if (this.a == null)
        return;
      this.a.fetchAd(paramContext, 923856987, 65831114, paramCustomEventBannerListener);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label27;
    }
  }

  public void onInvalidate()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.SomaMopubAdapter
 * JD-Core Version:    0.6.2
 */