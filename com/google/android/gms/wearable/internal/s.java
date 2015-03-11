package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wearable.c;

public class s
  implements Parcelable.Creator<r>
{
  static void a(r paramr, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramr.versionCode);
    b.c(paramParcel, 2, paramr.statusCode);
    b.a(paramParcel, 3, paramr.avx, paramInt, false);
    b.H(paramParcel, i);
  }

  public r dW(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    c localc = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        break;
      case 2:
        i = a.g(paramParcel, m);
        break;
      case 3:
        localc = (c)a.a(paramParcel, m, c.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new r(k, i, localc);
  }

  public r[] fZ(int paramInt)
  {
    return new r[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.s
 * JD-Core Version:    0.6.2
 */