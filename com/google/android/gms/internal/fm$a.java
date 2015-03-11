package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class fm$a extends Binder
  implements fm
{
  public fm$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }

  public static fm D(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
    if ((localIInterface != null) && ((localIInterface instanceof fm)))
      return (fm)localIInterface;
    return new fm.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
    fi localfi;
    if (paramParcel1.readInt() != 0)
    {
      localfi = fi.CREATOR.h(paramParcel1);
      fk localfk = b(localfi);
      paramParcel2.writeNoException();
      if (localfk == null)
        break label105;
      paramParcel2.writeInt(1);
      localfk.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      return true;
      localfi = null;
      break;
      label105: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fm.a
 * JD-Core Version:    0.6.2
 */