package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

class ae$a$a
  implements ae
{
  private IBinder lb;

  ae$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void Z(DataHolder paramDataHolder)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
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

  public void a(ah paramah)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
      if (paramah != null)
      {
        localParcel.writeInt(1);
        paramah.writeToParcel(localParcel, 0);
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

  public void a(ak paramak)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
      if (paramak != null)
      {
        localParcel.writeInt(1);
        paramak.writeToParcel(localParcel, 0);
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

  public void b(ak paramak)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
      if (paramak != null)
      {
        localParcel.writeInt(1);
        paramak.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.lb.transact(4, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ae.a.a
 * JD-Core Version:    0.6.2
 */