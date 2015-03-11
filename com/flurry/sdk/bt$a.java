package com.flurry.sdk;

import com.inmobi.monetization.IMBanner;
import com.inmobi.monetization.IMBannerListener;
import com.inmobi.monetization.IMErrorCode;
import java.util.Collections;
import java.util.Map;

final class bt$a
  implements IMBannerListener
{
  private bt$a(bt parambt)
  {
  }

  public final void onBannerInteraction(IMBanner paramIMBanner, Map<String, String> paramMap)
  {
    this.a.onAdClicked(Collections.emptyMap());
    eo.a(3, bt.a(), "InMobi onBannerInteraction");
  }

  public final void onBannerRequestFailed(IMBanner paramIMBanner, IMErrorCode paramIMErrorCode)
  {
    this.a.onRenderFailed(Collections.emptyMap());
    eo.a(3, bt.a(), "InMobi imAdView ad request failed. " + paramIMErrorCode.toString());
  }

  public final void onBannerRequestSucceeded(IMBanner paramIMBanner)
  {
    this.a.onAdShown(Collections.emptyMap());
    eo.a(3, bt.a(), "InMobi imAdView ad request completed.");
  }

  public final void onDismissBannerScreen(IMBanner paramIMBanner)
  {
    this.a.onAdClosed(Collections.emptyMap());
    eo.a(3, bt.a(), "InMobi imAdView dismiss ad.");
  }

  public final void onLeaveApplication(IMBanner paramIMBanner)
  {
    eo.a(3, bt.a(), "InMobi onLeaveApplication");
  }

  public final void onShowBannerScreen(IMBanner paramIMBanner)
  {
    this.a.onAdClicked(Collections.emptyMap());
    eo.a(3, bt.a(), "InMobi imAdView ad shown.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bt.a
 * JD-Core Version:    0.6.2
 */