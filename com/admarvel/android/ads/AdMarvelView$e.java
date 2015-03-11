package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import com.admarvel.android.util.a;
import java.lang.ref.WeakReference;

class AdMarvelView$e
  implements Runnable
{
  private final AdMarvelAd a;
  private final Context b;

  public AdMarvelView$e(AdMarvelAd paramAdMarvelAd, Context paramContext)
  {
    this.a = paramAdMarvelAd;
    if ((!(paramContext instanceof Activity)) && (AdMarvelView.d() != null) && (AdMarvelView.d().get() != null))
      paramContext = (Context)AdMarvelView.d().get();
    this.b = paramContext;
  }

  public void run()
  {
    a locala = a.b(this.b);
    if (locala != null)
    {
      int i = locala.a(this.b);
      this.a.setAdHistoryCounter(i);
      locala.a(this.a.getAdHistoryDumpString(), i);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.e
 * JD-Core Version:    0.6.2
 */