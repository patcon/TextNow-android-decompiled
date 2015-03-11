package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

class jy$a$a
  implements jy
{
  private IBinder kq;

  jy$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void V(DataHolder paramDataHolder)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      if (paramDataHolder != null)
      {
        localParcel.writeInt(1);
        paramDataHolder.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.kq.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void W(DataHolder paramDataHolder)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      if (paramDataHolder != null)
      {
        localParcel.writeInt(1);
        paramDataHolder.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.kq.transact(2, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void X(DataHolder paramDataHolder)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      if (paramDataHolder != null)
      {
        localParcel.writeInt(1);
        paramDataHolder.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.kq.transact(3, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jy.a.a
 * JD-Core Version:    0.6.2
 */