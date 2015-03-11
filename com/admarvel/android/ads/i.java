package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.util.Map;

public class i
{
  private AdMarvelInterstitialAds.AdMarvelInterstitialAdListener a;

  public void a()
  {
    if (this.a != null)
    {
      Logging.log("onRequestInterstitialAd");
      this.a.onRequestInterstitialAd();
    }
  }

  public void a(Context paramContext, AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString1, int paramInt1, AdMarvelUtils.ErrorReason paramErrorReason, String paramString2, int paramInt2, Map<String, Object> paramMap, String paramString3)
  {
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext).onFailedToReceiveAd(paramString2, paramInt2, paramMap, paramString3);
      label17: if (this.a != null)
      {
        Logging.log("onFailedToReceiveInterstitialAd : Error Code " + paramInt1);
        this.a.onFailedToReceiveInterstitialAd(paramSDKAdNetwork, paramString1, paramInt1, paramErrorReason);
      }
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  public void a(Context paramContext, AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString1, AdMarvelAd paramAdMarvelAd, String paramString2, int paramInt, Map<String, Object> paramMap, String paramString3)
  {
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext).onReceiveAd(paramString2, paramInt, paramMap, paramString3);
      label17: if (this.a != null)
      {
        Logging.log("onReceiveInterstitialAd");
        this.a.onReceiveInterstitialAd(paramSDKAdNetwork, paramString1, paramAdMarvelAd);
      }
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  public void a(Context paramContext, String paramString1, String paramString2, int paramInt, Map<String, Object> paramMap, String paramString3)
  {
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext).onAdClick(paramString2, paramInt, paramMap, paramString1, paramString3);
      label17: if (this.a != null)
      {
        Logging.log("onClickInterstitialAd");
        this.a.onClickInterstitialAd(paramString1);
      }
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  public void a(AdMarvelActivity paramAdMarvelActivity)
  {
    if (this.a != null)
    {
      Logging.log("onAdmarvelActivityLaunched");
      this.a.onAdmarvelActivityLaunched(paramAdMarvelActivity);
    }
  }

  public void a(AdMarvelInterstitialAds.AdMarvelInterstitialAdListener paramAdMarvelInterstitialAdListener)
  {
    this.a = paramAdMarvelInterstitialAdListener;
  }

  public void a(AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
    if (this.a != null)
    {
      Logging.log("onAdMarvelVideoActivityLaunched");
      this.a.onAdMarvelVideoActivityLaunched(paramAdMarvelVideoActivity);
    }
  }

  public boolean b()
  {
    if (this.a != null)
    {
      Logging.log("onCloseInterstitialAd");
      this.a.onCloseInterstitialAd();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.i
 * JD-Core Version:    0.6.2
 */