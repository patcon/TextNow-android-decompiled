package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<a>
{
  static void a(a parama, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, parama.getPackageName(), false);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, parama.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, parama.getVersion(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, parama.iz(), false);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public a bi(Parcel paramParcel)
  {
    String str1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.a.C(paramParcel);
    String str2 = null;
    int j = 0;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1:
        str2 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 1000:
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, k);
        break;
      case 2:
        str3 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 3:
        str1 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new a(j, str2, str3, str1);
  }

  public a[] cw(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.b
 * JD-Core Version:    0.6.2
 */