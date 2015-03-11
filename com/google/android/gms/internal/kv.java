package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kv
  implements Parcelable.Creator<ks.b>
{
  static void a(ks.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    Set localSet = paramb.kk();
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramb.getVersionCode());
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramb.kO(), paramInt, true);
    if (localSet.contains(Integer.valueOf(3)))
      b.a(paramParcel, 3, paramb.kP(), paramInt, true);
    if (localSet.contains(Integer.valueOf(4)))
      b.c(paramParcel, 4, paramb.getLayout());
    b.G(paramParcel, i);
  }

  public ks.b bI(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = a.B(paramParcel);
    HashSet localHashSet = new HashSet();
    Object localObject2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        ks.b.a locala = (ks.b.a)a.a(paramParcel, m, ks.b.a.CREATOR);
        localHashSet.add(Integer.valueOf(2));
        localObject2 = locala;
        break;
      case 3:
        ks.b.b localb = (ks.b.b)a.a(paramParcel, m, ks.b.b.CREATOR);
        localHashSet.add(Integer.valueOf(3));
        localObject1 = localb;
        break;
      case 4:
        i = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(4));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ks.b(localHashSet, k, localObject2, localObject1, i);
  }

  public ks.b[] df(int paramInt)
  {
    return new ks.b[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kv
 * JD-Core Version:    0.6.2
 */