package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.DataTypeResult;

public abstract class ko$a extends Binder
  implements ko
{
  public ko$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
  }

  public static ko ar(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
    if ((localIInterface != null) && ((localIInterface instanceof ko)))
      return (ko)localIInterface;
    return new ko.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
    if (paramParcel1.readInt() != 0);
    for (DataTypeResult localDataTypeResult = (DataTypeResult)DataTypeResult.CREATOR.createFromParcel(paramParcel1); ; localDataTypeResult = null)
    {
      a(localDataTypeResult);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ko.a
 * JD-Core Version:    0.6.2
 */