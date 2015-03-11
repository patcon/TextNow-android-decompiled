package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.BleDevice;

public abstract class l$a extends Binder
  implements l
{
  public l$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
  }

  public static l ay(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
    if ((localIInterface != null) && ((localIInterface instanceof l)))
      return (l)localIInterface;
    return new l.a.a(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
      if (paramParcel1.readInt() != 0);
      for (BleDevice localBleDevice = (BleDevice)BleDevice.CREATOR.createFromParcel(paramParcel1); ; localBleDevice = null)
      {
        onDeviceFound(localBleDevice);
        return true;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
    onScanStopped();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.l.a
 * JD-Core Version:    0.6.2
 */