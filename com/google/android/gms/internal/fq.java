package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fq
  implements Parcelable.Creator<fp>
{
  static void a(fp paramfp, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramfp.name, false);
    b.c(paramParcel, 1000, paramfp.xM);
    b.a(paramParcel, 2, paramfp.yb, false);
    b.a(paramParcel, 3, paramfp.yc);
    b.c(paramParcel, 4, paramfp.weight);
    b.a(paramParcel, 5, paramfp.yd);
    b.a(paramParcel, 6, paramfp.ye, false);
    b.a(paramParcel, 7, paramfp.yf, paramInt, false);
    b.a(paramParcel, 8, paramfp.yg, false);
    b.a(paramParcel, 11, paramfp.yh, false);
    b.G(paramParcel, i);
  }

  public fp[] J(int paramInt)
  {
    return new fp[paramInt];
  }

  public fp p(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = a.B(paramParcel);
    int j = 1;
    int[] arrayOfInt = null;
    fm[] arrayOffm = null;
    String str2 = null;
    boolean bool2 = false;
    String str3 = null;
    String str4 = null;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        str4 = a.o(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        str3 = a.o(paramParcel, m);
        break;
      case 3:
        bool2 = a.c(paramParcel, m);
        break;
      case 4:
        j = a.g(paramParcel, m);
        break;
      case 5:
        bool1 = a.c(paramParcel, m);
        break;
      case 6:
        str2 = a.o(paramParcel, m);
        break;
      case 7:
        arrayOffm = (fm[])a.b(paramParcel, m, fm.CREATOR);
        break;
      case 8:
        arrayOfInt = a.u(paramParcel, m);
        break;
      case 11:
        str1 = a.o(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new fp(k, str4, str3, bool2, j, bool1, str2, arrayOffm, arrayOfInt, str1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fq
 * JD-Core Version:    0.6.2
 */