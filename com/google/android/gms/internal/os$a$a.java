package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class os$a$a
  implements os
{
  private IBinder lb;

  os$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(2, localParcel1, localParcel2, 0);
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

  public IBinder asBinder()
  {
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.os.a.a
 * JD-Core Version:    0.6.2
 */