package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.AdConfiguration;
import com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener;
import com.mopub.mobileads.HtmlInterstitialWebView;

public class HtmlInterstitialWebViewFactory
{
  protected static HtmlInterstitialWebViewFactory instance = new HtmlInterstitialWebViewFactory();

  public static HtmlInterstitialWebView create(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, boolean paramBoolean, String paramString1, String paramString2, AdConfiguration paramAdConfiguration)
  {
    return instance.internalCreate(paramContext, paramCustomEventInterstitialListener, paramBoolean, paramString1, paramString2, paramAdConfiguration);
  }

  @Deprecated
  public static void setInstance(HtmlInterstitialWebViewFactory paramHtmlInterstitialWebViewFactory)
  {
    instance = paramHtmlInterstitialWebViewFactory;
  }

  public HtmlInterstitialWebView internalCreate(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, boolean paramBoolean, String paramString1, String paramString2, AdConfiguration paramAdConfiguration)
  {
    HtmlInterstitialWebView localHtmlInterstitialWebView = new HtmlInterstitialWebView(paramContext, paramAdConfiguration);
    localHtmlInterstitialWebView.init(paramCustomEventInterstitialListener, paramBoolean, paramString1, paramString2);
    return localHtmlInterstitialWebView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.HtmlInterstitialWebViewFactory
 * JD-Core Version:    0.6.2
 */