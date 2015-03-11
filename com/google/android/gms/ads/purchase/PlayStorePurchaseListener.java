package com.google.android.gms.ads.purchase;

public abstract interface PlayStorePurchaseListener
{
  public abstract boolean isValidPurchase(String paramString);

  public abstract void onInAppPurchaseFinished(InAppPurchaseResult paramInAppPurchaseResult);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.PlayStorePurchaseListener
 * JD-Core Version:    0.6.2
 */