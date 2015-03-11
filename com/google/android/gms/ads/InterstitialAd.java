package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.av;

public final class InterstitialAd
{
  private final av ky;

  public InterstitialAd(Context paramContext)
  {
    this.ky = new av(paramContext);
  }

  public final AdListener getAdListener()
  {
    return this.ky.getAdListener();
  }

  public final String getAdUnitId()
  {
    return this.ky.getAdUnitId();
  }

  public final InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.ky.getInAppPurchaseListener();
  }

  public final boolean isLoaded()
  {
    return this.ky.isLoaded();
  }

  public final void loadAd(AdRequest paramAdRequest)
  {
    this.ky.a(paramAdRequest.T());
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    this.ky.setAdListener(paramAdListener);
  }

  public final void setAdUnitId(String paramString)
  {
    this.ky.setAdUnitId(paramString);
  }

  public final void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.ky.setInAppPurchaseListener(paramInAppPurchaseListener);
  }

  public final void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    this.ky.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }

  public final void show()
  {
    this.ky.show();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.6.2
 */