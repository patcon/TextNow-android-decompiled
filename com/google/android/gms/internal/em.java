package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

@ez
public final class em extends eh.a
{
  private final InAppPurchaseListener oC;

  public em(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.oC = paramInAppPurchaseListener;
  }

  public final void a(eg parameg)
  {
    this.oC.onInAppPurchaseRequested(new ep(parameg));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.em
 * JD-Core Version:    0.6.2
 */