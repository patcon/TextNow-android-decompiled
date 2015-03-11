package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

class be$a$a
  implements be
{
  private IBinder lb;

  be$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder a(d paramd, ay paramay, String paramString, ct paramct, int paramInt)
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
        if (paramay == null)
          break label137;
        localParcel1.writeInt(1);
        paramay.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (paramct != null)
          localIBinder2 = paramct.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        localParcel1.writeInt(paramInt);
        this.lb.transact(1, localParcel1, localParcel2, 0);
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
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.be.a.a
 * JD-Core Version:    0.6.2
 */