package com.flurry.sdk;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class n$b extends WebViewClient
{
  private n$b(n paramn)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    eo.a(3, n.a(this.a), "onPageFinished: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != n.b(this.a)))
      return;
    n.a(this.a, false);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    eo.a(3, n.a(this.a), "onPageStarted: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != n.b(this.a)))
      return;
    this.a.e();
    if (n.d(this.a))
    {
      n.f localf = n.c(this.a);
      boolean bool = false;
      if (localf != null)
        bool = n.c(this.a).a(this.a, paramString, n.d(this.a));
      if (bool)
        paramWebView.stopLoading();
    }
    n.a(this.a, true);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    eo.a(3, n.a(this.a), "shouldOverrideUrlLoading: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != n.b(this.a)))
      return false;
    if (n.c(this.a) != null);
    for (boolean bool = n.c(this.a).a(this.a, paramString, n.d(this.a)); ; bool = false)
    {
      n.a(this.a, false);
      return bool;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.n.b
 * JD-Core Version:    0.6.2
 */