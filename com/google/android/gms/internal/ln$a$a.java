package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

class ln$a$a
  implements ln
{
  private IBinder kq;

  ln$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public lk a(d paramd, c paramc, WalletFragmentOptions paramWalletFragmentOptions, ll paramll)
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
        if (paramll != null)
          localIBinder3 = paramll.asBinder();
        localParcel1.writeStrongBinder(localIBinder3);
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        lk locallk = lk.a.bo(localParcel2.readStrongBinder());
        return locallk;
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
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ln.a.a
 * JD-Core Version:    0.6.2
 */