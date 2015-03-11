package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class hx
  implements Parcelable.Creator<hv.a>
{
  static void a(hv.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, parama.versionCode);
    b.a(paramParcel, 2, parama.GZ, false);
    b.c(paramParcel, 3, parama.Ha);
    b.G(paramParcel, i);
  }

  public hv.a G(Parcel paramParcel)
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
        k = a.g(paramParcel, m);
        break;
      case 2:
        str = a.o(paramParcel, m);
        break;
      case 3:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new hv.a(k, str, i);
  }

  public hv.a[] av(int paramInt)
  {
    return new hv.a[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hx
 * JD-Core Version:    0.6.2
 */