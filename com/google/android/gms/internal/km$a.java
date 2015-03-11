package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.DataReadResult;

public abstract class km$a extends Binder
  implements km
{
  public km$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IDataReadCallback");
  }

  public static km ap(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
    if ((localIInterface != null) && ((localIInterface instanceof km)))
      return (km)localIInterface;
    return new km.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IDataReadCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
    if (paramParcel1.readInt() != 0);
    for (DataReadResult localDataReadResult = (DataReadResult)DataReadResult.CREATOR.createFromParcel(paramParcel1); ; localDataReadResult = null)
    {
      a(localDataReadResult);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.km.a
 * JD-Core Version:    0.6.2
 */