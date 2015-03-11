package textnow.as;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Map;

public final class l extends WebView
{
  public n a;
  private m b;
  private o c;
  private boolean d = false;
  private Handler e;
  private Runnable f;

  public l(Context paramContext, n paramn)
  {
    super(paramContext);
    getSettings().setJavaScriptEnabled(true);
    getSettings().setAllowFileAccess(true);
    this.b = new m(this, (byte)0);
    setWebChromeClient(this.b);
    this.c = new o(this, (byte)0);
    setWebViewClient(this.c);
    this.e = new Handler();
    this.f = new Runnable()
    {
      public final void run()
      {
        l.this.a.a(false, true);
      }
    };
    this.e.postDelayed(this.f, 8000L);
    this.a = paramn;
  }

  public final void a()
  {
    if (!this.d)
    {
      this.d = true;
      super.loadUrl("javascript:validateXML()");
    }
  }

  public final void a(Map<String, String> paramMap)
  {
    if (this.e != null)
    {
      this.e.removeCallbacks(this.f);
      this.e = null;
      this.f = null;
    }
    if (((String)paramMap.get("valid")).equals("true"))
    {
      this.a.a(true, false);
      return;
    }
    this.a.a(false, false);
  }

  public final void destroy()
  {
    if (this.e != null)
    {
      this.e.removeCallbacks(this.f);
      this.e = null;
      this.f = null;
    }
    clearCache(false);
    destroyDrawingCache();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.as.l
 * JD-Core Version:    0.6.2
 */