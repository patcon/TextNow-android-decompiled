package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelView$h
  implements AdMarvelAdapterListener
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$h(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void onClickAd(String paramString)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null);
    AdMarvelAd localAdMarvelAd;
    do
    {
      return;
      localAdMarvelAd = AdMarvelView.f(localAdMarvelView);
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
    if (localAdMarvelView == null);
    AdMarvelAd localAdMarvelAd;
    do
    {
      return;
      localAdMarvelAd = AdMarvelView.f(localAdMarvelView);
      new Handler(Looper.getMainLooper()).post(new AdMarvelView.j(localAdMarvelView));
    }
    while ((localAdMarvelAd == null) || (localAdMarvelAd.getAdType() != AdMarvelAd.AdType.SDKCALL));
    Boolean localBoolean = localAdMarvelAd.getRetry();
    int i = 0;
    int m;
    String str1;
    if (localBoolean != null)
    {
      boolean bool = localAdMarvelAd.getRetry().equals(Boolean.valueOf(true));
      i = 0;
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
            break label301;
        }
      }
    }
    label301: for (String str2 = str1 + "," + localAdMarvelAd.getBannerid(); ; str2 = localAdMarvelAd.getBannerid())
    {
      if (localAdMarvelView.getContext() != null)
      {
        Logging.log("Retry : onRequestAd");
        new Handler(Looper.getMainLooper()).post(new AdMarvelView.a(localAdMarvelView.getContext(), localAdMarvelAd.getTargetParams(), localAdMarvelAd.getPartnerId(), localAdMarvelAd.getSiteId(), localAdMarvelAd.getAndroidId(), localAdMarvelAd.getOrientation(), localAdMarvelAd.getDeviceConnectivity(), localAdMarvelView, m, str2));
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
    new Handler(Looper.getMainLooper()).post(new AdMarvelView.d(localAdMarvelView, AdMarvelView.f(localAdMarvelView)));
  }

  public void onReceiveNativeAd(Object paramObject)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.h
 * JD-Core Version:    0.6.2
 */