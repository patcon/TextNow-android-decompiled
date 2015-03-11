package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class am
  implements Parcelable.Creator<al>
{
  static void a(al paramal, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramal.versionCode);
    b.a(paramParcel, 2, paramal.me, false);
    b.c(paramParcel, 3, paramal.height);
    b.c(paramParcel, 4, paramal.heightPixels);
    b.a(paramParcel, 5, paramal.mf);
    b.c(paramParcel, 6, paramal.width);
    b.c(paramParcel, 7, paramal.widthPixels);
    b.a(paramParcel, 8, paramal.mg, paramInt, false);
    b.G(paramParcel, i);
  }

  public al c(Parcel paramParcel)
  {
    al[] arrayOfal = null;
    int i = 0;
    int j = a.B(paramParcel);
    int k = 0;
    boolean bool = false;
    int m = 0;
    int n = 0;
    String str = null;
    int i1 = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i2 = a.A(paramParcel);
      switch (a.ar(i2))
      {
      default:
        a.b(paramParcel, i2);
        break;
      case 1:
        i1 = a.g(paramParcel, i2);
        break;
      case 2:
        str = a.o(paramParcel, i2);
        break;
      case 3:
        n = a.g(paramParcel, i2);
        break;
      case 4:
        m = a.g(paramParcel, i2);
        break;
      case 5:
        bool = a.c(paramParcel, i2);
        break;
      case 6:
        k = a.g(paramParcel, i2);
        break;
      case 7:
        i = a.g(paramParcel, i2);
        break;
      case 8:
        arrayOfal = (al[])a.b(paramParcel, i2, al.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new al(i1, str, n, m, bool, k, i, arrayOfal);
  }

  public al[] d(int paramInt)
  {
    return new al[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.am
 * JD-Core Version:    0.6.2
 */