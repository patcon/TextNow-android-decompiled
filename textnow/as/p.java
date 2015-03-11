package textnow.as;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Map;
import java.util.Timer;

public final class p extends WebView
{
  private c a;
  private r b;
  private q c;
  private a d;
  private boolean e;

  public p(Context paramContext, c paramc)
  {
    super(paramContext);
    this.a = paramc;
    setScrollContainer(false);
    setBackgroundColor(0);
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setAllowFileAccess(true);
    if (Build.VERSION.SDK_INT >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.d = this.a.j();
    this.b = new r(this, (byte)0);
    setWebViewClient(this.b);
    this.c = new q(this, (byte)0);
    setWebChromeClient(this.c);
    this.e = false;
  }

  private void a(String paramString)
  {
    b("tremorcore.nativeCallComplete('" + paramString + "');");
  }

  private void b(String paramString)
  {
    if (paramString != null)
      super.loadUrl("javascript:" + paramString);
  }

  protected final void a()
  {
    b("tremorcore.fireEvent('viewableChange','true');");
  }

  public final void a(Map<String, String> paramMap)
  {
    this.d.a(paramMap);
  }

  public final void b()
  {
    a locala = this.d;
    if (locala.b != null)
    {
      locala.b.cancel();
      locala.b.purge();
      locala.b = null;
    }
  }

  public final void destroy()
  {
    clearCache(false);
    destroyDrawingCache();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.as.p
 * JD-Core Version:    0.6.2
 */