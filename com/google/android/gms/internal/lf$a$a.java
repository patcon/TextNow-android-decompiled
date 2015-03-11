package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.BleDevicesResult;

class lf$a$a
  implements lf
{
  private IBinder lb;

  lf$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(BleDevicesResult paramBleDevicesResult)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
      if (paramBleDevicesResult != null)
      {
        localParcel1.writeInt(1);
        paramBleDevicesResult.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.lf.a.a
 * JD-Core Version:    0.6.2
 */