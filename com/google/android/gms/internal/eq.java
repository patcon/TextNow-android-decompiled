package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

@ez
public final class eq extends el.a
{
  private final PlayStorePurchaseListener oD;

  public eq(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    this.oD = paramPlayStorePurchaseListener;
  }

  public final void a(ek paramek)
  {
    this.oD.onInAppPurchaseFinished(new eo(paramek));
  }

  public final boolean isValidPurchase(String paramString)
  {
    return this.oD.isValidPurchase(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eq
 * JD-Core Version:    0.6.2
 */