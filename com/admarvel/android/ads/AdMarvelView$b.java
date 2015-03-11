package com.admarvel.android.ads;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

class AdMarvelView$b
  implements Runnable
{
  private final File a;
  private final WeakReference<Context> b;
  private final Map<String, Object> c;
  private final String d;
  private final String e;
  private final String f;
  private final int g;
  private final String h;
  private final WeakReference<AdMarvelView> i;
  private final int j;
  private final String k;
  private final Handler l;

  public AdMarvelView$b(File paramFile, Context paramContext, Map<String, Object> paramMap, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, AdMarvelView paramAdMarvelView, int paramInt2, String paramString5, Handler paramHandler)
  {
    this.b = new WeakReference(paramContext);
    this.a = paramFile;
    this.c = paramMap;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramInt1;
    this.h = paramString4;
    this.i = new WeakReference(paramAdMarvelView);
    this.j = paramInt2;
    this.k = paramString5;
    this.l = paramHandler;
  }

  public void run()
  {
    Context localContext = (Context)this.b.get();
    AdMarvelView localAdMarvelView = (AdMarvelView)this.i.get();
    if ((localContext != null) && (localAdMarvelView != null))
    {
      if (ac.a() >= 11)
        this.l.post(new AdMarvelView.c(this.a, localContext, this.c, this.d, this.e, this.f, this.g, this.h, localAdMarvelView, this.j, this.k, this.l));
    }
    else
      return;
    q localq = new q(this.a, localContext);
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = this.d;
    arrayOfObject[2] = this.e;
    arrayOfObject[3] = this.f;
    arrayOfObject[4] = Integer.valueOf(this.g);
    arrayOfObject[5] = this.h;
    arrayOfObject[6] = localAdMarvelView;
    arrayOfObject[7] = Integer.valueOf(this.j);
    arrayOfObject[8] = this.k;
    arrayOfObject[9] = this.l;
    arrayOfObject[10] = Boolean.valueOf(localAdMarvelView.b());
    arrayOfObject[11] = Boolean.valueOf(AdMarvelView.h(localAdMarvelView));
    localq.execute(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.b
 * JD-Core Version:    0.6.2
 */