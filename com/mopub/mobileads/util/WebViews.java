package com.mopub.mobileads.util;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.reflect.Method;

public class WebViews
{
  private static final String LOGTAG = "MoPub - WebViewsUtil";

  public static void onPause(WebView paramWebView)
  {
    try
    {
      WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(paramWebView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void onResume(WebView paramWebView)
  {
    try
    {
      WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(paramWebView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void setDisableJSChromeClient(WebView paramWebView)
  {
    paramWebView.setWebChromeClient(new WebChromeClient()
    {
      public final boolean onJsAlert(WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
      {
        return true;
      }

      public final boolean onJsBeforeUnload(WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
      {
        return true;
      }

      public final boolean onJsConfirm(WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
      {
        return true;
      }

      public final boolean onJsPrompt(WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, JsPromptResult paramAnonymousJsPromptResult)
      {
        return true;
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.WebViews
 * JD-Core Version:    0.6.2
 */