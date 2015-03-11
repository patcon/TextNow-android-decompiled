package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.admarvel.android.util.a.b;
import java.lang.ref.WeakReference;

class AdMarvelView$f
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$f(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void run()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null);
    Handler localHandler;
    Context localContext;
    AdMarvelAd localAdMarvelAd;
    do
    {
      View localView;
      do
      {
        return;
        localHandler = new Handler();
        localContext = localAdMarvelView.getContext();
        localView = localAdMarvelView.findViewWithTag("CURRENT");
      }
      while ((localView == null) || (!(localView instanceof m)));
      localAdMarvelAd = ((m)localView).getAdMarvelAd();
    }
    while (localAdMarvelAd == null);
    new b().a(localAdMarvelAd, localContext, localHandler);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.f
 * JD-Core Version:    0.6.2
 */