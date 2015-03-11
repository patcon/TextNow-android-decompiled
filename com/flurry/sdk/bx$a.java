package com.flurry.sdk;

import com.millennialmedia.android.MMAd;
import com.millennialmedia.android.MMException;
import com.millennialmedia.android.RequestListener;
import java.util.Collections;

final class bx$a
  implements RequestListener
{
  private bx$a(bx parambx)
  {
  }

  public final void MMAdOverlayClosed(MMAd paramMMAd)
  {
    eo.a(3, bx.a(), "Millennial MMAdView banner overlay closed.");
  }

  public final void MMAdOverlayLaunched(MMAd paramMMAd)
  {
    eo.a(3, bx.a(), "Millennial MMAdView banner overlay launched.");
  }

  public final void MMAdRequestIsCaching(MMAd paramMMAd)
  {
    eo.a(3, bx.a(), "Millennial MMAdView banner request is caching.");
  }

  public final void onSingleTap(MMAd paramMMAd)
  {
    this.a.onAdClicked(Collections.emptyMap());
    eo.a(3, bx.a(), "Millennial MMAdView banner tapped.");
  }

  public final void requestCompleted(MMAd paramMMAd)
  {
    this.a.onAdShown(Collections.emptyMap());
    eo.a(3, bx.a(), "Millennial MMAdView returned ad." + System.currentTimeMillis());
  }

  public final void requestFailed(MMAd paramMMAd, MMException paramMMException)
  {
    this.a.onRenderFailed(Collections.emptyMap());
    eo.a(3, bx.a(), "Millennial MMAdView failed to load ad with error: " + paramMMException);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bx.a
 * JD-Core Version:    0.6.2
 */