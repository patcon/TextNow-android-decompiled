package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class or$a extends Binder
  implements or
{
  public static or bJ(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof or)))
      return (or)localIInterface;
    return new or.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      d locald4 = d.a.am(paramParcel1.readStrongBinder());
      WalletFragmentOptions localWalletFragmentOptions;
      if (paramParcel1.readInt() != 0)
      {
        localWalletFragmentOptions = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label229;
      }
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
      {
        a(locald4, localWalletFragmentOptions, localBundle4);
        paramParcel2.writeNoException();
        return true;
        localWalletFragmentOptions = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
      {
        onCreate(localBundle3);
        paramParcel2.writeNoException();
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      d locald1 = d.a.am(paramParcel1.readStrongBinder());
      d locald2 = d.a.am(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        d locald3 = onCreateView(locald1, locald2, localBundle2);
        paramParcel2.writeNoException();
        IBinder localIBinder = null;
        if (locald3 != null)
          localIBinder = locald3.asBinder();
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      onStart();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      onResume();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      onPause();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      onStop();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
      {
        onSaveInstanceState(localBundle1);
        paramParcel2.writeNoException();
        if (localBundle1 == null)
          break;
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; localIntent = null)
      {
        onActivityResult(j, k, localIntent);
        paramParcel2.writeNoException();
        return true;
      }
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (WalletFragmentInitParams localWalletFragmentInitParams = (WalletFragmentInitParams)WalletFragmentInitParams.CREATOR.createFromParcel(paramParcel1); ; localWalletFragmentInitParams = null)
      {
        initialize(localWalletFragmentInitParams);
        paramParcel2.writeNoException();
        return true;
      }
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (MaskedWalletRequest localMaskedWalletRequest = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1); ; localMaskedWalletRequest = null)
      {
        updateMaskedWalletRequest(localMaskedWalletRequest);
        paramParcel2.writeNoException();
        return true;
      }
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      if (paramParcel1.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        setEnabled(bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 13:
      label229: paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
      int i = getState();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    case 14:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
    if (paramParcel1.readInt() != 0);
    for (MaskedWallet localMaskedWallet = (MaskedWallet)MaskedWallet.CREATOR.createFromParcel(paramParcel1); ; localMaskedWallet = null)
    {
      updateMaskedWallet(localMaskedWallet);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.or.a
 * JD-Core Version:    0.6.2
 */