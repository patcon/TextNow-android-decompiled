package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class dg$a$a
  implements dg
{
  private IBinder kq;

  dg$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(df paramdf)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      if (paramdf != null);
      for (IBinder localIBinder = paramdf.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.kq.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
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

  public boolean isValidPurchase(String paramString)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localParcel1.writeString(paramString);
      this.kq.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0)
        return bool;
      bool = false;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dg.a.a
 * JD-Core Version:    0.6.2
 */