package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.admarvel.android.b.a;
import java.lang.ref.WeakReference;

class AdMarvelView$h
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;
  private final WeakReference<Handler> b;

  public AdMarvelView$h(AdMarvelView paramAdMarvelView, Handler paramHandler)
  {
    this.a = new WeakReference(paramAdMarvelView);
    this.b = new WeakReference(paramHandler);
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
        localHandler = (Handler)this.b.get();
        localContext = localAdMarvelView.getContext();
        localView = localAdMarvelView.findViewWithTag("CURRENT");
      }
      while ((localView == null) || (!(localView instanceof AdMarvelWebView)));
      localAdMarvelAd = ((AdMarvelWebView)localView).getAdMarvelAd();
    }
    while (localAdMarvelAd == null);
    new a().a(localAdMarvelAd, localContext, localHandler);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.h
 * JD-Core Version:    0.6.2
 */