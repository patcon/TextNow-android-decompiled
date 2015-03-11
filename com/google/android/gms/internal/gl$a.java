package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;

public abstract class gl$a extends Binder
  implements gl
{
  public static gl H(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
    if ((localIInterface != null) && ((localIInterface instanceof gl)))
      return (gl)localIInterface;
    return new gl.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      disconnect();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      String str2 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      boolean bool4 = false;
      if (j != 0)
        bool4 = true;
      e(str2, bool4);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      h(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      ep();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      am(paramParcel1.readString());
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      eg();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      double d2 = paramParcel1.readDouble();
      double d3 = paramParcel1.readDouble();
      if (paramParcel1.readInt() != 0);
      for (boolean bool3 = true; ; bool3 = false)
      {
        a(d2, d3, bool3);
        return true;
      }
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      if (paramParcel1.readInt() != 0);
      for (boolean bool1 = true; ; bool1 = false)
      {
        double d1 = paramParcel1.readDouble();
        int i = paramParcel1.readInt();
        boolean bool2 = false;
        if (i != 0)
          bool2 = true;
        a(bool1, d1, bool2);
        return true;
      }
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      a(paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readLong());
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      an(paramParcel1.readString());
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      ao(paramParcel1.readString());
      return true;
    case 13:
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
    String str1 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (LaunchOptions localLaunchOptions = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(paramParcel1); ; localLaunchOptions = null)
    {
      a(str1, localLaunchOptions);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gl.a
 * JD-Core Version:    0.6.2
 */