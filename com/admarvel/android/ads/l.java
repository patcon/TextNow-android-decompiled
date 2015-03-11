package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.util.HashMap;
import java.util.Map;

public class l
{
  private AdMarvelView.AdMarvelViewListener a;
  private AdMarvelView.AdMarvelViewExtendedListener b;

  public void a()
  {
    if (this.a != null)
    {
      Logging.log("onExpand");
      this.a.onExpand();
      return;
    }
    Logging.log("onExpand - No listener found");
  }

  public void a(Context paramContext, AdMarvelView paramAdMarvelView, int paramInt1, AdMarvelUtils.ErrorReason paramErrorReason, String paramString1, int paramInt2, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      AdMarvelAnalyticsAdapter localAdMarvelAnalyticsAdapter = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext);
      if (paramMap == null)
        paramMap = new HashMap();
      localAdMarvelAnalyticsAdapter.onFailedToReceiveAd(paramString1, paramInt2, paramMap, paramString2);
      label35: if (this.a != null)
      {
        Logging.log("onFailedToReceiveAd : Error Code " + paramInt1);
        this.a.onFailedToReceiveAd(paramAdMarvelView, paramInt1, paramErrorReason);
        return;
      }
      Logging.log("onFailedToReceiveAd - No listener found");
      return;
    }
    catch (Exception localException)
    {
      break label35;
    }
  }

  public void a(Context paramContext, AdMarvelView paramAdMarvelView, String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      AdMarvelAnalyticsAdapter localAdMarvelAnalyticsAdapter = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext);
      if (paramMap == null)
        paramMap = new HashMap();
      localAdMarvelAnalyticsAdapter.onReceiveAd(paramString1, paramInt, paramMap, paramString2);
      label34: if (this.a != null)
      {
        Logging.log("onReceiveAd");
        this.a.onReceiveAd(paramAdMarvelView);
        return;
      }
      Logging.log("onReceiveAd - No listener found");
      return;
    }
    catch (Exception localException)
    {
      break label34;
    }
  }

  public void a(Context paramContext, AdMarvelView paramAdMarvelView, String paramString1, String paramString2, int paramInt, Map<String, Object> paramMap, String paramString3)
  {
    try
    {
      AdMarvelAnalyticsAdapter localAdMarvelAnalyticsAdapter = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext);
      if (paramMap == null);
      for (Object localObject = new HashMap(); ; localObject = paramMap)
      {
        localAdMarvelAnalyticsAdapter.onAdClick(paramString2, paramInt, (Map)localObject, paramString1, paramString3);
        label36: if (this.a == null)
          break;
        Logging.log("onClickAd");
        this.a.onClickAd(paramAdMarvelView, paramString1);
        return;
      }
      Logging.log("onClickAd - No listener found");
      return;
    }
    catch (Exception localException)
    {
      break label36;
    }
  }

  public void a(AdMarvelView.AdMarvelViewExtendedListener paramAdMarvelViewExtendedListener)
  {
    this.b = paramAdMarvelViewExtendedListener;
  }

  public void a(AdMarvelView.AdMarvelViewListener paramAdMarvelViewListener)
  {
    this.a = paramAdMarvelViewListener;
  }

  public void a(AdMarvelView paramAdMarvelView)
  {
    if (this.a != null)
    {
      Logging.log("onRequestAd");
      this.a.onRequestAd(paramAdMarvelView);
      return;
    }
    Logging.log("onRequestAd - No listener found");
  }

  public void a(AdMarvelView paramAdMarvelView, AdMarvelAd paramAdMarvelAd)
  {
    if (this.b != null)
    {
      Logging.log("onAdFetched");
      this.b.onAdFetched(paramAdMarvelView, paramAdMarvelAd);
      return;
    }
    Logging.log("onAdFetched - No listener found");
  }

  public void b()
  {
    if (this.a != null)
    {
      Logging.log("onClose");
      this.a.onClose();
      return;
    }
    Logging.log("onClose - No listener found");
  }

  public void b(Context paramContext, AdMarvelView paramAdMarvelView, String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      AdMarvelAnalyticsAdapter localAdMarvelAnalyticsAdapter = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext);
      if (paramMap == null)
        paramMap = new HashMap();
      localAdMarvelAnalyticsAdapter.onReceiveAd(paramString1, paramInt, paramMap, paramString2);
      label34: if (this.b != null)
      {
        Logging.log("onDisplayedAd");
        this.b.onAdDisplayed(paramAdMarvelView);
        return;
      }
      Logging.log("onDisplayedAd - No listener found");
      return;
    }
    catch (Exception localException)
    {
      break label34;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.l
 * JD-Core Version:    0.6.2
 */