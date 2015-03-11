package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.a;

public class AdMarvelActivity$h
  implements Runnable
{
  private final AdMarvelAd a;
  private final Context b;

  public AdMarvelActivity$h(AdMarvelAd paramAdMarvelAd, Context paramContext)
  {
    this.a = paramAdMarvelAd;
    this.b = paramContext;
  }

  public void run()
  {
    if (this.a != null)
      this.a.setResponseJson();
    a locala = a.b(this.b);
    if ((locala != null) && (this.a != null))
    {
      int i = locala.a(this.b);
      this.a.setAdHistoryCounter(i);
      locala.a(this.a.getAdHistoryDumpString(), i);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.h
 * JD-Core Version:    0.6.2
 */