package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class ag extends ap.a
{
  private final AdListener lQ;

  public ag(AdListener paramAdListener)
  {
    this.lQ = paramAdListener;
  }

  public final void onAdClosed()
  {
    this.lQ.onAdClosed();
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.lQ.onAdFailedToLoad(paramInt);
  }

  public final void onAdLeftApplication()
  {
    this.lQ.onAdLeftApplication();
  }

  public final void onAdLoaded()
  {
    this.lQ.onAdLoaded();
  }

  public final void onAdOpened()
  {
    this.lQ.onAdOpened();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ag
 * JD-Core Version:    0.6.2
 */