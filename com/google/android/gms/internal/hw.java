package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class hw
  implements Parcelable.Creator<hv>
{
  static void a(hv paramhv, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramhv.getVersionCode());
    b.b(paramParcel, 2, paramhv.fD(), false);
    b.G(paramParcel, i);
  }

  public hv F(Parcel paramParcel)
  {
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
        localArrayList = a.c(paramParcel, k, hv.a.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new hv(j, localArrayList);
  }

  public hv[] au(int paramInt)
  {
    return new hv[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hw
 * JD-Core Version:    0.6.2
 */