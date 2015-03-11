package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class bf$a$a
  implements bf
{
  private IBinder lb;

  bf$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void onAppEvent(String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.lb.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bf.a.a
 * JD-Core Version:    0.6.2
 */