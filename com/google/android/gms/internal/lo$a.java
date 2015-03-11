package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.UserAddressRequest;

public abstract class lo$a extends Binder
  implements lo
{
  public static lo aH(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    if ((localIInterface != null) && ((localIInterface instanceof lo)))
      return (lo)localIInterface;
    return new lo.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
      return true;
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    ln localln = ln.a.aG(paramParcel1.readStrongBinder());
    UserAddressRequest localUserAddressRequest;
    if (paramParcel1.readInt() != 0)
    {
      localUserAddressRequest = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label125;
    }
    label125: for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
    {
      a(localln, localUserAddressRequest, localBundle);
      paramParcel2.writeNoException();
      return true;
      localUserAddressRequest = null;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lo.a
 * JD-Core Version:    0.6.2
 */