package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class if
  implements Parcelable.Creator<ie>
{
  static void a(ie paramie, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramie.getVersionCode());
    b.a(paramParcel, 2, paramie.fY(), false);
    b.a(paramParcel, 3, paramie.fZ(), paramInt, false);
    b.G(paramParcel, i);
  }

  public ie L(Parcel paramParcel)
  {
    ib localib = null;
    int i = a.B(paramParcel);
    int j = 0;
    Parcel localParcel = null;
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
        localParcel = a.C(paramParcel, k);
        break;
      case 3:
        localib = (ib)a.a(paramParcel, k, ib.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ie(j, localParcel, localib);
  }

  public ie[] aA(int paramInt)
  {
    return new ie[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.if
 * JD-Core Version:    0.6.2
 */