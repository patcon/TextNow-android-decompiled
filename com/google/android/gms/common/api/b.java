package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.k;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.f.b;
import com.google.android.gms.common.internal.o;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class b
  implements GoogleApiClient
{
  private final Looper IH;
  final int IU;
  private final Lock IV = new ReentrantLock();
  private final Condition IW = this.IV.newCondition();
  private final f IX = new f(paramContext, paramLooper, this.Jp);
  private final int IY;
  final Queue<b.c<?>> IZ = new LinkedList();
  private final b.a Iz = new b.a()
  {
    public void b(b.c<?> paramAnonymousc)
    {
      b.this.Jn.remove(paramAnonymousc);
    }
  };
  private ConnectionResult Ja;
  private int Jb;
  private volatile int Jc = 4;
  private volatile int Jd;
  private boolean Je = false;
  private int Jf;
  private long Jg = 5000L;
  final Handler Jh;
  private final Bundle Ji = new Bundle();
  private final Map<Api.c<?>, Api.a> Jj = new HashMap();
  private final List<String> Jk;
  private boolean Jl;
  private final Set<c<?>> Jm = Collections.newSetFromMap(new WeakHashMap());
  final Set<b.c<?>> Jn = Collections.newSetFromMap(new ConcurrentHashMap());
  private final GoogleApiClient.ConnectionCallbacks Jo = new GoogleApiClient.ConnectionCallbacks()
  {
    public void onConnected(Bundle paramAnonymousBundle)
    {
      b.a(b.this).lock();
      try
      {
        if (b.b(b.this) == 1)
        {
          if (paramAnonymousBundle != null)
            b.c(b.this).putAll(paramAnonymousBundle);
          b.d(b.this);
        }
        return;
      }
      finally
      {
        b.a(b.this).unlock();
      }
    }

    public void onConnectionSuspended(int paramAnonymousInt)
    {
      b.a(b.this).lock();
      while (true)
      {
        try
        {
          b.a(b.this, paramAnonymousInt);
          switch (paramAnonymousInt)
          {
          default:
            return;
          case 2:
            b.this.connect();
            continue;
          case 1:
          }
        }
        finally
        {
          b.a(b.this).unlock();
        }
        boolean bool = b.e(b.this);
        if (bool)
        {
          b.a(b.this).unlock();
          return;
        }
        b.b(b.this, b.this.IU);
        b.this.Jh.sendMessageDelayed(b.this.Jh.obtainMessage(1), b.f(b.this));
      }
    }
  };
  private final f.b Jp = new f.b()
  {
    public Bundle fC()
    {
      return null;
    }

    public boolean gq()
    {
      return b.g(b.this);
    }

    public boolean isConnected()
    {
      return b.this.isConnected();
    }
  };

  public b(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, Map<Api<?>, Api.ApiOptions> paramMap, Set<GoogleApiClient.ConnectionCallbacks> paramSet, Set<GoogleApiClient.OnConnectionFailedListener> paramSet1, int paramInt1, int paramInt2)
  {
    this.IH = paramLooper;
    this.Jh = new b.b(this, paramLooper);
    this.IY = paramInt1;
    this.IU = paramInt2;
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator1.next();
      this.IX.registerConnectionCallbacks(localConnectionCallbacks);
    }
    Iterator localIterator2 = paramSet1.iterator();
    while (localIterator2.hasNext())
    {
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener)localIterator2.next();
      this.IX.registerConnectionFailedListener(localOnConnectionFailedListener);
    }
    Iterator localIterator3 = paramMap.keySet().iterator();
    while (localIterator3.hasNext())
    {
      Api localApi = (Api)localIterator3.next();
      final Api.b localb = localApi.gb();
      Object localObject = paramMap.get(localApi);
      this.Jj.put(localApi.ge(), a(localb, localObject, paramContext, paramLooper, paramClientSettings, this.Jo, new GoogleApiClient.OnConnectionFailedListener()
      {
        public void onConnectionFailed(ConnectionResult paramAnonymousConnectionResult)
        {
          b.a(b.this).lock();
          try
          {
            if ((b.i(b.this) == null) || (localb.getPriority() < b.j(b.this)))
            {
              b.a(b.this, paramAnonymousConnectionResult);
              b.c(b.this, localb.getPriority());
            }
            b.d(b.this);
            return;
          }
          finally
          {
            b.a(b.this).unlock();
          }
        }
      }));
    }
    this.Jk = Collections.unmodifiableList(paramClientSettings.getScopes());
  }

  private static <C extends Api.a, O> C a(Api.b<C, O> paramb, Object paramObject, Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramb.a(paramContext, paramLooper, paramClientSettings, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }

  private <A extends Api.a> void a(b.c<A> paramc)
  {
    this.IV.lock();
    try
    {
      if (paramc.ge() != null);
      for (boolean bool = true; ; bool = false)
      {
        o.b(bool, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        this.Jn.add(paramc);
        paramc.a(this.Iz);
        if (!go())
          break;
        paramc.m(new Status(8));
        return;
      }
      paramc.b(a(paramc.ge()));
      return;
    }
    finally
    {
      this.IV.unlock();
    }
  }

  private void aj(int paramInt)
  {
    this.IV.lock();
    try
    {
      if (this.Jc == 3)
        break label373;
      if (paramInt != -1)
        break label236;
      if (isConnecting())
      {
        Iterator localIterator4 = this.IZ.iterator();
        while (localIterator4.hasNext())
        {
          b.c localc = (b.c)localIterator4.next();
          if (localc.gj() != 1)
          {
            localc.cancel();
            localIterator4.remove();
          }
        }
      }
    }
    finally
    {
      this.IV.unlock();
    }
    this.IZ.clear();
    Iterator localIterator1 = this.Jn.iterator();
    while (localIterator1.hasNext())
      ((b.c)localIterator1.next()).cancel();
    this.Jn.clear();
    Iterator localIterator2 = this.Jm.iterator();
    while (localIterator2.hasNext())
      ((c)localIterator2.next()).clear();
    this.Jm.clear();
    if ((this.Ja == null) && (!this.IZ.isEmpty()))
    {
      this.Je = true;
      this.IV.unlock();
      return;
    }
    label236: boolean bool1 = isConnecting();
    boolean bool2 = isConnected();
    this.Jc = 3;
    if (bool1)
    {
      if (paramInt == -1)
        this.Ja = null;
      this.IW.signalAll();
    }
    this.Jl = false;
    Iterator localIterator3 = this.Jj.values().iterator();
    while (localIterator3.hasNext())
    {
      Api.a locala = (Api.a)localIterator3.next();
      if (locala.isConnected())
        locala.disconnect();
    }
    this.Jl = true;
    this.Jc = 4;
    if (bool2)
    {
      if (paramInt != -1)
        this.IX.aB(paramInt);
      this.Jl = false;
    }
    label373: this.IV.unlock();
  }

  private void gm()
  {
    this.Jf = (-1 + this.Jf);
    if (this.Jf == 0)
    {
      if (this.Ja == null)
        break label81;
      this.Je = false;
      aj(3);
      if (!go())
        break label67;
      this.Jh.sendMessageDelayed(this.Jh.obtainMessage(1), this.Jg);
    }
    while (true)
    {
      this.Jl = false;
      return;
      label67: this.IX.b(this.Ja);
    }
    label81: this.Jc = 2;
    gp();
    this.IW.signalAll();
    gn();
    if (this.Je)
    {
      this.Je = false;
      aj(-1);
      return;
    }
    if (this.Ji.isEmpty());
    for (Bundle localBundle = null; ; localBundle = this.Ji)
    {
      this.IX.d(localBundle);
      return;
    }
  }

  private void gn()
  {
    this.IV.lock();
    while (true)
    {
      try
      {
        if (!isConnected())
        {
          if (go())
          {
            break label98;
            o.a(bool1, "GoogleApiClient is not connected yet.");
            boolean bool2 = this.IZ.isEmpty();
            if (!bool2)
            {
              try
              {
                a((b.c)this.IZ.remove());
              }
              catch (DeadObjectException localDeadObjectException)
              {
              }
              continue;
            }
          }
          else
          {
            bool1 = false;
            continue;
          }
          return;
        }
      }
      finally
      {
        this.IV.unlock();
      }
      label98: boolean bool1 = true;
    }
  }

  private boolean go()
  {
    return this.Jd != 0;
  }

  private void gp()
  {
    this.IV.lock();
    try
    {
      this.Jd = 0;
      this.Jh.removeMessages(1);
      return;
    }
    finally
    {
      this.IV.unlock();
    }
  }

  public final <C extends Api.a> C a(Api.c<C> paramc)
  {
    Api.a locala = (Api.a)this.Jj.get(paramc);
    o.b(locala, "Appropriate Api was not requested.");
    return locala;
  }

  public final <A extends Api.a, R extends Result, T extends BaseImplementation.a<R, A>> T a(T paramT)
  {
    this.IV.lock();
    try
    {
      paramT.a(new BaseImplementation.CallbackHandler(getLooper()));
      if (isConnected())
        b(paramT);
      while (true)
      {
        return paramT;
        this.IZ.add(paramT);
      }
    }
    finally
    {
      this.IV.unlock();
    }
  }

  public final boolean a(Scope paramScope)
  {
    return this.Jk.contains(paramScope.gs());
  }

  public final <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T b(T paramT)
  {
    boolean bool;
    if ((isConnected()) || (go()))
      bool = true;
    while (true)
    {
      o.a(bool, "GoogleApiClient is not connected yet.");
      gn();
      try
      {
        a(paramT);
        return paramT;
        bool = false;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        aj(1);
      }
    }
    return paramT;
  }

  public final ConnectionResult blockingConnect()
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper())
      bool1 = true;
    while (true)
    {
      o.a(bool1, "blockingConnect must not be called on the UI thread");
      this.IV.lock();
      try
      {
        connect();
        while (true)
        {
          boolean bool2 = isConnecting();
          if (!bool2)
            break label89;
          try
          {
            this.IW.await();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            return localConnectionResult4;
          }
        }
        bool1 = false;
        continue;
        label89: if (isConnected())
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.HE;
          return localConnectionResult3;
        }
        if (this.Ja != null)
        {
          ConnectionResult localConnectionResult2 = this.Ja;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.IV.unlock();
      }
    }
  }

  public final ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper())
      bool1 = true;
    while (true)
    {
      o.a(bool1, "blockingConnect must not be called on the UI thread");
      this.IV.lock();
      try
      {
        connect();
        long l = paramTimeUnit.toNanos(paramLong);
        label40: boolean bool2 = isConnecting();
        if (bool2)
          try
          {
            l = this.IW.awaitNanos(l);
            if (l > 0L)
              break label40;
            ConnectionResult localConnectionResult5 = new ConnectionResult(14, null);
            return localConnectionResult5;
            bool1 = false;
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            return localConnectionResult4;
          }
        if (isConnected())
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.HE;
          return localConnectionResult3;
        }
        if (this.Ja != null)
        {
          ConnectionResult localConnectionResult2 = this.Ja;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.IV.unlock();
      }
    }
  }

  public final <L> c<L> c(L paramL)
  {
    o.b(paramL, "Listener must not be null");
    this.IV.lock();
    try
    {
      c localc = new c(this.IH, paramL);
      this.Jm.add(localc);
      return localc;
    }
    finally
    {
      this.IV.unlock();
    }
  }

  public final void connect()
  {
    this.IV.lock();
    try
    {
      this.Je = false;
      if (!isConnected())
      {
        boolean bool = isConnecting();
        if (!bool);
      }
      else
      {
        return;
      }
      this.Jl = true;
      this.Ja = null;
      this.Jc = 1;
      this.Ji.clear();
      this.Jf = this.Jj.size();
      Iterator localIterator = this.Jj.values().iterator();
      while (localIterator.hasNext())
        ((Api.a)localIterator.next()).connect();
    }
    finally
    {
      this.IV.unlock();
    }
    this.IV.unlock();
  }

  public final void disconnect()
  {
    gp();
    aj(-1);
  }

  public final Looper getLooper()
  {
    return this.IH;
  }

  public final boolean isConnected()
  {
    return this.Jc == 2;
  }

  public final boolean isConnecting()
  {
    return this.Jc == 1;
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.IX.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.IX.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  public final void reconnect()
  {
    disconnect();
    connect();
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IX.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IX.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public final void stopAutoManage(k paramk)
  {
    if (this.IY >= 0);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Called stopAutoManage but automatic lifecycle management is not enabled.");
      d.a(paramk).al(this.IY);
      return;
    }
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IX.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IX.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b
 * JD-Core Version:    0.6.2
 */