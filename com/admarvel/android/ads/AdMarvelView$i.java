package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$i
  implements n
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$i(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void a()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.d(localAdMarvelView).a();
  }

  public void a(AdMarvelAd paramAdMarvelAd, String paramString)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, paramString, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
  }

  public void a(m paramm, AdMarvelAd paramAdMarvelAd)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    new Handler(Looper.getMainLooper()).post(new AdMarvelView.d(localAdMarvelView, paramAdMarvelAd));
  }

  public void a(m paramm, AdMarvelAd paramAdMarvelAd, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason)
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null);
    do
    {
      return;
      View localView = localAdMarvelView.findViewWithTag("PENDING");
      if (localView != null)
        localAdMarvelView.removeView(localView);
    }
    while (paramAdMarvelAd == null);
    AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, paramInt, paramErrorReason, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
  }

  public void b()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.d(localAdMarvelView).b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.i
 * JD-Core Version:    0.6.2
 */