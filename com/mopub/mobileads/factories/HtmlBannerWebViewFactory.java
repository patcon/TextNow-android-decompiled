package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.AdConfiguration;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;
import com.mopub.mobileads.HtmlBannerWebView;

public class HtmlBannerWebViewFactory
{
  protected static HtmlBannerWebViewFactory instance = new HtmlBannerWebViewFactory();

  public static HtmlBannerWebView create(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, boolean paramBoolean, String paramString1, String paramString2, AdConfiguration paramAdConfiguration)
  {
    return instance.internalCreate(paramContext, paramCustomEventBannerListener, paramBoolean, paramString1, paramString2, paramAdConfiguration);
  }

  @Deprecated
  public static void setInstance(HtmlBannerWebViewFactory paramHtmlBannerWebViewFactory)
  {
    instance = paramHtmlBannerWebViewFactory;
  }

  public HtmlBannerWebView internalCreate(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, boolean paramBoolean, String paramString1, String paramString2, AdConfiguration paramAdConfiguration)
  {
    HtmlBannerWebView localHtmlBannerWebView = new HtmlBannerWebView(paramContext, paramAdConfiguration);
    localHtmlBannerWebView.init(paramCustomEventBannerListener, paramBoolean, paramString1, paramString2);
    return localHtmlBannerWebView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.HtmlBannerWebViewFactory
 * JD-Core Version:    0.6.2
 */