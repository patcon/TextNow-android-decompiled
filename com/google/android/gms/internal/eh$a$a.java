package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class eh$a$a
  implements eh
{
  private IBinder lb;

  eh$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(eg parameg)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
      if (parameg != null);
      for (IBinder localIBinder = parameg.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
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
 * Qualified Name:     com.google.android.gms.internal.eh.a.a
 * JD-Core Version:    0.6.2
 */