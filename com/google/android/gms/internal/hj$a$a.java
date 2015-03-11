package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

class hj$a$a
  implements hj
{
  private IBinder kq;

  hj$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public d a(d paramd, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
      if (paramd != null);
      for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        d locald = d.a.ag(localParcel2.readStrongBinder());
        return locald;
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
 * Qualified Name:     com.google.android.gms.internal.hj.a.a
 * JD-Core Version:    0.6.2
 */