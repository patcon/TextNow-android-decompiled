package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

class co$a$a
  implements co
{
  private IBinder kq;

  co$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder a(d paramd)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
      if (paramd != null);
      for (IBinder localIBinder1 = paramd.asBinder(); ; localIBinder1 = null)
      {
        localParcel1.writeStrongBinder(localIBinder1);
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder2 = localParcel2.readStrongBinder();
        return localIBinder2;
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
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.co.a.a
 * JD-Core Version:    0.6.2
 */