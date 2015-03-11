package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

class IGoogleAuthApiCallbacks$Stub$a
  implements IGoogleAuthApiCallbacks
{
  private IBinder lb;

  IGoogleAuthApiCallbacks$Stub$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void onConnectionSuccess(GoogleAuthApiResponse paramGoogleAuthApiResponse)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
      if (paramGoogleAuthApiResponse != null)
      {
        localParcel1.writeInt(1);
        paramGoogleAuthApiResponse.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void onError(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      if (paramPendingIntent != null)
      {
        localParcel1.writeInt(1);
        paramPendingIntent.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthApiCallbacks.Stub.a
 * JD-Core Version:    0.6.2
 */