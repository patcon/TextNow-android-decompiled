package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class id$a extends Binder
  implements id
{
  public static id K(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
    if ((localIInterface != null) && ((localIInterface instanceof id)))
      return (id)localIInterface;
    return new id.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
      return true;
    case 5001:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      int j = fq();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      return true;
    case 5002:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      int i = fr();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    case 5003:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      a(ic.a.J(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 5004:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      a(ic.a.J(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5005:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      a(ic.a.J(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5006:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      a(ic.a.J(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 5007:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      b(ic.a.J(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5008:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
      b(ic.a.J(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5009:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
    c(ic.a.J(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.id.a
 * JD-Core Version:    0.6.2
 */