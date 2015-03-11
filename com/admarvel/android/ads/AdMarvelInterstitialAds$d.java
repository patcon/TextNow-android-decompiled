package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.admarvel.android.util.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

class AdMarvelInterstitialAds$d
  implements AdMarvelInterstitialAdapterListener
{
  private final WeakReference<AdMarvelInterstitialAds> a;
  private WeakReference<AdMarvelAd> b;
  private AdMarvelAd c;

  public AdMarvelInterstitialAds$d(AdMarvelInterstitialAds paramAdMarvelInterstitialAds)
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
      if ((localContext != null) && (AdMarvelInterstitialAds.access$100() != null))
        AdMarvelInterstitialAds.access$100().a(localContext, paramString, localAdMarvelAd.getSiteId(), localAdMarvelAd.getId(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getIpAddress());
    }
  }

  public void onCloseInterstitialAd()
  {
    AdMarvelInterstitialAds.access$002(AdMarvelInterstitialAds.e.a);
    if (AdMarvelInterstitialAds.access$100() != null)
      AdMarvelInterstitialAds.access$100().b();
  }

  public void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason, AdMarvelAd paramAdMarvelAd)
  {
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.a.get();
    AdMarvelInterstitialAds.access$002(AdMarvelInterstitialAds.e.a);
    if (localAdMarvelInterstitialAds == null);
    label387: 
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
            break label305;
          str2 = str1 + "," + paramAdMarvelAd.getBannerid();
          label136: if ((localAdMarvelInterstitialAds.contextReference == null) || ((Context)localAdMarvelInterstitialAds.contextReference.get() == null))
            break label383;
          if (Version.getAndroidSDKVersion() < 11)
            break label315;
          f.a().b().execute(new AdMarvelInterstitialAds.b(paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getPartnerId(), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getAndroidId(), paramAdMarvelAd.getOrientation(), paramAdMarvelAd.getDeviceConnectivity(), localAdMarvelInterstitialAds, m, str2, (Context)localAdMarvelInterstitialAds.contextReference.get()));
        }
      }
      label305: label315: label383: for (i = 1; ; i = 1)
      {
        if ((i != 0) || (localAdMarvelInterstitialAds.contextReference == null))
          break label387;
        Context localContext = (Context)localAdMarvelInterstitialAds.contextReference.get();
        if ((localContext == null) || (AdMarvelInterstitialAds.access$100() == null))
          break;
        AdMarvelInterstitialAds.access$100().a(localContext, paramSDKAdNetwork, paramString, paramInt, paramErrorReason, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
        str2 = paramAdMarvelAd.getBannerid();
        break label136;
        new Handler(Looper.getMainLooper()).post(new AdMarvelInterstitialAds.a(paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getPartnerId(), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getAndroidId(), paramAdMarvelAd.getOrientation(), paramAdMarvelAd.getDeviceConnectivity(), localAdMarvelInterstitialAds, m, str2, (Context)localAdMarvelInterstitialAds.contextReference.get()));
      }
    }
  }

  public void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, AdMarvelAd paramAdMarvelAd)
  {
    AdMarvelInterstitialAds localAdMarvelInterstitialAds = (AdMarvelInterstitialAds)this.a.get();
    if ((localAdMarvelInterstitialAds != null) && (localAdMarvelInterstitialAds.contextReference != null) && (localAdMarvelInterstitialAds.contextReference.get() != null))
    {
      Context localContext = (Context)localAdMarvelInterstitialAds.contextReference.get();
      if ((localContext != null) && (AdMarvelInterstitialAds.access$100() != null))
        AdMarvelInterstitialAds.access$100().a(localContext, paramSDKAdNetwork, paramString, paramAdMarvelAd, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
    }
  }

  public void onRequestInterstitialAd()
  {
    if (AdMarvelInterstitialAds.access$100() != null)
      AdMarvelInterstitialAds.access$100().a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInterstitialAds.d
 * JD-Core Version:    0.6.2
 */