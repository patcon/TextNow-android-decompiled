package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

public abstract class af$a extends Binder
  implements af
{
  public static af bT(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
    if ((localIInterface != null) && ((localIInterface instanceof af)))
      return (af)localIInterface;
    return new af.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
      return true;
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad9 = ad.a.bR(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      c localc2 = null;
      if (i4 != 0)
        localc2 = (c)c.CREATOR.createFromParcel(paramParcel1);
      a(localad9, localc2);
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      a(ad.a.bR(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      a(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      b(ad.a.bR(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      c(ad.a.bR(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad8 = ad.a.bR(paramParcel1.readStrongBinder());
      int i3 = paramParcel1.readInt();
      PutDataRequest localPutDataRequest = null;
      if (i3 != 0)
        localPutDataRequest = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(paramParcel1);
      a(localad8, localPutDataRequest);
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad7 = ad.a.bR(paramParcel1.readStrongBinder());
      int i2 = paramParcel1.readInt();
      Uri localUri3 = null;
      if (i2 != 0)
        localUri3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      a(localad7, localUri3);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      b(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad6 = ad.a.bR(paramParcel1.readStrongBinder());
      int i1 = paramParcel1.readInt();
      Uri localUri2 = null;
      if (i1 != 0)
        localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      b(localad6, localUri2);
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad5 = ad.a.bR(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      Uri localUri1 = null;
      if (n != 0)
        localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      c(localad5, localUri1);
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      a(ad.a.bR(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad4 = ad.a.bR(paramParcel1.readStrongBinder());
      int m = paramParcel1.readInt();
      Asset localAsset = null;
      if (m != 0)
        localAsset = (Asset)Asset.CREATOR.createFromParcel(paramParcel1);
      a(localad4, localAsset);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      c(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      d(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad3 = ad.a.bR(paramParcel1.readStrongBinder());
      int k = paramParcel1.readInt();
      b localb = null;
      if (k != 0)
        localb = (b)b.CREATOR.createFromParcel(paramParcel1);
      a(localad3, localb);
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad2 = ad.a.bR(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      aq localaq = null;
      if (j != 0)
        localaq = (aq)aq.CREATOR.createFromParcel(paramParcel1);
      a(localad2, localaq);
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      e(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      f(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      ad localad1 = ad.a.bR(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      c localc1 = null;
      if (i != 0)
        localc1 = (c)c.CREATOR.createFromParcel(paramParcel1);
      b(localad1, localc1);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      g(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      h(ad.a.bR(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
    i(ad.a.bR(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.af.a
 * JD-Core Version:    0.6.2
 */