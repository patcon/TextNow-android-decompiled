package com.google.android.gms.auth.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IGoogleAuthService$Stub extends Binder
  implements IGoogleAuthService
{
  public IGoogleAuthService$Stub()
  {
    attachInterface(this, "com.google.android.gms.auth.api.IGoogleAuthService");
  }

  public static IGoogleAuthService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.IGoogleAuthService");
    if ((localIInterface != null) && ((localIInterface instanceof IGoogleAuthService)))
      return (IGoogleAuthService)localIInterface;
    return new IGoogleAuthService.Stub.a(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.auth.api.IGoogleAuthService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.IGoogleAuthService");
    IGoogleAuthApiCallbacks localIGoogleAuthApiCallbacks = IGoogleAuthApiCallbacks.Stub.asInterface(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0);
    for (GoogleAuthApiRequest localGoogleAuthApiRequest = GoogleAuthApiRequest.CREATOR.createFromParcel(paramParcel1); ; localGoogleAuthApiRequest = null)
    {
      sendConnection(localIGoogleAuthApiCallbacks, localGoogleAuthApiRequest);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthService.Stub
 * JD-Core Version:    0.6.2
 */