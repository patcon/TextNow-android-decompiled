package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class kd$a extends Binder
  implements kd
{
  public kd$a()
  {
    attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
  }

  public static kd bh(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof kd)))
      return (kd)localIInterface;
    return new kd.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
    int i = paramParcel1.readInt();
    Bundle localBundle;
    int j;
    if (paramParcel1.readInt() != 0)
    {
      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      j = paramParcel1.readInt();
      if (paramParcel1.readInt() == 0)
        break label130;
    }
    label130: for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; localIntent = null)
    {
      a(i, localBundle, j, localIntent);
      paramParcel2.writeNoException();
      return true;
      localBundle = null;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kd.a
 * JD-Core Version:    0.6.2
 */