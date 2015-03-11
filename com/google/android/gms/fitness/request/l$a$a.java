package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.data.BleDevice;

class l$a$a
  implements l
{
  private IBinder lb;

  l$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void onDeviceFound(BleDevice paramBleDevice)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
      if (paramBleDevice != null)
      {
        localParcel.writeInt(1);
        paramBleDevice.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void onScanStopped()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
      this.lb.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.l.a.a
 * JD-Core Version:    0.6.2
 */