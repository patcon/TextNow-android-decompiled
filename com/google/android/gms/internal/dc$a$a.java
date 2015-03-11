package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class dc$a$a
  implements dc
{
  private IBinder kq;

  dc$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(db paramdb)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
      if (paramdb != null);
      for (IBinder localIBinder = paramdb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.kq.transact(1, localParcel1, localParcel2, 0);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dc.a.a
 * JD-Core Version:    0.6.2
 */