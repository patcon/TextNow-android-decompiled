package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class d$b extends WebChromeClient
{
  private final WeakReference<d> a;
  private final WeakReference<Context> b;

  public d$b(d paramd, Context paramContext)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramContext);
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    d locald = (d)this.a.get();
    if (locald == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsResult.cancel();
      return true;
    }
    if ((this.b.get() != null) && ((this.b.get() instanceof Activity)))
      return super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    d locald = (d)this.a.get();
    if (locald == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsResult.cancel();
      return true;
    }
    if ((this.b.get() != null) && ((this.b.get() instanceof Activity)))
      return super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    d locald = (d)this.a.get();
    if (locald == null)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if ((this.b.get() != null) && ((this.b.get() instanceof Activity)))
      return super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
    paramJsPromptResult.cancel();
    return true;
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    d locald = (d)this.a.get();
    if (locald == null);
    o localo;
    do
    {
      do
        return;
      while (d.a(locald));
      boolean bool = locald.getParent() instanceof RelativeLayout;
      localo = null;
      if (bool)
        localo = (o)((RelativeLayout)locald.getParent()).findViewWithTag(locald.s + "CONTROLS");
    }
    while ((localo == null) || (d.d(locald).get() != true));
    ((ProgressBar)localo.findViewWithTag(locald.s + "PROGRESS_BAR")).setProgress(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.b
 * JD-Core Version:    0.6.2
 */