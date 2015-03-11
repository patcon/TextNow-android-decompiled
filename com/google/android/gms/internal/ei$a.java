package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ei$a extends Binder
  implements ei
{
  public ei$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
  }

  public static ei u(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
    if ((localIInterface != null) && ((localIInterface instanceof ei)))
      return (ei)localIInterface;
    return new ei.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
      onCreate();
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
      onDestroy();
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
    int i = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; localIntent = null)
    {
      onActivityResult(i, j, localIntent);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ei.a
 * JD-Core Version:    0.6.2
 */