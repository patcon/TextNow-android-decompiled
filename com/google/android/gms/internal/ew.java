package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ew
  implements Parcelable.Creator<ev>
{
  static void a(ev paramev, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramev.versionCode);
    b.a(paramParcel, 2, paramev.sw, false);
    b.c(paramParcel, 3, paramev.sx);
    b.c(paramParcel, 4, paramev.sy);
    b.a(paramParcel, 5, paramev.sz);
    b.G(paramParcel, i);
  }

  public ev j(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.B(paramParcel);
    String str = null;
    int j = 0;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < i)
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
      case 2:
        str = a.o(paramParcel, n);
        break;
      case 3:
        k = a.g(paramParcel, n);
        break;
      case 4:
        j = a.g(paramParcel, n);
        break;
      case 5:
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ev(m, str, k, j, bool);
  }

  public ev[] q(int paramInt)
  {
    return new ev[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ew
 * JD-Core Version:    0.6.2
 */