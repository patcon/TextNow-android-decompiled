package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kx
  implements Parcelable.Creator<ks.b.b>
{
  static void a(ks.b.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    Set localSet = paramb.kk();
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramb.getVersionCode());
    if (localSet.contains(Integer.valueOf(2)))
      b.c(paramParcel, 2, paramb.getHeight());
    if (localSet.contains(Integer.valueOf(3)))
      b.a(paramParcel, 3, paramb.getUrl(), true);
    if (localSet.contains(Integer.valueOf(4)))
      b.c(paramParcel, 4, paramb.getWidth());
    b.G(paramParcel, i);
  }

  public ks.b.b bK(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    HashSet localHashSet = new HashSet();
    String str = null;
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
        str = a.o(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4:
        i = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(4));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ks.b.b(localHashSet, m, k, str, i);
  }

  public ks.b.b[] dh(int paramInt)
  {
    return new ks.b.b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kx
 * JD-Core Version:    0.6.2
 */