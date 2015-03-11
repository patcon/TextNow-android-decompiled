package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.IntentUtils;
import com.mopub.mobileads.util.Utils;

class HtmlWebViewClient extends WebViewClient
{
  static final String MOPUB_FAIL_LOAD = "mopub://failLoad";
  static final String MOPUB_FINISH_LOAD = "mopub://finishLoad";
  private final String mClickthroughUrl;
  private final Context mContext;
  private BaseHtmlWebView mHtmlWebView;
  private HtmlWebViewListener mHtmlWebViewListener;
  private final String mRedirectUrl;

  HtmlWebViewClient(HtmlWebViewListener paramHtmlWebViewListener, BaseHtmlWebView paramBaseHtmlWebView, String paramString1, String paramString2)
  {
    this.mHtmlWebViewListener = paramHtmlWebViewListener;
    this.mHtmlWebView = paramBaseHtmlWebView;
    this.mClickthroughUrl = paramString1;
    this.mRedirectUrl = paramString2;
    this.mContext = paramBaseHtmlWebView.getContext();
  }

  private void handleCustomIntentFromUri(Uri paramUri)
  {
    try
    {
      String str1 = paramUri.getQueryParameter("fnc");
      String str2 = paramUri.getQueryParameter("data");
      Intent localIntent = new Intent(str1);
      localIntent.addFlags(268435456);
      localIntent.putExtra("com.mopub.intent.extra.AD_CLICK_DATA", str2);
      String str3 = "Could not handle custom intent: " + str1 + ". Is your intent spelled correctly?";
      launchIntentForUserClick(this.mContext, localIntent, str3);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      MoPubLog.w("Could not handle custom intent with uri: " + paramUri);
    }
  }

  private boolean handleNativeBrowserScheme(String paramString)
  {
    if (!isNativeBrowserScheme(paramString));
    while (true)
    {
      return false;
      Uri localUri = Uri.parse(paramString);
      try
      {
        String str1 = localUri.getQueryParameter("url");
        if (("navigate".equals(localUri.getHost())) && (str1 != null))
        {
          Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str1));
          localIntent.setFlags(268435456);
          String str2 = "Could not handle intent with URI: " + paramString + ". Is this intent supported on your phone?";
          launchIntentForUserClick(this.mContext, localIntent, str2);
          return true;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        MoPubLog.w("Could not handle url: " + paramString);
      }
    }
    return false;
  }

  private boolean handlePhoneScheme(String paramString)
  {
    if (!isPhoneScheme(paramString))
      return false;
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.addFlags(268435456);
    String str = "Could not handle intent with URI: " + paramString + ". Is this intent supported on your phone?";
    launchIntentForUserClick(this.mContext, localIntent, str);
    return true;
  }

  private boolean handleSpecialMoPubScheme(String paramString)
  {
    if (!isSpecialMoPubScheme(paramString))
      return false;
    Uri localUri = Uri.parse(paramString);
    String str = localUri.getHost();
    if ("finishLoad".equals(str))
      this.mHtmlWebViewListener.onLoaded(this.mHtmlWebView);
    while (true)
    {
      return true;
      if ("close".equals(str))
        this.mHtmlWebViewListener.onCollapsed();
      else if ("failLoad".equals(str))
        this.mHtmlWebViewListener.onFailed(MoPubErrorCode.UNSPECIFIED);
      else if ("custom".equals(str))
        handleCustomIntentFromUri(localUri);
    }
  }

  private boolean isNativeBrowserScheme(String paramString)
  {
    return paramString.startsWith("mopubnativebrowser://");
  }

  private boolean isPhoneScheme(String paramString)
  {
    return (paramString.startsWith("tel:")) || (paramString.startsWith("voicemail:")) || (paramString.startsWith("sms:")) || (paramString.startsWith("mailto:")) || (paramString.startsWith("geo:")) || (paramString.startsWith("google.streetview:"));
  }

  private boolean isSpecialMoPubScheme(String paramString)
  {
    return paramString.startsWith("mopub://");
  }

  private boolean isWebSiteUrl(String paramString)
  {
    return (paramString.startsWith("http://")) || (paramString.startsWith("https://"));
  }

  private boolean launchApplicationUrl(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.addFlags(268435456);
    return launchIntentForUserClick(this.mContext, localIntent, "Unable to open intent.");
  }

  private void showMoPubBrowserForUrl(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      paramString = "about:blank";
    MoPubLog.d("Final URI to show in browser: " + paramString);
    Intent localIntent1 = new Intent(this.mContext, MoPubBrowser.class);
    localIntent1.putExtra("URL", paramString);
    localIntent1.addFlags(268435456);
    if (!launchIntentForUserClick(this.mContext, localIntent1, "Could not handle intent action. . Perhaps you forgot to declare com.mopub.common.MoPubBrowser in your Android manifest file."))
    {
      Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("about:blank"));
      localIntent2.setFlags(268435456);
      launchIntentForUserClick(this.mContext, localIntent2, null);
    }
  }

  boolean launchIntentForUserClick(Context paramContext, Intent paramIntent, String paramString)
  {
    boolean bool;
    if (!this.mHtmlWebView.wasClicked())
      bool = false;
    do
    {
      return bool;
      bool = Utils.executeIntent(paramContext, paramIntent, paramString);
    }
    while (!bool);
    this.mHtmlWebViewListener.onClicked();
    this.mHtmlWebView.onResetUserClick();
    return bool;
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if ((this.mRedirectUrl != null) && (paramString.startsWith(this.mRedirectUrl)))
    {
      paramWebView.stopLoading();
      showMoPubBrowserForUrl(paramString);
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((handleSpecialMoPubScheme(paramString)) || (handlePhoneScheme(paramString)) || (handleNativeBrowserScheme(paramString)));
    do
    {
      return true;
      MoPubLog.d("Ad clicked. Click URL: " + paramString);
    }
    while ((!isWebSiteUrl(paramString)) && (IntentUtils.canHandleApplicationUrl(this.mContext, paramString)) && (launchApplicationUrl(paramString)));
    showMoPubBrowserForUrl(paramString);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlWebViewClient
 * JD-Core Version:    0.6.2
 */