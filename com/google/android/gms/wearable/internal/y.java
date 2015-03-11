package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y
  implements Parcelable.Creator<x>
{
  static void a(x paramx, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramx.versionCode);
    b.c(paramParcel, 2, paramx.statusCode);
    b.a(paramParcel, 3, paramx.avA, paramInt, false);
    b.H(paramParcel, i);
  }

  public x dZ(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    m localm = null;
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
        localm = (m)a.a(paramParcel, m, m.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new x(k, i, localm);
  }

  public x[] gc(int paramInt)
  {
    return new x[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.y
 * JD-Core Version:    0.6.2
 */