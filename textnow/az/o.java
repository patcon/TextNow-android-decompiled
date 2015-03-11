package textnow.az;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

final class o extends WebViewClient
{
  private o(l paraml)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if ((paramWebView instanceof l))
      ((l)paramWebView).a();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("tremorvideo"))
    {
      l.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.az.o
 * JD-Core Version:    0.6.2
 */