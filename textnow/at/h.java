package textnow.at;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

final class h extends WebViewClient
{
  private h(f paramf)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!f.a(this.a))
    {
      this.a.c();
      this.a.a();
      this.a.b();
      this.a.d();
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
      f.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.at.h
 * JD-Core Version:    0.6.2
 */