package com.admarvel.android.ads;

import com.admarvel.android.util.Logging;

class AdMarvelWebView$x
  implements Runnable
{
  private final String b;

  public AdMarvelWebView$x(AdMarvelWebView paramAdMarvelWebView, String paramString)
  {
    this.b = paramString;
  }

  public void run()
  {
    if (!AdMarvelWebView.U(this.a))
    {
      Logging.log("onPagFinished is not  called after delay" + u.b);
      AdMarvelWebView.n(this.a, this.b);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.x
 * JD-Core Version:    0.6.2
 */