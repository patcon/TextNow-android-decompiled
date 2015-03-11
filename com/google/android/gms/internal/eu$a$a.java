package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class eu$a$a
  implements eu
{
  private IBinder lb;

  eu$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(es parames)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
      if (parames != null);
      for (IBinder localIBinder = parames.asBinder(); ; localIBinder = null)
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

  public boolean e(String paramString1, String paramString2)
  {
    boolean bool = true;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
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
 * Qualified Name:     com.google.android.gms.internal.eu.a.a
 * JD-Core Version:    0.6.2
 */