package com.mologiq.analytics;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

public final class h
{
  private final Context b;

  public h(e parame, Context paramContext)
  {
    this.b = paramContext;
  }

  private String b()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.b.getApplicationContext());
      Object localObject = null;
      if (localInfo != null)
      {
        String str = localInfo.getId();
        localObject = str;
      }
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final boolean a()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.b.getApplicationContext());
      boolean bool1 = false;
      if (localInfo != null)
      {
        boolean bool2 = localInfo.isLimitAdTrackingEnabled();
        bool1 = bool2;
      }
      return bool1;
    }
    catch (Exception localException)
    {
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.h
 * JD-Core Version:    0.6.2
 */