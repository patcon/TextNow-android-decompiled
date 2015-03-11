package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.av;

public final class PublisherInterstitialAd
{
  private final av ky;

  public PublisherInterstitialAd(Context paramContext)
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

  public final AppEventListener getAppEventListener()
  {
    return this.ky.getAppEventListener();
  }

  public final boolean isLoaded()
  {
    return this.ky.isLoaded();
  }

  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    this.ky.a(paramPublisherAdRequest.T());
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    this.ky.setAdListener(paramAdListener);
  }

  public final void setAdUnitId(String paramString)
  {
    this.ky.setAdUnitId(paramString);
  }

  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.ky.setAppEventListener(paramAppEventListener);
  }

  public final void show()
  {
    this.ky.show();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
 * JD-Core Version:    0.6.2
 */