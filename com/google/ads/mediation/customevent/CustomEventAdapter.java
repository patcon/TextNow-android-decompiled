package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.eu;

public final class CustomEventAdapter
  implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters>
{
  private View n;
  private CustomEventBanner o;
  private CustomEventInterstitial p;

  private static <T> T a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      eu.D("Could not instantiate custom event adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    return null;
  }

  private void a(View paramView)
  {
    this.n = paramView;
  }

  public final void destroy()
  {
    if (this.o != null)
      this.o.destroy();
    if (this.p != null)
      this.p.destroy();
  }

  public final Class<CustomEventExtras> getAdditionalParametersType()
  {
    return CustomEventExtras.class;
  }

  public final View getBannerView()
  {
    return this.n;
  }

  public final Class<CustomEventServerParameters> getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }

  public final void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    this.o = ((CustomEventBanner)a(paramCustomEventServerParameters.className));
    if (this.o == null)
    {
      paramMediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramCustomEventExtras == null);
    for (Object localObject = null; ; localObject = paramCustomEventExtras.getExtra(paramCustomEventServerParameters.label))
    {
      this.o.requestBannerAd(new CustomEventAdapter.a(this, paramMediationBannerListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramAdSize, paramMediationAdRequest, localObject);
      return;
    }
  }

  public final void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    this.p = ((CustomEventInterstitial)a(paramCustomEventServerParameters.className));
    if (this.p == null)
    {
      paramMediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    if (paramCustomEventExtras == null);
    for (Object localObject = null; ; localObject = paramCustomEventExtras.getExtra(paramCustomEventServerParameters.label))
    {
      this.p.requestInterstitialAd(new CustomEventAdapter.b(this, this, paramMediationInterstitialListener), paramActivity, paramCustomEventServerParameters.label, paramCustomEventServerParameters.parameter, paramMediationAdRequest, localObject);
      return;
    }
  }

  public final void showInterstitial()
  {
    this.p.showInterstitial();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.2
 */