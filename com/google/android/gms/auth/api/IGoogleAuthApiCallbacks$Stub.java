package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IGoogleAuthApiCallbacks$Stub extends Binder
  implements IGoogleAuthApiCallbacks
{
  public IGoogleAuthApiCallbacks$Stub()
  {
    attachInterface(this, "com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
  }

  public static IGoogleAuthApiCallbacks asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof IGoogleAuthApiCallbacks)))
      return (IGoogleAuthApiCallbacks)localIInterface;
    return new IGoogleAuthApiCallbacks.Stub.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
      int k = paramParcel1.readInt();
      GoogleAuthApiResponse localGoogleAuthApiResponse = null;
      if (k != 0)
        localGoogleAuthApiResponse = GoogleAuthApiResponse.CREATOR.createFromParcel(paramParcel1);
      onConnectionSuccess(localGoogleAuthApiResponse);
      paramParcel2.writeNoException();
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.IGoogleAuthApiCallbacks");
    int i = paramParcel1.readInt();
    String str = paramParcel1.readString();
    int j = paramParcel1.readInt();
    PendingIntent localPendingIntent = null;
    if (j != 0)
      localPendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);
    onError(i, str, localPendingIntent);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthApiCallbacks.Stub
 * JD-Core Version:    0.6.2
 */