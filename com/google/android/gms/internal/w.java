package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class w
  implements Parcelable.Creator<v>
{
  static void a(v paramv, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramv.versionCode);
    b.a(paramParcel, 2, paramv.lb);
    b.a(paramParcel, 3, paramv.ld);
    b.G(paramParcel, i);
  }

  public v a(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = a.B(paramParcel);
    boolean bool2 = false;
    int j = 0;
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
        bool2 = a.c(paramParcel, k);
        break;
      case 3:
        bool1 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new v(j, bool2, bool1);
  }

  public v[] b(int paramInt)
  {
    return new v[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.w
 * JD-Core Version:    0.6.2
 */