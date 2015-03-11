package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class at
  implements Parcelable.Creator<as>
{
  static void a(as paramas, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramas.versionCode);
    b.c(paramParcel, 2, paramas.statusCode);
    b.c(paramParcel, 3, paramas.avO);
    b.H(paramParcel, i);
  }

  public as eh(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        break;
      case 2:
        k = a.g(paramParcel, n);
        break;
      case 3:
        i = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new as(m, k, i);
  }

  public as[] gk(int paramInt)
  {
    return new as[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.at
 * JD-Core Version:    0.6.2
 */