package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.v;
import android.support.v4.app.y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hc.b;
import com.google.android.gms.internal.hm;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c
  implements GoogleApiClient
{
  private final Looper DF;
  private final Lock DQ = new ReentrantLock();
  private final Condition DR = this.DQ.newCondition();
  private final hc DS = new hc(paramContext, paramLooper, this.Ej);
  private final Fragment DT;
  final Queue<c.c<?>> DU = new LinkedList();
  private ConnectionResult DV;
  private int DW;
  private int DX = 4;
  private int DY = 0;
  private boolean DZ = false;
  private final c.a Dy = new c.a()
  {
    public void b(c.c<?> paramAnonymousc)
    {
      c.this.Eh.remove(paramAnonymousc);
    }
  };
  private int Ea;
  private long Eb = 5000L;
  final Handler Ec;
  private final Bundle Ed = new Bundle();
  private final Map<Api.c<?>, Api.a> Ee = new HashMap();
  private final List<String> Ef;
  private boolean Eg;
  final Set<c.c<?>> Eh = Collections.newSetFromMap(new ConcurrentHashMap());
  final GoogleApiClient.ConnectionCallbacks Ei = new GoogleApiClient.ConnectionCallbacks()
  {
    public void onConnected(Bundle paramAnonymousBundle)
    {
      c.a(c.this).lock();
      try
      {
        if (c.b(c.this) == 1)
        {
          if (paramAnonymousBundle != null)
            c.c(c.this).putAll(paramAnonymousBundle);
          c.d(c.this);
        }
        return;
      }
      finally
      {
        c.a(c.this).unlock();
      }
    }

    public void onConnectionSuspended(int paramAnonymousInt)
    {
      c.a(c.this).lock();
      while (true)
      {
        try
        {
          c.a(c.this, paramAnonymousInt);
          switch (paramAnonymousInt)
          {
          default:
            return;
          case 2:
            c.this.connect();
            continue;
          case 1:
          }
        }
        finally
        {
          c.a(c.this).unlock();
        }
        boolean bool = c.e(c.this);
        if (bool)
        {
          c.a(c.this).unlock();
          return;
        }
        c.b(c.this, 2);
        c.this.Ec.sendMessageDelayed(c.this.Ec.obtainMessage(1), c.f(c.this));
      }
    }
  };
  private final hc.b Ej = new hc.b()
  {
    public boolean eO()
    {
      return c.g(c.this);
    }

    public Bundle ef()
    {
      return null;
    }

    public boolean isConnected()
    {
      return c.this.isConnected();
    }
  };

  public c(Context paramContext, Looper paramLooper, gy paramgy, Map<Api<?>, Api.ApiOptions> paramMap, Fragment paramFragment, Set<GoogleApiClient.ConnectionCallbacks> paramSet, Set<GoogleApiClient.OnConnectionFailedListener> paramSet1)
  {
    this.DT = paramFragment;
    this.DF = paramLooper;
    this.Ec = new c.b(this, paramLooper);
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator1.next();
      this.DS.registerConnectionCallbacks(localConnectionCallbacks);
    }
    Iterator localIterator2 = paramSet1.iterator();
    while (localIterator2.hasNext())
    {
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener)localIterator2.next();
      this.DS.registerConnectionFailedListener(localOnConnectionFailedListener);
    }
    Iterator localIterator3 = paramMap.keySet().iterator();
    while (localIterator3.hasNext())
    {
      Api localApi = (Api)localIterator3.next();
      final Api.b localb = localApi.ez();
      Object localObject = paramMap.get(localApi);
      this.Ee.put(localApi.eB(), a(localb, localObject, paramContext, paramLooper, paramgy, this.Ei, new GoogleApiClient.OnConnectionFailedListener()
      {
        public void onConnectionFailed(ConnectionResult paramAnonymousConnectionResult)
        {
          c.a(c.this).lock();
          try
          {
            if ((c.h(c.this) == null) || (localb.getPriority() < c.i(c.this)))
            {
              c.a(c.this, paramAnonymousConnectionResult);
              c.c(c.this, localb.getPriority());
            }
            c.d(c.this);
            return;
          }
          finally
          {
            c.a(c.this).unlock();
          }
        }
      }));
    }
    this.Ef = Collections.unmodifiableList(paramgy.fl());
  }

  private static <C extends Api.a, O> C a(Api.b<C, O> paramb, Object paramObject, Context paramContext, Looper paramLooper, gy paramgy, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramb.a(paramContext, paramLooper, paramgy, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }

  private <A extends Api.a> void a(c.c<A> paramc)
  {
    boolean bool1 = true;
    this.DQ.lock();
    while (true)
    {
      try
      {
        if (!isConnected())
        {
          if (eM())
          {
            break label152;
            hm.a(bool2, "GoogleApiClient is not connected yet.");
            if (paramc.eB() != null)
            {
              hm.b(bool1, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
              this.Eh.add(paramc);
              paramc.a(this.Dy);
              if (!eM())
                continue;
              paramc.m(new Status(8));
            }
          }
          else
          {
            bool2 = false;
            continue;
          }
          bool1 = false;
          continue;
          paramc.b(a(paramc.eB()));
          return;
        }
      }
      finally
      {
        this.DQ.unlock();
      }
      label152: boolean bool2 = bool1;
    }
  }

  private void aa(int paramInt)
  {
    this.DQ.lock();
    try
    {
      if (this.DX == 3)
        break label327;
      if (paramInt != -1)
        break label190;
      if (isConnecting())
      {
        Iterator localIterator3 = this.DU.iterator();
        while (localIterator3.hasNext())
        {
          c.c localc = (c.c)localIterator3.next();
          if (localc.eG() != 1)
          {
            localc.cancel();
            localIterator3.remove();
          }
        }
      }
    }
    finally
    {
      this.DQ.unlock();
    }
    this.DU.clear();
    Iterator localIterator1 = this.Eh.iterator();
    while (localIterator1.hasNext())
      ((c.c)localIterator1.next()).cancel();
    this.Eh.clear();
    if ((this.DV == null) && (!this.DU.isEmpty()))
    {
      this.DZ = true;
      this.DQ.unlock();
      return;
    }
    label190: boolean bool1 = isConnecting();
    boolean bool2 = isConnected();
    this.DX = 3;
    if (bool1)
    {
      if (paramInt == -1)
        this.DV = null;
      this.DR.signalAll();
    }
    this.Eg = false;
    Iterator localIterator2 = this.Ee.values().iterator();
    while (localIterator2.hasNext())
    {
      Api.a locala = (Api.a)localIterator2.next();
      if (locala.isConnected())
        locala.disconnect();
    }
    this.Eg = true;
    this.DX = 4;
    if (bool2)
    {
      if (paramInt != -1)
        this.DS.ao(paramInt);
      this.Eg = false;
    }
    label327: this.DQ.unlock();
  }

  private void eK()
  {
    this.DQ.lock();
    while (true)
    {
      try
      {
        this.Ea = (-1 + this.Ea);
        if (this.Ea == 0)
        {
          if (this.DV == null)
            break label128;
          this.DZ = false;
          aa(3);
          if (eM())
            this.DY = (-1 + this.DY);
          if (eM())
          {
            this.Ec.sendMessageDelayed(this.Ec.obtainMessage(1), this.Eb);
            this.Eg = false;
          }
        }
        else
        {
          return;
        }
        this.DS.a(this.DV);
        continue;
      }
      finally
      {
        this.DQ.unlock();
      }
      label128: this.DX = 2;
      eN();
      this.DR.signalAll();
      eL();
      if (!this.DZ)
        break;
      this.DZ = false;
      aa(-1);
    }
    if (this.Ed.isEmpty());
    for (Bundle localBundle = null; ; localBundle = this.Ed)
    {
      this.DS.c(localBundle);
      break;
    }
  }

  private void eL()
  {
    boolean bool1;
    if ((isConnected()) || (eM()))
      bool1 = true;
    while (true)
    {
      hm.a(bool1, "GoogleApiClient is not connected yet.");
      this.DQ.lock();
      try
      {
        while (true)
        {
          boolean bool2 = this.DU.isEmpty();
          if (bool2)
            break;
          try
          {
            a((c.c)this.DU.remove());
          }
          catch (DeadObjectException localDeadObjectException)
          {
          }
        }
        bool1 = false;
        continue;
        return;
      }
      finally
      {
        this.DQ.unlock();
      }
    }
  }

  private boolean eM()
  {
    this.DQ.lock();
    try
    {
      int i = this.DY;
      if (i != 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
      this.DQ.unlock();
    }
  }

  private void eN()
  {
    this.DQ.lock();
    try
    {
      this.DY = 0;
      this.Ec.removeMessages(1);
      return;
    }
    finally
    {
      this.DQ.unlock();
    }
  }

  public final <C extends Api.a> C a(Api.c<C> paramc)
  {
    Api.a locala = (Api.a)this.Ee.get(paramc);
    hm.b(locala, "Appropriate Api was not requested.");
    return locala;
  }

  public final <A extends Api.a, T extends a.b<? extends Result, A>> T a(T paramT)
  {
    this.DQ.lock();
    try
    {
      if (isConnected())
        b(paramT);
      while (true)
      {
        return paramT;
        this.DU.add(paramT);
      }
    }
    finally
    {
      this.DQ.unlock();
    }
  }

  public final <A extends Api.a, T extends a.b<? extends Result, A>> T b(T paramT)
  {
    boolean bool;
    if ((isConnected()) || (eM()))
      bool = true;
    while (true)
    {
      hm.a(bool, "GoogleApiClient is not connected yet.");
      eL();
      try
      {
        a(paramT);
        return paramT;
        bool = false;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        aa(1);
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
      hm.a(bool1, "blockingConnect must not be called on the UI thread");
      this.DQ.lock();
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
            this.DR.await();
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
          ConnectionResult localConnectionResult3 = ConnectionResult.CS;
          return localConnectionResult3;
        }
        if (this.DV != null)
        {
          ConnectionResult localConnectionResult2 = this.DV;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.DQ.unlock();
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
      hm.a(bool1, "blockingConnect must not be called on the UI thread");
      this.DQ.lock();
      try
      {
        connect();
        long l = paramTimeUnit.toNanos(paramLong);
        label40: boolean bool2 = isConnecting();
        if (bool2)
          try
          {
            l = this.DR.awaitNanos(l);
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
          ConnectionResult localConnectionResult3 = ConnectionResult.CS;
          return localConnectionResult3;
        }
        if (this.DV != null)
        {
          ConnectionResult localConnectionResult2 = this.DV;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.DQ.unlock();
      }
    }
  }

  public final void connect()
  {
    this.DQ.lock();
    try
    {
      this.DZ = false;
      if (!isConnected())
      {
        boolean bool = isConnecting();
        if (!bool);
      }
      else
      {
        return;
      }
      this.Eg = true;
      this.DV = null;
      this.DX = 1;
      this.Ed.clear();
      this.Ea = this.Ee.size();
      Iterator localIterator = this.Ee.values().iterator();
      while (localIterator.hasNext())
        ((Api.a)localIterator.next()).connect();
    }
    finally
    {
      this.DQ.unlock();
    }
    this.DQ.unlock();
  }

  public final void disconnect()
  {
    eN();
    aa(-1);
  }

  public final Looper getLooper()
  {
    return this.DF;
  }

  public final boolean isConnected()
  {
    this.DQ.lock();
    try
    {
      int i = this.DX;
      if (i == 2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
      this.DQ.unlock();
    }
  }

  public final boolean isConnecting()
  {
    int i = 1;
    this.DQ.lock();
    try
    {
      int j = this.DX;
      if (j == i)
        return i;
      i = 0;
    }
    finally
    {
      this.DQ.unlock();
    }
  }

  public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.DS.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.DS.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  public final void reconnect()
  {
    disconnect();
    connect();
  }

  public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.DS.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.DS.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public final void stopAutoManage()
  {
    if (this.DT != null);
    for (boolean bool = true; ; bool = false)
    {
      hm.a(bool, "Called stopAutoManage but automatic lifecycle management is not enabled.");
      if (this.DT.getActivity() != null)
      {
        this.DT.getActivity().getSupportFragmentManager().a().a(this.DT).a();
        disconnect();
      }
      return;
    }
  }

  public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.DS.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.DS.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c
 * JD-Core Version:    0.6.2
 */