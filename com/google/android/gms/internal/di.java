package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class di extends g<de>
{
  private static final di pv = new di();

  private di()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }

  private static boolean b(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
      throw new di.a("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
  }

  public static dd d(Activity paramActivity)
  {
    try
    {
      if (b(paramActivity))
      {
        eu.z("Using AdOverlay from the client jar.");
        return new cu(paramActivity);
      }
      dd localdd = pv.e(paramActivity);
      return localdd;
    }
    catch (di.a locala)
    {
      eu.D(locala.getMessage());
    }
    return null;
  }

  private dd e(Activity paramActivity)
  {
    try
    {
      d locald = e.h(paramActivity);
      dd localdd = dd.a.r(((de)G(paramActivity)).b(locald));
      return localdd;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not create remote InAppPurchaseManager.", localRemoteException);
      return null;
    }
    catch (g.a locala)
    {
      eu.c("Could not create remote InAppPurchaseManager.", locala);
    }
    return null;
  }

  protected final de v(IBinder paramIBinder)
  {
    return de.a.s(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.di
 * JD-Core Version:    0.6.2
 */