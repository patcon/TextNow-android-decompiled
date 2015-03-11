package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

class nh$a$a
  implements nh
{
  private IBinder lb;

  nh$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(String paramString, nm paramnm, ni paramni)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
        localParcel.writeString(paramString);
        if (paramnm != null)
        {
          localParcel.writeInt(1);
          paramnm.writeToParcel(localParcel, 0);
          if (paramni != null)
          {
            localParcel.writeInt(1);
            paramni.writeToParcel(localParcel, 0);
            this.lb.transact(2, localParcel, null, 1);
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

  public void a(String paramString, nm paramnm, List<ni> paramList)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
      localParcel.writeString(paramString);
      if (paramnm != null)
      {
        localParcel.writeInt(1);
        paramnm.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        localParcel.writeTypedList(paramList);
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

  public void a(String paramString, nm paramnm, byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
      localParcel.writeString(paramString);
      if (paramnm != null)
      {
        localParcel.writeInt(1);
        paramnm.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        localParcel.writeByteArray(paramArrayOfByte);
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

  public IBinder asBinder()
  {
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nh.a.a
 * JD-Core Version:    0.6.2
 */