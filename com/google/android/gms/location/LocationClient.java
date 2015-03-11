package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public class LocationClient
  implements GooglePlayServicesClient
{
  public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
  public static final String KEY_MOCK_LOCATION = "mockLocation";
  private final jg UU;

  public LocationClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.UU = new jg(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, "location");
  }

  public static int getErrorCode(Intent paramIntent)
  {
    return paramIntent.getIntExtra("gms_error_code", -1);
  }

  public static int getGeofenceTransition(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
    if (i == -1);
    while ((i != 1) && (i != 2) && (i != 4))
      return -1;
    return i;
  }

  public static List<Geofence> getTriggeringGeofences(Intent paramIntent)
  {
    ArrayList localArrayList1 = (ArrayList)paramIntent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
    if (localArrayList1 == null)
      return null;
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    Iterator localIterator = localArrayList1.iterator();
    while (localIterator.hasNext())
      localArrayList2.add(jh.h((byte[])localIterator.next()));
    return localArrayList2;
  }

  public static Location getTriggeringLocation(Intent paramIntent)
  {
    return (Location)paramIntent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
  }

  public static boolean hasError(Intent paramIntent)
  {
    return paramIntent.hasExtra("gms_error_code");
  }

  public void addGeofences(List<Geofence> paramList, PendingIntent paramPendingIntent, LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
  {
    Object localObject = null;
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Geofence localGeofence = (Geofence)localIterator.next();
        hm.b(localGeofence instanceof jh, "Geofence must be created using Geofence.Builder.");
        localArrayList.add((jh)localGeofence);
      }
      localObject = localArrayList;
    }
    try
    {
      this.UU.addGeofences(localObject, paramPendingIntent, paramOnAddGeofencesResultListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void connect()
  {
    this.UU.connect();
  }

  public void disconnect()
  {
    this.UU.disconnect();
  }

  public Location getLastLocation()
  {
    return this.UU.getLastLocation();
  }

  public boolean isConnected()
  {
    return this.UU.isConnected();
  }

  public boolean isConnecting()
  {
    return this.UU.isConnecting();
  }

  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.UU.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.UU.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.UU.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.UU.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public void removeGeofences(PendingIntent paramPendingIntent, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    try
    {
      this.UU.removeGeofences(paramPendingIntent, paramOnRemoveGeofencesResultListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void removeGeofences(List<String> paramList, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    try
    {
      this.UU.removeGeofences(paramList, paramOnRemoveGeofencesResultListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    try
    {
      this.UU.removeLocationUpdates(paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    try
    {
      this.UU.removeLocationUpdates(paramLocationListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    try
    {
      this.UU.requestLocationUpdates(paramLocationRequest, paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    try
    {
      this.UU.requestLocationUpdates(paramLocationRequest, paramLocationListener);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    try
    {
      this.UU.requestLocationUpdates(paramLocationRequest, paramLocationListener, paramLooper);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void setMockLocation(Location paramLocation)
  {
    try
    {
      this.UU.setMockLocation(paramLocation);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void setMockMode(boolean paramBoolean)
  {
    try
    {
      this.UU.setMockMode(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.UU.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.UU.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationClient
 * JD-Core Version:    0.6.2
 */