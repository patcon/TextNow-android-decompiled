package com.admarvel.android.ads;

import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$g
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$g(AdMarvelView paramAdMarvelView)
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
      localView = localAdMarvelView.findViewWithTag("CURRENT");
    }
    while ((localView == null) || (!(localView instanceof m)));
    ((m)localView).f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.g
 * JD-Core Version:    0.6.2
 */