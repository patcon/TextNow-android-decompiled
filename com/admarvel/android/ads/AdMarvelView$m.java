package com.admarvel.android.ads;

import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$m
  implements Runnable
{
  final WeakReference<AdMarvelView> a;

  public AdMarvelView$m(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void run()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null);
    View localView;
    do
    {
      return;
      localView = localAdMarvelView.findViewWithTag("PENDING");
    }
    while (localView == null);
    localAdMarvelView.removeView(localView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.m
 * JD-Core Version:    0.6.2
 */