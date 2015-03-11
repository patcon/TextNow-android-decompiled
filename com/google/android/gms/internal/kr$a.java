package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.SessionReadResult;

public abstract class kr$a extends Binder
  implements kr
{
  public kr$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.ISessionReadCallback");
  }

  public static kr au(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
    if ((localIInterface != null) && ((localIInterface instanceof kr)))
      return (kr)localIInterface;
    return new kr.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.ISessionReadCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
    if (paramParcel1.readInt() != 0);
    for (SessionReadResult localSessionReadResult = (SessionReadResult)SessionReadResult.CREATOR.createFromParcel(paramParcel1); ; localSessionReadResult = null)
    {
      a(localSessionReadResult);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kr.a
 * JD-Core Version:    0.6.2
 */