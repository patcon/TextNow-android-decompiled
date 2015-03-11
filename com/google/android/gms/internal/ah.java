package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class ah extends g<ar>
{
  private static final ah lR = new ah();

  private ah()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }

  public static aq a(Context paramContext, al paramal, String paramString, bs parambs)
  {
    Object localObject;
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) == 0)
    {
      localObject = lR.b(paramContext, paramal, paramString, parambs);
      if (localObject != null);
    }
    else
    {
      eu.z("Using AdManager from the client jar.");
      localObject = new u(paramContext, paramal, paramString, parambs, new ev(5089000, 5089000, true));
    }
    return localObject;
  }

  private aq b(Context paramContext, al paramal, String paramString, bs parambs)
  {
    try
    {
      d locald = e.h(paramContext);
      aq localaq = aq.a.f(((ar)G(paramContext)).a(locald, paramal, paramString, parambs, 5089000));
      return localaq;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not create remote AdManager.", localRemoteException);
      return null;
    }
    catch (g.a locala)
    {
      eu.c("Could not create remote AdManager.", locala);
    }
    return null;
  }

  protected final ar c(IBinder paramIBinder)
  {
    return ar.a.g(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ah
 * JD-Core Version:    0.6.2
 */