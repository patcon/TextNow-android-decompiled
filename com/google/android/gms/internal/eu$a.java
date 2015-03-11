package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class eu$a extends Binder
  implements eu
{
  public eu$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
  }

  public static eu B(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
    if ((localIInterface != null) && ((localIInterface instanceof eu)))
      return (eu)localIInterface;
    return new eu.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
      boolean bool = e(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (bool);
      for (int i = 1; ; i = 0)
      {
        paramParcel2.writeInt(i);
        return true;
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlPublisherInterstitialAdListener");
    a(es.a.z(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eu.a
 * JD-Core Version:    0.6.2
 */