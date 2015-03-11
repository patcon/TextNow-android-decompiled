package textnow.be;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.bc;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public final class q extends WebView
{
  public static int a = -1;
  public static int b = 0;
  public static int c = 1;
  q d = this;
  String e;
  String f;
  s g;
  n h;
  boolean i;
  boolean j;
  boolean k;
  public int l = a;
  public int m = 0;
  d n;
  private String o;

  public q(Context paramContext, n paramn)
  {
    super(paramContext);
    this.h = paramn;
    setBackgroundColor(0);
    this.l = a;
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportZoom(false);
    localWebSettings.setJavaScriptEnabled(true);
    if (Build.VERSION.SDK_INT >= 8)
      localWebSettings.setPluginState(WebSettings.PluginState.ON);
    localWebSettings.setAllowFileAccess(true);
    if (Build.VERSION.SDK_INT >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.n = new d(this);
    addJavascriptInterface(this.n, "Device");
    this.g = new s(this, (byte)0);
    setWebViewClient(this.g);
    setWebChromeClient(new r(this, (byte)0));
  }

  private void a(bc parambc)
  {
    n localn = this.h;
    if (localn.e != null)
      localn.e.a(parambc);
  }

  public final void a()
  {
    if ((this.i) && (this.j) && (this.k))
      this.g.a();
  }

  public final void a(String paramString1, String paramString2)
  {
    this.h.i();
    this.i = false;
    this.j = false;
    this.k = false;
    this.e = paramString2;
    this.f = paramString1;
    super.loadUrl("file://" + paramString1 + "index.html");
  }

  public final void a(URI paramURI)
  {
    String str1 = paramURI.getHost();
    List localList = URLEncodedUtils.parse(paramURI, "UTF-8");
    HashMap localHashMap = new HashMap();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      NameValuePair localNameValuePair = (NameValuePair)localIterator.next();
      localHashMap.put(localNameValuePair.getName(), localNameValuePair.getValue());
    }
    com.tremorvideo.sdk.android.videoad.r.d("Trying Command: " + str1 + " / " + (String)localHashMap.get("event_type"));
    String str4;
    if (str1.equals("trigger-event"))
    {
      str4 = (String)localHashMap.get("event_type");
      if (str4.equals("video-ready") == true)
      {
        this.j = true;
        bc localbc = bc.a(str4);
        this.d.a(localbc);
      }
    }
    while (true)
    {
      this.g.a(str1);
      return;
      if (str4.equals("video-start"))
      {
        this.k = true;
        this.d.a(bc.ag);
        break;
      }
      if (str4.equals("video-playing"))
      {
        this.l = b;
        break;
      }
      if ((!str4.equals("video-paused")) || (this.l != b))
        break;
      c();
      break;
      if (str1.equals("handle-url"))
      {
        this.o = ((String)localHashMap.get("url"));
      }
      else if (str1.equals("trigger-error"))
      {
        q localq = this.d;
        String str2 = (String)localHashMap.get("error_code");
        String str3 = (String)localHashMap.get("description");
        com.tremorvideo.sdk.android.videoad.r.d("EmbedPlayer Error - " + str2 + ": " + str3);
        localq.h.i();
        localq.g.a("trigger-error");
      }
      else
      {
        com.tremorvideo.sdk.android.videoad.r.d("Unknown native call in Embed JS player: " + str1);
      }
    }
  }

  public final void b()
  {
    if ((this.i) && (this.j) && (this.k))
    {
      this.l = c;
      this.g.b();
    }
  }

  public final void c()
  {
    if ((this.i) && (this.j) && (this.k))
    {
      this.l = b;
      this.g.c();
    }
  }

  public final void d()
  {
    if ((this.i == true) && (this.j))
      ((Activity)getContext()).runOnUiThread(new Runnable()
      {
        public final void run()
        {
          q.this.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.getCurrentTime();");
        }
      });
  }

  public final int getProgress()
  {
    if (this.m > 0)
      return this.m;
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.q
 * JD-Core Version:    0.6.2
 */