package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ia
  implements Parcelable.Creator<ib.b>
{
  static void a(ib.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramb.versionCode);
    b.a(paramParcel, 2, paramb.eM, false);
    b.a(paramParcel, 3, paramb.Hp, paramInt, false);
    b.G(paramParcel, i);
  }

  public ib.b I(Parcel paramParcel)
  {
    hy.a locala = null;
    int i = a.B(paramParcel);
    int j = 0;
    String str = null;
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
        str = a.o(paramParcel, k);
        break;
      case 3:
        locala = (hy.a)a.a(paramParcel, k, hy.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ib.b(j, str, locala);
  }

  public ib.b[] ax(int paramInt)
  {
    return new ib.b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ia
 * JD-Core Version:    0.6.2
 */