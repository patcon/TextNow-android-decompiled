package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public abstract class lp$a extends Binder
  implements lp
{
  public lp$a()
  {
    attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
  }

  public static lp bt(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof lp)))
      return (lp)localIInterface;
    return new lp.a.a(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      int m = paramParcel1.readInt();
      MaskedWallet localMaskedWallet;
      if (paramParcel1.readInt() != 0)
      {
        localMaskedWallet = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label154;
      }
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
      {
        a(m, localMaskedWallet, localBundle5);
        paramParcel2.writeNoException();
        return true;
        localMaskedWallet = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      int k = paramParcel1.readInt();
      FullWallet localFullWallet;
      if (paramParcel1.readInt() != 0)
      {
        localFullWallet = (FullWallet)FullWallet.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label236;
      }
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
      {
        a(k, localFullWallet, localBundle4);
        paramParcel2.writeNoException();
        return true;
        localFullWallet = null;
        break;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      int j = paramParcel1.readInt();
      boolean bool;
      if (paramParcel1.readInt() != 0)
      {
        bool = true;
        if (paramParcel1.readInt() == 0)
          break label307;
      }
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
      {
        a(j, bool, localBundle3);
        paramParcel2.writeNoException();
        return true;
        bool = false;
        break;
      }
    case 4:
      label154: label236: paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      label307: int i = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        i(i, localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    Status localStatus;
    li localli;
    if (paramParcel1.readInt() != 0)
    {
      localStatus = Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label452;
      localli = (li)li.CREATOR.createFromParcel(paramParcel1);
      label409: if (paramParcel1.readInt() == 0)
        break label458;
    }
    label452: label458: for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
    {
      a(localStatus, localli, localBundle1);
      paramParcel2.writeNoException();
      return true;
      localStatus = null;
      break;
      localli = null;
      break label409;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lp.a
 * JD-Core Version:    0.6.2
 */