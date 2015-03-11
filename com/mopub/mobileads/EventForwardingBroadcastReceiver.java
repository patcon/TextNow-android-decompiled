package com.mopub.mobileads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.m;

class EventForwardingBroadcastReceiver extends BroadcastReceiver
{
  static final String ACTION_INTERSTITIAL_CLICK = "com.mopub.action.interstitial.click";
  static final String ACTION_INTERSTITIAL_DISMISS = "com.mopub.action.interstitial.dismiss";
  static final String ACTION_INTERSTITIAL_FAIL = "com.mopub.action.interstitial.fail";
  static final String ACTION_INTERSTITIAL_SHOW = "com.mopub.action.interstitial.show";
  static final String BROADCAST_IDENTIFIER_KEY = "broadcastIdentifier";
  private static IntentFilter sIntentFilter;
  private final long mBroadcastIdentifier;
  private Context mContext;
  private final CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;

  public EventForwardingBroadcastReceiver(CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, long paramLong)
  {
    this.mCustomEventInterstitialListener = paramCustomEventInterstitialListener;
    this.mBroadcastIdentifier = paramLong;
    sIntentFilter = getHtmlInterstitialIntentFilter();
  }

  static void broadcastAction(Context paramContext, long paramLong, String paramString)
  {
    Intent localIntent = new Intent(paramString);
    localIntent.putExtra("broadcastIdentifier", paramLong);
    m.a(paramContext.getApplicationContext()).a(localIntent);
  }

  static IntentFilter getHtmlInterstitialIntentFilter()
  {
    if (sIntentFilter == null)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      sIntentFilter = localIntentFilter;
      localIntentFilter.addAction("com.mopub.action.interstitial.fail");
      sIntentFilter.addAction("com.mopub.action.interstitial.show");
      sIntentFilter.addAction("com.mopub.action.interstitial.dismiss");
      sIntentFilter.addAction("com.mopub.action.interstitial.click");
    }
    return sIntentFilter;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.mCustomEventInterstitialListener == null);
    String str;
    do
    {
      long l;
      do
      {
        return;
        l = paramIntent.getLongExtra("broadcastIdentifier", -1L);
      }
      while (this.mBroadcastIdentifier != l);
      str = paramIntent.getAction();
      if ("com.mopub.action.interstitial.fail".equals(str))
      {
        this.mCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
        return;
      }
      if ("com.mopub.action.interstitial.show".equals(str))
      {
        this.mCustomEventInterstitialListener.onInterstitialShown();
        return;
      }
      if ("com.mopub.action.interstitial.dismiss".equals(str))
      {
        this.mCustomEventInterstitialListener.onInterstitialDismissed();
        unregister();
        return;
      }
    }
    while (!"com.mopub.action.interstitial.click".equals(str));
    this.mCustomEventInterstitialListener.onInterstitialClicked();
  }

  public void register(Context paramContext)
  {
    this.mContext = paramContext;
    m.a(this.mContext).a(this, sIntentFilter);
  }

  public void unregister()
  {
    if (this.mContext != null)
    {
      m.a(this.mContext).a(this);
      this.mContext = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.EventForwardingBroadcastReceiver
 * JD-Core Version:    0.6.2
 */