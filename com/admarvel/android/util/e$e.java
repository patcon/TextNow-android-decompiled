package com.admarvel.android.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

public class e$e
{
  private final Context b;

  public e$e(e parame, Context paramContext)
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
    catch (IllegalStateException localIllegalStateException)
    {
      Logging.log("IllegalStateException " + localIllegalStateException.getMessage() + " in fetching ADvID");
      return null;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      Logging.log("GooglePlayServicesRepairableException " + localGooglePlayServicesRepairableException.getMessage() + " in fetching ADvID");
      return null;
    }
    catch (IOException localIOException)
    {
      Logging.log("IOException " + localIOException.getMessage() + " in fetching ADvID");
      return null;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      Logging.log("GooglePlayServicesNotAvailableException " + localGooglePlayServicesNotAvailableException.getMessage() + " in fetching ADvID");
    }
    return null;
  }

  public boolean a()
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
    catch (IllegalStateException localIllegalStateException)
    {
      Logging.log("IllegalStateException " + localIllegalStateException.getMessage() + " in fetching ADvID");
      return false;
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      Logging.log("GooglePlayServicesRepairableException " + localGooglePlayServicesRepairableException.getMessage() + " in fetching ADvID");
      return false;
    }
    catch (IOException localIOException)
    {
      Logging.log("IOException " + localIOException.getMessage() + " in fetching ADvID");
      return false;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      Logging.log("GooglePlayServicesNotAvailableException " + localGooglePlayServicesNotAvailableException.getMessage() + " in fetching ADvID");
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.e.e
 * JD-Core Version:    0.6.2
 */