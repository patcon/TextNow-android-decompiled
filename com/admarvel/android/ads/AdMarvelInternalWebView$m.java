package com.admarvel.android.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

class AdMarvelInternalWebView$m
  implements Runnable
{
  private WeakReference<AdMarvelInternalWebView> a;
  private WeakReference<AdMarvelWebView> b;
  private long c = 500L;

  public AdMarvelInternalWebView$m(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext, AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = new WeakReference(paramAdMarvelWebView);
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.b.get();
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if ((localAdMarvelInternalWebView == null) || (localAdMarvelWebView == null));
    while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return;
    int[] arrayOfInt = { -1, -1 };
    localAdMarvelInternalWebView.getLocationOnScreen(arrayOfInt);
    if ((arrayOfInt[1] >= 0) && (arrayOfInt[1] < ab.h(localAdMarvelWebView.getContext())));
    for (int i = 1; ; i = 0)
    {
      if (AdMarvelInternalWebView.l(localAdMarvelInternalWebView) == null)
      {
        IntentFilter localIntentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
        localAdMarvelInternalWebView.getClass();
        AdMarvelInternalWebView.a(localAdMarvelInternalWebView, new AdMarvelInternalWebView.l(localAdMarvelInternalWebView));
        localAdMarvelInternalWebView.getContext().registerReceiver(AdMarvelInternalWebView.l(localAdMarvelInternalWebView), localIntentFilter);
      }
      if ((i != 0) && (!localAdMarvelInternalWebView.isLastStateVisible))
        localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelInternalWebView.visibilityCallback + "(" + true + ")");
      for (localAdMarvelInternalWebView.isLastStateVisible = true; ; localAdMarvelInternalWebView.isLastStateVisible = false)
      {
        do
        {
          AdMarvelInternalWebView.h(localAdMarvelInternalWebView).removeCallbacks(this);
          AdMarvelInternalWebView.h(localAdMarvelInternalWebView).postAtTime(this, SystemClock.uptimeMillis() + this.c);
          return;
        }
        while ((i != 0) || (!localAdMarvelInternalWebView.isLastStateVisible));
        localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelInternalWebView.visibilityCallback + "(" + false + ")");
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.m
 * JD-Core Version:    0.6.2
 */