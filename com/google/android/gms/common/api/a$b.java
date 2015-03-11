package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.hm;

public abstract class a$b<R extends Result, A extends Api.a> extends a.a<R>
  implements c.c<A>
{
  private final Api.c<A> Dn;
  private c.a Dy;

  protected a$b(Api.c<A> paramc)
  {
    this.Dn = ((Api.c)hm.f(paramc));
  }

  private void a(RemoteException paramRemoteException)
  {
    m(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }

  protected abstract void a(A paramA);

  public void a(c.a parama)
  {
    this.Dy = parama;
  }

  public final void b(A paramA)
  {
    a(new a.c(paramA.getLooper()));
    try
    {
      a(paramA);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      a(localRemoteException);
    }
  }

  public final Api.c<A> eB()
  {
    return this.Dn;
  }

  protected void eD()
  {
    super.eD();
    if (this.Dy != null)
    {
      this.Dy.b(this);
      this.Dy = null;
    }
  }

  public int eG()
  {
    return 0;
  }

  public final void m(Status paramStatus)
  {
    if (!paramStatus.isSuccess());
    for (boolean bool = true; ; bool = false)
    {
      hm.b(bool, "Failed result must not be success");
      b(c(paramStatus));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.a.b
 * JD-Core Version:    0.6.2
 */