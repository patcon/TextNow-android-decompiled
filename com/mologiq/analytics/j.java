package com.mologiq.analytics;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

final class j
{
  private final Context b;

  j(g paramg, Context paramContext)
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

  final boolean a()
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.j
 * JD-Core Version:    0.6.2
 */