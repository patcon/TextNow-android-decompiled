package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class gk
  implements Parcelable.Creator<gj>
{
  static void a(gj paramgj, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramgj.getVersionCode());
    b.a(paramParcel, 2, paramgj.eh());
    b.a(paramParcel, 3, paramgj.en());
    b.c(paramParcel, 4, paramgj.eo());
    b.G(paramParcel, i);
  }

  public gj[] Y(int paramInt)
  {
    return new gj[paramInt];
  }

  public gj v(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    double d = 0.0D;
    boolean bool = false;
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
        k = a.g(paramParcel, m);
        break;
      case 2:
        d = a.m(paramParcel, m);
        break;
      case 3:
        bool = a.c(paramParcel, m);
        break;
      case 4:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new gj(k, d, bool, i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gk
 * JD-Core Version:    0.6.2
 */