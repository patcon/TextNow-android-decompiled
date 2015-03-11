package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ds$a extends Binder
  implements ds
{
  public ds$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }

  public static ds p(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    if ((localIInterface != null) && ((localIInterface instanceof ds)))
      return (ds)localIInterface;
    return new ds.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      int j = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (j != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      onCreate(localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onRestart();
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onStart();
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onResume();
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onPause();
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      int i = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (i != 0)
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      onSaveInstanceState(localBundle1);
      paramParcel2.writeNoException();
      if (localBundle1 != null)
      {
        paramParcel2.writeInt(1);
        localBundle1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onStop();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      onDestroy();
      paramParcel2.writeNoException();
      return true;
    case 9:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    U();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ds.a
 * JD-Core Version:    0.6.2
 */