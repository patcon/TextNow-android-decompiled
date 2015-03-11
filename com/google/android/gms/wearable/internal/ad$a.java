package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class ad$a extends Binder
  implements ad
{
  public ad$a()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
  }

  public static ad bR(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof ad)))
      return (ad)localIInterface;
    return new ad.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i7 = paramParcel1.readInt();
      r localr = null;
      if (i7 != 0)
        localr = (r)r.CREATOR.createFromParcel(paramParcel1);
      a(localr);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i6 = paramParcel1.readInt();
      t localt = null;
      if (i6 != 0)
        localt = (t)t.CREATOR.createFromParcel(paramParcel1);
      a(localt);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i5 = paramParcel1.readInt();
      ao localao = null;
      if (i5 != 0)
        localao = (ao)ao.CREATOR.createFromParcel(paramParcel1);
      a(localao);
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i4 = paramParcel1.readInt();
      x localx = null;
      if (i4 != 0)
        localx = (x)x.CREATOR.createFromParcel(paramParcel1);
      a(localx);
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i3 = paramParcel1.readInt();
      DataHolder localDataHolder = null;
      if (i3 != 0)
        localDataHolder = DataHolder.CREATOR.z(paramParcel1);
      aa(localDataHolder);
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i2 = paramParcel1.readInt();
      p localp = null;
      if (i2 != 0)
        localp = (p)p.CREATOR.createFromParcel(paramParcel1);
      a(localp);
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i1 = paramParcel1.readInt();
      as localas = null;
      if (i1 != 0)
        localas = (as)as.CREATOR.createFromParcel(paramParcel1);
      a(localas);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int n = paramParcel1.readInt();
      z localz = null;
      if (n != 0)
        localz = (z)z.CREATOR.createFromParcel(paramParcel1);
      a(localz);
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int m = paramParcel1.readInt();
      ab localab = null;
      if (m != 0)
        localab = (ab)ab.CREATOR.createFromParcel(paramParcel1);
      a(localab);
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int k = paramParcel1.readInt();
      v localv = null;
      if (k != 0)
        localv = (v)v.CREATOR.createFromParcel(paramParcel1);
      a(localv);
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int j = paramParcel1.readInt();
      Status localStatus = null;
      if (j != 0)
        localStatus = Status.CREATOR.createFromParcel(paramParcel1);
      a(localStatus);
      paramParcel2.writeNoException();
      return true;
    case 12:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
    int i = paramParcel1.readInt();
    au localau = null;
    if (i != 0)
      localau = (au)au.CREATOR.createFromParcel(paramParcel1);
    a(localau);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ad.a
 * JD-Core Version:    0.6.2
 */