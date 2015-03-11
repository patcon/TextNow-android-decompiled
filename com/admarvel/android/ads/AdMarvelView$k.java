package com.admarvel.android.ads;

import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.admarvel.android.util.n;
import java.lang.ref.WeakReference;

class AdMarvelView$k
  implements Runnable
{
  private final WeakReference<View> a;
  private final WeakReference<AdMarvelView> b;
  private final AdMarvelAd c;

  public AdMarvelView$k(View paramView, AdMarvelView paramAdMarvelView, AdMarvelAd paramAdMarvelAd)
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
        n localn = new n(90.0F, 0.0F, localAdMarvelView.getWidth() / 2.0F, localAdMarvelView.getHeight() / 2.0F, -0.3F * localAdMarvelView.getWidth(), false);
        localn.setDuration(700L);
        localn.setFillAfter(true);
        localn.setInterpolator(new DecelerateInterpolator());
        localAdMarvelView.startAnimation(localn);
        if (this.c == null)
          break;
        if (localAdMarvelView.b())
          AdMarvelView.d(localAdMarvelView).b(localAdMarvelView.getContext(), localAdMarvelView, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        while (AdMarvelUtils.isLogDumpEnabled())
        {
          new Handler().postDelayed(new AdMarvelView.e(this.c, localAdMarvelView.getContext()), 1000L);
          return;
          AdMarvelView.d(localAdMarvelView).a(localAdMarvelView.getContext(), localAdMarvelView, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.k
 * JD-Core Version:    0.6.2
 */