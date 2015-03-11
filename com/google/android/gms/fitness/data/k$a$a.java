package com.google.android.gms.fitness.data;

import android.os.IBinder;
import android.os.Parcel;

class k$a$a
  implements k
{
  private IBinder lb;

  k$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void c(DataPoint paramDataPoint)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
      if (paramDataPoint != null)
      {
        localParcel.writeInt(1);
        paramDataPoint.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel, null, 1);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.k.a.a
 * JD-Core Version:    0.6.2
 */