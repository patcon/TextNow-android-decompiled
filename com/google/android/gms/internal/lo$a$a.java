package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class lo$a$a
  implements lo
{
  private IBinder kq;

  lo$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public void b(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletInternalServiceCallbacks");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lo.a.a
 * JD-Core Version:    0.6.2
 */