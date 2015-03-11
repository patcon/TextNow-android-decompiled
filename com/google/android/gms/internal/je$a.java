package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequestCreator;
import com.google.android.gms.location.a.a;
import com.google.android.gms.location.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBoundsCreator;
import com.google.android.gms.maps.model.LatLngCreator;
import java.util.ArrayList;

public abstract class je$a extends Binder
  implements je
{
  public static je as(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    if ((localIInterface != null) && ((localIInterface instanceof je)))
      return (je)localIInterface;
    return new je.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ArrayList localArrayList3 = paramParcel1.createTypedArrayList(jh.CREATOR);
      if (paramParcel1.readInt() != 0);
      for (PendingIntent localPendingIntent10 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent10 = null)
      {
        a(localArrayList3, localPendingIntent10, jd.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (PendingIntent localPendingIntent9 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent9 = null)
      {
        a(localPendingIntent9, jd.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(paramParcel1.createStringArray(), jd.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(jd.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      long l = paramParcel1.readLong();
      boolean bool2;
      if (paramParcel1.readInt() != 0)
      {
        bool2 = true;
        if (paramParcel1.readInt() == 0)
          break label540;
      }
      for (PendingIntent localPendingIntent8 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent8 = null)
      {
        a(l, bool2, localPendingIntent8);
        paramParcel2.writeNoException();
        return true;
        bool2 = false;
        break;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (PendingIntent localPendingIntent7 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent7 = null)
      {
        removeActivityUpdates(localPendingIntent7);
        paramParcel2.writeNoException();
        return true;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation4 = iW();
      paramParcel2.writeNoException();
      if (localLocation4 != null)
      {
        paramParcel2.writeInt(1);
        localLocation4.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i7 = paramParcel1.readInt();
      LocationRequest localLocationRequest3 = null;
      if (i7 != 0)
        localLocationRequest3 = LocationRequest.CREATOR.createFromParcel(paramParcel1);
      a(localLocationRequest3, a.a.aq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LocationRequest localLocationRequest2;
      if (paramParcel1.readInt() != 0)
      {
        localLocationRequest2 = LocationRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label744;
      }
      for (PendingIntent localPendingIntent6 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent6 = null)
      {
        a(localLocationRequest2, localPendingIntent6);
        paramParcel2.writeNoException();
        return true;
        localLocationRequest2 = null;
        break;
      }
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(a.a.aq(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (PendingIntent localPendingIntent5 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent5 = null)
      {
        a(localPendingIntent5);
        paramParcel2.writeNoException();
        return true;
      }
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i6 = paramParcel1.readInt();
      boolean bool1 = false;
      if (i6 != 0)
        bool1 = true;
      setMockMode(bool1);
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (Location localLocation3 = (Location)Location.CREATOR.createFromParcel(paramParcel1); ; localLocation3 = null)
      {
        setMockLocation(localLocation3);
        paramParcel2.writeNoException();
        return true;
      }
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLngBounds localLatLngBounds3;
      int i5;
      jm localjm5;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds3 = LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        i5 = paramParcel1.readInt();
        if (paramParcel1.readInt() == 0)
          break label989;
        localjm5 = jm.CREATOR.bv(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label995;
      }
      for (ka localka14 = ka.CREATOR.bB(paramParcel1); ; localka14 = null)
      {
        a(localLatLngBounds3, i5, localjm5, localka14, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds3 = null;
        break;
        localjm5 = null;
        break label942;
      }
    case 47:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLngBounds localLatLngBounds2;
      int i3;
      String str5;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds2 = LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        i3 = paramParcel1.readInt();
        str5 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0)
          break label1107;
      }
      for (jm localjm4 = jm.CREATOR.bv(paramParcel1); ; localjm4 = null)
      {
        int i4 = paramParcel1.readInt();
        ka localka13 = null;
        if (i4 != 0)
          localka13 = ka.CREATOR.bB(paramParcel1);
        a(localLatLngBounds2, i3, str5, localjm4, localka13, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds2 = null;
        break;
      }
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str4 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      ka localka12 = null;
      if (i2 != 0)
        localka12 = ka.CREATOR.bB(paramParcel1);
      a(str4, localka12, jy.a.au(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LatLng localLatLng;
      if (paramParcel1.readInt() != 0)
      {
        localLatLng = LatLng.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1259;
      }
      for (jm localjm3 = jm.CREATOR.bv(paramParcel1); ; localjm3 = null)
      {
        int i1 = paramParcel1.readInt();
        ka localka11 = null;
        if (i1 != 0)
          localka11 = ka.CREATOR.bB(paramParcel1);
        a(localLatLng, localjm3, localka11, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLng = null;
        break;
      }
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (jm localjm2 = jm.CREATOR.bv(paramParcel1); ; localjm2 = null)
      {
        int n = paramParcel1.readInt();
        ka localka10 = null;
        if (n != 0)
          localka10 = ka.CREATOR.bB(paramParcel1);
        a(localjm2, localka10, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 42:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str3 = paramParcel1.readString();
      int m = paramParcel1.readInt();
      ka localka9 = null;
      if (m != 0)
        localka9 = ka.CREATOR.bB(paramParcel1);
      b(str3, localka9, jy.a.au(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 50:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str2 = paramParcel1.readString();
      ArrayList localArrayList1 = paramParcel1.createStringArrayList();
      ArrayList localArrayList2 = paramParcel1.createTypedArrayList(jw.CREATOR);
      if (paramParcel1.readInt() != 0);
      for (ka localka8 = ka.CREATOR.bB(paramParcel1); ; localka8 = null)
      {
        a(str2, localArrayList1, localArrayList2, localka8, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      jq localjq;
      ka localka7;
      if (paramParcel1.readInt() != 0)
      {
        localjq = jq.CREATOR.bx(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1548;
        localka7 = ka.CREATOR.bB(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1554;
      }
      for (PendingIntent localPendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent4 = null)
      {
        a(localjq, localka7, localPendingIntent4);
        paramParcel2.writeNoException();
        return true;
        localjq = null;
        break;
        localka7 = null;
        break label1505;
      }
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ka localka6;
      if (paramParcel1.readInt() != 0)
      {
        localka6 = ka.CREATOR.bB(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1623;
      }
      for (PendingIntent localPendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent3 = null)
      {
        a(localka6, localPendingIntent3);
        paramParcel2.writeNoException();
        return true;
        localka6 = null;
        break;
      }
    case 48:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      jk localjk;
      ka localka5;
      if (paramParcel1.readInt() != 0)
      {
        localjk = jk.CREATOR.bu(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1710;
        localka5 = ka.CREATOR.bB(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1716;
      }
      for (PendingIntent localPendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent2 = null)
      {
        a(localjk, localka5, localPendingIntent2);
        paramParcel2.writeNoException();
        return true;
        localjk = null;
        break;
        localka5 = null;
        break label1667;
      }
    case 49:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ka localka4;
      if (paramParcel1.readInt() != 0)
      {
        localka4 = ka.CREATOR.bB(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1785;
      }
      for (PendingIntent localPendingIntent1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent1 = null)
      {
        b(localka4, localPendingIntent1);
        paramParcel2.writeNoException();
        return true;
        localka4 = null;
        break;
      }
    case 45:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      String str1 = paramParcel1.readString();
      LatLngBounds localLatLngBounds1;
      jm localjm1;
      if (paramParcel1.readInt() != 0)
      {
        localLatLngBounds1 = LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1882;
        localjm1 = jm.CREATOR.bv(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label1888;
      }
      for (ka localka3 = ka.CREATOR.bB(paramParcel1); ; localka3 = null)
      {
        a(str1, localLatLngBounds1, localjm1, localka3, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localLatLngBounds1 = null;
        break;
        localjm1 = null;
        break label1835;
      }
    case 46:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (ju localju = (ju)ju.CREATOR.createFromParcel(paramParcel1); ; localju = null)
      {
        int k = paramParcel1.readInt();
        ka localka2 = null;
        if (k != 0)
          localka2 = ka.CREATOR.bB(paramParcel1);
        a(localju, localka2, jy.a.au(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int j = paramParcel1.readInt();
      LocationRequest localLocationRequest1 = null;
      if (j != 0)
        localLocationRequest1 = LocationRequest.CREATOR.createFromParcel(paramParcel1);
      a(localLocationRequest1, a.a.aq(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation2 = bo(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localLocation2 != null)
      {
        paramParcel2.writeInt(1);
        localLocation2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (jo localjo = jo.CREATOR.bw(paramParcel1); ; localjo = null)
      {
        int i = paramParcel1.readInt();
        ka localka1 = null;
        if (i != 0)
          localka1 = ka.CREATOR.bB(paramParcel1);
        a(localjo, localka1);
        return true;
      }
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0);
      for (Location localLocation1 = (Location)Location.CREATOR.createFromParcel(paramParcel1); ; localLocation1 = null)
      {
        a(localLocation1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 34:
      label540: label744: label1259: label1785: paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      label942: label989: label995: b localb = bp(paramParcel1.readString());
      label1107: label1505: paramParcel2.writeNoException();
      label1548: label1554: label1623: label1882: label1888: if (localb != null)
      {
        paramParcel2.writeInt(1);
        localb.writeToParcel(paramParcel2, 1);
        return true;
      }
      label1667: label1710: label1716: paramParcel2.writeInt(0);
      label1835: return true;
    case 51:
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    IBinder localIBinder = iX();
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(localIBinder);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.je.a
 * JD-Core Version:    0.6.2
 */