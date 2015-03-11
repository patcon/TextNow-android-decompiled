package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract class io$a extends Binder
  implements io
{
  public io$a()
  {
    attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
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
      paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      ac(paramParcel1.readInt());
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      int m = paramParcel1.readInt();
      ApplicationMetadata localApplicationMetadata = null;
      if (m != 0)
        localApplicationMetadata = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      boolean bool2 = false;
      if (n != 0)
        bool2 = true;
      a(localApplicationMetadata, str2, str3, bool2);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      ad(paramParcel1.readInt());
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      String str1 = paramParcel1.readString();
      double d = paramParcel1.readDouble();
      int k = paramParcel1.readInt();
      boolean bool1 = false;
      if (k != 0)
        bool1 = true;
      a(str1, d, bool1);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      k(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      b(paramParcel1.readString(), paramParcel1.createByteArray());
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      af(paramParcel1.readInt());
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      ae(paramParcel1.readInt());
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      onApplicationDisconnected(paramParcel1.readInt());
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readInt());
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readLong());
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      int j = paramParcel1.readInt();
      ig localig = null;
      if (j != 0)
        localig = (ig)ig.CREATOR.createFromParcel(paramParcel1);
      b(localig);
      return true;
    case 13:
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    int i = paramParcel1.readInt();
    il localil = null;
    if (i != 0)
      localil = (il)il.CREATOR.createFromParcel(paramParcel1);
    b(localil);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.io.a
 * JD-Core Version:    0.6.2
 */