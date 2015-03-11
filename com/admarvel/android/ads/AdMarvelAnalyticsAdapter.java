package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public abstract class AdMarvelAnalyticsAdapter
{
  protected AdMarvelAnalyticsAdapter(Context paramContext)
  {
  }

  protected static AdMarvelAnalyticsAdapter createInstance(String paramString, Context paramContext)
  {
    return (AdMarvelAnalyticsAdapter)createObject(paramString, paramContext);
  }

  private static Object createObject(String paramString, Context paramContext)
  {
    try
    {
      Constructor localConstructor = Class.forName(paramString).getDeclaredConstructor(new Class[] { Context.class });
      localConstructor.setAccessible(true);
      Object localObject = localConstructor.newInstance(new Object[] { paramContext });
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
      return null;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Logging.log(localNoSuchMethodException.getMessage());
      return null;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Logging.log(localIllegalArgumentException.getMessage());
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Logging.log(localInvocationTargetException.getMessage());
    }
    return null;
  }

  public abstract String getAdapterAnalyticsVersion();

  protected abstract Map<String, Object> getEnhancedTargetParams(String paramString, Map<String, Object> paramMap);

  protected abstract void onAdClick(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2, String paramString3);

  protected abstract void onFailedToReceiveAd(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2);

  protected abstract void onReceiveAd(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2);

  protected abstract void pause();

  protected abstract void resume();

  protected abstract void start();

  protected abstract void stop();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAnalyticsAdapter
 * JD-Core Version:    0.6.2
 */