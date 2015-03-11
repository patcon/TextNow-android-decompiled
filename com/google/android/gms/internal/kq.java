package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kq
  implements Parcelable.Creator<kp>
{
  static void a(kp paramkp, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    Set localSet = paramkp.kk();
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramkp.getVersionCode());
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramkp.getId(), true);
    if (localSet.contains(Integer.valueOf(4)))
      b.a(paramParcel, 4, paramkp.kB(), paramInt, true);
    if (localSet.contains(Integer.valueOf(5)))
      b.a(paramParcel, 5, paramkp.getStartDate(), true);
    if (localSet.contains(Integer.valueOf(6)))
      b.a(paramParcel, 6, paramkp.kC(), paramInt, true);
    if (localSet.contains(Integer.valueOf(7)))
      b.a(paramParcel, 7, paramkp.getType(), true);
    b.G(paramParcel, i);
  }

  public kp bF(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2 = null;
    String str3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      case 3:
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        str3 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 4:
        kn localkn2 = (kn)a.a(paramParcel, k, kn.CREATOR);
        localHashSet.add(Integer.valueOf(4));
        localObject2 = localkn2;
        break;
      case 5:
        str2 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6:
        kn localkn1 = (kn)a.a(paramParcel, k, kn.CREATOR);
        localHashSet.add(Integer.valueOf(6));
        localObject1 = localkn1;
        break;
      case 7:
        str1 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new kp(localHashSet, j, str3, localObject2, str2, localObject1, str1);
  }

  public kp[] dc(int paramInt)
  {
    return new kp[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kq
 * JD-Core Version:    0.6.2
 */