package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class bt$a$a
  implements bt
{
  private IBinder kq;

  bt$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public bu m(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localParcel1.writeString(paramString);
      this.kq.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      bu localbu = bu.a.j(localParcel2.readStrongBinder());
      return localbu;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bt.a.a
 * JD-Core Version:    0.6.2
 */