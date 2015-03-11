package com.admarvel.android.ads;

import android.view.View;
import java.lang.ref.WeakReference;

class AdMarvelView$i
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$i(AdMarvelView paramAdMarvelView)
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
    while ((localView == null) || (!(localView instanceof AdMarvelWebView)));
    ((AdMarvelWebView)localView).e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.i
 * JD-Core Version:    0.6.2
 */