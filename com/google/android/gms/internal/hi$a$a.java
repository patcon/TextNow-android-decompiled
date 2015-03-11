package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class hi$a$a
  implements hi
{
  private IBinder kq;

  hi$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(hh paramhh, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
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

  public void a(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
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

  public void a(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label105;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label105: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hh paramhh, int paramInt, String paramString, IBinder paramIBinder, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        localParcel1.writeStrongBinder(paramIBinder);
        if (paramBundle == null)
          break label113;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(19, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label113: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        this.kq.transact(34, localParcel1, localParcel2, 0);
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

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeString(paramString3);
        localParcel1.writeStringArray(paramArrayOfString);
        this.kq.transact(33, localParcel1, localParcel2, 0);
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

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        this.kq.transact(10, localParcel1, localParcel2, 0);
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

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        if (paramBundle == null)
          break label120;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(30, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label120: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        localParcel1.writeString(paramString3);
        if (paramBundle == null)
          break label126;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label126: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hh paramhh, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, IBinder paramIBinder, String paramString4, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        localParcel1.writeString(paramString3);
        localParcel1.writeStrongBinder(paramIBinder);
        localParcel1.writeString(paramString4);
        if (paramBundle == null)
          break label141;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label141: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(hh paramhh, int paramInt, String paramString1, String[] paramArrayOfString, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeStringArray(paramArrayOfString);
        localParcel1.writeString(paramString2);
        if (paramBundle == null)
          break label120;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(20, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label120: localParcel1.writeInt(0);
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

  public void b(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(21, localParcel1, localParcel2, 0);
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

  public void b(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label105;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label105: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void b(hh paramhh, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        this.kq.transact(28, localParcel1, localParcel2, 0);
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

  public void c(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(22, localParcel1, localParcel2, 0);
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

  public void c(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void d(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(24, localParcel1, localParcel2, 0);
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

  public void d(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void e(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(26, localParcel1, localParcel2, 0);
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

  public void e(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void f(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(31, localParcel1, localParcel2, 0);
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

  public void f(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void g(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(32, localParcel1, localParcel2, 0);
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

  public void g(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(12, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void h(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(35, localParcel1, localParcel2, 0);
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

  public void h(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void i(hh paramhh, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramhh != null);
      for (IBinder localIBinder = paramhh.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.kq.transact(36, localParcel1, localParcel2, 0);
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

  public void i(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(14, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void j(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(15, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void k(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void l(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(17, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void m(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(18, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void n(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(23, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void o(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(25, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void p(hh paramhh, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramhh != null)
      {
        localIBinder = paramhh.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        if (paramBundle == null)
          break label106;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(27, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label106: localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.internal.hi.a.a
 * JD-Core Version:    0.6.2
 */