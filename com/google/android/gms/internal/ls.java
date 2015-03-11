package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class ls extends g<ln>
{
  private static ls akN;

  protected ls()
  {
    super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
  }

  public static lk a(Activity paramActivity, c paramc, WalletFragmentOptions paramWalletFragmentOptions, ll paramll)
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramActivity);
    if (i != 0)
      throw new GooglePlayServicesNotAvailableException(i);
    try
    {
      lk locallk = ((ln)nj().G(paramActivity)).a(e.h(paramActivity), paramc, paramWalletFragmentOptions, paramll);
      return locallk;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
    catch (g.a locala)
    {
      throw new RuntimeException(locala);
    }
  }

  private static ls nj()
  {
    if (akN == null)
      akN = new ls();
    return akN;
  }

  protected ln bv(IBinder paramIBinder)
  {
    return ln.a.br(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ls
 * JD-Core Version:    0.6.2
 */