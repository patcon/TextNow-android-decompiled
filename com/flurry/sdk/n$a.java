package com.flurry.sdk;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;

final class n$a extends WebChromeClient
{
  private n$a(n paramn)
  {
  }

  public final void onHideCustomView()
  {
    eo.a(3, n.a(this.a), "onHideCustomView()");
    if (n.e(this.a) != null)
      n.e(this.a).a(this.a);
    n.b(this.a, false);
  }

  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    eo.a(3, n.a(this.a), "onShowCustomView(14)");
    n.b(this.a, true);
    if (n.e(this.a) != null)
      n.e(this.a).a(this.a, paramView, paramInt, new n.g(this.a, paramCustomViewCallback));
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    eo.a(3, n.a(this.a), "onShowCustomView(7)");
    n.b(this.a, true);
    if (n.e(this.a) != null)
      n.e(this.a).a(this.a, paramView, new n.g(this.a, paramCustomViewCallback));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.n.a
 * JD-Core Version:    0.6.2
 */