package com.admarvel.android.util;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

final class e$c
  implements IInterface
{
  private IBinder a;

  public e$c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final String a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      localParcel2.readInt();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final boolean a(boolean paramBoolean, Context paramContext)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      int j;
      int k;
      label65: e locale;
      if (paramBoolean)
      {
        j = i;
        localParcel1.writeInt(j);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        if (localParcel2.readInt() == 0)
          break label101;
        k = i;
        locale = e.a;
        if (k != i)
          break label107;
      }
      while (true)
      {
        locale.a(i);
        return k;
        j = 0;
        break;
        label101: int m = 0;
        break label65;
        label107: i = 0;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.e.c
 * JD-Core Version:    0.6.2
 */