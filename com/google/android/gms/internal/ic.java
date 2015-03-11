package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ic
  implements Parcelable.Creator<ib>
{
  static void a(ib paramib, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramib.getVersionCode());
    b.b(paramParcel, 2, paramib.fV(), false);
    b.a(paramParcel, 3, paramib.fW(), false);
    b.G(paramParcel, i);
  }

  public ib J(Parcel paramParcel)
  {
    String str = null;
    int i = a.B(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, ib.a.CREATOR);
        break;
      case 3:
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ib(j, localArrayList, str);
  }

  public ib[] ay(int paramInt)
  {
    return new ib[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ic
 * JD-Core Version:    0.6.2
 */