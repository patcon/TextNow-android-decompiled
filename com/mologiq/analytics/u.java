package com.mologiq.analytics;

import android.content.Context;
import java.lang.ref.WeakReference;

final class u
  implements Runnable
{
  private final WeakReference<Context> a;

  public u(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  public final void run()
  {
    Context localContext = (Context)this.a.get();
    if (localContext != null)
      new t(localContext).execute(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.u
 * JD-Core Version:    0.6.2
 */