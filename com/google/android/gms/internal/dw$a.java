package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class dw$a extends Binder
  implements dw
{
  public dw$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
  }

  public static dw y(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
    if ((localIInterface != null) && ((localIInterface instanceof dw)))
      return (dw)localIInterface;
    return new dw.a.a(paramIBinder);
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
    ds localds;
    if (paramParcel1.readInt() != 0)
    {
      localds = ds.CREATOR.h(paramParcel1);
      du localdu = b(localds);
      paramParcel2.writeNoException();
      if (localdu == null)
        break label105;
      paramParcel2.writeInt(1);
      localdu.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      return true;
      localds = null;
      break;
      label105: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw.a
 * JD-Core Version:    0.6.2
 */