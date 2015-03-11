package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

class AdMarvelView$b
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

  public AdMarvelView$b(Context paramContext, Map<String, Object> paramMap, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, AdMarvelView paramAdMarvelView, int paramInt2, String paramString5)
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

  @SuppressLint({"NewApi"})
  public void run()
  {
    if ((this.a.get() != null) && (this.h.get() != null))
    {
      k localk = new k((Context)this.a.get());
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      Object[] arrayOfObject = new Object[11];
      arrayOfObject[0] = this.b;
      arrayOfObject[1] = this.c;
      arrayOfObject[2] = this.d;
      arrayOfObject[3] = this.e;
      arrayOfObject[4] = Integer.valueOf(this.f);
      arrayOfObject[5] = this.g;
      arrayOfObject[6] = this.h.get();
      arrayOfObject[7] = Integer.valueOf(this.i);
      arrayOfObject[8] = this.j;
      arrayOfObject[9] = Boolean.valueOf(((AdMarvelView)this.h.get()).c());
      arrayOfObject[10] = Boolean.valueOf(AdMarvelView.g((AdMarvelView)this.h.get()));
      localk.executeOnExecutor(localExecutor, arrayOfObject);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.b
 * JD-Core Version:    0.6.2
 */