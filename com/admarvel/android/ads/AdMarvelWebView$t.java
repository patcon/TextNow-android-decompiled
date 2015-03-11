package com.admarvel.android.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

class AdMarvelWebView$t
  implements Runnable
{
  private static int a = -2147483648;
  private final WeakReference<AdMarvelWebView> b;

  public AdMarvelWebView$t(AdMarvelWebView paramAdMarvelWebView)
  {
    this.b = new WeakReference(paramAdMarvelWebView);
  }

  private int a()
  {
    return a;
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.b.get();
    if (localAdMarvelWebView == null);
    Context localContext;
    do
    {
      return;
      localContext = localAdMarvelWebView.getContext();
    }
    while (localContext == null);
    a = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getRotation();
    AdMarvelWebView.b(localAdMarvelWebView, a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.t
 * JD-Core Version:    0.6.2
 */