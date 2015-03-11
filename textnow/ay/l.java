package textnow.ay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.av;
import com.tremorvideo.sdk.android.videoad.bh;
import com.tremorvideo.sdk.android.videoad.cl;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpParams;
import org.json.JSONObject;

public final class l extends WebView
  implements bh
{
  m a;
  i b;
  public float c = 255.0F;
  public boolean d = false;
  int e = -1;
  Context f;
  Activity g;
  Timer h;
  JSONObject i;
  private boolean j;
  private JSONObject k;
  private ArrayList<n> l;
  private String m;
  private GestureDetector n;
  private AtomicBoolean o = new AtomicBoolean(false);
  private AtomicLong p = new AtomicLong(0L);

  public l(Context paramContext, int paramInt, String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    super(paramContext);
    this.f = paramContext;
    this.g = ((Activity)paramContext);
    clearCache(true);
    this.e = paramInt;
    this.m = paramString;
    this.k = paramJSONObject1;
    this.i = paramJSONObject2;
    d();
  }

  private void d()
  {
    setScrollContainer(false);
    setBackgroundColor(0);
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    requestFocus(130);
    setBackgroundColor(0);
    if (com.tremorvideo.sdk.android.videoad.r.p() > 10)
      setLayerType(1, null);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setUseWideViewPort(true);
    localWebSettings.setLoadWithOverviewMode(true);
    localWebSettings.setCacheMode(2);
    getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
    if (com.tremorvideo.sdk.android.videoad.r.p() >= 8)
      localWebSettings.setPluginState(WebSettings.PluginState.ON);
    localWebSettings.setAllowFileAccess(true);
    if (com.tremorvideo.sdk.android.videoad.r.p() >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.a = new m(this, (byte)0);
    setWebViewClient(this.a);
    setWebChromeClient(new p(this, (byte)0));
    this.l = new ArrayList();
    this.j = false;
    this.n = new GestureDetector(this.f, new o(this, (byte)0));
    addJavascriptInterface(this, "AndroidDevice");
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
      ((n)localIterator.next()).cancel(true);
    this.l.clear();
    this.j = false;
    this.h = new Timer();
    this.h.schedule(new s(this, this.m), 100L);
  }

  private void e(String paramString)
  {
    f("TMWI.nativeCallComplete('" + paramString + "');");
  }

  private void f(String paramString)
  {
    if (paramString != null)
      ((Activity)getContext()).runOnUiThread(new r(this, paramString));
  }

  public final int a()
  {
    return this.e;
  }

  public final void a(float paramFloat)
  {
    if ((com.tremorvideo.sdk.android.videoad.r.p() > 10) && (paramFloat != this.c))
      setAlpha(paramFloat / 255.0F);
    this.c = paramFloat;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      offsetLeftAndRight(paramInt1);
      offsetTopAndBottom(paramInt2);
      return;
    }
    setX(paramInt1);
    setY(paramInt2);
  }

  protected final void a(String paramString)
  {
    f("TMWI.urlRequestDidFinishLoading(" + paramString + ");");
  }

  public final void a(i parami)
  {
    this.b = parami;
  }

  public final void a(n paramn)
  {
    if ((this.l != null) && (this.l.contains(paramn)))
      this.l.remove(paramn);
  }

  public final void b()
  {
    setBackgroundColor(0);
    if (com.tremorvideo.sdk.android.videoad.r.p() > 10)
      setLayerType(1, null);
    onSizeChanged(getWidth(), getHeight(), 0, 0);
  }

  protected final void b(String paramString)
  {
    f("TMWI.urlRequestDidFailWithError(" + paramString + ");");
  }

  protected final void c()
  {
    try
    {
      if (com.tremorvideo.sdk.android.videoad.r.a)
        this.k.put("AppID", com.tremorvideo.sdk.android.videoad.r.c);
      cl.a(com.tremorvideo.sdk.android.videoad.r.u(), true);
      av localav = av.a();
      this.k.put("OS", localav.d);
      this.k.put("OS_version", localav.e);
      this.k.put("carrier", localav.l);
      this.k.put("connection", localav.i);
      this.k.put("make", localav.b);
      this.k.put("sdk_version", localav.a);
      this.k.put("udid", localav.f);
      this.k.put("opt-out", localav.g);
      this.k.put("androidID", localav.h);
      this.k.put("AndroidVersion", com.tremorvideo.sdk.android.videoad.r.p());
      this.k.put("Lat", cl.a);
      this.k.put("Long", cl.b);
      if (this.i != null)
      {
        Iterator localIterator = this.i.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          this.k.put(str, this.i.get(str));
        }
      }
    }
    catch (Exception localException)
    {
      com.tremorvideo.sdk.android.videoad.r.d("Failed to add additional parameters");
      f("TMWI.fireEvent('init'," + this.k + ");");
    }
  }

  protected final void c(String paramString)
  {
    f("TMWI.fireEvent('frameChange'," + paramString + ");");
  }

  public final void d(String paramString)
  {
    com.tremorvideo.sdk.android.videoad.r.d("GenericWebView:onZipChanged zip=" + paramString);
    f("TMWI.fireEvent('onZipPicked','" + paramString + "');");
  }

  public final void destroy()
  {
    this.d = true;
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
      ((n)localIterator.next()).cancel(true);
    this.l.clear();
    this.l = null;
    this.k = null;
    this.j = false;
    super.destroyDrawingCache();
    super.destroy();
  }

  public final void draw(Canvas paramCanvas)
  {
    if (com.tremorvideo.sdk.android.videoad.r.p() < 11)
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
    if (this.j)
      localJSONObject = new JSONObject();
    try
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if ((localLayoutParams instanceof RelativeLayout.LayoutParams))
      {
        localJSONObject.put("x", ((RelativeLayout.LayoutParams)localLayoutParams).leftMargin);
        localJSONObject.put("y", ((RelativeLayout.LayoutParams)localLayoutParams).topMargin);
        localJSONObject.put("width", ((RelativeLayout.LayoutParams)localLayoutParams).width);
        localJSONObject.put("height", ((RelativeLayout.LayoutParams)localLayoutParams).height);
      }
      localJSONObject.put("AndroidVersion", com.tremorvideo.sdk.android.videoad.r.p());
      c(localJSONObject.toString());
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tremorvideo.sdk.android.videoad.r.a(localException);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    requestFocus(130);
    if (paramMotionEvent.getPointerId((0xFF00 & paramMotionEvent.getAction()) >> 8) == 0)
    {
      this.n.onTouchEvent(paramMotionEvent);
      if (this.o.get())
      {
        if (System.currentTimeMillis() - this.p.get() > ViewConfiguration.getDoubleTapTimeout())
          this.o.set(false);
      }
      else
        bool = super.onTouchEvent(paramMotionEvent);
    }
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.l
 * JD-Core Version:    0.6.2
 */