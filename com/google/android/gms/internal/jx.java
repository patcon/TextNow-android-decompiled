package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jx
  implements Parcelable.Creator<jw>
{
  static void a(jw paramjw, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramjw.qX, false);
    b.c(paramParcel, 1000, paramjw.xM);
    b.c(paramParcel, 2, paramjw.YS);
    b.G(paramParcel, i);
  }

  public jw bA(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        str = a.o(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new jw(k, str, i);
  }

  public jw[] cV(int paramInt)
  {
    return new jw[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jx
 * JD-Core Version:    0.6.2
 */