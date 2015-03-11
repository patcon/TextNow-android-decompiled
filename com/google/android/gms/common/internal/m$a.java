package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

public abstract class m$a extends Binder
  implements m
{
  public static m R(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    if ((localIInterface != null) && ((localIInterface instanceof m)))
      return (m)localIInterface;
    return new m.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
    d locald = a(d.a.am(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    if (locald != null);
    for (IBinder localIBinder = locald.asBinder(); ; localIBinder = null)
    {
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.m.a
 * JD-Core Version:    0.6.2
 */