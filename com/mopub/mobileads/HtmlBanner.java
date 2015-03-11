package com.mopub.mobileads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.enflick.android.TextNow.ads.c;
import com.enflick.android.TextNow.ads.d;
import com.mopub.mobileads.factories.HtmlBannerWebViewFactory;
import java.util.Map;

public class HtmlBanner extends CustomEventBanner
  implements d
{
  private static Handler handler = new Handler();
  private static Runnable sLoadBanner;
  private CustomEventBanner.CustomEventBannerListener mBannerListener;
  private HtmlBannerWebView mHtmlBannerWebView;

  private boolean extrasAreValid(Map<String, String> paramMap)
  {
    return paramMap.containsKey("Html-Response-Body");
  }

  public void invalidate()
  {
    if (this.mHtmlBannerWebView != null)
      this.mHtmlBannerWebView.destroy();
  }

  protected void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.mBannerListener = new HtmlBanner.CustomHtmlEventBannerListener(paramCustomEventBannerListener);
    if (extrasAreValid(paramMap1))
    {
      String str1 = Uri.decode((String)paramMap1.get("Html-Response-Body"));
      String str2 = (String)paramMap1.get("Redirect-Url");
      String str3 = (String)paramMap1.get("Clickthrough-Url");
      Boolean localBoolean = Boolean.valueOf((String)paramMap1.get("Scrollable"));
      AdConfiguration localAdConfiguration = AdConfiguration.extractFromMap(paramMap);
      this.mHtmlBannerWebView = HtmlBannerWebViewFactory.create(paramContext, this.mBannerListener, localBoolean.booleanValue(), str2, str3, localAdConfiguration);
      AdViewController.setShouldHonorServerDimensions(this.mHtmlBannerWebView);
      this.mHtmlBannerWebView.loadHtmlResponse(str1);
      return;
    }
    paramCustomEventBannerListener.onBannerFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
  }

  protected void onInvalidate()
  {
    ((HtmlBanner.CustomHtmlEventBannerListener)this.mBannerListener).mListener = null;
    this.mBannerListener = null;
    c.a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlBanner
 * JD-Core Version:    0.6.2
 */