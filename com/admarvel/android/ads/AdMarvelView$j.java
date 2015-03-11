package com.admarvel.android.ads;

import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$j
  implements Runnable
{
  final WeakReference<AdMarvelView> a;

  public AdMarvelView$j(AdMarvelView paramAdMarvelView)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.j
 * JD-Core Version:    0.6.2
 */