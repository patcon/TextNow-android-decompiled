package com.google.android.gms.common.api;

import android.os.Looper;
import android.support.v4.app.k;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.TimeUnit;

public abstract interface GoogleApiClient
{
  public abstract <C extends Api.a> C a(Api.c<C> paramc);

  public abstract <A extends Api.a, R extends Result, T extends BaseImplementation.a<R, A>> T a(T paramT);

  public abstract boolean a(Scope paramScope);

  public abstract <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T b(T paramT);

  public abstract ConnectionResult blockingConnect();

  public abstract ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit);

  public abstract <L> c<L> c(L paramL);

  public abstract void connect();

  public abstract void disconnect();

  public abstract Looper getLooper();

  public abstract boolean isConnected();

  public abstract boolean isConnecting();

  public abstract boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);

  public abstract boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public abstract void reconnect();

  public abstract void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);

  public abstract void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public abstract void stopAutoManage(k paramk);

  public abstract void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks);

  public abstract void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient
 * JD-Core Version:    0.6.2
 */