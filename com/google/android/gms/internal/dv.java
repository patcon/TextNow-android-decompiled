package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class dv
  implements Parcelable.Creator<du>
{
  static void a(du paramdu, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramdu.versionCode);
    b.a(paramParcel, 2, paramdu.oA, false);
    b.a(paramParcel, 3, paramdu.qe, false);
    b.a(paramParcel, 4, paramdu.nt, false);
    b.c(paramParcel, 5, paramdu.errorCode);
    b.a(paramParcel, 6, paramdu.nu, false);
    b.a(paramParcel, 7, paramdu.qf);
    b.a(paramParcel, 8, paramdu.qg);
    b.a(paramParcel, 9, paramdu.qh);
    b.a(paramParcel, 10, paramdu.qi, false);
    b.a(paramParcel, 11, paramdu.nx);
    b.c(paramParcel, 12, paramdu.orientation);
    b.a(paramParcel, 13, paramdu.qj, false);
    b.a(paramParcel, 14, paramdu.qk);
    b.a(paramParcel, 15, paramdu.ql, false);
    b.a(paramParcel, 19, paramdu.qn, false);
    b.a(paramParcel, 18, paramdu.qm);
    b.a(paramParcel, 21, paramdu.qo, false);
    b.G(paramParcel, i);
  }

  public du i(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList1 = null;
    int k = 0;
    ArrayList localArrayList2 = null;
    long l1 = 0L;
    boolean bool1 = false;
    long l2 = 0L;
    ArrayList localArrayList3 = null;
    long l3 = 0L;
    int m = 0;
    String str3 = null;
    long l4 = 0L;
    String str4 = null;
    boolean bool2 = false;
    String str5 = null;
    String str6 = null;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.A(paramParcel);
      switch (a.ar(n))
      {
      case 16:
      case 17:
      case 20:
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        j = a.g(paramParcel, n);
        break;
      case 2:
        str1 = a.o(paramParcel, n);
        break;
      case 3:
        str2 = a.o(paramParcel, n);
        break;
      case 4:
        localArrayList1 = a.B(paramParcel, n);
        break;
      case 5:
        k = a.g(paramParcel, n);
        break;
      case 6:
        localArrayList2 = a.B(paramParcel, n);
        break;
      case 7:
        l1 = a.i(paramParcel, n);
        break;
      case 8:
        bool1 = a.c(paramParcel, n);
        break;
      case 9:
        l2 = a.i(paramParcel, n);
        break;
      case 10:
        localArrayList3 = a.B(paramParcel, n);
        break;
      case 11:
        l3 = a.i(paramParcel, n);
        break;
      case 12:
        m = a.g(paramParcel, n);
        break;
      case 13:
        str3 = a.o(paramParcel, n);
        break;
      case 14:
        l4 = a.i(paramParcel, n);
        break;
      case 15:
        str4 = a.o(paramParcel, n);
        break;
      case 19:
        str5 = a.o(paramParcel, n);
        break;
      case 18:
        bool2 = a.c(paramParcel, n);
        break;
      case 21:
        str6 = a.o(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new du(j, str1, str2, localArrayList1, k, localArrayList2, l1, bool1, l2, localArrayList3, l3, m, str3, l4, str4, bool2, str5, str6);
  }

  public du[] n(int paramInt)
  {
    return new du[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dv
 * JD-Core Version:    0.6.2
 */