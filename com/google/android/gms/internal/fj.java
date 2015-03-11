package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fj
  implements Parcelable.Creator<fi>
{
  static void a(fi paramfi, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramfi.xQ, false);
    b.c(paramParcel, 1000, paramfi.xM);
    b.a(paramParcel, 2, paramfi.xR, false);
    b.a(paramParcel, 3, paramfi.xS, false);
    b.G(paramParcel, i);
  }

  public fi[] E(int paramInt)
  {
    return new fi[paramInt];
  }

  public fi m(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    String str2 = null;
    int j = 0;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str2 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str3 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new fi(j, str2, str3, str1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fj
 * JD-Core Version:    0.6.2
 */