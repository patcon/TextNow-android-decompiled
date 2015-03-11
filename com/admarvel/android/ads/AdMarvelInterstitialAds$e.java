package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;

class AdMarvelInterstitialAds$e
  implements AdMarvelInterstitialAdapterListener
{
  private final WeakReference<AdMarvelInterstitialAds> a;
  private WeakReference<AdMarvelAd> b;
  private AdMarvelAd c;

  public AdMarvelInterstitialAds$e(AdMarvelInterstitialAds paramAdMarvelInterstitialAds)
  {
    this.a = new WeakReference(paramAdMarvelInterstitialAds);
  }

  public void a(AdMarvelAd paramAdMarvelAd)
  {
    this.c = paramAdMarvelAd;
    this.b = new WeakReference(paramAdMarvelAd);
  }

  public void onClickInterstitialAd(String paramString)
  {
    AdMarvelAd localAdMarvelAd = (AdMarvelAd)this.b.get();
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.a.get();
    if ((localAdMarvelInterstitialAds != null) && (localAdMarvelInterstitialAds.contextReference != null) && (localAdMarvelInterstitialAds.contextReference.get() != null) && (localAdMarvelAd != null))
    {
      Context localContext = (Context)localAdMarvelInterstitialAds.contextReference.get();
      if ((localContext != null) && (AdMarvelInterstitialAds.access$200() != null))
        AdMarvelInterstitialAds.access$200().a(localContext, paramString, localAdMarvelAd.getSiteId(), localAdMarvelAd.getId(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getIpAddress());
    }
  }

  public void onCloseInterstitialAd()
  {
    if (AdMarvelInterstitialAds.access$200() != null)
      AdMarvelInterstitialAds.access$200().b();
  }

  public void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason, AdMarvelAd paramAdMarvelAd)
  {
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.a.get();
    if (localAdMarvelInterstitialAds == null);
    label129: label301: label311: label379: label383: 
    while (true)
    {
      return;
      boolean bool = paramAdMarvelAd.getRetry().equals(Boolean.valueOf(true));
      int i = 0;
      int m;
      String str2;
      if (bool)
      {
        int j = paramAdMarvelAd.getRetrynum();
        int k = paramAdMarvelAd.getMaxretries();
        i = 0;
        if (j <= k)
        {
          m = 1 + paramAdMarvelAd.getRetrynum();
          String str1 = paramAdMarvelAd.getExcluded();
          if ((paramAdMarvelAd.getExcluded() == null) || (paramAdMarvelAd.getExcluded().length() <= 0))
            break label301;
          str2 = str1 + "," + paramAdMarvelAd.getBannerid();
          if ((localAdMarvelInterstitialAds.contextReference == null) || ((Context)localAdMarvelInterstitialAds.contextReference.get() == null))
            break label379;
          if (ac.a() < 11)
            break label311;
          AdMarvelInterstitialAds.access$100(localAdMarvelInterstitialAds).post(new AdMarvelInterstitialAds.b(paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getPartnerId(), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getAndroidId(), paramAdMarvelAd.getOrientation(), paramAdMarvelAd.getDeviceConnectivity(), localAdMarvelInterstitialAds, m, str2, (Context)localAdMarvelInterstitialAds.contextReference.get(), AdMarvelInterstitialAds.access$100(localAdMarvelInterstitialAds)));
        }
      }
      for (i = 1; ; i = 1)
      {
        if ((i != 0) || (localAdMarvelInterstitialAds.contextReference == null))
          break label383;
        Context localContext = (Context)localAdMarvelInterstitialAds.contextReference.get();
        if ((localContext == null) || (AdMarvelInterstitialAds.access$200() == null))
          break;
        AdMarvelInterstitialAds.access$200().a(localContext, paramSDKAdNetwork, paramString, paramInt, paramErrorReason, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
        str2 = paramAdMarvelAd.getBannerid();
        break label129;
        AdMarvelInterstitialAds.access$100(localAdMarvelInterstitialAds).post(new AdMarvelInterstitialAds.a(paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getPartnerId(), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getAndroidId(), paramAdMarvelAd.getOrientation(), paramAdMarvelAd.getDeviceConnectivity(), localAdMarvelInterstitialAds, m, str2, (Context)localAdMarvelInterstitialAds.contextReference.get(), AdMarvelInterstitialAds.access$100(localAdMarvelInterstitialAds)));
      }
    }
  }

  public void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, AdMarvelAd paramAdMarvelAd)
  {
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.a.get();
    if ((localAdMarvelInterstitialAds != null) && (localAdMarvelInterstitialAds.contextReference != null) && (localAdMarvelInterstitialAds.contextReference.get() != null))
    {
      Context localContext = (Context)localAdMarvelInterstitialAds.contextReference.get();
      if ((localContext != null) && (AdMarvelInterstitialAds.access$200() != null))
        AdMarvelInterstitialAds.access$200().a(localContext, paramSDKAdNetwork, paramString, paramAdMarvelAd, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
    }
  }

  public void onRequestInterstitialAd()
  {
    if (AdMarvelInterstitialAds.access$200() != null)
      AdMarvelInterstitialAds.access$200().a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInterstitialAds.e
 * JD-Core Version:    0.6.2
 */