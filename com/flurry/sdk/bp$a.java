package com.flurry.sdk;

import com.google.android.gms.ads.AdListener;
import java.util.Collections;

final class bp$a extends AdListener
{
  private bp$a(bp parambp)
  {
  }

  public final void onAdClosed()
  {
    this.a.onAdClosed(Collections.emptyMap());
    eo.a(4, bp.a(), "GMS AdView onAdClosed.");
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.a.onRenderFailed(Collections.emptyMap());
    eo.a(5, bp.a(), "GMS AdView onAdFailedToLoad: " + paramInt + ".");
  }

  public final void onAdLeftApplication()
  {
    this.a.onAdClicked(Collections.emptyMap());
    eo.a(4, bp.a(), "GMS AdView onAdLeftApplication.");
  }

  public final void onAdLoaded()
  {
    this.a.onAdShown(Collections.emptyMap());
    eo.a(4, bp.a(), "GMS AdView onAdLoaded.");
  }

  public final void onAdOpened()
  {
    eo.a(4, bp.a(), "GMS AdView onAdOpened.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bp.a
 * JD-Core Version:    0.6.2
 */