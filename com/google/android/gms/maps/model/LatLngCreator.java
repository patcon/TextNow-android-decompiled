package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class LatLngCreator
  implements Parcelable.Creator<LatLng>
{
  public static final int CONTENT_DESCRIPTION;

  static void a(LatLng paramLatLng, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramLatLng.getVersionCode());
    b.a(paramParcel, 2, paramLatLng.latitude);
    b.a(paramParcel, 3, paramLatLng.longitude);
    b.G(paramParcel, i);
  }

  public LatLng createFromParcel(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int i = a.B(paramParcel);
    int j = 0;
    double d2 = d1;
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
        d2 = a.m(paramParcel, k);
        break;
      case 3:
        d1 = a.m(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new LatLng(j, d2, d1);
  }

  public LatLng[] newArray(int paramInt)
  {
    return new LatLng[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngCreator
 * JD-Core Version:    0.6.2
 */