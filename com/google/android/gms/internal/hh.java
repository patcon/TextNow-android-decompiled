package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class hh
  implements Parcelable.Creator<hg>
{
  static void a(hg paramhg, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramhg.BZ, false);
    b.c(paramParcel, 1000, paramhg.BR);
    b.a(paramParcel, 2, paramhg.Ca, false);
    b.a(paramParcel, 3, paramhg.Cb, false);
    b.H(paramParcel, i);
  }

  public hg[] J(int paramInt)
  {
    return new hg[paramInt];
  }

  public hg m(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    String str2 = null;
    int j = 0;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
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
    return new hg(j, str2, str3, str1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hh
 * JD-Core Version:    0.6.2
 */