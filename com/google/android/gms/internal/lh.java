package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class lh
  implements Parcelable.Creator<lg>
{
  static void a(lg paramlg, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramlg.getVersionCode());
    b.a(paramParcel, 2, paramlg.akd, false);
    b.G(paramParcel, i);
  }

  public lg ce(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    int[] arrayOfInt = null;
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
        arrayOfInt = a.u(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new lg(j, arrayOfInt);
  }

  public lg[] dK(int paramInt)
  {
    return new lg[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lh
 * JD-Core Version:    0.6.2
 */