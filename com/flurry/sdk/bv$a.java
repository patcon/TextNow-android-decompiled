package com.flurry.sdk;

import com.inmobi.monetization.IMErrorCode;
import com.inmobi.monetization.IMInterstitial;
import com.inmobi.monetization.IMInterstitial.State;
import com.inmobi.monetization.IMInterstitialListener;
import java.util.Collections;
import java.util.Map;

final class bv$a
  implements IMInterstitialListener
{
  private bv$a(bv parambv)
  {
  }

  public final void onDismissInterstitialScreen(IMInterstitial paramIMInterstitial)
  {
    this.a.c(Collections.emptyMap());
    eo.a(3, bv.f(), "InMobi Interstitial ad dismissed.");
  }

  public final void onInterstitialFailed(IMInterstitial paramIMInterstitial, IMErrorCode paramIMErrorCode)
  {
    this.a.d(Collections.emptyMap());
    eo.a(3, bv.f(), "InMobi imAdView ad request failed. ErrorCode  = " + paramIMErrorCode.toString());
  }

  public final void onInterstitialInteraction(IMInterstitial paramIMInterstitial, Map<String, String> paramMap)
  {
    this.a.b(Collections.emptyMap());
    eo.a(3, bv.f(), "InMobi onBannerInteraction");
  }

  public final void onInterstitialLoaded(IMInterstitial paramIMInterstitial)
  {
    eo.a(3, bv.f(), "InMobi Interstitial ad request completed.");
    if (IMInterstitial.State.READY.equals(paramIMInterstitial.getState()))
    {
      this.a.a(Collections.emptyMap());
      paramIMInterstitial.show();
    }
  }

  public final void onLeaveApplication(IMInterstitial paramIMInterstitial)
  {
    this.a.b(Collections.emptyMap());
    eo.a(3, bv.f(), "InMobi onLeaveApplication");
  }

  public final void onShowInterstitialScreen(IMInterstitial paramIMInterstitial)
  {
    eo.a(3, bv.f(), "InMobi Interstitial ad shown.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bv.a
 * JD-Core Version:    0.6.2
 */