package textnow.az;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.r;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;
import org.json.JSONObject;

public final class e extends WebView
{
  f a;
  c b;
  public float c = 255.0F;
  public boolean d = false;
  private boolean e;
  private JSONObject f;
  private ArrayList<g> g;
  private String h;

  public e(Context paramContext)
  {
    super(paramContext);
    clearCache(true);
    setScrollContainer(false);
    setBackgroundColor(0);
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setUseWideViewPort(true);
    localWebSettings.setCacheMode(2);
    if (r.p() >= 8)
      localWebSettings.setPluginState(WebSettings.PluginState.ON);
    localWebSettings.setAllowFileAccess(true);
    if (r.p() >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.a = new f(this, (byte)0);
    setWebViewClient(this.a);
    setWebChromeClient(new h(this, (byte)0));
    getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
    this.g = new ArrayList();
    this.e = false;
  }

  private void d(String paramString)
  {
    e("tremorcore.fireEvent('frameChange'," + paramString + ");");
  }

  private void e(String paramString)
  {
    if (paramString != null)
      ((Activity)getContext()).runOnUiThread(new i(this, paramString));
  }

  public final void a()
  {
    setBackgroundColor(0);
    if (r.p() > 10)
      setLayerType(1, null);
    onSizeChanged(getWidth(), getHeight(), 0, 0);
  }

  public final void a(float paramFloat)
  {
    if ((r.p() > 10) && (paramFloat != this.c))
      setAlpha(paramFloat / 255.0F);
    this.c = paramFloat;
  }

  protected final void a(String paramString)
  {
    e("tremorcore.nativeCallComplete('" + paramString + "');");
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).cancel(true);
    this.g.clear();
    this.e = false;
    this.h = paramString;
    this.f = paramJSONObject;
    loadUrl(paramString);
  }

  public final void a(c paramc)
  {
    this.b = paramc;
  }

  public final void a(g paramg)
  {
    if ((this.g != null) && (this.g.contains(paramg)))
      this.g.remove(paramg);
  }

  protected final void b()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if ((localLayoutParams instanceof RelativeLayout.LayoutParams))
      {
        localJSONObject.put("x", ((RelativeLayout.LayoutParams)localLayoutParams).leftMargin);
        localJSONObject.put("y", ((RelativeLayout.LayoutParams)localLayoutParams).topMargin);
        localJSONObject.put("width", localLayoutParams.width);
        localJSONObject.put("height", localLayoutParams.height);
        if (r.p() < 14)
          localJSONObject.put("Android2Fix", 1);
      }
      d(localJSONObject.toString());
      e("tremorcore.fireEvent('init'," + this.f + ");");
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }

  protected final void b(String paramString)
  {
    e("tremorcore.urlRequestDidFinishLoading(" + paramString + ");");
  }

  protected final void c(String paramString)
  {
    e("tremorcore.urlRequestDidFailWithError(" + paramString + ");");
  }

  public final void destroy()
  {
    this.d = true;
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).cancel(true);
    this.g.clear();
    this.g = null;
    this.f = null;
    this.e = false;
    super.destroyDrawingCache();
    super.destroy();
  }

  public final void draw(Canvas paramCanvas)
  {
    if (r.p() < 11)
    {
      paramCanvas.saveLayerAlpha(null, Math.round(this.c), 31);
      super.draw(paramCanvas);
      paramCanvas.restore();
      return;
    }
    super.draw(paramCanvas);
  }

  public final void loadUrl(String paramString)
  {
    if (!this.d)
      super.loadUrl(paramString);
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JSONObject localJSONObject;
    if (this.e)
      localJSONObject = new JSONObject();
    try
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if ((localLayoutParams instanceof RelativeLayout.LayoutParams))
      {
        localJSONObject.put("x", ((RelativeLayout.LayoutParams)localLayoutParams).leftMargin);
        localJSONObject.put("y", ((RelativeLayout.LayoutParams)localLayoutParams).topMargin);
      }
      localJSONObject.put("width", paramInt1);
      localJSONObject.put("height", paramInt2);
      if (r.p() < 14)
        localJSONObject.put("Android2Fix", 1);
      d(localJSONObject.toString());
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.az.e
 * JD-Core Version:    0.6.2
 */