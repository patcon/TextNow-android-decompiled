package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class c
  implements Parcelable.Creator<b>
{
  static void a(b paramb, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.C(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramb.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramb.label, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramb.value, false);
    com.google.android.gms.common.internal.safeparcel.b.G(paramParcel, i);
  }

  public b ck(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    int j = 0;
    String str2 = null;
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
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new b(j, str2, str1);
  }

  public b[] dS(int paramInt)
  {
    return new b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.c
 * JD-Core Version:    0.6.2
 */