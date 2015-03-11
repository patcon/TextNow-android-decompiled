package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class id
  implements Parcelable.Creator<ib.a>
{
  static void a(ib.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, parama.versionCode);
    b.a(paramParcel, 2, parama.className, false);
    b.b(paramParcel, 3, parama.Ho, false);
    b.G(paramParcel, i);
  }

  public ib.a K(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int i = a.B(paramParcel);
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
        break;
      case 2:
        str = a.o(paramParcel, k);
        break;
      case 3:
        localArrayList = a.c(paramParcel, k, ib.b.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ib.a(j, str, localArrayList);
  }

  public ib.a[] az(int paramInt)
  {
    return new ib.a[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.id
 * JD-Core Version:    0.6.2
 */