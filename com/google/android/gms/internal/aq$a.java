package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

public abstract class aq$a extends Binder
  implements aq
{
  public aq$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }

  public static aq f(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface != null) && ((localIInterface instanceof aq)))
      return (aq)localIInterface;
    return new aq.a.a(paramIBinder);
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
      d locald = U();
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
      ai localai = null;
      if (j != 0)
        localai = ai.CREATOR.b(paramParcel1);
      boolean bool1 = a(localai);
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
      a(ap.a.e(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(as.a.h(paramParcel1.readStrongBinder()));
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
      ag();
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      al localal2 = V();
      paramParcel2.writeNoException();
      if (localal2 != null)
      {
        paramParcel2.writeInt(1);
        localal2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      int i = paramParcel1.readInt();
      al localal1 = null;
      if (i != 0)
        localal1 = al.CREATOR.c(paramParcel1);
      a(localal1);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      a(dc.a.q(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
    a(dg.a.u(paramParcel1.readStrongBinder()), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aq.a
 * JD-Core Version:    0.6.2
 */