package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

class ar$a$a
  implements ar
{
  private IBinder kq;

  ar$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public IBinder a(d paramd, al paramal, String paramString, bt parambt, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      IBinder localIBinder1;
      if (paramd != null)
      {
        localIBinder1 = paramd.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramal == null)
          break label137;
        localParcel1.writeInt(1);
        paramal.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (parambt != null)
          localIBinder2 = parambt.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.kq.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        IBinder localIBinder3 = localParcel2.readStrongBinder();
        return localIBinder3;
        localIBinder1 = null;
        break;
        label137: localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.internal.ar.a.a
 * JD-Core Version:    0.6.2
 */