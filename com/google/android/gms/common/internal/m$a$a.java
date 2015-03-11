package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

class m$a$a
  implements m
{
  private IBinder lb;

  m$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public d a(d paramd, int paramInt1, int paramInt2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
      if (paramd != null);
      for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        this.lb.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        d locald = d.a.am(localParcel2.readStrongBinder());
        return locald;
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.m.a.a
 * JD-Core Version:    0.6.2
 */