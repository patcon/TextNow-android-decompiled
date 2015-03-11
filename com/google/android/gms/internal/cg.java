package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class cg
  implements Parcelable.Creator<ch>
{
  static void a(ch paramch, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramch.versionCode);
    b.a(paramParcel, 2, paramch.ov, paramInt, false);
    b.a(paramParcel, 3, paramch.aU(), false);
    b.a(paramParcel, 4, paramch.aV(), false);
    b.a(paramParcel, 5, paramch.aW(), false);
    b.a(paramParcel, 6, paramch.aX(), false);
    b.a(paramParcel, 7, paramch.oA, false);
    b.a(paramParcel, 8, paramch.oB);
    b.a(paramParcel, 9, paramch.oC, false);
    b.a(paramParcel, 10, paramch.aZ(), false);
    b.c(paramParcel, 11, paramch.orientation);
    b.c(paramParcel, 12, paramch.oE);
    b.a(paramParcel, 13, paramch.ob, false);
    b.a(paramParcel, 14, paramch.kQ, paramInt, false);
    b.a(paramParcel, 15, paramch.aY(), false);
    b.a(paramParcel, 17, paramch.oH, paramInt, false);
    b.a(paramParcel, 16, paramch.oG, false);
    b.G(paramParcel, i);
  }

  public ch f(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    ce localce = null;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    IBinder localIBinder4 = null;
    String str1 = null;
    boolean bool = false;
    String str2 = null;
    IBinder localIBinder5 = null;
    int k = 0;
    int m = 0;
    String str3 = null;
    ev localev = null;
    IBinder localIBinder6 = null;
    String str4 = null;
    v localv = null;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.A(paramParcel);
      switch (a.ar(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        j = a.g(paramParcel, n);
        break;
      case 2:
        localce = (ce)a.a(paramParcel, n, ce.CREATOR);
        break;
      case 3:
        localIBinder1 = a.p(paramParcel, n);
        break;
      case 4:
        localIBinder2 = a.p(paramParcel, n);
        break;
      case 5:
        localIBinder3 = a.p(paramParcel, n);
        break;
      case 6:
        localIBinder4 = a.p(paramParcel, n);
        break;
      case 7:
        str1 = a.o(paramParcel, n);
        break;
      case 8:
        bool = a.c(paramParcel, n);
        break;
      case 9:
        str2 = a.o(paramParcel, n);
        break;
      case 10:
        localIBinder5 = a.p(paramParcel, n);
        break;
      case 11:
        k = a.g(paramParcel, n);
        break;
      case 12:
        m = a.g(paramParcel, n);
        break;
      case 13:
        str3 = a.o(paramParcel, n);
        break;
      case 14:
        localev = (ev)a.a(paramParcel, n, ev.CREATOR);
        break;
      case 15:
        localIBinder6 = a.p(paramParcel, n);
        break;
      case 17:
        localv = (v)a.a(paramParcel, n, v.CREATOR);
        break;
      case 16:
        str4 = a.o(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ch(j, localce, localIBinder1, localIBinder2, localIBinder3, localIBinder4, str1, bool, str2, localIBinder5, k, m, str3, localev, localIBinder6, str4, localv);
  }

  public ch[] j(int paramInt)
  {
    return new ch[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cg
 * JD-Core Version:    0.6.2
 */