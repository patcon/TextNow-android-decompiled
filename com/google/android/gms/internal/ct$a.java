package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ct$a extends Binder
  implements ct
{
  public ct$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }

  public static ct l(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    if ((localIInterface != null) && ((localIInterface instanceof ct)))
      return (ct)localIInterface;
    return new ct.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
      cu localcu = x(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localcu != null);
      for (IBinder localIBinder = localcu.asBinder(); ; localIBinder = null)
      {
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    boolean bool = y(paramParcel1.readString());
    paramParcel2.writeNoException();
    if (bool);
    for (int i = 1; ; i = 0)
    {
      paramParcel2.writeInt(i);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct.a
 * JD-Core Version:    0.6.2
 */