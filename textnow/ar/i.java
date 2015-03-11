package textnow.ar;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

final class i extends f
{
  private i(h paramh)
  {
    super(paramh);
  }

  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    this.b.d.a(new a("An SSL Error Occured.", -1, ""));
    super.a();
    paramWebView.clearView();
    paramWebView.loadUrl("about:blank");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ar.i
 * JD-Core Version:    0.6.2
 */