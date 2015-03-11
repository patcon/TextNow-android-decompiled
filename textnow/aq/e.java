package textnow.aq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class e
{
  private static final Method d;
  private static final Method e;
  private static final Method f;
  private static final TreeMap<Integer, String> k;
  private WebView a = null;
  private boolean b = false;
  private f c = null;
  private final String g = "androidJSInterface";
  private final String h = e.class.getName();
  private boolean i = false;
  private WebSettings j;

  static
  {
    Class[] arrayOfClass1 = { String.class, ValueCallback.class };
    try
    {
      Method localMethod6 = WebView.class.getMethod("evaluateJavascript", arrayOfClass1);
      localMethod1 = localMethod6;
      d = localMethod1;
      arrayOfClass2 = new Class[1];
      arrayOfClass1[0] = Context.class;
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      try
      {
        Class[] arrayOfClass2;
        Method localMethod5 = WebSettings.class.getMethod("getDefaultUserAgent", arrayOfClass2);
        localMethod2 = localMethod5;
        e = localMethod2;
        arrayOfClass3 = new Class[1];
        arrayOfClass1[0] = WebSettings.RenderPriority.class;
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          while (true)
          {
            Class[] arrayOfClass3;
            Method localMethod4 = WebSettings.class.getMethod("setPluginState", arrayOfClass3);
            localMethod3 = localMethod4;
            f = localMethod3;
            TreeMap localTreeMap = new TreeMap();
            k = localTreeMap;
            localTreeMap.put(Integer.valueOf(9), "533.1");
            k.put(Integer.valueOf(10), "533.1");
            k.put(Integer.valueOf(11), "533.1");
            k.put(Integer.valueOf(12), "533.1");
            k.put(Integer.valueOf(13), "534.13");
            k.put(Integer.valueOf(14), "534.30");
            k.put(Integer.valueOf(15), "534.30");
            k.put(Integer.valueOf(16), "534.30");
            k.put(Integer.valueOf(17), "534.30");
            k.put(Integer.valueOf(18), "534.30");
            return;
            localNoSuchMethodException1 = localNoSuchMethodException1;
            Method localMethod1 = null;
          }
          localNoSuchMethodException2 = localNoSuchMethodException2;
          Method localMethod2 = null;
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          while (true)
            Method localMethod3 = null;
        }
      }
    }
  }

  @SuppressLint({"SetJavaScriptEnabled"})
  public e(Context paramContext, f paramf, boolean paramBoolean)
  {
    new StringBuilder("JSExecutor() Build: ").append(Build.VERSION.RELEASE);
    this.i = b();
    this.c = paramf;
    WebViewClient localWebViewClient;
    if (paramBoolean)
    {
      this.a = new WebView(paramContext);
      if (this.c == null)
        this.c = new f(null);
      localWebViewClient = new WebViewClient();
      this.j = this.a.getSettings();
      this.j.setJavaScriptEnabled(true);
      if (f == null);
    }
    try
    {
      Method localMethod = f;
      WebSettings localWebSettings = this.j;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = WebSettings.PluginState.ON;
      localMethod.invoke(localWebSettings, arrayOfObject);
      label175: this.a.setVisibility(4);
      this.a.setWebViewClient(localWebViewClient);
      if (a())
      {
        if (this.c.a == null);
        return;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label175;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label175;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      break label175;
      if (!this.i)
      {
        this.a.addJavascriptInterface(this.c, "androidJSInterface");
        return;
      }
      if (this.c.a == null);
      this.a.setWebChromeClient(new o(this.c));
    }
  }

  public static boolean a()
  {
    return d != null;
  }

  public static boolean b()
  {
    try
    {
      boolean bool = Build.VERSION.RELEASE.startsWith("2.3");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final String a(String paramString)
  {
    if (!this.b)
      return null;
    if (Thread.currentThread().isInterrupted())
      return "";
    CountDownLatch localCountDownLatch;
    if ((!this.i) && (!a()))
    {
      localCountDownLatch = new CountDownLatch(1);
      this.c.a(localCountDownLatch);
    }
    while (true)
    {
      String str;
      if (a())
      {
        str = "javascript:(function(){try{return " + paramString + " + \"\";}catch(js_eval_err){return '';}})();";
        label79: new StringBuilder("getJSResult() attempting to execute: ").append(str);
        this.c.b = null;
        if (!a())
          break label356;
      }
      while (true)
      {
        try
        {
          Method localMethod = d;
          WebView localWebView = this.a;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = str;
          arrayOfObject[1] = this.c;
          localMethod.invoke(localWebView, arrayOfObject);
          m = 0;
          if ((m != 0) && (this.c.a != null))
            this.c.a.countDown();
          if ((this.i) || (a()))
            break;
          if (localCountDownLatch == null)
            break label367;
          if (!localCountDownLatch.await(5L, TimeUnit.SECONDS));
          new StringBuilder("getJSResult() count = ").append(localCountDownLatch.getCount());
          if (this.c.b != null)
            break label375;
          return this.c.b;
          if (!this.i)
          {
            str = "javascript:window.androidJSInterface.getString((function(){try{return " + paramString + " + \"\";}catch(js_eval_err){return '';}})());";
            break label79;
          }
          str = "javascript:alert((function(){try{return " + paramString + " + \"\";}catch(js_eval_err){return '';}})());";
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          m = 1;
          continue;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          m = 1;
          continue;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          int m = 1;
          continue;
        }
        label356: this.a.loadUrl(str);
        continue;
        label367: continue;
        label375: new StringBuilder("getJSResult() After latch: got ").append(this.c.b);
      }
      localCountDownLatch = null;
    }
  }

  public final String a(boolean paramBoolean, Context paramContext)
  {
    if (e != null);
    String str1;
    do
    {
      while (true)
      {
        try
        {
          str1 = (String)e.invoke(null, new Object[] { paramContext });
          if ((str1 == null) || (str1.isEmpty()))
            break;
          return str1;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          str1 = "";
          continue;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          str1 = "";
          continue;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
        }
        str1 = "";
      }
      if ((paramBoolean) && (this.j != null))
        str1 = this.j.getUserAgentString();
    }
    while ((str1 != null) && (!str1.isEmpty()));
    if (k.containsKey(Integer.valueOf(Build.VERSION.SDK_INT)));
    for (String str2 = (String)k.get(Integer.valueOf(Build.VERSION.SDK_INT)); ; str2 = (String)k.lastEntry().getValue() + "+")
    {
      String str3 = Locale.getDefault().getLanguage();
      String str4 = Locale.getDefault().getCountry();
      if (!str4.isEmpty())
        str3 = str3 + "-" + str4;
      return "Mozilla/5.0 (Linux; U; Android " + Build.VERSION.RELEASE + "; " + str3.toLowerCase() + "; " + Build.MODEL + " Build/" + Build.DISPLAY + ") AppleWebKit/" + str2 + " (KHTML, like Gecko) Version/4.0 Mobile Safari/" + str2 + " " + m.a;
    }
  }

  public final void c()
  {
    if (!this.b)
    {
      if (this.a != null)
        break label20;
      this.b = true;
    }
    label20: CountDownLatch localCountDownLatch;
    while (true)
    {
      return;
      String str;
      if ((!this.i) && (!a()))
      {
        localCountDownLatch = new CountDownLatch(1);
        str = "<html><head></head><body onLoad='javascript:window.androidJSInterface.getString(1)'></body></html>";
        this.c.a(localCountDownLatch);
        this.c.b = null;
      }
      while (!Thread.currentThread().isInterrupted())
      {
        this.a.loadData(str, "text/html", null);
        if ((this.i) || (localCountDownLatch == null) || (a()))
          break label204;
        if (localCountDownLatch.await(5L, TimeUnit.SECONDS))
          break label133;
        return;
        str = "<html><head></head><body></body></html>";
        localCountDownLatch = null;
      }
    }
    label133: this.b = true;
    new StringBuilder("in init() count = ").append(localCountDownLatch.getCount());
    if (this.c.b == null)
      return;
    new StringBuilder("init() After latch: got ").append(this.c.b);
    return;
    label204: this.b = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.e
 * JD-Core Version:    0.6.2
 */