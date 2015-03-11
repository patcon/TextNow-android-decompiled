package com.flurry.sdk;

import com.millennialmedia.android.MMAd;
import com.millennialmedia.android.MMException;
import com.millennialmedia.android.MMInterstitial;
import com.millennialmedia.android.RequestListener;
import java.util.Collections;

final class bz$a
  implements RequestListener
{
  private bz$a(bz parambz)
  {
  }

  public final void MMAdOverlayClosed(MMAd paramMMAd)
  {
    this.a.c(Collections.emptyMap());
    eo.a(3, bz.f(), "Millennial MMAdView Interstitial overlay closed.");
  }

  public final void MMAdOverlayLaunched(MMAd paramMMAd)
  {
    this.a.a(Collections.emptyMap());
    eo.a(3, bz.f(), "Millennial MMAdView Interstitial overlay launched." + System.currentTimeMillis());
  }

  public final void MMAdRequestIsCaching(MMAd paramMMAd)
  {
    eo.a(3, bz.f(), "Millennial MMAdView Interstitial request is caching.");
  }

  public final void onSingleTap(MMAd paramMMAd)
  {
    this.a.b(Collections.emptyMap());
    eo.a(3, bz.f(), "Millennial MMAdView Interstitial tapped.");
  }

  public final void requestCompleted(MMAd paramMMAd)
  {
    eo.a(3, bz.f(), "Millennial MMAdView returned interstitial ad: " + System.currentTimeMillis());
    if (!bz.a(this.a))
      bz.b(this.a).display();
  }

  public final void requestFailed(MMAd paramMMAd, MMException paramMMException)
  {
    this.a.d(Collections.emptyMap());
    eo.a(3, bz.f(), "Millennial MMAdView Interstitial failed to load ad.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bz.a
 * JD-Core Version:    0.6.2
 */