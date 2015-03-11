package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.gs;

public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter
{
  private View n;
  private CustomEventBanner xf;
  private CustomEventInterstitial xg;

  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      gs.W("Could not instantiate custom event adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    return null;
  }

  private void a(View paramView)
  {
    this.n = paramView;
  }

  public final View getBannerView()
  {
    return this.n;
  }

  public final void onDestroy()
  {
    if (this.xf != null)
      this.xf.onDestroy();
    if (this.xg != null)
      this.xg.onDestroy();
  }

  public final void onPause()
  {
    if (this.xf != null)
      this.xf.onPause();
    if (this.xg != null)
      this.xg.onPause();
  }

  public final void onResume()
  {
    if (this.xf != null)
      this.xf.onResume();
    if (this.xg != null)
      this.xg.onResume();
  }

  public final void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.xf = ((CustomEventBanner)a(paramBundle1.getString("class_name")));
    if (this.xf == null)
    {
      paramMediationBannerListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null);
    for (Bundle localBundle = null; ; localBundle = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.xf.requestBannerAd(paramContext, new CustomEventAdapter.a(this, paramMediationBannerListener), paramBundle1.getString("parameter"), paramAdSize, paramMediationAdRequest, localBundle);
      return;
    }
  }

  public final void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.xg = ((CustomEventInterstitial)a(paramBundle1.getString("class_name")));
    if (this.xg == null)
    {
      paramMediationInterstitialListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null);
    for (Bundle localBundle = null; ; localBundle = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      this.xg.requestInterstitialAd(paramContext, new CustomEventAdapter.b(this, this, paramMediationInterstitialListener), paramBundle1.getString("parameter"), paramMediationAdRequest, localBundle);
      return;
    }
  }

  public final void showInterstitial()
  {
    this.xg.showInterstitial();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.2
 */