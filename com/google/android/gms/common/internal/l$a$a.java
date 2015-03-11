package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class l$a$a
  implements l
{
  private IBinder lb;

  l$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(k paramk, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
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

  public void a(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
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

  public void a(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(2, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString, IBinder paramIBinder, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(19, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        this.lb.transact(34, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeString(paramString3);
        localParcel1.writeStringArray(paramArrayOfString);
        this.lb.transact(33, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        this.lb.transact(10, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(30, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(1, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, IBinder paramIBinder, String paramString4, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(9, localParcel1, localParcel2, 0);
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

  public void a(k paramk, int paramInt, String paramString1, String[] paramArrayOfString, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(20, localParcel1, localParcel2, 0);
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
    return this.lb;
  }

  public void b(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(21, localParcel1, localParcel2, 0);
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

  public void b(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(5, localParcel1, localParcel2, 0);
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

  public void b(k paramk, int paramInt, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeStringArray(paramArrayOfString);
        this.lb.transact(28, localParcel1, localParcel2, 0);
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

  public void c(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(22, localParcel1, localParcel2, 0);
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

  public void c(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(6, localParcel1, localParcel2, 0);
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

  public void d(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(24, localParcel1, localParcel2, 0);
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

  public void d(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(7, localParcel1, localParcel2, 0);
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

  public void e(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(26, localParcel1, localParcel2, 0);
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

  public void e(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(8, localParcel1, localParcel2, 0);
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

  public void f(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(31, localParcel1, localParcel2, 0);
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

  public void f(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(11, localParcel1, localParcel2, 0);
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

  public void g(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(32, localParcel1, localParcel2, 0);
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

  public void g(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(12, localParcel1, localParcel2, 0);
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

  public void h(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(35, localParcel1, localParcel2, 0);
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

  public void h(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(13, localParcel1, localParcel2, 0);
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

  public void i(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(36, localParcel1, localParcel2, 0);
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

  public void i(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(14, localParcel1, localParcel2, 0);
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

  public void j(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(40, localParcel1, localParcel2, 0);
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

  public void j(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(15, localParcel1, localParcel2, 0);
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

  public void k(k paramk, int paramInt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null);
      for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.lb.transact(42, localParcel1, localParcel2, 0);
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

  public void k(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(16, localParcel1, localParcel2, 0);
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

  public void l(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(17, localParcel1, localParcel2, 0);
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

  public void m(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(18, localParcel1, localParcel2, 0);
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

  public void n(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(23, localParcel1, localParcel2, 0);
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

  public void o(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(25, localParcel1, localParcel2, 0);
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

  public void p(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(27, localParcel1, localParcel2, 0);
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

  public void q(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(37, localParcel1, localParcel2, 0);
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

  public void r(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(38, localParcel1, localParcel2, 0);
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

  public void s(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(41, localParcel1, localParcel2, 0);
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

  public void t(k paramk, int paramInt, String paramString, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder;
      if (paramk != null)
      {
        localIBinder = paramk.asBinder();
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
        this.lb.transact(43, localParcel1, localParcel2, 0);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.l.a.a
 * JD-Core Version:    0.6.2
 */