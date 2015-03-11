package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.bi;

public final class PublisherInterstitialAd
{
  private final bi lj = new bi(paramContext, this);

  public PublisherInterstitialAd(Context paramContext)
  {
  }

  public final AdListener getAdListener()
  {
    return this.lj.getAdListener();
  }

  public final String getAdUnitId()
  {
    return this.lj.getAdUnitId();
  }

  public final AppEventListener getAppEventListener()
  {
    return this.lj.getAppEventListener();
  }

  public final String getMediationAdapterClassName()
  {
    return this.lj.getMediationAdapterClassName();
  }

  public final boolean isLoaded()
  {
    return this.lj.isLoaded();
  }

  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    this.lj.a(paramPublisherAdRequest.V());
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    this.lj.setAdListener(paramAdListener);
  }

  public final void setAdUnitId(String paramString)
  {
    this.lj.setAdUnitId(paramString);
  }

  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.lj.setAppEventListener(paramAppEventListener);
  }

  public final void show()
  {
    this.lj.show();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
 * JD-Core Version:    0.6.2
 */