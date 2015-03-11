package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class gb$a extends Binder
  implements gb
{
  public gb$a()
  {
    attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
  }

  public static gb E(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof gb)))
      return (gb)localIInterface;
    return new gb.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
      return true;
    case 5001:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
      int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      DataHolder localDataHolder2 = null;
      if (k != 0)
        localDataHolder2 = DataHolder.CREATOR.x(paramParcel1);
      a(j, localDataHolder2);
      paramParcel2.writeNoException();
      return true;
    case 5002:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
      int i = paramParcel1.readInt();
      DataHolder localDataHolder1 = null;
      if (i != 0)
        localDataHolder1 = DataHolder.CREATOR.x(paramParcel1);
      a(localDataHolder1);
      paramParcel2.writeNoException();
      return true;
    case 5003:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
      b(paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5004:
      paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
      dT();
      paramParcel2.writeNoException();
      return true;
    case 5005:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
    L(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gb.a
 * JD-Core Version:    0.6.2
 */