package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class fm$a$a
  implements fm
{
  private IBinder lb;

  fm$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public fk b(fi paramfi)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (paramfi != null)
        {
          localParcel1.writeInt(1);
          paramfi.writeToParcel(localParcel1, 0);
          this.lb.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            fk localfk2 = fk.CREATOR.i(localParcel2);
            localfk1 = localfk2;
            return localfk1;
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
      fk localfk1 = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fm.a.a
 * JD-Core Version:    0.6.2
 */