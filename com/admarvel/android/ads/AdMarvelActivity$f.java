package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.a;

class AdMarvelActivity$f
  implements Runnable
{
  private final AdMarvelAd a;
  private final Context b;

  public AdMarvelActivity$f(AdMarvelAd paramAdMarvelAd, Context paramContext)
  {
    this.a = paramAdMarvelAd;
    this.b = paramContext;
  }

  public void run()
  {
    a locala = a.b(this.b);
    if ((locala != null) && (this.a != null))
    {
      int i = this.a.getAdHistoryCounter();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("/ssr_");
      localStringBuilder.append(i);
      localStringBuilder.append(".jpg");
      locala.a(localStringBuilder.toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.f
 * JD-Core Version:    0.6.2
 */