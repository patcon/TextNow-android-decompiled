package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.internal.ig;
import java.util.ArrayList;

public class e
  implements Parcelable.Creator<d>
{
  static void a(d paramd, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.C(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramd.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramd.akP, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramd.akQ, false);
    com.google.android.gms.common.internal.safeparcel.b.b(paramParcel, 4, paramd.akR, false);
    com.google.android.gms.common.internal.safeparcel.b.G(paramParcel, i);
  }

  public d cl(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    ArrayList localArrayList = ig.ga();
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
        break;
      case 4:
        localArrayList = a.c(paramParcel, k, b.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new d(j, str2, str1, localArrayList);
  }

  public d[] dT(int paramInt)
  {
    return new d[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.e
 * JD-Core Version:    0.6.2
 */