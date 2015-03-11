package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class ke$a$a
  implements ke
{
  private IBinder kq;

  ke$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(kd paramkd, Uri paramUri, Bundle paramBundle, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
        IBinder localIBinder = null;
        if (paramkd != null)
          localIBinder = paramkd.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        if (paramUri != null)
        {
          localParcel.writeInt(1);
          paramUri.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            break label136;
            localParcel.writeInt(i);
            this.kq.transact(1, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      localParcel.writeInt(0);
      label136: 
      while (!paramBoolean)
      {
        i = 0;
        break;
      }
    }
  }

  public IBinder asBinder()
  {
    return this.kq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ke.a.a
 * JD-Core Version:    0.6.2
 */