package com.admarvel.android.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

class AdMarvelActivity$BrightRollInnerInterstitialJS
{
  private final WeakReference<AdMarvelActivity> adMarvelActivityReference;
  private final WeakReference<AdMarvelInternalWebView> adMarvelInternalWebViewReference;
  private String videoUrl;

  public AdMarvelActivity$BrightRollInnerInterstitialJS(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity)
  {
    this.adMarvelInternalWebViewReference = new WeakReference(paramAdMarvelInternalWebView);
    this.adMarvelActivityReference = new WeakReference(paramAdMarvelActivity);
  }

  @JavascriptInterface
  public void browseTo(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    if (ab.a(localAdMarvelActivity.getBaseContext(), localIntent))
      localAdMarvelActivity.startActivity(localIntent);
    finish();
  }

  @JavascriptInterface
  public void cleanup()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
    AdMarvelActivity.f(localAdMarvelActivity).post(locald);
  }

  @JavascriptInterface
  public void didPixel(String paramString)
  {
  }

  @JavascriptInterface
  public void enableVideoCloseInBackground()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    AdMarvelActivity.c(localAdMarvelActivity, true);
  }

  @JavascriptInterface
  public void finish()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
  }

  @JavascriptInterface
  public void hide()
  {
    didPixel("Hide");
    finish();
  }

  @JavascriptInterface
  public void load()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      localAdMarvelInternalWebView.a(true);
    }
    while ((this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.q localq = new AdMarvelActivity.q(this.videoUrl, localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(localq);
    localAdMarvelActivity.d = false;
  }

  @JavascriptInterface
  public void onBackPressed()
  {
    finish();
  }

  @JavascriptInterface
  public void play()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.s locals = new AdMarvelActivity.s(localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(locals);
  }

  @JavascriptInterface
  public void positionVideo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.t localt = new AdMarvelActivity.t(localAdMarvelActivity, localAdMarvelInternalWebView, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    AdMarvelActivity.f(localAdMarvelActivity).post(localt);
  }

  @JavascriptInterface
  public void seekTo(float paramFloat)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.v localv = new AdMarvelActivity.v(localAdMarvelActivity, localAdMarvelInternalWebView, paramFloat);
    AdMarvelActivity.f(localAdMarvelActivity).post(localv);
  }

  @JavascriptInterface
  public void setVideoUrl(String paramString)
  {
    this.videoUrl = paramString;
  }

  @JavascriptInterface
  boolean videoIsLoaded()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return false;
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()))
      return false;
    return AdMarvelActivity.z(localAdMarvelActivity) != null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.BrightRollInnerInterstitialJS
 * JD-Core Version:    0.6.2
 */