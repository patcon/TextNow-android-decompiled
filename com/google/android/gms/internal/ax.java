package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ax
  implements Parcelable.Creator<aw>
{
  static void a(aw paramaw, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramaw.versionCode);
    b.c(paramParcel, 2, paramaw.mD);
    b.c(paramParcel, 3, paramaw.backgroundColor);
    b.c(paramParcel, 4, paramaw.mE);
    b.c(paramParcel, 5, paramaw.mF);
    b.c(paramParcel, 6, paramaw.mG);
    b.c(paramParcel, 7, paramaw.mH);
    b.c(paramParcel, 8, paramaw.mI);
    b.c(paramParcel, 9, paramaw.mJ);
    b.a(paramParcel, 10, paramaw.mK, false);
    b.c(paramParcel, 11, paramaw.mL);
    b.a(paramParcel, 12, paramaw.mM, false);
    b.c(paramParcel, 13, paramaw.mN);
    b.c(paramParcel, 14, paramaw.mO);
    b.a(paramParcel, 15, paramaw.mP, false);
    b.G(paramParcel, i);
  }

  public aw d(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    String str1 = null;
    int i6 = 0;
    String str2 = null;
    int i7 = 0;
    int i8 = 0;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int i9 = a.A(paramParcel);
      switch (a.ar(i9))
      {
      default:
        a.b(paramParcel, i9);
        break;
      case 1:
        j = a.g(paramParcel, i9);
        break;
      case 2:
        k = a.g(paramParcel, i9);
        break;
      case 3:
        m = a.g(paramParcel, i9);
        break;
      case 4:
        n = a.g(paramParcel, i9);
        break;
      case 5:
        i1 = a.g(paramParcel, i9);
        break;
      case 6:
        i2 = a.g(paramParcel, i9);
        break;
      case 7:
        i3 = a.g(paramParcel, i9);
        break;
      case 8:
        i4 = a.g(paramParcel, i9);
        break;
      case 9:
        i5 = a.g(paramParcel, i9);
        break;
      case 10:
        str1 = a.o(paramParcel, i9);
        break;
      case 11:
        i6 = a.g(paramParcel, i9);
        break;
      case 12:
        str2 = a.o(paramParcel, i9);
        break;
      case 13:
        i7 = a.g(paramParcel, i9);
        break;
      case 14:
        i8 = a.g(paramParcel, i9);
        break;
      case 15:
        str3 = a.o(paramParcel, i9);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new aw(j, k, m, n, i1, i2, i3, i4, i5, str1, i6, str2, i7, i8, str3);
  }

  public aw[] f(int paramInt)
  {
    return new aw[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ax
 * JD-Core Version:    0.6.2
 */