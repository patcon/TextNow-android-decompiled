package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class d$i
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<d> b;

  public d$i(d paramd, Context paramContext)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    if (this.a != null);
    for (Context localContext = (Context)this.a.get(); ; localContext = null)
    {
      if ((localContext != null) && ((localContext instanceof AdMarvelActivity)))
      {
        AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localContext;
        Object localObject = this.b.get();
        d locald = null;
        if (localObject != null)
          locald = (d)this.b.get();
        if ((locald != null) && (!locald.b()) && (!d.e(locald)))
        {
          Logging.log("Closing Interstitial as onpagefinished is not called");
          localAdMarvelActivity.g();
        }
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.i
 * JD-Core Version:    0.6.2
 */