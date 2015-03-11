package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.jg;

@Deprecated
public class ActivityRecognitionClient
  implements GooglePlayServicesClient
{
  private final jg UU;

  public ActivityRecognitionClient(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.UU = new jg(paramContext, paramConnectionCallbacks, paramOnConnectionFailedListener, "activity_recognition");
  }

  public void connect()
  {
    this.UU.connect();
  }

  public void disconnect()
  {
    this.UU.disconnect();
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

  public void removeActivityUpdates(PendingIntent paramPendingIntent)
  {
    try
    {
      this.UU.removeActivityUpdates(paramPendingIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void requestActivityUpdates(long paramLong, PendingIntent paramPendingIntent)
  {
    try
    {
      this.UU.requestActivityUpdates(paramLong, paramPendingIntent);
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
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionClient
 * JD-Core Version:    0.6.2
 */