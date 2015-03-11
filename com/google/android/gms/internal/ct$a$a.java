package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class ct$a$a
  implements ct
{
  private IBinder lb;

  ct$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public cu x(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localParcel1.writeString(paramString);
      this.lb.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      cu localcu = cu.a.m(localParcel2.readStrongBinder());
      return localcu;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public boolean y(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      localParcel1.writeString(paramString);
      this.lb.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct.a.a
 * JD-Core Version:    0.6.2
 */