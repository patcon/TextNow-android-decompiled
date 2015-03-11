package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kw
  implements Parcelable.Creator<ks.b.a>
{
  static void a(ks.b.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    Set localSet = parama.kk();
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, parama.getVersionCode());
    if (localSet.contains(Integer.valueOf(2)))
      b.c(paramParcel, 2, parama.getLeftImageOffset());
    if (localSet.contains(Integer.valueOf(3)))
      b.c(paramParcel, 3, parama.getTopImageOffset());
    b.G(paramParcel, i);
  }

  public ks.b.a bJ(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.A(paramParcel);
      switch (a.ar(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        k = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3:
        i = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ks.b.a(localHashSet, m, k, i);
  }

  public ks.b.a[] dg(int paramInt)
  {
    return new ks.b.a[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kw
 * JD-Core Version:    0.6.2
 */