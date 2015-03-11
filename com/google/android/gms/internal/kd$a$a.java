package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class kd$a$a
  implements kd
{
  private IBinder kq;

  kd$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
        localParcel1.writeInt(paramInt1);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt2);
          if (paramIntent != null)
          {
            localParcel1.writeInt(1);
            paramIntent.writeToParcel(localParcel1, 0);
            this.kq.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      localParcel1.writeInt(0);
    }
  }

  public IBinder asBinder()
  {
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kd.a.a
 * JD-Core Version:    0.6.2
 */