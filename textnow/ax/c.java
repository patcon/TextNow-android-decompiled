package textnow.ax;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class c extends WebViewClient
{
  private c(a parama)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    this.a.d = true;
    this.a.b.m();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.c
 * JD-Core Version:    0.6.2
 */