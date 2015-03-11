package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

class a$a$a
  implements a
{
  private IBinder kq;

  a$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public void onLocationChanged(Location paramLocation)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
      if (paramLocation != null)
      {
        localParcel.writeInt(1);
        paramLocation.writeToParcel(localParcel, 0);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.a.a.a
 * JD-Core Version:    0.6.2
 */