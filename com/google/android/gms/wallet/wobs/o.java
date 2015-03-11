package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o
  implements Parcelable.Creator<n>
{
  static void a(n paramn, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramn.getVersionCode());
    b.a(paramParcel, 2, paramn.alc, false);
    b.a(paramParcel, 3, paramn.description, false);
    b.G(paramParcel, i);
  }

  public n cq(Parcel paramParcel)
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
    return new n(j, str2, str1);
  }

  public n[] dY(int paramInt)
  {
    return new n[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.o
 * JD-Core Version:    0.6.2
 */