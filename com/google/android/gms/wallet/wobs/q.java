package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q
  implements Parcelable.Creator<p>
{
  static void a(p paramp, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramp.getVersionCode());
    b.a(paramParcel, 2, paramp.akZ, false);
    b.a(paramParcel, 3, paramp.qe, false);
    b.a(paramParcel, 4, paramp.ald, paramInt, false);
    b.a(paramParcel, 5, paramp.ale, paramInt, false);
    b.a(paramParcel, 6, paramp.alf, paramInt, false);
    b.G(paramParcel, i);
  }

  public p cr(Parcel paramParcel)
  {
    n localn1 = null;
    int i = a.B(paramParcel);
    int j = 0;
    n localn2 = null;
    l locall = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
        break;
      case 4:
        locall = (l)a.a(paramParcel, k, l.CREATOR);
        break;
      case 5:
        localn2 = (n)a.a(paramParcel, k, n.CREATOR);
        break;
      case 6:
        localn1 = (n)a.a(paramParcel, k, n.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new p(j, str2, str1, locall, localn2, localn1);
  }

  public p[] dZ(int paramInt)
  {
    return new p[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.q
 * JD-Core Version:    0.6.2
 */