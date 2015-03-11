package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ky
  implements Parcelable.Creator<ks.c>
{
  static void a(ks.c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    Set localSet = paramc.kk();
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramc.getVersionCode());
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramc.getUrl(), true);
    b.G(paramParcel, i);
  }

  public ks.c bL(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str = null;
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
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        str = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ks.c(localHashSet, j, str);
  }

  public ks.c[] di(int paramInt)
  {
    return new ks.c[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ky
 * JD-Core Version:    0.6.2
 */