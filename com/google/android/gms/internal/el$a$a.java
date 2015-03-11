package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class el$a$a
  implements el
{
  private IBinder lb;

  el$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(ek paramek)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      if (paramek != null);
      for (IBinder localIBinder = paramek.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(2, localParcel1, localParcel2, 0);
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

  public boolean isValidPurchase(String paramString)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
      localParcel1.writeString(paramString);
      this.lb.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0)
        return bool;
      bool = false;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.el.a.a
 * JD-Core Version:    0.6.2
 */