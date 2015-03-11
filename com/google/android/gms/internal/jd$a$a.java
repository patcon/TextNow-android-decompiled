package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

class jd$a$a
  implements jd
{
  private IBinder kq;

  jd$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public void onAddGeofencesResult(int paramInt, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeStringArray(paramArrayOfString);
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

  public void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
      localParcel1.writeInt(paramInt);
      if (paramPendingIntent != null)
      {
        localParcel1.writeInt(1);
        paramPendingIntent.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.kq.transact(3, localParcel1, localParcel2, 0);
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

  public void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeStringArray(paramArrayOfString);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jd.a.a
 * JD-Core Version:    0.6.2
 */