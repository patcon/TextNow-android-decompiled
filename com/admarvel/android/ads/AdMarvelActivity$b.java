package com.admarvel.android.ads;

import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

class AdMarvelActivity$b
  implements g
{
  private final WeakReference<AdMarvelActivity> a;

  public AdMarvelActivity$b(AdMarvelActivity paramAdMarvelActivity)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
  }

  public void a(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      RelativeLayout localRelativeLayout;
      do
      {
        return;
        localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
      }
      while (localRelativeLayout == null);
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(paramString + "WEBVIEW");
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (localAdMarvelInternalWebView.mInAppBrowserCloseCallback == null) || (localAdMarvelInternalWebView.mInAppBrowserCloseCallback.length() <= 0));
    localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelInternalWebView.mInAppBrowserCloseCallback + "()");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.b
 * JD-Core Version:    0.6.2
 */