package com.admarvel.android.ads;

import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class d$k
  implements Runnable
{
  private final WeakReference<d> b;
  private String c = null;

  public d$k(d paramd1, d paramd2, String paramString)
  {
    this.b = new WeakReference(paramd2);
    this.c = paramString;
  }

  public void run()
  {
    if (this.b == null);
    d locald;
    do
    {
      return;
      locald = (d)this.b.get();
    }
    while ((locald == null) || (locald.b()));
    locald.loadUrl("javascript:" + this.c);
    Logging.log("Inject JS:" + this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.k
 * JD-Core Version:    0.6.2
 */