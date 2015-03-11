package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class my
  implements Parcelable.Creator<mx>
{
  static void a(mx parammx, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, parammx.aij, false);
    b.c(paramParcel, 1000, parammx.versionCode);
    b.a(paramParcel, 2, parammx.aik, false);
    b.a(paramParcel, 3, parammx.Dv, false);
    b.H(paramParcel, i);
  }

  public mx cF(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    String str2 = null;
    int j = 0;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
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
        str3 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new mx(j, str2, str3, str1);
  }

  public mx[] ev(int paramInt)
  {
    return new mx[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.my
 * JD-Core Version:    0.6.2
 */