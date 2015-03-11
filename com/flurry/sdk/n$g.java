package com.flurry.sdk;

import android.webkit.WebChromeClient.CustomViewCallback;

final class n$g
  implements n.d.a
{
  private WebChromeClient.CustomViewCallback b;

  public n$g(n paramn, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.b = paramCustomViewCallback;
  }

  public final void a()
  {
    if (this.b != null)
      this.b.onCustomViewHidden();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.n.g
 * JD-Core Version:    0.6.2
 */