package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class d$a extends Binder
  implements d
{
  public d$a()
  {
    attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
  }

  public static d am(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
    if ((localIInterface != null) && ((localIInterface instanceof d)))
      return (d)localIInterface;
    return new d.a.a(paramIBinder);
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
    }
    paramParcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.d.a
 * JD-Core Version:    0.6.2
 */