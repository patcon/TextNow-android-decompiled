package com.google.android.gms.internal;

import android.os.RemoteException;

public abstract class dq extends em
{
  private final ds ne;
  private final dp.a pT;

  public dq(ds paramds, dp.a parama)
  {
    this.ne = paramds;
    this.pT = parama;
  }

  private static du a(dw paramdw, ds paramds)
  {
    try
    {
      du localdu = paramdw.b(paramds);
      return localdu;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not fetch ad response from ad request service.", localRemoteException);
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      eu.c("Could not fetch ad response from ad request service due to an Exception.", localNullPointerException);
      return null;
    }
    catch (SecurityException localSecurityException)
    {
      eu.c("Could not fetch ad response from ad request service due to an Exception.", localSecurityException);
    }
    return null;
  }

  public final void bh()
  {
    try
    {
      dw localdw = bt();
      du localdu;
      if (localdw == null)
        localdu = new du(0);
      while (true)
      {
        bs();
        this.pT.a(localdu);
        return;
        localdu = a(localdw, this.ne);
        if (localdu == null)
          localdu = new du(0);
      }
    }
    finally
    {
      bs();
    }
  }

  public abstract void bs();

  public abstract dw bt();

  public final void onStop()
  {
    bs();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dq
 * JD-Core Version:    0.6.2
 */