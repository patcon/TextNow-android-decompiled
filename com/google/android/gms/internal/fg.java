package com.google.android.gms.internal;

import android.os.RemoteException;

@ez
public abstract class fg extends gg
{
  private final fi pQ;
  private final ff.a tu;

  public fg(fi paramfi, ff.a parama)
  {
    this.pQ = paramfi;
    this.tu = parama;
  }

  private static fk a(fm paramfm, fi paramfi)
  {
    try
    {
      fk localfk = paramfm.b(paramfi);
      return localfk;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not fetch ad response from ad request service.", localRemoteException);
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      gs.d("Could not fetch ad response from ad request service due to an Exception.", localNullPointerException);
      return null;
    }
    catch (SecurityException localSecurityException)
    {
      gs.d("Could not fetch ad response from ad request service due to an Exception.", localSecurityException);
      return null;
    }
    catch (Throwable localThrowable)
    {
      gb.e(localThrowable);
    }
    return null;
  }

  public abstract void cC();

  public abstract fm cD();

  public final void co()
  {
    try
    {
      fm localfm = cD();
      fk localfk;
      if (localfm == null)
        localfk = new fk(0);
      while (true)
      {
        cC();
        this.tu.a(localfk);
        return;
        localfk = a(localfm, this.pQ);
        if (localfk == null)
          localfk = new fk(0);
      }
    }
    finally
    {
      cC();
    }
  }

  public final void onStop()
  {
    cC();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fg
 * JD-Core Version:    0.6.2
 */