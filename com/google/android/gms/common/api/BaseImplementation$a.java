package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.o;

public abstract class BaseImplementation$a<R extends Result, A extends Api.a> extends BaseImplementation.AbstractPendingResult<R>
  implements b.c<A>
{
  private final Api.c<A> Ip;
  private b.a Iz;

  protected BaseImplementation$a(Api.c<A> paramc)
  {
    this.Ip = ((Api.c)o.i(paramc));
  }

  private void a(RemoteException paramRemoteException)
  {
    m(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }

  protected abstract void a(A paramA);

  public void a(b.a parama)
  {
    this.Iz = parama;
  }

  public final void b(A paramA)
  {
    if (this.mHandler == null)
      a(new BaseImplementation.CallbackHandler(paramA.getLooper()));
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

  public final Api.c<A> ge()
  {
    return this.Ip;
  }

  protected void gg()
  {
    super.gg();
    if (this.Iz != null)
    {
      this.Iz.b(this);
      this.Iz = null;
    }
  }

  public int gj()
  {
    return 0;
  }

  public final void m(Status paramStatus)
  {
    if (!paramStatus.isSuccess());
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Failed result must not be success");
      b(c(paramStatus));
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BaseImplementation.a
 * JD-Core Version:    0.6.2
 */