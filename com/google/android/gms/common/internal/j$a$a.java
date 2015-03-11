package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

class j$a$a
  implements j
{
  private IBinder lb;

  j$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void cancel()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
      this.lb.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.j.a.a
 * JD-Core Version:    0.6.2
 */