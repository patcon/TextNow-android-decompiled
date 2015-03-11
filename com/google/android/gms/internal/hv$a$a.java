package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class hv$a$a
  implements hv
{
  private IBinder lb;

  hv$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(hm.a parama, hw paramhw)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (parama != null)
        {
          localParcel1.writeInt(1);
          parama.writeToParcel(localParcel1, 0);
          if (paramhw != null)
          {
            localIBinder = paramhw.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      IBinder localIBinder = null;
    }
  }

  public void a(hw paramhw)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramhw != null);
      for (IBinder localIBinder = paramhw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hw paramhw, String paramString, hs[] paramArrayOfhs)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramhw != null);
      for (IBinder localIBinder = paramhw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        localParcel1.writeTypedArray(paramArrayOfhs, 0);
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hw paramhw, boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramhw != null);
      for (IBinder localIBinder = paramhw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        int i = 0;
        if (paramBoolean)
          i = 1;
        localParcel1.writeInt(i);
        this.lb.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void b(hw paramhw)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramhw != null);
      for (IBinder localIBinder = paramhw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hv.a.a
 * JD-Core Version:    0.6.2
 */