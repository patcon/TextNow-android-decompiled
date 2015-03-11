package com.admarvel.android.ads;

import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$d
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$d(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void run()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    View localView = localAdMarvelView.findViewWithTag("CURRENT");
    AdMarvelView.a(localAdMarvelView, localView);
    if (!AdMarvelView.a(localAdMarvelView))
      AdMarvelView.b(localAdMarvelView, localView);
    localAdMarvelView.removeAllViews();
    if (AdMarvelView.d() != null)
      AdMarvelView.d().clear();
    b.b(localAdMarvelView.c);
    AdMarvelInternalWebView.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.d
 * JD-Core Version:    0.6.2
 */