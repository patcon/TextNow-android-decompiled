package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class k$a extends Binder
  implements k
{
  public k$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
  }

  public static k an(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
    if ((localIInterface != null) && ((localIInterface instanceof k)))
      return (k)localIInterface;
    return new k.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
    if (paramParcel1.readInt() != 0);
    for (DataPoint localDataPoint = (DataPoint)DataPoint.CREATOR.createFromParcel(paramParcel1); ; localDataPoint = null)
    {
      c(localDataPoint);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.k.a
 * JD-Core Version:    0.6.2
 */