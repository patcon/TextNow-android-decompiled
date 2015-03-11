package textnow.bd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.dm;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import textnow.be.m;

public final class q extends WebView
{
  private c a;
  private l b;
  private u c;
  private t d;
  private boolean e;
  private final ab f;
  private dm g;
  private String h;
  private boolean i = false;
  private s j;

  public q(Context paramContext, r paramr, v paramv, ab paramab, String paramString)
  {
    super(paramContext);
    this.f = paramab;
    this.h = paramString;
    setScrollContainer(false);
    setBackgroundColor(0);
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        switch (paramAnonymousMotionEvent.getAction())
        {
        default:
        case 0:
        case 1:
        }
        while (true)
        {
          return false;
          if (!paramAnonymousView.hasFocus())
            paramAnonymousView.requestFocus();
        }
      }
    });
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setAllowFileAccess(true);
    localWebSettings.setCacheMode(2);
    if (com.tremorvideo.sdk.android.videoad.r.p() >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    if (com.tremorvideo.sdk.android.videoad.r.p() >= 17)
      localWebSettings.setMediaPlaybackRequiresUserGesture(false);
    this.a = new c(this);
    this.b = new l(this, paramr, paramv);
    this.c = new u(this, (byte)0);
    setWebViewClient(this.c);
    this.d = new t(this, this);
    setWebChromeClient(this.d);
    this.j = new s();
  }

  private void a(String paramString)
  {
    if ((paramString != null) && (this.i == true))
      super.loadUrl("javascript:" + paramString);
  }

  private boolean a(URI paramURI)
  {
    String str = paramURI.getHost();
    List localList = URLEncodedUtils.parse(paramURI, "UTF-8");
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
      localHashMap.put(localNameValuePair.getName(), localNameValuePair.getValue());
    }
    e locale = i.a(str, localHashMap, this);
    if (locale == null)
    {
      b(str);
      return false;
    }
    locale.a();
    b(str);
    return true;
  }

  private void b(String paramString)
  {
    a("window.mraidbridge.nativeCallComplete('" + paramString + "');");
  }

  public final void a()
  {
    if (this.g != null)
      this.g.e();
  }

  public final void a(dm paramdm)
  {
    this.g = paramdm;
  }

  public final void a(File paramFile)
  {
    String str1 = m.b(paramFile);
    int k = str1.indexOf("<html>");
    int m = 0;
    if (k == -1)
    {
      str1 = "<html><head><meta name='viewport' content='user-scalable=no; initial-scale=1.0'/></head><body style='margin:0;padding:0;overflow:hidden;background:transparent;'>" + str1 + "</body></html>";
      m = 1;
    }
    String str2 = "file://" + this.h + "mraid.js";
    if (str1.indexOf("<head><script src='" + str2 + "'></script>") == -1)
    {
      str1 = str1.replace("<head>", "<head><script src='" + str2 + "'></script>");
      m = 1;
    }
    if (m == 1);
    try
    {
      FileWriter localFileWriter = new FileWriter(paramFile);
      localFileWriter.write(str1);
      localFileWriter.close();
      loadUrl("file://" + paramFile.getAbsolutePath());
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        new StringBuilder().append("File write failed: ").append(localIOException.toString()).toString();
    }
  }

  protected final void a(String paramString1, String paramString2)
  {
    a("window.mraidbridge.fireErrorEvent('" + paramString1 + "', '" + paramString2 + "');");
  }

  protected final void a(ArrayList<n> paramArrayList)
  {
    String str1 = paramArrayList.toString();
    if (str1.length() < 2)
      return;
    String str2 = "{" + str1.substring(1, -1 + str1.length()) + "}";
    a("window.mraidbridge.fireChangeEvent(" + str2 + ");");
  }

  public final void a(aa paramaa)
  {
    s.a(this.j, paramaa);
  }

  protected final void a(n paramn)
  {
    String str = "{" + paramn.toString() + "}";
    a("window.mraidbridge.fireChangeEvent(" + str + ");");
  }

  public final void a(w paramw)
  {
    s.a(this.j, paramw);
  }

  public final void a(x paramx)
  {
    s.a(this.j, paramx);
  }

  public final boolean b()
  {
    a("window.mraidbridge.fireTremorVideoEndEvent();");
    return this.d.b();
  }

  public final void c()
  {
    this.g.g();
  }

  public final void d()
  {
    this.g.h();
  }

  public final void destroy()
  {
    if (this.b != null)
      this.b.b();
    super.destroy();
  }

  public final void e()
  {
    this.d.a();
    this.b.b();
    this.b = null;
    loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
    clearView();
    this.d = null;
    this.c = null;
  }

  protected final c f()
  {
    return this.a;
  }

  protected final l g()
  {
    return this.b;
  }

  public final y h()
  {
    return s.a(this.j);
  }

  public final x i()
  {
    return s.b(this.j);
  }

  public final aa j()
  {
    return s.c(this.j);
  }

  public final w k()
  {
    return s.d(this.j);
  }

  public final z l()
  {
    return s.e(this.j);
  }

  public final void m()
  {
    a("window.mraidbridge.fireTremorVideoEndEvent();");
  }

  protected final void n()
  {
    a("window.mraidbridge.fireReadyEvent();");
  }

  public final void o()
  {
    try
    {
      a(new URI("mraid://close"));
      return;
    }
    catch (Exception localException)
    {
      com.tremorvideo.sdk.android.videoad.r.a(localException);
    }
  }

  public final void onPause()
  {
    super.onPause();
    a("window.mraidbridge.fireTremorPauseAppEvent();");
    if (this.d != null)
      this.d.c();
  }

  public final void onResume()
  {
    super.onResume();
    a("window.mraidbridge.fireTremorResumeAppEvent();");
    if (this.d != null)
      this.d.d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.q
 * JD-Core Version:    0.6.2
 */