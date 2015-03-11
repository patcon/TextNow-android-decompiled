package com.flurry.sdk;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import java.util.Collections;

final class br$a extends AdListener
{
  private br$a(br parambr)
  {
  }

  public final void onAdClosed()
  {
    this.a.c(Collections.emptyMap());
    eo.a(4, br.f(), "GMS AdView onAdClosed.");
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.a.d(Collections.emptyMap());
    eo.a(5, br.f(), "GMS AdView onAdFailedToLoad: " + paramInt + ".");
  }

  public final void onAdLeftApplication()
  {
    this.a.b(Collections.emptyMap());
    eo.a(4, br.f(), "GMS AdView onAdLeftApplication.");
  }

  public final void onAdLoaded()
  {
    this.a.a(Collections.emptyMap());
    eo.a(4, br.f(), "GMS AdView onAdLoaded.");
    br.a(this.a).show();
  }

  public final void onAdOpened()
  {
    eo.a(4, br.f(), "GMS AdView onAdOpened.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.br.a
 * JD-Core Version:    0.6.2
 */