package com.flurry.android;

import com.flurry.sdk.n;
import com.flurry.sdk.n.c;
import com.flurry.sdk.n.e;

final class FlurryFullscreenTakeoverActivity$a
  implements n.c
{
  private FlurryFullscreenTakeoverActivity$a(FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity)
  {
  }

  public final void a(n paramn, n.e parame)
  {
    FlurryFullscreenTakeoverActivity.a(this.a, parame);
    if (FlurryFullscreenTakeoverActivity.b(this.a) == n.e.c)
      FlurryFullscreenTakeoverActivity.fBasicWebViewClosingHandlerFired = true;
    this.a.finish();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryFullscreenTakeoverActivity.a
 * JD-Core Version:    0.6.2
 */