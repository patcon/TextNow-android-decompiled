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

class AdMarvelInternalWebView$b extends WebChromeClient
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final WeakReference<Context> b;

  public AdMarvelInternalWebView$b(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = new WeakReference(paramContext);
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null);
    w localw;
    do
    {
      do
        return;
      while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView));
      boolean bool = localAdMarvelInternalWebView.getParent() instanceof RelativeLayout;
      localw = null;
      if (bool)
        localw = (w)((RelativeLayout)localAdMarvelInternalWebView.getParent()).findViewWithTag(localAdMarvelInternalWebView.GUID + "CONTROLS");
    }
    while ((localw == null) || (AdMarvelInternalWebView.e(localAdMarvelInternalWebView).get() != true));
    ((ProgressBar)localw.findViewWithTag(localAdMarvelInternalWebView.GUID + "PROGRESS_BAR")).setProgress(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.b
 * JD-Core Version:    0.6.2
 */