package textnow.ax;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class o extends WebChromeClient
{
  private f a;
  private final String b = o.class.getName();

  public o(f paramf)
  {
    this.a = paramf;
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    new StringBuilder("onJsAlert() -").append(paramString2);
    this.a.a(paramString2);
    paramJsResult.confirm();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ax.o
 * JD-Core Version:    0.6.2
 */