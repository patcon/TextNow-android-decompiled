package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

class fe$a$a
  implements fe
{
  private IBinder kq;

  fe$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(Map paramMap, long paramLong, String paramString, List<fd> paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      localParcel1.writeMap(paramMap);
      localParcel1.writeLong(paramLong);
      localParcel1.writeString(paramString);
      localParcel1.writeTypedList(paramList);
      this.kq.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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

  public void cl()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      this.kq.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public String getVersion()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      this.kq.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fe.a.a
 * JD-Core Version:    0.6.2
 */