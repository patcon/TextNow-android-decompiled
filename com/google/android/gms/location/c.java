package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class c
  implements Parcelable.Creator<b>
{
  static void a(b paramb, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.C(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramb.Vq);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramb.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 2, paramb.Vr);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramb.Vs);
    com.google.android.gms.common.internal.safeparcel.b.G(paramParcel, i);
  }

  public b bs(Parcel paramParcel)
  {
    int i = 1;
    int j = a.B(paramParcel);
    int k = 0;
    long l = 0L;
    int m = i;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.A(paramParcel);
      switch (a.ar(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        break;
      case 1000:
        k = a.g(paramParcel, n);
        break;
      case 2:
        i = a.g(paramParcel, n);
        break;
      case 3:
        l = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new b(k, m, i, l);
  }

  public b[] cL(int paramInt)
  {
    return new b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.c
 * JD-Core Version:    0.6.2
 */