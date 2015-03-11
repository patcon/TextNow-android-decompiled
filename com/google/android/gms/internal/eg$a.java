package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class eg$a extends Binder
  implements eg
{
  public eg$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
  }

  public static eg s(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
    if ((localIInterface != null) && ((localIInterface instanceof eg)))
      return (eg)localIInterface;
    return new eg.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      String str = getProductId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
      recordResolution(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
    recordPlayBillingResolution(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg.a
 * JD-Core Version:    0.6.2
 */