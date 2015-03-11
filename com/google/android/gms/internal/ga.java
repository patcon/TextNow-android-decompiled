package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;

public final class ga extends hb<gc>
{
  private final String yQ;

  public ga(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.yQ = ((String)hm.f(paramString));
  }

  protected final gc D(IBinder paramIBinder)
  {
    return gc.a.F(paramIBinder);
  }

  public final void a(a.d<AppStateManager.StateListResult> paramd)
  {
    try
    {
      ((gc)ft()).a(new ga.c(paramd));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(a.d<AppStateManager.StateDeletedResult> paramd, int paramInt)
  {
    try
    {
      ((gc)ft()).b(new ga.a(paramd), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(a.d<AppStateManager.StateResult> paramd, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      ((gc)ft()).a(new ga.e(paramd), paramInt, paramString, paramArrayOfByte);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(a.d<AppStateManager.StateResult> paramd, int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramd == null)
      localObject = null;
    try
    {
      while (true)
      {
        ((gc)ft()).a((gb)localObject, paramInt, paramArrayOfByte);
        return;
        ga.e locale = new ga.e(paramd);
        localObject = locale;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected final void a(hi paramhi, hb.e parame)
  {
    paramhi.a(parame, 5089000, getContext().getPackageName(), this.yQ, fs());
  }

  public final void b(a.d<Status> paramd)
  {
    try
    {
      ((gc)ft()).b(new ga.g(paramd));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void b(a.d<AppStateManager.StateResult> paramd, int paramInt)
  {
    try
    {
      ((gc)ft()).a(new ga.e(paramd), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected final void b(String[] paramArrayOfString)
  {
    int i = 0;
    boolean bool = false;
    while (i < paramArrayOfString.length)
    {
      if (paramArrayOfString[i].equals("https://www.googleapis.com/auth/appstate"))
        bool = true;
      i++;
    }
    hm.a(bool, String.format("App State APIs requires %s to function.", new Object[] { "https://www.googleapis.com/auth/appstate" }));
  }

  protected final String bu()
  {
    return "com.google.android.gms.appstate.service.START";
  }

  protected final String bv()
  {
    return "com.google.android.gms.appstate.internal.IAppStateService";
  }

  public final int dU()
  {
    try
    {
      int i = ((gc)ft()).dU();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 2;
  }

  public final int dV()
  {
    try
    {
      int i = ((gc)ft()).dV();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga
 * JD-Core Version:    0.6.2
 */