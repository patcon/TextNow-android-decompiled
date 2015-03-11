package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.a;

class m$j
  implements Runnable
{
  private final AdMarvelAd a;
  private final Context b;

  public m$j(AdMarvelAd paramAdMarvelAd, Context paramContext)
  {
    this.a = paramAdMarvelAd;
    this.b = paramContext;
  }

  public void run()
  {
    a locala = a.b(this.b);
    if (locala != null)
    {
      int i = this.a.getAdHistoryCounter();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("/sse_");
      localStringBuilder.append(i);
      localStringBuilder.append(".jpg");
      locala.a(localStringBuilder.toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.j
 * JD-Core Version:    0.6.2
 */