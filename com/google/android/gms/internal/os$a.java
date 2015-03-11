package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class os$a extends Binder
  implements os
{
  public os$a()
  {
    attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
  }

  public static os bK(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
    if ((localIInterface != null) && ((localIInterface instanceof os)))
      return (os)localIInterface;
    return new os.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
    {
      a(i, j, localBundle);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.os.a
 * JD-Core Version:    0.6.2
 */