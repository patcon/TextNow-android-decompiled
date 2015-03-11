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

  public abstract void destroy(View paramView);

  protected abstract void displayInterstitial(Activity paramActivity, String paramString);

  protected abstract void forceCloseFullScreenAd(Activity paramActivity);

  public abstract String getAdapterVersion();

  public abstract String getAdnetworkSDKVersionInfo();

  public abstract void handleClick();

  public abstract void handleImpression();

  public abstract void initialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);

  protected abstract AdMarvelAd loadAd(AdMarvelAd paramAdMarvelAd, AdMarvelXMLReader paramAdMarvelXMLReader);

  public abstract Object loadNativeAd(Object paramObject, AdMarvelXMLReader paramAdMarvelXMLReader);

  public abstract void notifyAddedToListView(View paramView);

  public abstract void pause(Activity paramActivity, View paramView);

  public abstract void registerViewForInteraction(View paramView);

  protected abstract void requestIntersitialNewAd(AdMarvelInterstitialAdapterListener paramAdMarvelInterstitialAdapterListener, Context paramContext, AdMarvelAd paramAdMarvelAd, Map<String, Object> paramMap, int paramInt1, int paramInt2);

  public abstract Object requestNativeAd(AdMarvelAdapterListener paramAdMarvelAdapterListener, Object paramObject);

  protected abstract View requestNewAd(AdMarvelAdapterListener paramAdMarvelAdapterListener, Context paramContext, AdMarvelAd paramAdMarvelAd, Map<String, Object> paramMap, int paramInt1, int paramInt2);

  public abstract void resume(Activity paramActivity, View paramView);

  public abstract void uninitialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap);

  public abstract void unregisterView();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAdapter
 * JD-Core Version:    0.6.2
 */