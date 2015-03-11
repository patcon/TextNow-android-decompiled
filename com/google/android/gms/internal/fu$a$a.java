package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class fu$a$a
  implements fu
{
  private IBinder kq;

  fu$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(fv paramfv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramfv != null);
      for (IBinder localIBinder = paramfv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.kq.transact(2, localParcel1, localParcel2, 0);
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

  public void a(fv paramfv, String paramString, fr[] paramArrayOffr)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramfv != null);
      for (IBinder localIBinder = paramfv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        localParcel1.writeTypedArray(paramArrayOffr, 0);
        this.kq.transact(1, localParcel1, localParcel2, 0);
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

  public void a(fv paramfv, boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramfv != null);
      for (IBinder localIBinder = paramfv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        int i = 0;
        if (paramBoolean)
          i = 1;
        localParcel1.writeInt(i);
        this.kq.transact(4, localParcel1, localParcel2, 0);
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
    return this.kq;
  }

  public void b(fv paramfv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramfv != null);
      for (IBinder localIBinder = paramfv.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.kq.transact(3, localParcel1, localParcel2, 0);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fu.a.a
 * JD-Core Version:    0.6.2
 */