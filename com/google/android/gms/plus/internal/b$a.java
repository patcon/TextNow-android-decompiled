package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.if;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.kt;

public abstract class b$a extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
  }

  public static b bk(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof b)))
      return (b)localIInterface;
    return new b.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i5 = paramParcel1.readInt();
      Bundle localBundle4;
      if (paramParcel1.readInt() != 0)
      {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label194;
      }
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
      {
        a(i5, localBundle4, localBundle5);
        paramParcel2.writeNoException();
        return true;
        localBundle4 = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i4 = paramParcel1.readInt();
      Bundle localBundle3;
      if (paramParcel1.readInt() != 0)
      {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label276;
      }
      for (ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1); ; localParcelFileDescriptor = null)
      {
        a(i4, localBundle3, localParcelFileDescriptor);
        paramParcel2.writeNoException();
        return true;
        localBundle3 = null;
        break;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      bw(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i3 = paramParcel1.readInt();
      DataHolder localDataHolder2 = null;
      if (i3 != 0)
        localDataHolder2 = DataHolder.CREATOR.x(paramParcel1);
      a(localDataHolder2, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int i1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        int i2 = paramParcel1.readInt();
        ie localie = null;
        if (i2 != 0)
          localie = ie.CREATOR.L(paramParcel1);
        a(i1, localBundle2, localie);
        paramParcel2.writeNoException();
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int n = paramParcel1.readInt();
      DataHolder localDataHolder1 = null;
      if (n != 0)
        localDataHolder1 = DataHolder.CREATOR.x(paramParcel1);
      a(localDataHolder1, paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      int m = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
      {
        h(m, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      bx(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9:
      label194: paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
      label276: int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      ks localks = null;
      if (k != 0)
        localks = ks.CREATOR.bG(paramParcel1);
      a(j, localks);
      paramParcel2.writeNoException();
      return true;
    case 10:
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
    int i = paramParcel1.readInt();
    Status localStatus = null;
    if (i != 0)
      localStatus = Status.CREATOR.createFromParcel(paramParcel1);
    am(localStatus);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.b.a
 * JD-Core Version:    0.6.2
 */