package textnow.ba;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.dx;
import com.tremorvideo.sdk.android.videoad.r;

public final class f extends WebView
{
  private c a;
  private h b;
  private g c;
  private a d;
  private e e;
  private boolean f;

  public f(Context paramContext, c paramc)
  {
    super(paramContext);
    this.a = paramc;
    this.e = paramc.f().z();
    setScrollContainer(false);
    setBackgroundColor(0);
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    localWebSettings.setJavaScriptEnabled(true);
    if (Build.VERSION.SDK_INT >= 8)
      localWebSettings.setPluginState(WebSettings.PluginState.ON);
    localWebSettings.setAllowFileAccess(true);
    if (Build.VERSION.SDK_INT >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.d = this.a.j();
    this.b = new h(this, (byte)0);
    setWebViewClient(this.b);
    this.c = new g(this, (byte)0);
    setWebChromeClient(this.c);
    this.f = false;
  }

  private void b(String paramString)
  {
    c("tremorcore.nativeCallComplete('" + paramString + "');");
  }

  private void c(String paramString)
  {
    if (paramString != null)
      super.loadUrl("javascript:" + paramString);
  }

  protected final void a()
  {
    c("tremorcore.fireEvent('viewableChange','true');");
  }

  protected final void a(String paramString)
  {
    this.d.g();
    c("tremorcore.fireEvent('tmsDataChange'," + paramString + ");");
  }

  protected final void b()
  {
    c("tremorcore.fireEvent('zipChange','" + this.e.a + "');");
  }

  public final void c()
  {
    setBackgroundColor(0);
    if (r.p() > 10)
      setLayerType(1, null);
    this.f = true;
  }

  public final void d()
  {
    try
    {
      String str = this.e.b().replace("__ZIP__", this.e.a).replace("__DATE__", this.e.b);
      new i(this).execute(new String[] { str });
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void destroy()
  {
    clearCache(false);
    destroyDrawingCache();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ba.f
 * JD-Core Version:    0.6.2
 */