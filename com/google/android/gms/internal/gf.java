package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class gf
  implements Parcelable.Creator<ge>
{
  static void a(ge paramge, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramge.getVersionCode());
    b.a(paramParcel, 2, paramge.ec(), false);
    b.G(paramParcel, i);
  }

  public ge[] S(int paramInt)
  {
    return new ge[paramInt];
  }

  public ge u(Parcel paramParcel)
  {
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
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ge(j, str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gf
 * JD-Core Version:    0.6.2
 */