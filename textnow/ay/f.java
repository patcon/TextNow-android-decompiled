package textnow.ay;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

final class f extends WebViewClient
{
  private f(d paramd)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!d.b(this.a))
    {
      this.a.b();
      Iterator localIterator = d.a(this.a).iterator();
      while (localIterator.hasNext())
        ((k)localIterator.next()).cancel(true);
      d.a(this.a).clear();
      this.a.a();
      this.a.b("TMWI.fireEvent('init'," + d.c(this.a) + ");");
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("tmwi"))
    {
      d.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.f
 * JD-Core Version:    0.6.2
 */