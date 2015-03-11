package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

public abstract class bd$a extends Binder
  implements bd
{
  public bd$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }

  public static bd f(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface != null) && ((localIInterface instanceof bd)))
      return (bd)localIInterface;
    return new bd.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      d locald = X();
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (locald != null)
        localIBinder = locald.asBinder();
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      destroy();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      boolean bool2 = isReady();
      paramParcel2.writeNoException();
      if (bool2);
      for (int m = 1; ; m = 0)
      {
        paramParcel2.writeInt(m);
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int j = paramParcel1.readInt();
      av localav = null;
      if (j != 0)
        localav = av.CREATOR.b(paramParcel1);
      boolean bool1 = a(localav);
      paramParcel2.writeNoException();
      int k = 0;
      if (bool1)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      pause();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      resume();
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(bc.a.e(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(bf.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      showInterstitial();
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      stopLoading();
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      aj();
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      ay localay2 = Y();
      paramParcel2.writeNoException();
      if (localay2 != null)
      {
        paramParcel2.writeInt(1);
        localay2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int i = paramParcel1.readInt();
      ay localay1 = null;
      if (i != 0)
        localay1 = ay.CREATOR.c(paramParcel1);
      a(localay1);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(eh.a.t(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(el.a.x(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(et.a.A(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(eu.a.B(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 18:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
    String str = getMediationAdapterClassName();
    paramParcel2.writeNoException();
    paramParcel2.writeString(str);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bd.a
 * JD-Core Version:    0.6.2
 */