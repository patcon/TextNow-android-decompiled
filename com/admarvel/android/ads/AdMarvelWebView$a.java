package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

class AdMarvelWebView$a
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private final String c;
  private final String d;
  private final int e;
  private final File f;

  public AdMarvelWebView$a(Context paramContext, AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString1, String paramString2, int paramInt, File paramFile)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramInt;
    this.f = paramFile;
  }

  public void run()
  {
    if ((this.a.get() != null) && (this.b.get() != null))
    {
      k localk = new k((Context)this.a.get(), (AdMarvelInternalWebView)this.b.get(), this.f);
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = this.c;
      arrayOfObject[1] = this.d;
      arrayOfObject[2] = Integer.valueOf(this.e);
      localk.executeOnExecutor(localExecutor, arrayOfObject);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.a
 * JD-Core Version:    0.6.2
 */