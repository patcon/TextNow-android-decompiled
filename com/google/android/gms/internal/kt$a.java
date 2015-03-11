package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

public abstract class kt$a extends Binder
  implements kt
{
  public kt$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IStatusCallback");
  }

  public static kt aw(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
    if ((localIInterface != null) && ((localIInterface instanceof kt)))
      return (kt)localIInterface;
    return new kt.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IStatusCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IStatusCallback");
    if (paramParcel1.readInt() != 0);
    for (Status localStatus = Status.CREATOR.createFromParcel(paramParcel1); ; localStatus = null)
    {
      k(localStatus);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kt.a
 * JD-Core Version:    0.6.2
 */