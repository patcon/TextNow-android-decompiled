package com.mopub.mobileads;

class MoPubActivity$BroadcastingInterstitialListener
  implements CustomEventInterstitial.CustomEventInterstitialListener
{
  MoPubActivity$BroadcastingInterstitialListener(MoPubActivity paramMoPubActivity)
  {
  }

  public void onInterstitialClicked()
  {
    EventForwardingBroadcastReceiver.broadcastAction(this.this$0, this.this$0.getBroadcastIdentifier(), "com.mopub.action.interstitial.click");
  }

  public void onInterstitialDismissed()
  {
  }

  public void onInterstitialFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    EventForwardingBroadcastReceiver.broadcastAction(this.this$0, this.this$0.getBroadcastIdentifier(), "com.mopub.action.interstitial.fail");
    this.this$0.finish();
  }

  public void onInterstitialLoaded()
  {
    MoPubActivity.access$000(this.this$0).loadUrl(BaseInterstitialActivity.JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getUrl());
  }

  public void onInterstitialShown()
  {
  }

  public void onLeaveApplication()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubActivity.BroadcastingInterstitialListener
 * JD-Core Version:    0.6.2
 */