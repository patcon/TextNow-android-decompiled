package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.c.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class ln$a extends Binder
  implements ln
{
  public static ln br(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    if ((localIInterface != null) && ((localIInterface instanceof ln)))
      return (ln)localIInterface;
    return new ln.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    d locald = d.a.ag(paramParcel1.readStrongBinder());
    c localc = c.a.af(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0);
    for (WalletFragmentOptions localWalletFragmentOptions = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1); ; localWalletFragmentOptions = null)
    {
      lk locallk = a(locald, localc, localWalletFragmentOptions, ll.a.bp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (locallk != null)
        localIBinder = locallk.asBinder();
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ln.a
 * JD-Core Version:    0.6.2
 */