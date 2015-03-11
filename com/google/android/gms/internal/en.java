package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

@ez
public final class en extends g<ej>
{
  private static final en sK = new en();

  private en()
  {
    super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
  }

  private static boolean c(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
      throw new en.a("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
  }

  public static ei e(Activity paramActivity)
  {
    try
    {
      if (c(paramActivity))
      {
        gs.S("Using AdOverlay from the client jar.");
        return new dz(paramActivity);
      }
      ei localei = sK.f(paramActivity);
      return localei;
    }
    catch (en.a locala)
    {
      gs.W(locala.getMessage());
    }
    return null;
  }

  private ei f(Activity paramActivity)
  {
    try
    {
      d locald = e.k(paramActivity);
      ei localei = ei.a.u(((ej)L(paramActivity)).b(locald));
      return localei;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not create remote InAppPurchaseManager.", localRemoteException);
      return null;
    }
    catch (g.a locala)
    {
      gs.d("Could not create remote InAppPurchaseManager.", locala);
    }
    return null;
  }

  protected final ej y(IBinder paramIBinder)
  {
    return ej.a.v(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.en
 * JD-Core Version:    0.6.2
 */