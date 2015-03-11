package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@ez
public final class at extends bc.a
{
  private final AdListener nR;

  public at(AdListener paramAdListener)
  {
    this.nR = paramAdListener;
  }

  public final void onAdClosed()
  {
    this.nR.onAdClosed();
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.nR.onAdFailedToLoad(paramInt);
  }

  public final void onAdLeftApplication()
  {
    this.nR.onAdLeftApplication();
  }

  public final void onAdLoaded()
  {
    this.nR.onAdLoaded();
  }

  public final void onAdOpened()
  {
    this.nR.onAdOpened();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.at
 * JD-Core Version:    0.6.2
 */