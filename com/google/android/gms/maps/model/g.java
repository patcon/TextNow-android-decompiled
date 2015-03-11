package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<LatLngBounds>
{
  static void a(LatLngBounds paramLatLngBounds, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramLatLngBounds.getVersionCode());
    b.a(paramParcel, 2, paramLatLngBounds.southwest, paramInt, false);
    b.a(paramParcel, 3, paramLatLngBounds.northeast, paramInt, false);
    b.H(paramParcel, i);
  }

  public LatLngBounds cL(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    LatLng localLatLng1 = null;
    int j = 0;
    LatLng localLatLng2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localLatLng1 = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3:
        localLatLng2 = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new LatLngBounds(j, localLatLng1, localLatLng2);
  }

  public LatLngBounds[] eB(int paramInt)
  {
    return new LatLngBounds[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.g
 * JD-Core Version:    0.6.2
 */