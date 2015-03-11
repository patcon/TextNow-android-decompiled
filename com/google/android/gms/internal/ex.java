package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.c;

@ez
public final class ex extends eu.a
{
  private final PublisherInterstitialAd oF;
  private final c oG;

  public ex(c paramc, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this.oG = paramc;
    this.oF = paramPublisherInterstitialAd;
  }

  public final void a(es parames)
  {
    this.oG.a(this.oF, new ev(parames));
  }

  public final boolean e(String paramString1, String paramString2)
  {
    return this.oG.a(this.oF, paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ex
 * JD-Core Version:    0.6.2
 */