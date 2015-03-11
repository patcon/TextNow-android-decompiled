package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

public final class hc
{
  private final hc.b Gp;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> Gq = new ArrayList();
  final ArrayList<GoogleApiClient.ConnectionCallbacks> Gr = new ArrayList();
  private boolean Gs = false;
  private final ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> Gt = new ArrayList();
  private final Handler mHandler;

  public hc(Context paramContext, Looper paramLooper, hc.b paramb)
  {
    this.Gp = paramb;
    this.mHandler = new hc.a(this, paramLooper);
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.mHandler.removeMessages(1);
    synchronized (this.Gt)
    {
      Iterator localIterator = new ArrayList(this.Gt).iterator();
      while (localIterator.hasNext())
      {
        GooglePlayServicesClient.OnConnectionFailedListener localOnConnectionFailedListener = (GooglePlayServicesClient.OnConnectionFailedListener)localIterator.next();
        if (!this.Gp.eO())
          return;
        if (this.Gt.contains(localOnConnectionFailedListener))
          localOnConnectionFailedListener.onConnectionFailed(paramConnectionResult);
      }
    }
  }

  public final void ao(int paramInt)
  {
    this.mHandler.removeMessages(1);
    synchronized (this.Gq)
    {
      this.Gs = true;
      Iterator localIterator = new ArrayList(this.Gq).iterator();
      while (localIterator.hasNext())
      {
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
        if (this.Gp.eO())
          if (this.Gq.contains(localConnectionCallbacks))
            localConnectionCallbacks.onConnectionSuspended(paramInt);
      }
    }
    this.Gs = false;
  }

  public final void c(Bundle paramBundle)
  {
    boolean bool1 = true;
    while (true)
    {
      synchronized (this.Gq)
      {
        if (!this.Gs)
        {
          bool2 = bool1;
          hm.A(bool2);
          this.mHandler.removeMessages(1);
          this.Gs = true;
          if (this.Gr.size() != 0)
            break label149;
          hm.A(bool1);
          Iterator localIterator = new ArrayList(this.Gq).iterator();
          if (!localIterator.hasNext())
            break;
          GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
          if ((!this.Gp.eO()) || (!this.Gp.isConnected()))
            break;
          if (this.Gr.contains(localConnectionCallbacks))
            continue;
          localConnectionCallbacks.onConnected(paramBundle);
        }
      }
      boolean bool2 = false;
      continue;
      label149: bool1 = false;
    }
    this.Gr.clear();
    this.Gs = false;
  }

  protected final void cp()
  {
    synchronized (this.Gq)
    {
      c(this.Gp.ef());
      return;
    }
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    hm.f(paramConnectionCallbacks);
    synchronized (this.Gq)
    {
      boolean bool = this.Gq.contains(paramConnectionCallbacks);
      return bool;
    }
  }

  public final boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    hm.f(paramOnConnectionFailedListener);
    synchronized (this.Gt)
    {
      boolean bool = this.Gt.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    hm.f(paramConnectionCallbacks);
    synchronized (this.Gq)
    {
      if (this.Gq.contains(paramConnectionCallbacks))
      {
        new StringBuilder().append("registerConnectionCallbacks(): listener ").append(paramConnectionCallbacks).append(" is already registered").toString();
        if (this.Gp.isConnected())
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramConnectionCallbacks));
        return;
      }
      this.Gq.add(paramConnectionCallbacks);
    }
  }

  public final void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    hm.f(paramOnConnectionFailedListener);
    synchronized (this.Gt)
    {
      if (this.Gt.contains(paramOnConnectionFailedListener))
      {
        new StringBuilder().append("registerConnectionFailedListener(): listener ").append(paramOnConnectionFailedListener).append(" is already registered").toString();
        return;
      }
      this.Gt.add(paramOnConnectionFailedListener);
    }
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    hm.f(paramConnectionCallbacks);
    synchronized (this.Gq)
    {
      if (this.Gq != null)
      {
        if (this.Gq.remove(paramConnectionCallbacks))
          break label58;
        new StringBuilder().append("unregisterConnectionCallbacks(): listener ").append(paramConnectionCallbacks).append(" not found").toString();
      }
      label58: 
      while (!this.Gs)
        return;
      this.Gr.add(paramConnectionCallbacks);
    }
  }

  public final void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    hm.f(paramOnConnectionFailedListener);
    synchronized (this.Gt)
    {
      if ((this.Gt != null) && (!this.Gt.remove(paramOnConnectionFailedListener)))
        new StringBuilder().append("unregisterConnectionFailedListener(): listener ").append(paramOnConnectionFailedListener).append(" not found").toString();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hc
 * JD-Core Version:    0.6.2
 */