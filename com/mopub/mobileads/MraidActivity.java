package com.mopub.mobileads;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.util.VersionCode;
import com.mopub.mobileads.factories.MraidViewFactory;
import com.mopub.mobileads.util.WebViews;

public class MraidActivity extends BaseInterstitialActivity
{
  private MraidView mMraidView;

  private static Intent createIntent(Context paramContext, String paramString, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = new Intent(paramContext, MraidActivity.class);
    localIntent.putExtra("Html-Response-Body", paramString);
    localIntent.putExtra("Ad-Configuration", paramAdConfiguration);
    localIntent.addFlags(268435456);
    return localIntent;
  }

  static void preRenderHtml(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, String paramString)
  {
    MraidView localMraidView = MraidViewFactory.create(paramContext, null, MraidView.ExpansionStyle.DISABLED, MraidView.NativeCloseButtonStyle.ALWAYS_VISIBLE, MraidView.PlacementType.INTERSTITIAL);
    localMraidView.enablePlugins(false);
    localMraidView.setMraidListener(new MraidView.MraidListener()
    {
      public final void onClose(MraidView paramAnonymousMraidView, MraidView.ViewState paramAnonymousViewState)
      {
      }

      public final void onExpand(MraidView paramAnonymousMraidView)
      {
      }

      public final void onFailure(MraidView paramAnonymousMraidView)
      {
        MraidActivity.this.onInterstitialFailed(null);
      }

      public final void onOpen(MraidView paramAnonymousMraidView)
      {
      }

      public final void onReady(MraidView paramAnonymousMraidView)
      {
        MraidActivity.this.onInterstitialLoaded();
      }
    });
    localMraidView.setWebViewClient(new WebViewClient()
    {
      public final void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        MraidActivity.this.onInterstitialLoaded();
      }

      public final boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        return true;
      }
    });
    localMraidView.loadHtmlData(paramString);
  }

  public static void start(Context paramContext, String paramString, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = createIntent(paramContext, paramString, paramAdConfiguration);
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
    this.mMraidView = MraidViewFactory.create(this, getAdConfiguration(), MraidView.ExpansionStyle.DISABLED, MraidView.NativeCloseButtonStyle.AD_CONTROLLED, MraidView.PlacementType.INTERSTITIAL);
    this.mMraidView.setMraidListener(new MraidView.BaseMraidListener()
    {
      public void onClose(MraidView paramAnonymousMraidView, MraidView.ViewState paramAnonymousViewState)
      {
        MraidActivity.this.mMraidView.loadUrl(BaseInterstitialActivity.JavaScriptWebViewCallbacks.WEB_VIEW_DID_CLOSE.getUrl());
        MraidActivity.this.finish();
      }

      public void onOpen(MraidView paramAnonymousMraidView)
      {
        EventForwardingBroadcastReceiver.broadcastAction(MraidActivity.this, MraidActivity.this.getBroadcastIdentifier(), "com.mopub.action.interstitial.click");
      }

      public void onReady(MraidView paramAnonymousMraidView)
      {
        MraidActivity.this.mMraidView.loadUrl(BaseInterstitialActivity.JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getUrl());
        MraidActivity.this.showInterstitialCloseButton();
      }
    });
    this.mMraidView.setOnCloseButtonStateChange(new MraidView.OnCloseButtonStateChangeListener()
    {
      public void onCloseButtonStateChange(MraidView paramAnonymousMraidView, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          MraidActivity.this.showInterstitialCloseButton();
          return;
        }
        MraidActivity.this.hideInterstitialCloseButton();
      }
    });
    String str = getIntent().getStringExtra("Html-Response-Body");
    this.mMraidView.loadHtmlData(str);
    return this.mMraidView;
  }

  @TargetApi(11)
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier(), "com.mopub.action.interstitial.show");
    if (VersionCode.currentApiLevel().isAtLeast(VersionCode.ICE_CREAM_SANDWICH))
      getWindow().setFlags(16777216, 16777216);
    addCloseEventRegion();
  }

  protected void onDestroy()
  {
    this.mMraidView.destroy();
    EventForwardingBroadcastReceiver.broadcastAction(this, getBroadcastIdentifier(), "com.mopub.action.interstitial.dismiss");
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    WebViews.onPause(this.mMraidView);
  }

  protected void onResume()
  {
    super.onResume();
    WebViews.onResume(this.mMraidView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidActivity
 * JD-Core Version:    0.6.2
 */