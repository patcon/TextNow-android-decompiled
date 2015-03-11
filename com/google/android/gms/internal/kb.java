package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class kb
  implements Parcelable.Creator<ka>
{
  static void a(ka paramka, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.a(paramParcel, 1, paramka.YV, false);
    b.c(paramParcel, 1000, paramka.versionCode);
    b.a(paramParcel, 2, paramka.YW, false);
    b.G(paramParcel, i);
  }

  public ka bB(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    int j = 0;
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
        str2 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ka(j, str2, str1);
  }

  public ka[] cW(int paramInt)
  {
    return new ka[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kb
 * JD-Core Version:    0.6.2
 */