package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.UserAddressRequest;

public abstract class iy$a extends Binder
  implements iy
{
  public static iy ap(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    if ((localIInterface != null) && ((localIInterface instanceof iy)))
      return (iy)localIInterface;
    return new iy.a.a(paramIBinder);
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
    ix localix = ix.a.ao(paramParcel1.readStrongBinder());
    UserAddressRequest localUserAddressRequest;
    if (paramParcel1.readInt() != 0)
    {
      localUserAddressRequest = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label125;
    }
    label125: for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
    {
      a(localix, localUserAddressRequest, localBundle);
      paramParcel2.writeNoException();
      return true;
      localUserAddressRequest = null;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iy.a
 * JD-Core Version:    0.6.2
 */