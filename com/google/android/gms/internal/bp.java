package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.dynamic.e;

public final class bp
  implements bq.a
{
  private final bt kB;
  private final ai lh;
  private final Object ls = new Object();
  private final Context mContext;
  private final String nC;
  private final long nD;
  private final bl nE;
  private final al nF;
  private final ev nG;
  private bu nH;
  private int nI = -2;

  public bp(Context paramContext, String paramString, bt parambt, bm parambm, bl parambl, ai paramai, al paramal, ev paramev)
  {
    this.mContext = paramContext;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      this.nC = b(parambl);
      this.kB = parambt;
      if (parambm.ns == -1L)
        break label108;
    }
    label108: for (long l = parambm.ns; ; l = 10000L)
    {
      this.nD = l;
      this.nE = parambl;
      this.lh = paramai;
      this.nF = paramal;
      this.nG = paramev;
      return;
      this.nC = paramString;
      break;
    }
  }

  private void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    while (true)
    {
      if (this.nI != -2)
        return;
      b(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }

  private void a(bo parambo)
  {
    try
    {
      if (this.nG.sy < 4100000)
      {
        if (this.nF.mf)
        {
          this.nH.a(e.h(this.mContext), this.lh, this.nE.nq, parambo);
          return;
        }
        this.nH.a(e.h(this.mContext), this.nF, this.lh, this.nE.nq, parambo);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not request ad from mediation adapter.", localRemoteException);
      g(5);
      return;
    }
    if (this.nF.mf)
    {
      this.nH.a(e.h(this.mContext), this.lh, this.nE.nq, this.nE.nk, parambo);
      return;
    }
    this.nH.a(e.h(this.mContext), this.nF, this.lh, this.nE.nq, this.nE.nk, parambo);
  }

  private bu aP()
  {
    eu.B("Instantiating mediation adapter: " + this.nC);
    try
    {
      bu localbu = this.kB.m(this.nC);
      return localbu;
    }
    catch (RemoteException localRemoteException)
    {
      eu.a("Could not instantiate mediation adapter: " + this.nC, localRemoteException);
    }
    return null;
  }

  private String b(bl parambl)
  {
    try
    {
      if ((!TextUtils.isEmpty(parambl.no)) && (CustomEvent.class.isAssignableFrom(Class.forName(parambl.no, false, bp.class.getClassLoader()))))
        return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      eu.D("Could not create custom event adapter.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }

  private void b(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = paramLong2 - (l1 - paramLong1);
    long l3 = paramLong4 - (l1 - paramLong3);
    if ((l2 <= 0L) || (l3 <= 0L))
    {
      eu.B("Timed out waiting for adapter.");
      this.nI = 3;
      return;
    }
    try
    {
      this.ls.wait(Math.min(l2, l3));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      this.nI = -1;
    }
  }

  public final bq b(long paramLong1, long paramLong2)
  {
    synchronized (this.ls)
    {
      long l = SystemClock.elapsedRealtime();
      final bo localbo = new bo();
      et.sv.post(new Runnable()
      {
        public void run()
        {
          synchronized (bp.a(bp.this))
          {
            if (bp.b(bp.this) != -2)
              return;
            bp.a(bp.this, bp.c(bp.this));
            if (bp.d(bp.this) == null)
            {
              bp.this.g(4);
              return;
            }
          }
          localbo.a(bp.this);
          bp.a(bp.this, localbo);
        }
      });
      a(l, this.nD, paramLong1, paramLong2);
      bq localbq = new bq(this.nE, this.nH, this.nC, localbo, this.nI);
      return localbq;
    }
  }

  public final void cancel()
  {
    synchronized (this.ls)
    {
      try
      {
        if (this.nH != null)
          this.nH.destroy();
        this.nI = -1;
        this.ls.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          eu.c("Could not destroy mediation adapter.", localRemoteException);
      }
    }
  }

  public final void g(int paramInt)
  {
    synchronized (this.ls)
    {
      this.nI = paramInt;
      this.ls.notify();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bp
 * JD-Core Version:    0.6.2
 */