package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

public abstract class cu$a extends Binder
  implements cu
{
  public cu$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }

  public static cu m(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    if ((localIInterface != null) && ((localIInterface instanceof cu)))
      return (cu)localIInterface;
    return new cu.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald5 = d.a.am(paramParcel1.readStrongBinder());
      ay localay2;
      if (paramParcel1.readInt() != 0)
      {
        localay2 = ay.CREATOR.c(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label190;
      }
      for (av localav4 = av.CREATOR.b(paramParcel1); ; localav4 = null)
      {
        a(locald5, localay2, localav4, paramParcel1.readString(), cv.a.n(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localay2 = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald4 = getView();
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (locald4 != null)
        localIBinder = locald4.asBinder();
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald3 = d.a.am(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      av localav3 = null;
      if (i != 0)
        localav3 = av.CREATOR.b(paramParcel1);
      a(locald3, localav3, paramParcel1.readString(), cv.a.n(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      showInterstitial();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      destroy();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald2 = d.a.am(paramParcel1.readStrongBinder());
      ay localay1;
      if (paramParcel1.readInt() != 0)
      {
        localay1 = ay.CREATOR.c(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label416;
      }
      for (av localav2 = av.CREATOR.b(paramParcel1); ; localav2 = null)
      {
        a(locald2, localay1, localav2, paramParcel1.readString(), paramParcel1.readString(), cv.a.n(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localay1 = null;
        break;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald1 = d.a.am(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (av localav1 = av.CREATOR.b(paramParcel1); ; localav1 = null)
      {
        a(locald1, localav1, paramParcel1.readString(), paramParcel1.readString(), cv.a.n(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 8:
      label190: paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      label416: pause();
      paramParcel2.writeNoException();
      return true;
    case 9:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    resume();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cu.a
 * JD-Core Version:    0.6.2
 */