package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bi;

public final class InterstitialAd
{
  private final bi lj;

  public InterstitialAd(Context paramContext)
  {
    this.lj = new bi(paramContext);
  }

  public final AdListener getAdListener()
  {
    return this.lj.getAdListener();
  }

  public final String getAdUnitId()
  {
    return this.lj.getAdUnitId();
  }

  public final InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.lj.getInAppPurchaseListener();
  }

  public final String getMediationAdapterClassName()
  {
    return this.lj.getMediationAdapterClassName();
  }

  public final boolean isLoaded()
  {
    return this.lj.isLoaded();
  }

  public final void loadAd(AdRequest paramAdRequest)
  {
    this.lj.a(paramAdRequest.V());
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    this.lj.setAdListener(paramAdListener);
  }

  public final void setAdUnitId(String paramString)
  {
    this.lj.setAdUnitId(paramString);
  }

  public final void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.lj.setInAppPurchaseListener(paramInAppPurchaseListener);
  }

  public final void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    this.lj.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }

  public final void show()
  {
    this.lj.show();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.6.2
 */