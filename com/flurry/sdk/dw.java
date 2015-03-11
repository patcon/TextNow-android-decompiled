package com.flurry.sdk;

import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;

public class dw
{
  private static final String a = dw.class.getSimpleName();

  public static AdvertisingIdClient.Info a()
  {
    try
    {
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
        throw new IllegalStateException("Must be called from a background thread!");
    }
    finally
    {
    }
    boolean bool = b();
    if (!bool);
    AdvertisingIdClient.Info localInfo;
    for (Object localObject2 = null; ; localObject2 = localInfo)
    {
      return localObject2;
      localInfo = c();
    }
  }

  public static boolean b()
  {
    try
    {
      int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(do.a().b());
      if (i == 0)
        return true;
      eo.d(a, "Google Play Services not available - connection result: " + i);
      return false;
    }
    catch (Exception localException)
    {
      eo.d(a, "Google Play Services not available - " + localException);
    }
    return false;
  }

  private static AdvertisingIdClient.Info c()
  {
    try
    {
      AdvertisingIdClient.Info localInfo = AdvertisingIdClient.getAdvertisingIdInfo(do.a().b());
      return localInfo;
    }
    catch (IOException localIOException)
    {
      eo.a(6, a, "Exception in readAdvertisingInfo():" + localIOException);
      return null;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      eo.a(6, a, "Exception in readAdvertisingInfo():" + localGooglePlayServicesNotAvailableException);
      return null;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      eo.a(6, a, "Exception in readAdvertisingInfo():" + localGooglePlayServicesRepairableException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dw
 * JD-Core Version:    0.6.2
 */