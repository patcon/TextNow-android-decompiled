package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelInternalWebView$h
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelInternalWebView$h(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    if (!AdMarvelInternalWebView.i())
    {
      Context localContext;
      AdMarvelActivity localAdMarvelActivity;
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      if (this.a != null)
      {
        localContext = (Context)this.a.get();
        if ((localContext != null) && ((localContext instanceof AdMarvelActivity)))
        {
          localAdMarvelActivity = (AdMarvelActivity)localContext;
          if (this.b.get() == null)
            break label122;
          localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
          label61: if ((localAdMarvelInternalWebView == null) || (!AdMarvelInternalWebView.f(localAdMarvelInternalWebView).get()))
            break label133;
          if (localAdMarvelActivity.a == null)
            break label127;
          localg = (AdMarvelActivity.g)localAdMarvelActivity.a.get();
          if ((localg != null) && (localg.a()))
          {
            Logging.log("closing In-app as dialog is visible and onpagefinished is not called");
            localAdMarvelActivity.g();
          }
        }
      }
      label122: label127: 
      while (localAdMarvelActivity == null)
        while (true)
        {
          return;
          localContext = null;
          break;
          localAdMarvelInternalWebView = null;
          break label61;
          AdMarvelActivity.g localg = null;
        }
      label133: Logging.log("closing Interstitial as onpagefinished is not called");
      localAdMarvelActivity.g();
      return;
    }
    Logging.log("not closing Interstitial as pageFinished is called");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.h
 * JD-Core Version:    0.6.2
 */