package com.admarvel.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class AdMarvelVideoActivity$g extends BroadcastReceiver
{
  AdMarvelVideoActivity$g(AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
    {
      if ((AdMarvelVideoActivity.r(this.a)) && (this.a.i == AdMarvelVideoActivity.j.g) && (AdMarvelVideoActivity.a(this.a) != null))
      {
        this.a.i = AdMarvelVideoActivity.j.b;
        AdMarvelVideoActivity.d(this.a, false);
      }
      if ((AdMarvelVideoActivity.s(this.a)) && (this.a.i == AdMarvelVideoActivity.j.g) && (AdMarvelVideoActivity.a(this.a) != null))
      {
        AdMarvelVideoActivity.a(this.a).pause();
        this.a.i = AdMarvelVideoActivity.j.c;
        AdMarvelVideoActivity.e(this.a, false);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.g
 * JD-Core Version:    0.6.2
 */