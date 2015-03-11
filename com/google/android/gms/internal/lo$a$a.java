package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

class lo$a$a
  implements lo
{
  private IBinder lb;

  lo$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(ln paramln, UserAddressRequest paramUserAddressRequest, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
        IBinder localIBinder;
        if (paramln != null)
        {
          localIBinder = paramln.asBinder();
          localParcel1.writeStrongBinder(localIBinder);
          if (paramUserAddressRequest != null)
          {
            localParcel1.writeInt(1);
            paramUserAddressRequest.writeToParcel(localParcel1, 0);
            if (paramBundle == null)
              break label132;
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.lb.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localIBinder = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label132: localParcel1.writeInt(0);
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lo.a.a
 * JD-Core Version:    0.6.2
 */