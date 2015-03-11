package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jp
  implements Parcelable.Creator<jo>
{
  static void a(jo paramjo, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramjo.xM);
    b.a(paramParcel, 2, paramjo.jj(), false);
    b.a(paramParcel, 3, paramjo.getTag(), false);
    b.G(paramParcel, i);
  }

  public jo bw(Parcel paramParcel)
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
        j = a.g(paramParcel, k);
        break;
      case 2:
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new jo(j, str2, str1);
  }

  public jo[] cR(int paramInt)
  {
    return new jo[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jp
 * JD-Core Version:    0.6.2
 */