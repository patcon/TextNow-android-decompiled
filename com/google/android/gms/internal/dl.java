package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public final class dl extends dg.a
{
  private final PlayStorePurchaseListener mC;

  public dl(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    this.mC = paramPlayStorePurchaseListener;
  }

  public final void a(df paramdf)
  {
    this.mC.onInAppPurchaseFinished(new dj(paramdf));
  }

  public final boolean isValidPurchase(String paramString)
  {
    return this.mC.isValidPurchase(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dl
 * JD-Core Version:    0.6.2
 */