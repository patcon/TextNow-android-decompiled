package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

class af$a$a
  implements af
{
  private IBinder lb;

  af$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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

  public void a(ad paramad, Uri paramUri)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramUri == null)
          break label85;
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, Asset paramAsset)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramAsset == null)
          break label85;
        localParcel1.writeInt(1);
        paramAsset.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, PutDataRequest paramPutDataRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramPutDataRequest == null)
          break label85;
        localParcel1.writeInt(1);
        paramPutDataRequest.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, c paramc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramc == null)
          break label85;
        localParcel1.writeInt(1);
        paramc.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(20, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, aq paramaq)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramaq == null)
          break label85;
        localParcel1.writeInt(1);
        paramaq.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(17, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, b paramb)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramb == null)
          break label85;
        localParcel1.writeInt(1);
        paramb.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ad paramad, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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

  public void a(ad paramad, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        localParcel1.writeByteArray(paramArrayOfByte);
        this.lb.transact(12, localParcel1, localParcel2, 0);
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

  public void b(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(8, localParcel1, localParcel2, 0);
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

  public void b(ad paramad, Uri paramUri)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramUri == null)
          break label85;
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void b(ad paramad, c paramc)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramc == null)
          break label84;
        localParcel1.writeInt(1);
        paramc.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label84: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void b(ad paramad, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(23, localParcel1, localParcel2, 0);
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

  public void c(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(14, localParcel1, localParcel2, 0);
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

  public void c(ad paramad, Uri paramUri)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      IBinder localIBinder;
      if (paramad != null)
      {
        localIBinder = paramad.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramUri == null)
          break label85;
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void c(ad paramad, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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

  public void d(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(15, localParcel1, localParcel2, 0);
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

  public void e(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(18, localParcel1, localParcel2, 0);
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

  public void f(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(19, localParcel1, localParcel2, 0);
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

  public void g(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
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

  public void h(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
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

  public void i(ad paramad)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
      if (paramad != null);
      for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(5, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.wearable.internal.af.a.a
 * JD-Core Version:    0.6.2
 */