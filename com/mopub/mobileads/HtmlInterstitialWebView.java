package com.mopub.mobileads;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.mopub.common.util.VersionCode;

public class HtmlInterstitialWebView extends BaseHtmlWebView
{
  protected static final String MOPUB_JS_INTERFACE_NAME = "mopubUriInterface";
  private Handler mHandler = new Handler();

  public HtmlInterstitialWebView(Context paramContext, AdConfiguration paramAdConfiguration)
  {
    super(paramContext, paramAdConfiguration);
  }

  private void postHandlerRunnable(Runnable paramRunnable)
  {
    this.mHandler.post(paramRunnable);
  }

  void addMoPubUriJavascriptInterface(final HtmlInterstitialWebView.MoPubUriJavascriptFireFinishLoadListener paramMoPubUriJavascriptFireFinishLoadListener)
  {
    addJavascriptInterface(new Object()
    {
      @JavascriptInterface
      public final boolean fireFinishLoad()
      {
        this.this$0.postHandlerRunnable(new Runnable()
        {
          public void run()
          {
            HtmlInterstitialWebView.1MoPubUriJavascriptInterface.this.val$moPubUriJavascriptFireFinishLoadListener.onInterstitialLoaded();
          }
        });
        return true;
      }
    }
    , "mopubUriInterface");
  }

  @TargetApi(11)
  public void destroy()
  {
    if (VersionCode.currentApiLevel().isAtLeast(VersionCode.HONEYCOMB))
      removeJavascriptInterface("mopubUriInterface");
    super.destroy();
  }

  public void init(final CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, boolean paramBoolean, String paramString1, String paramString2)
  {
    super.init(paramBoolean);
    setWebViewClient(new HtmlWebViewClient(new HtmlInterstitialWebView.HtmlInterstitialWebViewListener(paramCustomEventInterstitialListener), this, paramString2, paramString1));
    addMoPubUriJavascriptInterface(new HtmlInterstitialWebView.MoPubUriJavascriptFireFinishLoadListener()
    {
      public void onInterstitialLoaded()
      {
        if (!HtmlInterstitialWebView.this.mIsDestroyed)
          paramCustomEventInterstitialListener.onInterstitialLoaded();
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlInterstitialWebView
 * JD-Core Version:    0.6.2
 */