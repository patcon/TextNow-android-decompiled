package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ac
  implements Parcelable.Creator<ab>
{
  static void a(ab paramab, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramab.versionCode);
    b.c(paramParcel, 2, paramab.statusCode);
    b.a(paramParcel, 3, paramab.avC, paramInt, false);
    b.H(paramParcel, i);
  }

  public ab eb(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    ak localak = null;
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
        localak = (ak)a.a(paramParcel, m, ak.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ab(k, i, localak);
  }

  public ab[] ge(int paramInt)
  {
    return new ab[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ac
 * JD-Core Version:    0.6.2
 */