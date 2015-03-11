package com.admarvel.android.ads;

import android.os.Handler;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.ref.WeakReference;

class AdMarvelView$k
  implements AdMarvelAdapterListener
{
  private final WeakReference<AdMarvelView> a;
  private AdMarvelAd b;

  public AdMarvelView$k(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
    if (this.a.get() != null);
    for (AdMarvelAd localAdMarvelAd = AdMarvelView.g((AdMarvelView)this.a.get()); ; localAdMarvelAd = null)
    {
      this.b = localAdMarvelAd;
      return;
    }
  }

  public void onClickAd(String paramString)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null);
    AdMarvelAd localAdMarvelAd;
    do
    {
      return;
      localAdMarvelAd = AdMarvelView.g(localAdMarvelView);
    }
    while (localAdMarvelAd == null);
    AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, paramString, localAdMarvelAd.getSiteId(), localAdMarvelAd.getId(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getIpAddress());
  }

  public void onClose()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.a(localAdMarvelView, false);
    AdMarvelView.d(localAdMarvelView).b();
  }

  public void onExpand()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.a(localAdMarvelView, true);
    AdMarvelView.d(localAdMarvelView).a();
  }

  public void onFailedToReceiveAd(int paramInt, AdMarvelUtils.ErrorReason paramErrorReason)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelAd localAdMarvelAd = AdMarvelView.g(localAdMarvelView);
    AdMarvelView.e(localAdMarvelView).post(new AdMarvelView.m(localAdMarvelView));
    boolean bool = localAdMarvelAd.getRetry().equals(Boolean.valueOf(true));
    int i = 0;
    int m;
    String str1;
    if (bool)
    {
      int j = localAdMarvelAd.getRetrynum();
      int k = localAdMarvelAd.getMaxretries();
      i = 0;
      if (j <= k)
      {
        m = 1 + localAdMarvelAd.getRetrynum();
        str1 = localAdMarvelAd.getExcluded();
        if ((localAdMarvelAd.getExcluded() == null) || (localAdMarvelAd.getExcluded().length() <= 0))
          break label289;
      }
    }
    label289: for (String str2 = str1 + "," + localAdMarvelAd.getBannerid(); ; str2 = localAdMarvelAd.getBannerid())
    {
      String str3 = AdMarvelView.a;
      File localFile = null;
      if (str3 != null)
        localFile = new File(AdMarvelView.a);
      if (localAdMarvelView.getContext() != null)
      {
        Logging.log("Retry : onRequestAd");
        AdMarvelView.e(localAdMarvelView).post(new AdMarvelView.b(localFile, localAdMarvelView.getContext(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getPartnerId(), localAdMarvelAd.getSiteId(), localAdMarvelAd.getAndroidId(), localAdMarvelAd.getOrientation(), localAdMarvelAd.getDeviceConnectivity(), localAdMarvelView, m, str2, AdMarvelView.e(localAdMarvelView)));
      }
      i = 1;
      if (i != 0)
        break;
      AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, paramInt, paramErrorReason, localAdMarvelAd.getSiteId(), localAdMarvelAd.getId(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getIpAddress());
      return;
    }
  }

  public void onReceiveAd()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.e(localAdMarvelView).post(new AdMarvelView.e(localAdMarvelView, AdMarvelView.g(localAdMarvelView)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.k
 * JD-Core Version:    0.6.2
 */