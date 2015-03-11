package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.result.SessionReadResult;

class kr$a$a
  implements kr
{
  private IBinder lb;

  kr$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(SessionReadResult paramSessionReadResult)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionReadCallback");
      if (paramSessionReadResult != null)
      {
        localParcel1.writeInt(1);
        paramSessionReadResult.writeToParcel(localParcel1, 0);
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
 * Qualified Name:     com.google.android.gms.internal.kr.a.a
 * JD-Core Version:    0.6.2
 */