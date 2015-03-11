package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;

class AdMarvelView$a
  implements Runnable
{
  private final WeakReference<Context> a;
  private final File b;

  public AdMarvelView$a(Context paramContext, File paramFile)
  {
    this.a = new WeakReference(paramContext);
    this.b = paramFile;
  }

  public void run()
  {
    Context localContext = (Context)this.a.get();
    if (localContext != null)
    {
      if (ac.a() >= 11)
        new d(localContext, this.b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }
    else
      return;
    new d(localContext, this.b).execute(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.a
 * JD-Core Version:    0.6.2
 */