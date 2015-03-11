package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.admarvel.android.util.Logging;
import java.util.Map;

public abstract class AdMarvelAdapter
{
  protected static AdMarvelAdapter createInstance(String paramString)
  {
    return (AdMarvelAdapter)createObject(paramString);
  }

  private static Object createObject(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      Logging.log(localInstantiationException.getMessage());
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Logging.log(localIllegalAccessException.getMessage());
      return null;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Logging.log(localClassNotFoundException.getMessage());
    }
    return null;
  }

  protected abstract void cleanupView(View paramView);

  protected abstract void displayInterstitial(Activity paramActivity, String paramString);

  protected abstract void forceCloseFullScreenAd(Activity paramActivity);

  public abstract String getAdapterVersion();

  protected abstract String getAdnetworkSDKVersionInfo();

  protected abstract void initialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);

  protected abstract AdMarvelAd loadAd(AdMarvelAd paramAdMarvelAd, AdMarvelXMLReader paramAdMarvelXMLReader);

  protected abstract void pause(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);

  protected abstract void requestIntersitialNewAd(AdMarvelInterstitialAdapterListener paramAdMarvelInterstitialAdapterListener, Context paramContext, AdMarvelAd paramAdMarvelAd, Map<String, Object> paramMap, int paramInt1, int paramInt2);

  protected abstract View requestNewAd(AdMarvelAdapterListener paramAdMarvelAdapterListener, Context paramContext, AdMarvelAd paramAdMarvelAd, Map<String, Object> paramMap, int paramInt1, int paramInt2);

  protected abstract void resume(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);

  protected abstract void uninitialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAdapter
 * JD-Core Version:    0.6.2
 */