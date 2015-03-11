package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d.a;

public abstract class es$a extends Binder
  implements es
{
  public es$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
  }

  public static es z(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
    if ((localIInterface != null) && ((localIInterface instanceof es)))
      return (es)localIInterface;
    return new es.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
      String str2 = cu();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
      String str1 = cv();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
      c(d.a.am(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
      ar();
      paramParcel2.writeNoException();
      return true;
    case 5:
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.rawhtmlad.client.IRawHtmlAd");
    as();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.es.a
 * JD-Core Version:    0.6.2
 */