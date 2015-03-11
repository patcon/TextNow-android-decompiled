package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;

class AdMarvelView$a
  implements Runnable
{
  private final WeakReference<Context> a;
  private final Map<String, Object> b;
  private final String c;
  private final String d;
  private final String e;
  private final int f;
  private final String g;
  private final WeakReference<AdMarvelView> h;
  private final int i;
  private final String j;

  public AdMarvelView$a(Context paramContext, Map<String, Object> paramMap, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, AdMarvelView paramAdMarvelView, int paramInt2, String paramString5)
  {
    this.a = new WeakReference(paramContext);
    this.b = paramMap;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramInt1;
    this.g = paramString4;
    this.h = new WeakReference(paramAdMarvelView);
    this.i = paramInt2;
    this.j = paramString5;
  }

  public void run()
  {
    Context localContext = (Context)this.a.get();
    AdMarvelView localAdMarvelView = (AdMarvelView)this.h.get();
    if ((localContext != null) && (localAdMarvelView != null))
    {
      if (Version.getAndroidSDKVersion() >= 11)
        f.a().b().execute(new AdMarvelView.b(localContext, this.b, this.c, this.d, this.e, this.f, this.g, localAdMarvelView, this.i, this.j));
    }
    else
      return;
    k localk = new k(localContext);
    Object[] arrayOfObject = new Object[11];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = Integer.valueOf(this.f);
    arrayOfObject[5] = this.g;
    arrayOfObject[6] = localAdMarvelView;
    arrayOfObject[7] = Integer.valueOf(this.i);
    arrayOfObject[8] = this.j;
    arrayOfObject[9] = Boolean.valueOf(localAdMarvelView.c());
    arrayOfObject[10] = Boolean.valueOf(AdMarvelView.g(localAdMarvelView));
    localk.execute(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.a
 * JD-Core Version:    0.6.2
 */