package com.admarvel.android.ads;

import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

class AdMarvelView$n
  implements Runnable
{
  private final WeakReference<View> a;
  private final WeakReference<AdMarvelView> b;
  private final AdMarvelAd c;

  public AdMarvelView$n(View paramView, AdMarvelView paramAdMarvelView, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramView);
    this.b = new WeakReference(paramAdMarvelView);
    this.c = paramAdMarvelAd;
  }

  public void run()
  {
    label7: if (this.a == null)
    {
      break label7;
      break label7;
    }
    while (true)
    {
      return;
      if (this.b != null)
      {
        View localView1 = (View)this.a.get();
        AdMarvelView localAdMarvelView = (AdMarvelView)this.b.get();
        if (localAdMarvelView == null)
          break;
        View localView2 = localAdMarvelView.findViewWithTag("CURRENT");
        if (localView2 == null)
          break;
        AdMarvelView.a(localAdMarvelView, localView2);
        AdMarvelView.c(localAdMarvelView);
        localView1.setVisibility(0);
        localView1.setTag("CURRENT");
        localAdMarvelView.removeAllViews();
        localAdMarvelView.addView(localView1);
        if (!AdMarvelView.a(localAdMarvelView))
          AdMarvelView.b(localAdMarvelView, localView2);
        aa localaa = new aa(90.0F, 0.0F, localAdMarvelView.getWidth() / 2.0F, localAdMarvelView.getHeight() / 2.0F, -0.3F * localAdMarvelView.getWidth(), false);
        localaa.setDuration(700L);
        localaa.setFillAfter(true);
        localaa.setInterpolator(new DecelerateInterpolator());
        localAdMarvelView.startAnimation(localaa);
        if (this.c == null)
          break;
        if (localAdMarvelView.a())
          AdMarvelView.d(localAdMarvelView).b(localAdMarvelView.getContext(), localAdMarvelView, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        while (AdMarvelUtils.isLogDumpEnabled())
        {
          new Handler().postDelayed(new AdMarvelView.f(this.c, localAdMarvelView.getContext()), 1000L);
          return;
          AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.n
 * JD-Core Version:    0.6.2
 */