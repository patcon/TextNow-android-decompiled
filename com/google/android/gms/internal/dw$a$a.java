package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class dw$a$a
  implements dw
{
  private IBinder kq;

  dw$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public du b(ds paramds)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (paramds != null)
        {
          localParcel1.writeInt(1);
          paramds.writeToParcel(localParcel1, 0);
          this.kq.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            du localdu2 = du.CREATOR.i(localParcel2);
            localdu1 = localdu2;
            return localdu1;
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
      du localdu1 = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw.a.a
 * JD-Core Version:    0.6.2
 */