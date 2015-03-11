package textnow.az;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

final class f extends WebViewClient
{
  private f(e parame)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if ((paramString.equals(e.b(this.a))) && (!e.c(this.a)))
    {
      this.a.b();
      e.a(this.a, true);
      this.a.a();
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("tremorvideo"))
    {
      e.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.az.f
 * JD-Core Version:    0.6.2
 */