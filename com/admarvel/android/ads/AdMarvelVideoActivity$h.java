package com.admarvel.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

class AdMarvelVideoActivity$h extends BroadcastReceiver
{
  AdMarvelVideoActivity$h(AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
    {
      if (this.a.h != null)
      {
        AdMarvelVideoActivity.b localb = (AdMarvelVideoActivity.b)this.a.h.get();
        if ((localb != null) && (localb.a()) && (!AdMarvelVideoActivity.s(this.a)))
        {
          localb.d();
          this.a.c();
        }
      }
      if ((AdMarvelVideoActivity.t(this.a)) && (this.a.i == AdMarvelVideoActivity.k.g) && (AdMarvelVideoActivity.a(this.a) != null))
      {
        this.a.i = AdMarvelVideoActivity.k.b;
        AdMarvelVideoActivity.d(this.a, false);
      }
      if ((AdMarvelVideoActivity.u(this.a)) && (this.a.i == AdMarvelVideoActivity.k.g) && (AdMarvelVideoActivity.a(this.a) != null))
      {
        AdMarvelVideoActivity.a(this.a).pause();
        this.a.i = AdMarvelVideoActivity.k.c;
        AdMarvelVideoActivity.e(this.a, false);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.h
 * JD-Core Version:    0.6.2
 */