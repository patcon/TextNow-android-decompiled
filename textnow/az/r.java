package textnow.az;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

final class r extends WebViewClient
{
  private r(p paramp)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!p.a(this.a))
      this.a.a();
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("tremorvideo"))
    {
      p.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.az.r
 * JD-Core Version:    0.6.2
 */