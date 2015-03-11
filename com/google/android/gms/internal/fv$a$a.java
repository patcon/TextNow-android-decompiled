package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

class fv$a$a
  implements fv
{
  private IBinder kq;

  fv$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(Status paramStatus)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (paramStatus != null)
      {
        localParcel.writeInt(1);
        paramStatus.writeToParcel(localParcel, 0);
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

  public void a(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (paramStatus != null)
        {
          localParcel.writeInt(1);
          paramStatus.writeToParcel(localParcel, 0);
          if (paramParcelFileDescriptor != null)
          {
            localParcel.writeInt(1);
            paramParcelFileDescriptor.writeToParcel(localParcel, 0);
            this.kq.transact(2, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      localParcel.writeInt(0);
    }
  }

  public void a(Status paramStatus, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        if (paramStatus != null)
        {
          localParcel.writeInt(1);
          paramStatus.writeToParcel(localParcel, 0);
          break label85;
          localParcel.writeInt(i);
          this.kq.transact(3, localParcel, null, 1);
        }
        else
        {
          localParcel.writeInt(0);
        }
      }
      finally
      {
        localParcel.recycle();
      }
      label85: 
      while (!paramBoolean)
      {
        i = 0;
        break;
      }
    }
  }

  public IBinder asBinder()
  {
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fv.a.a
 * JD-Core Version:    0.6.2
 */