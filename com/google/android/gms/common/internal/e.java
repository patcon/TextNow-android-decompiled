package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;

public abstract class e<T extends IInterface>
  implements Api.a, f.b
{
  public static final String[] LE = { "service_esmobile", "service_googleme" };
  private final String[] Ds;
  private final Looper IH;
  private final f IX;
  private final ArrayList<e<T>.b<?>> LA = new ArrayList();
  private e<T>.f LB;
  private volatile int LC = 1;
  boolean LD = false;
  private T Lz;
  private final Context mContext;
  final Handler mHandler;

  protected e(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String[] paramArrayOfString)
  {
    this.mContext = ((Context)o.i(paramContext));
    this.IH = ((Looper)o.b(paramLooper, "Looper must not be null"));
    this.IX = new f(paramContext, paramLooper, this);
    this.mHandler = new e.a(this, paramLooper);
    c(paramArrayOfString);
    this.Ds = paramArrayOfString;
    registerConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)o.i(paramConnectionCallbacks));
    registerConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)o.i(paramOnConnectionFailedListener));
  }

  @Deprecated
  protected e(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, String[] paramArrayOfString)
  {
    this(paramContext, paramContext.getMainLooper(), new e.c(paramConnectionCallbacks), new e.g(paramOnConnectionFailedListener), paramArrayOfString);
  }

  private void az(int paramInt)
  {
    int i = this.LC;
    this.LC = paramInt;
    if (i != paramInt)
    {
      if (paramInt != 3)
        break label25;
      onConnected();
    }
    label25: 
    while ((i != 3) || (paramInt != 1))
      return;
    onDisconnected();
  }

  protected final void N(IBinder paramIBinder)
  {
    try
    {
      a(l.a.Q(paramIBinder), new e.e(this));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1, new e.h(this, paramInt, paramIBinder, paramBundle)));
  }

  @Deprecated
  public final void a(e<T>.b<?> parame)
  {
    synchronized (this.LA)
    {
      this.LA.add(parame);
      this.mHandler.sendMessage(this.mHandler.obtainMessage(2, parame));
      return;
    }
  }

  protected abstract void a(l paraml, e.e parame);

  public void aA(int paramInt)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Integer.valueOf(paramInt)));
  }

  protected void c(String[] paramArrayOfString)
  {
  }

  public void connect()
  {
    this.LD = true;
    az(2);
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
    if (i != 0)
    {
      az(1);
      this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(i)));
    }
    do
    {
      return;
      if (this.LB != null)
      {
        this.Lz = null;
        g.J(this.mContext).b(getStartServiceAction(), this.LB);
      }
      this.LB = new e.f(this);
    }
    while (g.J(this.mContext).a(getStartServiceAction(), this.LB));
    new StringBuilder().append("unable to connect to service: ").append(getStartServiceAction()).toString();
    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, Integer.valueOf(9)));
  }

  protected final void dJ()
  {
    if (!isConnected())
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }

  public void disconnect()
  {
    this.LD = false;
    synchronized (this.LA)
    {
      int i = this.LA.size();
      for (int j = 0; j < i; j++)
        ((e.b)this.LA.get(j)).gV();
      this.LA.clear();
      az(1);
      this.Lz = null;
      if (this.LB != null)
      {
        g.J(this.mContext).b(getStartServiceAction(), this.LB);
        this.LB = null;
      }
      return;
    }
  }

  public Bundle fC()
  {
    return null;
  }

  public final String[] gR()
  {
    return this.Ds;
  }

  public final T gS()
  {
    dJ();
    return this.Lz;
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public final Looper getLooper()
  {
    return this.IH;
  }

  protected abstract String getServiceDescriptor();

  protected abstract String getStartServiceAction();

  public boolean gq()
  {
    return this.LD;
  }

  public boolean isConnected()
  {
    return this.LC == 3;
  }

  public boolean isConnecting()
  {
    return this.LC == 2;
  }

  @Deprecated
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.IX.isConnectionCallbacksRegistered(new e.c(paramConnectionCallbacks));
  }

  @Deprecated
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.IX.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  protected abstract T j(IBinder paramIBinder);

  protected void onConnected()
  {
  }

  protected void onDisconnected()
  {
  }

  @Deprecated
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IX.registerConnectionCallbacks(new e.c(paramConnectionCallbacks));
  }

  public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IX.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  @Deprecated
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IX.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IX.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  @Deprecated
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IX.unregisterConnectionCallbacks(new e.c(paramConnectionCallbacks));
  }

  @Deprecated
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IX.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e
 * JD-Core Version:    0.6.2
 */