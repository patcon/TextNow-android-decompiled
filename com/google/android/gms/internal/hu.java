package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class hu
  implements Parcelable.Creator<ht>
{
  static void a(ht paramht, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramht.getVersionCode());
    b.a(paramParcel, 2, paramht.fB(), paramInt, false);
    b.G(paramParcel, i);
  }

  public ht E(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    hv localhv = null;
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
        localhv = (hv)a.a(paramParcel, k, hv.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ht(j, localhv);
  }

  public ht[] at(int paramInt)
  {
    return new ht[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hu
 * JD-Core Version:    0.6.2
 */