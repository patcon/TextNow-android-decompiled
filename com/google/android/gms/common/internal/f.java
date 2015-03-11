package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
{
  private final f.b LM;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> LN = new ArrayList();
  final ArrayList<GoogleApiClient.ConnectionCallbacks> LO = new ArrayList();
  private boolean LP = false;
  private final ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> LQ = new ArrayList();
  private final Handler mHandler;

  public f(Context paramContext, Looper paramLooper, f.b paramb)
  {
    this.LM = paramb;
    this.mHandler = new f.a(this, paramLooper);
  }

  public final void aB(int paramInt)
  {
    this.mHandler.removeMessages(1);
    synchronized (this.LN)
    {
      this.LP = true;
      Iterator localIterator = new ArrayList(this.LN).iterator();
      while (localIterator.hasNext())
      {
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
        if (this.LM.gq())
          if (this.LN.contains(localConnectionCallbacks))
            localConnectionCallbacks.onConnectionSuspended(paramInt);
      }
    }
    this.LP = false;
  }

  public final void b(ConnectionResult paramConnectionResult)
  {
    this.mHandler.removeMessages(1);
    synchronized (this.LQ)
    {
      Iterator localIterator = new ArrayList(this.LQ).iterator();
      while (localIterator.hasNext())
      {
        GooglePlayServicesClient.OnConnectionFailedListener localOnConnectionFailedListener = (GooglePlayServicesClient.OnConnectionFailedListener)localIterator.next();
        if (!this.LM.gq())
          return;
        if (this.LQ.contains(localOnConnectionFailedListener))
          localOnConnectionFailedListener.onConnectionFailed(paramConnectionResult);
      }
    }
  }

  public final void d(Bundle paramBundle)
  {
    boolean bool1 = true;
    while (true)
    {
      synchronized (this.LN)
      {
        if (!this.LP)
        {
          bool2 = bool1;
          o.I(bool2);
          this.mHandler.removeMessages(1);
          this.LP = true;
          if (this.LO.size() != 0)
            break label149;
          o.I(bool1);
          Iterator localIterator = new ArrayList(this.LN).iterator();
          if (!localIterator.hasNext())
            break;
          GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
          if ((!this.LM.gq()) || (!this.LM.isConnected()))
            break;
          if (this.LO.contains(localConnectionCallbacks))
            continue;
          localConnectionCallbacks.onConnected(paramBundle);
        }
      }
      boolean bool2 = false;
      continue;
      label149: bool1 = false;
    }
    this.LO.clear();
    this.LP = false;
  }

  protected final void dL()
  {
    synchronized (this.LN)
    {
      d(this.LM.fC());
      return;
    }
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    o.i(paramConnectionCallbacks);
    synchronized (this.LN)
    {
      boolean bool = this.LN.contains(paramConnectionCallbacks);
      return bool;
    }
  }

  public final boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    o.i(paramOnConnectionFailedListener);
    synchronized (this.LQ)
    {
      boolean bool = this.LQ.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    o.i(paramConnectionCallbacks);
    synchronized (this.LN)
    {
      if (this.LN.contains(paramConnectionCallbacks))
      {
        new StringBuilder().append("registerConnectionCallbacks(): listener ").append(paramConnectionCallbacks).append(" is already registered").toString();
        if (this.LM.isConnected())
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramConnectionCallbacks));
        return;
      }
      this.LN.add(paramConnectionCallbacks);
    }
  }

  public final void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    o.i(paramOnConnectionFailedListener);
    synchronized (this.LQ)
    {
      if (this.LQ.contains(paramOnConnectionFailedListener))
      {
        new StringBuilder().append("registerConnectionFailedListener(): listener ").append(paramOnConnectionFailedListener).append(" is already registered").toString();
        return;
      }
      this.LQ.add(paramOnConnectionFailedListener);
    }
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    o.i(paramConnectionCallbacks);
    synchronized (this.LN)
    {
      if (this.LN != null)
      {
        if (this.LN.remove(paramConnectionCallbacks))
          break label58;
        new StringBuilder().append("unregisterConnectionCallbacks(): listener ").append(paramConnectionCallbacks).append(" not found").toString();
      }
      label58: 
      while (!this.LP)
        return;
      this.LO.add(paramConnectionCallbacks);
    }
  }

  public final void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    o.i(paramOnConnectionFailedListener);
    synchronized (this.LQ)
    {
      if ((this.LQ != null) && (!this.LQ.remove(paramOnConnectionFailedListener)))
        new StringBuilder().append("unregisterConnectionFailedListener(): listener ").append(paramOnConnectionFailedListener).append(" not found").toString();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.f
 * JD-Core Version:    0.6.2
 */