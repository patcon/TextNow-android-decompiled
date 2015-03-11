package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionStopResult;

class ks$a$a
  implements ks
{
  private IBinder lb;

  ks$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(SessionStopResult paramSessionStopResult)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionStopCallback");
      if (paramSessionStopResult != null)
      {
        localParcel1.writeInt(1);
        paramSessionStopResult.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel1, localParcel2, 0);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.a.a
 * JD-Core Version:    0.6.2
 */