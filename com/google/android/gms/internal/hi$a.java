package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class hi$a extends Binder
  implements hi
{
  public static hi L(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    if ((localIInterface != null) && ((localIInterface instanceof hi)))
      return (hi)localIInterface;
    return new hi.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh21 = hh.a.K(paramParcel1.readStrongBinder());
      int i32 = paramParcel1.readInt();
      String str26 = paramParcel1.readString();
      String str27 = paramParcel1.readString();
      String[] arrayOfString4 = paramParcel1.createStringArray();
      String str28 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle21 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle21 = null)
      {
        a(localhh21, i32, str26, str27, arrayOfString4, str28, localBundle21);
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh20 = hh.a.K(paramParcel1.readStrongBinder());
      int i30 = paramParcel1.readInt();
      String str25 = paramParcel1.readString();
      int i31 = paramParcel1.readInt();
      Bundle localBundle20 = null;
      if (i31 != 0)
        localBundle20 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(localhh20, i30, str25, localBundle20);
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh19 = hh.a.K(paramParcel1.readStrongBinder());
      int i28 = paramParcel1.readInt();
      String str24 = paramParcel1.readString();
      int i29 = paramParcel1.readInt();
      Bundle localBundle19 = null;
      if (i29 != 0)
        localBundle19 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      b(localhh19, i28, str24, localBundle19);
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh18 = hh.a.K(paramParcel1.readStrongBinder());
      int i26 = paramParcel1.readInt();
      String str23 = paramParcel1.readString();
      int i27 = paramParcel1.readInt();
      Bundle localBundle18 = null;
      if (i27 != 0)
        localBundle18 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      c(localhh18, i26, str23, localBundle18);
      paramParcel2.writeNoException();
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh17 = hh.a.K(paramParcel1.readStrongBinder());
      int i24 = paramParcel1.readInt();
      String str22 = paramParcel1.readString();
      int i25 = paramParcel1.readInt();
      Bundle localBundle17 = null;
      if (i25 != 0)
        localBundle17 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      d(localhh17, i24, str22, localBundle17);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh16 = hh.a.K(paramParcel1.readStrongBinder());
      int i22 = paramParcel1.readInt();
      String str21 = paramParcel1.readString();
      int i23 = paramParcel1.readInt();
      Bundle localBundle16 = null;
      if (i23 != 0)
        localBundle16 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      e(localhh16, i22, str21, localBundle16);
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh15 = hh.a.K(paramParcel1.readStrongBinder());
      int i21 = paramParcel1.readInt();
      String str17 = paramParcel1.readString();
      String str18 = paramParcel1.readString();
      String[] arrayOfString3 = paramParcel1.createStringArray();
      String str19 = paramParcel1.readString();
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      String str20 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle15 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle15 = null)
      {
        a(localhh15, i21, str17, str18, arrayOfString3, str19, localIBinder2, str20, localBundle15);
        paramParcel2.writeNoException();
        return true;
      }
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh14 = hh.a.K(paramParcel1.readStrongBinder());
      int i19 = paramParcel1.readInt();
      String str16 = paramParcel1.readString();
      int i20 = paramParcel1.readInt();
      Bundle localBundle14 = null;
      if (i20 != 0)
        localBundle14 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      f(localhh14, i19, str16, localBundle14);
      paramParcel2.writeNoException();
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh13 = hh.a.K(paramParcel1.readStrongBinder());
      int i17 = paramParcel1.readInt();
      String str15 = paramParcel1.readString();
      int i18 = paramParcel1.readInt();
      Bundle localBundle13 = null;
      if (i18 != 0)
        localBundle13 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      g(localhh13, i17, str15, localBundle13);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh12 = hh.a.K(paramParcel1.readStrongBinder());
      int i15 = paramParcel1.readInt();
      String str14 = paramParcel1.readString();
      int i16 = paramParcel1.readInt();
      Bundle localBundle12 = null;
      if (i16 != 0)
        localBundle12 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      h(localhh12, i15, str14, localBundle12);
      paramParcel2.writeNoException();
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh11 = hh.a.K(paramParcel1.readStrongBinder());
      int i13 = paramParcel1.readInt();
      String str13 = paramParcel1.readString();
      int i14 = paramParcel1.readInt();
      Bundle localBundle11 = null;
      if (i14 != 0)
        localBundle11 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      i(localhh11, i13, str13, localBundle11);
      paramParcel2.writeNoException();
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh10 = hh.a.K(paramParcel1.readStrongBinder());
      int i11 = paramParcel1.readInt();
      String str12 = paramParcel1.readString();
      int i12 = paramParcel1.readInt();
      Bundle localBundle10 = null;
      if (i12 != 0)
        localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      j(localhh10, i11, str12, localBundle10);
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh9 = hh.a.K(paramParcel1.readStrongBinder());
      int i9 = paramParcel1.readInt();
      String str11 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      Bundle localBundle9 = null;
      if (i10 != 0)
        localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      k(localhh9, i9, str11, localBundle9);
      paramParcel2.writeNoException();
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh8 = hh.a.K(paramParcel1.readStrongBinder());
      int i7 = paramParcel1.readInt();
      String str10 = paramParcel1.readString();
      int i8 = paramParcel1.readInt();
      Bundle localBundle8 = null;
      if (i8 != 0)
        localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      l(localhh8, i7, str10, localBundle8);
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh7 = hh.a.K(paramParcel1.readStrongBinder());
      int i5 = paramParcel1.readInt();
      String str9 = paramParcel1.readString();
      int i6 = paramParcel1.readInt();
      Bundle localBundle7 = null;
      if (i6 != 0)
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      m(localhh7, i5, str9, localBundle7);
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh6 = hh.a.K(paramParcel1.readStrongBinder());
      int i4 = paramParcel1.readInt();
      String str8 = paramParcel1.readString();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle6 = null)
      {
        a(localhh6, i4, str8, localIBinder1, localBundle6);
        paramParcel2.writeNoException();
        return true;
      }
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh5 = hh.a.K(paramParcel1.readStrongBinder());
      int i3 = paramParcel1.readInt();
      String str6 = paramParcel1.readString();
      String[] arrayOfString2 = paramParcel1.createStringArray();
      String str7 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
      {
        a(localhh5, i3, str6, arrayOfString2, str7, localBundle5);
        paramParcel2.writeNoException();
        return true;
      }
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      b(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      c(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh4 = hh.a.K(paramParcel1.readStrongBinder());
      int i1 = paramParcel1.readInt();
      String str5 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      Bundle localBundle4 = null;
      if (i2 != 0)
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      n(localhh4, i1, str5, localBundle4);
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      d(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh3 = hh.a.K(paramParcel1.readStrongBinder());
      int m = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (n != 0)
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      o(localhh3, m, str4, localBundle3);
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      e(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 27:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh2 = hh.a.K(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (k != 0)
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      p(localhh2, j, str3, localBundle2);
      paramParcel2.writeNoException();
      return true;
    case 28:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      b(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 30:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      hh localhh1 = hh.a.K(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      String[] arrayOfString1 = paramParcel1.createStringArray();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
      {
        a(localhh1, i, str1, str2, arrayOfString1, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    case 31:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      f(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 32:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      g(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 33:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArray());
      paramParcel2.writeNoException();
      return true;
    case 34:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      a(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 35:
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      h(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 36:
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
    i(hh.a.K(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hi.a
 * JD-Core Version:    0.6.2
 */