package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class hv$a extends Binder
  implements hv
{
  public static hv F(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    if ((localIInterface != null) && ((localIInterface instanceof hv)))
      return (hv)localIInterface;
    return new hv.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      a(hw.a.G(paramParcel1.readStrongBinder()), paramParcel1.readString(), (hs[])paramParcel1.createTypedArray(hs.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      a(hw.a.G(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      b(hw.a.G(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      hw localhw = hw.a.G(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        a(localhw, bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 5:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    if (paramParcel1.readInt() != 0);
    for (hm.a locala = hm.a.CREATOR.p(paramParcel1); ; locala = null)
    {
      a(locala, hw.a.G(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hv.a
 * JD-Core Version:    0.6.2
 */