package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.Iterator;

public class no extends e<nh>
{
  private final String BZ;
  private final nl akW;
  private final nj akX;
  private boolean akY;
  private final Object mw;

  public no(Context paramContext, nl paramnl)
  {
    super(paramContext, paramnl, paramnl, new String[0]);
    this.BZ = paramContext.getPackageName();
    this.akW = ((nl)o.i(paramnl));
    this.akW.a(this);
    this.akX = new nj();
    this.mw = new Object();
    this.akY = true;
  }

  private void c(nm paramnm, ni paramni)
  {
    this.akX.a(paramnm, paramni);
  }

  private void d(nm paramnm, ni paramni)
  {
    try
    {
      mY();
      ((nh)gS()).a(this.BZ, paramnm, paramni);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      c(paramnm, paramni);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      c(paramnm, paramni);
    }
  }

  private void mY()
  {
    if (!this.akY);
    for (boolean bool = true; ; bool = false)
    {
      a.I(bool);
      if (!this.akX.isEmpty())
        try
        {
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = this.akX.mW().iterator();
          Object localObject = null;
          while (localIterator.hasNext())
          {
            nj.a locala = (nj.a)localIterator.next();
            if (locala.akO != null)
            {
              ((nh)gS()).a(this.BZ, locala.akM, pn.f(locala.akO));
            }
            else if (locala.akM.equals(localObject))
            {
              localArrayList.add(locala.akN);
            }
            else
            {
              if (!localArrayList.isEmpty())
              {
                ((nh)gS()).a(this.BZ, localObject, localArrayList);
                localArrayList.clear();
              }
              nm localnm = locala.akM;
              localArrayList.add(locala.akN);
              localObject = localnm;
            }
          }
          if (!localArrayList.isEmpty())
            ((nh)gS()).a(this.BZ, localObject, localArrayList);
          this.akX.clear();
          return;
        }
        catch (RemoteException localRemoteException)
        {
        }
      return;
    }
  }

  void S(boolean paramBoolean)
  {
    synchronized (this.mw)
    {
      boolean bool = this.akY;
      this.akY = paramBoolean;
      if ((bool) && (!this.akY))
        mY();
      return;
    }
  }

  protected void a(l paraml, e.e parame)
  {
    Bundle localBundle = new Bundle();
    paraml.f(parame, 6171000, getContext().getPackageName(), localBundle);
  }

  public void b(nm paramnm, ni paramni)
  {
    synchronized (this.mw)
    {
      if (this.akY)
      {
        c(paramnm, paramni);
        return;
      }
      d(paramnm, paramni);
    }
  }

  protected nh bD(IBinder paramIBinder)
  {
    return nh.a.bC(paramIBinder);
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.playlog.internal.IPlayLogService";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.playlog.service.START";
  }

  public void start()
  {
    synchronized (this.mw)
    {
      if ((isConnecting()) || (isConnected()))
        return;
      this.akW.R(true);
      connect();
      return;
    }
  }

  public void stop()
  {
    synchronized (this.mw)
    {
      this.akW.R(false);
      disconnect();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.no
 * JD-Core Version:    0.6.2
 */