package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cs extends em
  implements ServiceConnection
{
  private final Object ls = new Object();
  private Context mContext;
  private boolean oW = false;
  private dg oX;
  private cr oY;
  private cx oZ;
  private List<cv> pa = null;
  private cz pb;

  public cs(Context paramContext, dg paramdg, cz paramcz)
  {
    this.mContext = paramContext;
    this.oX = paramdg;
    this.pb = paramcz;
    this.oY = new cr(paramContext);
    this.oZ = cx.k(this.mContext);
    this.pa = this.oZ.d(10L);
  }

  private void a(final cv paramcv, String paramString1, String paramString2)
  {
    final Intent localIntent = new Intent();
    localIntent.putExtra("RESPONSE_CODE", 0);
    localIntent.putExtra("INAPP_PURCHASE_DATA", paramString1);
    localIntent.putExtra("INAPP_DATA_SIGNATURE", paramString2);
    et.sv.post(new Runnable()
    {
      public void run()
      {
        try
        {
          if (cs.a(cs.this).a(paramcv.pm, -1, localIntent))
          {
            cs.c(cs.this).a(new cw(cs.b(cs.this), paramcv.pn, true, -1, localIntent, paramcv));
            return;
          }
          cs.c(cs.this).a(new cw(cs.b(cs.this), paramcv.pn, false, -1, localIntent, paramcv));
          return;
        }
        catch (RemoteException localRemoteException)
        {
          eu.D("Fail to verify and dispatch pending transaction");
        }
      }
    });
  }

  private void b(long paramLong)
  {
    do
      if (!c(paramLong))
        eu.D("Timeout waiting for pending transaction to be processed.");
    while (!this.oW);
  }

  private void bi()
  {
    if (this.pa.isEmpty())
      return;
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = this.pa.iterator();
    while (localIterator1.hasNext())
    {
      cv localcv2 = (cv)localIterator1.next();
      localHashMap.put(localcv2.pn, localcv2);
    }
    String str2;
    for (Object localObject = null; ; localObject = str2)
    {
      Bundle localBundle = this.oY.b(this.mContext.getPackageName(), (String)localObject);
      if ((localBundle != null) && (cy.a(localBundle) == 0))
      {
        ArrayList localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList2 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList3 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        str2 = localBundle.getString("INAPP_CONTINUATION_TOKEN");
        for (int i = 0; i < localArrayList1.size(); i++)
          if (localHashMap.containsKey(localArrayList1.get(i)))
          {
            String str3 = (String)localArrayList1.get(i);
            String str4 = (String)localArrayList2.get(i);
            String str5 = (String)localArrayList3.get(i);
            cv localcv1 = (cv)localHashMap.get(str3);
            String str6 = cy.p(str4);
            if (localcv1.pm.equals(str6))
            {
              a(localcv1, str4, str5);
              localHashMap.remove(str3);
            }
          }
        if ((str2 != null) && (!localHashMap.isEmpty()));
      }
      else
      {
        Iterator localIterator2 = localHashMap.keySet().iterator();
        while (localIterator2.hasNext())
        {
          String str1 = (String)localIterator2.next();
          this.oZ.a((cv)localHashMap.get(str1));
        }
        break;
      }
    }
  }

  private boolean c(long paramLong)
  {
    long l = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.ls.wait(l);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        eu.D("waitWithTimeout_lock interrupted");
    }
  }

  public void bh()
  {
    synchronized (this.ls)
    {
      Context localContext = this.mContext;
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localContext.bindService(localIntent, this, 1);
      b(SystemClock.elapsedRealtime());
      this.mContext.unbindService(this);
      this.oY.destroy();
      return;
    }
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (this.ls)
    {
      this.oY.o(paramIBinder);
      bi();
      this.oW = true;
      this.ls.notify();
      return;
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    eu.B("In-app billing service disconnected.");
    this.oY.destroy();
  }

  public void onStop()
  {
    synchronized (this.ls)
    {
      this.mContext.unbindService(this);
      this.oY.destroy();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cs
 * JD-Core Version:    0.6.2
 */