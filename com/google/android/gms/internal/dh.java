package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

public final class dh extends dc.a
{
  private final InAppPurchaseListener mB;

  public dh(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.mB = paramInAppPurchaseListener;
  }

  public final void a(db paramdb)
  {
    this.mB.onInAppPurchaseRequested(new dk(paramdb));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dh
 * JD-Core Version:    0.6.2
 */