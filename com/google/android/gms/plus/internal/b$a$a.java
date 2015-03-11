package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.nz;

class b$a$a
  implements b
{
  private IBinder lb;

  b$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle1 != null)
        {
          localParcel1.writeInt(1);
          paramBundle1.writeToParcel(localParcel1, 0);
          if (paramBundle2 != null)
          {
            localParcel1.writeInt(1);
            paramBundle2.writeToParcel(localParcel1, 0);
            this.lb.transact(1, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramParcelFileDescriptor != null)
          {
            localParcel1.writeInt(1);
            paramParcelFileDescriptor.writeToParcel(localParcel1, 0);
            this.lb.transact(2, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(int paramInt, Bundle paramBundle, jp paramjp)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramjp != null)
          {
            localParcel1.writeInt(1);
            paramjp.writeToParcel(localParcel1, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(int paramInt, nz paramnz)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      localParcel1.writeInt(paramInt);
      if (paramnz != null)
      {
        localParcel1.writeInt(1);
        paramnz.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(DataHolder paramDataHolder, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramDataHolder != null)
      {
        localParcel1.writeInt(1);
        paramDataHolder.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        this.lb.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramDataHolder != null)
      {
        localParcel1.writeInt(1);
        paramDataHolder.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        this.lb.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void aB(Status paramStatus)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      if (paramStatus != null)
      {
        localParcel1.writeInt(1);
        paramStatus.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
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

  public void ce(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      localParcel1.writeString(paramString);
      this.lb.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void cf(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      localParcel1.writeString(paramString);
      this.lb.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void h(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
      localParcel1.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.plus.internal.b.a.a
 * JD-Core Version:    0.6.2
 */