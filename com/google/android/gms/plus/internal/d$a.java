package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.if;

public abstract class d$a extends Binder
  implements d
{
  public static d bm(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
    if ((localIInterface != null) && ((localIInterface instanceof d)))
      return (d)localIInterface;
    return new d.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      if (paramParcel1.readInt() != 0);
      for (ie localie2 = ie.CREATOR.L(paramParcel1); ; localie2 = null)
      {
        a(localie2);
        paramParcel2.writeNoException();
        return true;
      }
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      String str5 = getAccountName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      clearDefaultAccount();
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(b.a.bk(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b localb3 = b.a.bk(paramParcel1.readStrongBinder());
      Uri localUri2;
      if (paramParcel1.readInt() != 0)
      {
        localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label473;
      }
      for (Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle = null)
      {
        a(localb3, localUri2, localBundle);
        paramParcel2.writeNoException();
        return true;
        localUri2 = null;
        break;
      }
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b localb2 = b.a.bk(paramParcel1.readStrongBinder());
      int m = paramParcel1.readInt();
      String str4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Uri localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1); ; localUri1 = null)
      {
        a(localb2, m, str4, localUri1, paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      hg localhg = a(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder = null;
      if (localhg != null)
        localIBinder = localhg.asBinder();
      paramParcel2.writeStrongBinder(localIBinder);
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      removeMoment(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      c(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b(b.a.bk(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 34:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      a(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 40:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      d(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 41:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      String str3 = jU();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      return true;
    case 42:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      boolean bool = jV();
      paramParcel2.writeNoException();
      if (bool);
      for (int k = 1; ; k = 0)
      {
        paramParcel2.writeInt(k);
        return true;
      }
    case 43:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      String str2 = jW();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      return true;
    case 44:
      paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      e(b.a.bk(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 45:
      label473: paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
      b localb1 = b.a.bk(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      ie localie1 = null;
      if (j != 0)
        localie1 = ie.CREATOR.L(paramParcel1);
      a(localb1, localie1);
      paramParcel2.writeNoException();
      return true;
    case 46:
    }
    paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
    String str1 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (hr localhr1 = hr.CREATOR.D(paramParcel1); ; localhr1 = null)
    {
      int i = paramParcel1.readInt();
      hr localhr2 = null;
      if (i != 0)
        localhr2 = hr.CREATOR.D(paramParcel1);
      a(str1, localhr1, localhr2);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.d.a
 * JD-Core Version:    0.6.2
 */