package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

public final class bk
{
  private final bt kB;
  private final Object ls = new Object();
  private final Context mContext;
  private final ds ne;
  private final bm nf;
  private boolean ng = false;
  private bp nh;

  public bk(Context paramContext, ds paramds, bt parambt, bm parambm)
  {
    this.mContext = paramContext;
    this.ne = paramds;
    this.kB = parambt;
    this.nf = parambm;
  }

  public final bq a(long paramLong1, long paramLong2)
  {
    eu.z("Starting mediation.");
    Iterator localIterator1 = this.nf.nr.iterator();
    while (localIterator1.hasNext())
    {
      bl localbl = (bl)localIterator1.next();
      eu.B("Trying mediation network: " + localbl.nl);
      Iterator localIterator2 = localbl.nm.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        final bq localbq2;
        synchronized (this.ls)
        {
          if (this.ng)
          {
            bq localbq1 = new bq(-1);
            return localbq1;
          }
          this.nh = new bp(this.mContext, str, this.kB, this.nf, localbl, this.ne.pX, this.ne.kT, this.ne.kQ);
          localbq2 = this.nh.b(paramLong1, paramLong2);
          if (localbq2.nL == 0)
          {
            eu.z("Adapter succeeded.");
            return localbq2;
          }
        }
        if (localbq2.nN != null)
          et.sv.post(new Runnable()
          {
            public void run()
            {
              try
              {
                localbq2.nN.destroy();
                return;
              }
              catch (RemoteException localRemoteException)
              {
                eu.c("Could not destroy mediation adapter.", localRemoteException);
              }
            }
          });
      }
    }
    return new bq(1);
  }

  public final void cancel()
  {
    synchronized (this.ls)
    {
      this.ng = true;
      if (this.nh != null)
        this.nh.cancel();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bk
 * JD-Core Version:    0.6.2
 */