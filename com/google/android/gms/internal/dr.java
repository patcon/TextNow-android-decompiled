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
public final class dr extends g<dt>
{
  private static final dr sh = new dr();

  private dr()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }

  public static ds b(Activity paramActivity)
  {
    try
    {
      if (c(paramActivity))
      {
        gs.S("Using AdOverlay from the client jar.");
        return new dk(paramActivity);
      }
      ds localds = sh.d(paramActivity);
      return localds;
    }
    catch (dr.a locala)
    {
      gs.W(locala.getMessage());
    }
    return null;
  }

  private static boolean c(Activity paramActivity)
  {
    Intent localIntent = paramActivity.getIntent();
    if (!localIntent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
      throw new dr.a("Ad overlay requires the useClientJar flag in intent extras.");
    return localIntent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
  }

  private ds d(Activity paramActivity)
  {
    try
    {
      d locald = e.k(paramActivity);
      ds localds = ds.a.p(((dt)L(paramActivity)).a(locald));
      return localds;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not create remote AdOverlay.", localRemoteException);
      return null;
    }
    catch (g.a locala)
    {
      gs.d("Could not create remote AdOverlay.", locala);
    }
    return null;
  }

  protected final dt o(IBinder paramIBinder)
  {
    return dt.a.q(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dr
 * JD-Core Version:    0.6.2
 */