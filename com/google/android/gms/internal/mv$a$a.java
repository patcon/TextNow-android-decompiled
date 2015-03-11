package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

class mv$a$a
  implements mv
{
  private IBinder lb;

  mv$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
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
        this.lb.transact(1, localParcel, null, 1);
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
        this.lb.transact(2, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void Y(DataHolder paramDataHolder)
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
        this.lb.transact(3, localParcel, null, 1);
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
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mv.a.a
 * JD-Core Version:    0.6.2
 */