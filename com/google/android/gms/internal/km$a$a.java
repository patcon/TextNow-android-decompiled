package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.DataReadResult;

class km$a$a
  implements km
{
  private IBinder lb;

  km$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(DataReadResult paramDataReadResult)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataReadCallback");
      if (paramDataReadResult != null)
      {
        localParcel.writeInt(1);
        paramDataReadResult.writeToParcel(localParcel, 0);
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

  public IBinder asBinder()
  {
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.km.a.a
 * JD-Core Version:    0.6.2
 */