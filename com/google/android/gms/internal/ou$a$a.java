package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

class ou$a$a
  implements ou
{
  private IBinder lb;

  ou$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public or a(d paramd, c paramc, WalletFragmentOptions paramWalletFragmentOptions, os paramos)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      IBinder localIBinder1;
      IBinder localIBinder2;
      if (paramd != null)
      {
        localIBinder1 = paramd.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramc == null)
          break label146;
        localIBinder2 = paramc.asBinder();
        label48: localParcel1.writeStrongBinder(localIBinder2);
        if (paramWalletFragmentOptions == null)
          break label152;
        localParcel1.writeInt(1);
        paramWalletFragmentOptions.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        IBinder localIBinder3 = null;
        if (paramos != null)
          localIBinder3 = paramos.asBinder();
        localParcel1.writeStrongBinder(localIBinder3);
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        or localor = or.a.bJ(localParcel2.readStrongBinder());
        return localor;
        localIBinder1 = null;
        break;
        label146: localIBinder2 = null;
        break label48;
        label152: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ou.a.a
 * JD-Core Version:    0.6.2
 */