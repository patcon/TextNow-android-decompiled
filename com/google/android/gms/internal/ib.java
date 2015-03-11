package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.appstate.AppStateManager.StateDeletedResult;
import com.google.android.gms.appstate.AppStateManager.StateListResult;
import com.google.android.gms.appstate.AppStateManager.StateResult;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;

public final class ib extends e<id>
{
  private final String Dd;

  public ib(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.Dd = ((String)o.i(paramString));
  }

  protected final id I(IBinder paramIBinder)
  {
    return id.a.K(paramIBinder);
  }

  public final void a(BaseImplementation.b<AppStateManager.StateListResult> paramb)
  {
    try
    {
      ((id)gS()).a(new ib.c(paramb));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(BaseImplementation.b<AppStateManager.StateDeletedResult> paramb, int paramInt)
  {
    try
    {
      ((id)gS()).b(new ib.a(paramb), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(BaseImplementation.b<AppStateManager.StateResult> paramb, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      ((id)gS()).a(new ib.e(paramb), paramInt, paramString, paramArrayOfByte);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(BaseImplementation.b<AppStateManager.StateResult> paramb, int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramb == null)
      localObject = null;
    try
    {
      while (true)
      {
        ((id)gS()).a((ic)localObject, paramInt, paramArrayOfByte);
        return;
        ib.e locale = new ib.e(paramb);
        localObject = locale;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected final void a(l paraml, e.e parame)
  {
    paraml.a(parame, 6171000, getContext().getPackageName(), this.Dd, gR());
  }

  public final void b(BaseImplementation.b<Status> paramb)
  {
    try
    {
      ((id)gS()).b(new ib.g(paramb));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void b(BaseImplementation.b<AppStateManager.StateResult> paramb, int paramInt)
  {
    try
    {
      ((id)gS()).a(new ib.e(paramb), paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  protected final void c(String[] paramArrayOfString)
  {
    int i = 0;
    boolean bool = false;
    while (i < paramArrayOfString.length)
    {
      if (paramArrayOfString[i].equals("https://www.googleapis.com/auth/appstate"))
        bool = true;
      i++;
    }
    o.a(bool, String.format("App State APIs requires %s to function.", new Object[] { "https://www.googleapis.com/auth/appstate" }));
  }

  public final int fq()
  {
    try
    {
      int i = ((id)gS()).fq();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 2;
  }

  public final int fr()
  {
    try
    {
      int i = ((id)gS()).fr();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 2;
  }

  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.appstate.internal.IAppStateService";
  }

  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.appstate.service.START";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib
 * JD-Core Version:    0.6.2
 */