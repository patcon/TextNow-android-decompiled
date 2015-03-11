package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class an
  implements Parcelable.Creator<am>
{
  static void a(am paramam, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramam.versionCode);
    b.a(paramParcel, 2, paramam.packageName, false);
    b.a(paramParcel, 3, paramam.label, false);
    b.a(paramParcel, 4, paramam.avN);
    b.H(paramParcel, i);
  }

  public am ee(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    long l = 0L;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
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
        break;
      case 4:
        l = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new am(j, str2, str1, l);
  }

  public am[] gh(int paramInt)
  {
    return new am[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.an
 * JD-Core Version:    0.6.2
 */