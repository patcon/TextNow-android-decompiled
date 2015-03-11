package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class cm extends g<co>
{
  private static final cm oS = new cm();

  private cm()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }

  public static cn a(Activity paramActivity)
  {
    try
    {
      if (b(paramActivity))
      {
        eu.z("Using AdOverlay from the client jar.");
        return new cf(paramActivity);
      }
      cn localcn = oS.c(paramActivity);
      return localcn;
    }
    catch (cm.a locala)
    {
      eu.D(locala.getMessage());
    }
    return null;
  }

  private static boolean b(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
      throw new cm.a("Ad overlay requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }

  private cn c(Activity paramActivity)
  {
    try
    {
      d locald = e.h(paramActivity);
      cn localcn = cn.a.m(((co)G(paramActivity)).a(locald));
      return localcn;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not create remote AdOverlay.", localRemoteException);
      return null;
    }
    catch (g.a locala)
    {
      eu.c("Could not create remote AdOverlay.", locala);
    }
    return null;
  }

  protected final co l(IBinder paramIBinder)
  {
    return co.a.n(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cm
 * JD-Core Version:    0.6.2
 */