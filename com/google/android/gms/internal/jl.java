package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jl
  implements Parcelable.Creator<jk>
{
  static void a(jk paramjk, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramjk.jc());
    b.c(paramParcel, 1000, paramjk.getVersionCode());
    b.c(paramParcel, 2, paramjk.je());
    b.a(paramParcel, 3, paramjk.jf(), paramInt, false);
    b.G(paramParcel, i);
  }

  public jk bu(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    int k = -1;
    jm localjm = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.A(paramParcel);
      switch (a.ar(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        i = a.g(paramParcel, n);
        break;
      case 1000:
        m = a.g(paramParcel, n);
        break;
      case 2:
        k = a.g(paramParcel, n);
        break;
      case 3:
        localjm = (jm)a.a(paramParcel, n, jm.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new jk(m, i, k, localjm);
  }

  public jk[] cP(int paramInt)
  {
    return new jk[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl
 * JD-Core Version:    0.6.2
 */