package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class jb
  implements FusedLocationProviderApi
{
  public Location getLastLocation(GoogleApiClient paramGoogleApiClient)
  {
    jg localjg = LocationServices.e(paramGoogleApiClient);
    try
    {
      Location localLocation = localjg.getLastLocation();
      return localLocation;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public PendingResult<Status> removeLocationUpdates(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new jb.a(paramPendingIntent)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.removeLocationUpdates(paramPendingIntent);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> removeLocationUpdates(GoogleApiClient paramGoogleApiClient, final LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.b(new jb.a(paramLocationListener)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.removeLocationUpdates(paramLocationListener);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, final LocationRequest paramLocationRequest, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new jb.a(paramLocationRequest)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.requestLocationUpdates(paramLocationRequest, paramPendingIntent);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, final LocationRequest paramLocationRequest, final LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.b(new jb.a(paramLocationRequest)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.requestLocationUpdates(paramLocationRequest, paramLocationListener);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, final LocationRequest paramLocationRequest, final LocationListener paramLocationListener, final Looper paramLooper)
  {
    return paramGoogleApiClient.b(new jb.a(paramLocationRequest)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.requestLocationUpdates(paramLocationRequest, paramLocationListener, paramLooper);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> setMockLocation(GoogleApiClient paramGoogleApiClient, final Location paramLocation)
  {
    return paramGoogleApiClient.b(new jb.a(paramLocation)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.setMockLocation(paramLocation);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> setMockMode(GoogleApiClient paramGoogleApiClient, final boolean paramBoolean)
  {
    return paramGoogleApiClient.b(new jb.a(paramBoolean)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.setMockMode(paramBoolean);
        b(Status.En);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jb
 * JD-Core Version:    0.6.2
 */