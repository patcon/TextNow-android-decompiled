package com.google.android.gms.auth.api;

import android.os.IBinder;
import android.os.Parcel;

class IGoogleAuthService$Stub$a
  implements IGoogleAuthService
{
  private IBinder lb;

  IGoogleAuthService$Stub$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void sendConnection(IGoogleAuthApiCallbacks paramIGoogleAuthApiCallbacks, GoogleAuthApiRequest paramGoogleAuthApiRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthService");
      IBinder localIBinder;
      if (paramIGoogleAuthApiCallbacks != null)
      {
        localIBinder = paramIGoogleAuthApiCallbacks.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramGoogleAuthApiRequest == null)
          break label84;
        localParcel1.writeInt(1);
        paramGoogleAuthApiRequest.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label84: localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthService.Stub.a
 * JD-Core Version:    0.6.2
 */