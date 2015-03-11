package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.b;
import java.lang.ref.WeakReference;

class AdMarvelView$c
  implements Runnable
{
  private final WeakReference<AdMarvelView> a;

  public AdMarvelView$c(AdMarvelView paramAdMarvelView)
  {
    this.a = new WeakReference(paramAdMarvelView);
  }

  public void run()
  {
    AdMarvelView localAdMarvelView = (AdMarvelView)this.a.get();
    if (localAdMarvelView == null)
      return;
    AdMarvelView.a(localAdMarvelView, localAdMarvelView.findViewWithTag("CURRENT"));
    if (!AdMarvelView.a(localAdMarvelView))
      AdMarvelView.a(localAdMarvelView, localAdMarvelView);
    localAdMarvelView.removeAllViews();
    if (AdMarvelView.d() != null)
      AdMarvelView.d().clear();
    try
    {
      localAdMarvelView.getContext().getApplicationContext().unregisterReceiver(b.a());
      label67: AdMarvelAdapterInstances.destroyAdMarvelAdapterInstances(localAdMarvelView.b);
      d.d();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label67;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.c
 * JD-Core Version:    0.6.2
 */