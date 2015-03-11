package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.admarvel.android.b.a;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelView$e
  implements Runnable
{
  private final AdMarvelAd a;
  private final WeakReference<AdMarvelView> b;

  public AdMarvelView$e(AdMarvelView paramAdMarvelView, AdMarvelAd paramAdMarvelAd)
  {
    this.a = paramAdMarvelAd;
    this.b = new WeakReference(paramAdMarvelView);
  }

  public void run()
  {
    ab localab;
    while (true)
    {
      AdMarvelView localAdMarvelView;
      Context localContext;
      View localView1;
      View localView2;
      try
      {
        localAdMarvelView = (AdMarvelView)this.b.get();
        if (localAdMarvelView == null)
          return;
        localContext = localAdMarvelView.getContext();
        if (localContext == null)
          return;
        localView1 = localAdMarvelView.findViewWithTag("PENDING");
        if (localView1 == null)
          return;
        if ((AdMarvelUtils.isLogDumpEnabled()) && (this.a != null))
          this.a.setResponseJson();
        localView2 = localAdMarvelView.findViewWithTag("CURRENT");
        if ((localView2 != null) && (!AdMarvelView.b(localAdMarvelView)) && (localView2.isShown()))
          break label362;
        if ((this.a != null) && (this.a.isMustBeVisible()) && (this.a.getSdkAdNetwork() == AdMarvelUtils.SDKAdNetwork.PULSE3D))
        {
          localView1.setTag("CURRENT");
          AdMarvelView.a(localAdMarvelView, localView2);
          if (!AdMarvelView.a(localAdMarvelView))
            AdMarvelView.b(localAdMarvelView, localView2);
          if (this.a != null)
          {
            if (!localAdMarvelView.a())
              break label322;
            AdMarvelView.d(localAdMarvelView).b(localContext, localAdMarvelView, this.a.getSiteId(), this.a.getId(), this.a.getTargetParams(), this.a.getIpAddress());
          }
          if (AdMarvelUtils.isLogDumpEnabled())
            new Handler().postDelayed(new AdMarvelView.f(this.a, localContext), 1000L);
          localab = new ab(localContext, AdMarvelView.e(localAdMarvelView));
          if ((!AdMarvelView.b) || (AdMarvelView.f(localAdMarvelView)))
            break;
          new a().a(this.a, localContext, AdMarvelView.e(localAdMarvelView));
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      AdMarvelView.a(localAdMarvelView, localView2);
      AdMarvelView.c(localAdMarvelView);
      localView1.setTag("CURRENT");
      localView1.setVisibility(0);
      localAdMarvelView.setHorizontalGravity(1);
      localAdMarvelView.removeAllViews();
      localAdMarvelView.addView(localView1);
      continue;
      label322: AdMarvelView.d(localAdMarvelView).a(localContext, localAdMarvelView, this.a.getSiteId(), this.a.getId(), this.a.getTargetParams(), this.a.getIpAddress());
      continue;
      label362: AdMarvelView.a(localAdMarvelView, localView1, this.a);
    }
    if (!AdMarvelView.b)
      localab.a(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.e
 * JD-Core Version:    0.6.2
 */