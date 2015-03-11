package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fn
  implements Parcelable.Creator<fm>
{
  static void a(fm paramfm, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramfm.id);
    b.c(paramParcel, 1000, paramfm.xM);
    b.a(paramParcel, 2, paramfm.xY, false);
    b.G(paramParcel, i);
  }

  public fm[] G(int paramInt)
  {
    return new fm[paramInt];
  }

  public fm o(Parcel paramParcel)
  {
    int i = 0;
    int j = a.B(paramParcel);
    Bundle localBundle = null;
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
        i = a.g(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localBundle = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new fm(k, i, localBundle);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fn
 * JD-Core Version:    0.6.2
 */