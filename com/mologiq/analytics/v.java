package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

@SuppressLint({"NewApi", "UseSparseArrays"})
final class v
  implements Runnable
{
  private final WeakReference<Context> a;

  public v(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  public final void run()
  {
    Context localContext = (Context)this.a.get();
    if (localContext != null)
      new t(localContext).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.v
 * JD-Core Version:    0.6.2
 */