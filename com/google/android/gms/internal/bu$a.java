package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

public abstract class bu$a extends Binder
  implements bu
{
  public bu$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }

  public static bu j(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    if ((localIInterface != null) && ((localIInterface instanceof bu)))
      return (bu)localIInterface;
    return new bu.a.a(paramIBinder);
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
      d locald5 = d.a.ag(paramParcel1.readStrongBinder());
      al localal2;
      if (paramParcel1.readInt() != 0)
      {
        localal2 = al.CREATOR.c(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label190;
      }
      for (ai localai4 = ai.CREATOR.b(paramParcel1); ; localai4 = null)
      {
        a(locald5, localal2, localai4, paramParcel1.readString(), bv.a.k(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localal2 = null;
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
      d locald3 = d.a.ag(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      ai localai3 = null;
      if (i != 0)
        localai3 = ai.CREATOR.b(paramParcel1);
      a(locald3, localai3, paramParcel1.readString(), bv.a.k(paramParcel1.readStrongBinder()));
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
      d locald2 = d.a.ag(paramParcel1.readStrongBinder());
      al localal1;
      if (paramParcel1.readInt() != 0)
      {
        localal1 = al.CREATOR.c(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label416;
      }
      for (ai localai2 = ai.CREATOR.b(paramParcel1); ; localai2 = null)
      {
        a(locald2, localal1, localai2, paramParcel1.readString(), paramParcel1.readString(), bv.a.k(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localal1 = null;
        break;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      d locald1 = d.a.ag(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (ai localai1 = ai.CREATOR.b(paramParcel1); ; localai1 = null)
      {
        a(locald1, localai1, paramParcel1.readString(), paramParcel1.readString(), bv.a.k(paramParcel1.readStrongBinder()));
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bu.a
 * JD-Core Version:    0.6.2
 */