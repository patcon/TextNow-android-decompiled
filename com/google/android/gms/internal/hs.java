package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class hs
  implements Parcelable.Creator<hr>
{
  static void a(hr paramhr, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramhr.xM);
    b.a(paramParcel, 2, paramhr.GT, false);
    b.c(paramParcel, 3, paramhr.GU);
    b.G(paramParcel, i);
  }

  public hr D(Parcel paramParcel)
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
    return new hr(k, str, i);
  }

  public hr[] as(int paramInt)
  {
    return new hr[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hs
 * JD-Core Version:    0.6.2
 */