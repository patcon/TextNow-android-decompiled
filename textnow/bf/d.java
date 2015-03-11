package textnow.bf;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class d extends WebView
  implements v
{
  private b a;
  private f b;
  private e c;
  private a d;
  private ArrayList<k> e;
  private boolean f;
  private JSONObject g;

  public d(Context paramContext, b paramb)
  {
    super(paramContext);
    this.a = paramb;
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
    this.b = new f(this, (byte)0);
    setWebViewClient(this.b);
    this.c = new e(this, (byte)0);
    setWebChromeClient(this.c);
    this.f = false;
    this.e = new ArrayList();
  }

  private void c(String paramString)
  {
    b("TMWI.nativeCallComplete('" + paramString + "');");
  }

  protected final void a()
  {
    b("TMWI.fireEvent('viewableChange','true');");
  }

  public final void a(String paramString)
  {
    if (paramString != null);
    try
    {
      this.g = new JSONObject(paramString);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(k paramk)
  {
    if ((this.e != null) && (this.e.contains(paramk)))
      this.e.remove(paramk);
  }

  public final void b()
  {
    setBackgroundColor(0);
    if (r.p() > 10)
      setLayerType(1, null);
    this.f = true;
  }

  protected final void b(String paramString)
  {
    if (paramString != null)
      super.loadUrl("javascript:" + paramString);
  }

  public final void destroy()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((k)localIterator.next()).cancel(true);
    this.e.clear();
    this.e = null;
    clearCache(false);
    destroyDrawingCache();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bf.d
 * JD-Core Version:    0.6.2
 */