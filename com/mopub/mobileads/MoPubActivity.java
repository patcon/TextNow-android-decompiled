package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.mobileads.factories.HtmlInterstitialWebViewFactory;

public class MoPubActivity extends BaseInterstitialActivity
{
  private HtmlInterstitialWebView mHtmlInterstitialWebView;

  static Intent createIntent(Context paramContext, String paramString1, boolean paramBoolean, String paramString2, String paramString3, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = new Intent(paramContext, MoPubActivity.class);
    localIntent.putExtra("Html-Response-Body", paramString1);
    localIntent.putExtra("Scrollable", paramBoolean);
    localIntent.putExtra("Clickthrough-Url", paramString3);
    localIntent.putExtra("Redirect-Url", paramString2);
    localIntent.putExtra("Ad-Configuration", paramAdConfiguration);
    localIntent.addFlags(268435456);
    return localIntent;
  }

  static void preRenderHtml(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, String paramString)
  {
    HtmlInterstitialWebView localHtmlInterstitialWebView = HtmlInterstitialWebViewFactory.create(paramContext, paramCustomEventInterstitialListener, false, null, null, null);
    localHtmlInterstitialWebView.enablePlugins(false);
    localHtmlInterstitialWebView.addMoPubUriJavascriptInterface(new HtmlInterstitialWebView.MoPubUriJavascriptFireFinishLoadListener()
    {
      public final void onInterstitialLoaded()
      {
        MoPubActivity.this.onInterstitialLoaded();
      }
    });
    localHtmlInterstitialWebView.setWebViewClient(new WebViewClient()
    {
      public final boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if (paramAnonymousString.equals("mopub://finishLoad"))
          MoPubActivity.this.onInterstitialLoaded();
        while (true)
        {
          return true;
          if (paramAnonymousString.equals("mopub://failLoad"))
            MoPubActivity.this.onInterstitialFailed(null);
        }
      }
    });
    localHtmlInterstitialWebView.loadHtmlResponse(paramString);
  }

  public static void start(Context paramContext, String paramString1, boolean paramBoolean, String paramString2, String paramString3, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = createIntent(paramContext, paramString1, paramBoolean, paramString2, paramString3, paramAdConfiguration);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  public View getAdView()
  {
    Intent localIntent = getIntent();
    boolean bool = localIntent.getBooleanExtra("Scrollable", false);
    String str1 = localIntent.getStringExtra("Redirect-Url");
    String str2 = localIntent.getStringExtra("Clickthrough-Url");
    String str3 = localIntent.getStringExtra("Html-Response-Body");
    this.mHtmlInterstitialWebView = HtmlInterstitialWebViewFactory.create(getApplicationContext(), new MoPubActivity.BroadcastingInterstitialListener(this), bool, str1, str2, getAdConfiguration());
    this.mHtmlInterstitialWebView.loadHtmlResponse(str3);
    return this.mHtmlInterstitialWebView;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier(), "com.mopub.action.interstitial.show");
  }

  protected void onDestroy()
  {
    this.mHtmlInterstitialWebView.loadUrl(BaseInterstitialActivity.JavaScriptWebViewCallbacks.WEB_VIEW_DID_CLOSE.getUrl());
    this.mHtmlInterstitialWebView.destroy();
    EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier(), "com.mopub.action.interstitial.dismiss");
    super.onDestroy();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubActivity
 * JD-Core Version:    0.6.2
 */