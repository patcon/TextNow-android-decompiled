package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;

class in$a$a
  implements in
{
  private IBinder lb;

  in$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeDouble(paramDouble1);
      localParcel.writeDouble(paramDouble2);
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.lb.transact(7, localParcel, null, 1);
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(String paramString, LaunchOptions paramLaunchOptions)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      if (paramLaunchOptions != null)
      {
        localParcel.writeInt(1);
        paramLaunchOptions.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.lb.transact(13, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(String paramString1, String paramString2, long paramLong)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      localParcel.writeLong(paramLong);
      this.lb.transact(9, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(String paramString, byte[] paramArrayOfByte, long paramLong)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      localParcel.writeByteArray(paramArrayOfByte);
      localParcel.writeLong(paramLong);
      this.lb.transact(10, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(boolean paramBoolean1, double paramDouble, boolean paramBoolean2)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      int j;
      if (paramBoolean1)
      {
        j = i;
        localParcel.writeInt(j);
        localParcel.writeDouble(paramDouble);
        if (!paramBoolean2)
          break label76;
      }
      while (true)
      {
        localParcel.writeInt(i);
        this.lb.transact(8, localParcel, null, 1);
        return;
        j = 0;
        break;
        label76: i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void aH(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      this.lb.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void aI(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      this.lb.transact(11, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void aJ(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      this.lb.transact(12, localParcel, null, 1);
      return;
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

  public void disconnect()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      this.lb.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void f(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString);
      if (paramBoolean);
      while (true)
      {
        localParcel.writeInt(i);
        this.lb.transact(2, localParcel, null, 1);
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void fD()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      this.lb.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void fP()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      this.lb.transact(4, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void l(String paramString1, String paramString2)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      this.lb.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.in.a.a
 * JD-Core Version:    0.6.2
 */