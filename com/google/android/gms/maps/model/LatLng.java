package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

public final class LatLng
  implements SafeParcelable
{
  public static final i CREATOR = new i();
  private final int BR;
  public final double latitude;
  public final double longitude;

  public LatLng(double paramDouble1, double paramDouble2)
  {
    this(1, paramDouble1, paramDouble2);
  }

  LatLng(int paramInt, double paramDouble1, double paramDouble2)
  {
    this.BR = paramInt;
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D));
    for (this.longitude = paramDouble2; ; this.longitude = ((360.0D + (paramDouble2 - 180.0D) % 360.0D) % 360.0D - 180.0D))
    {
      this.latitude = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LatLng localLatLng;
    do
    {
      return true;
      if (!(paramObject instanceof LatLng))
        return false;
      localLatLng = (LatLng)paramObject;
    }
    while ((Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(localLatLng.latitude)) && (Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(localLatLng.longitude)));
    return false;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    long l1 = Double.doubleToLongBits(this.latitude);
    int i = 31 + (int)(l1 ^ l1 >>> 32);
    long l2 = Double.doubleToLongBits(this.longitude);
    return i * 31 + (int)(l2 ^ l2 >>> 32);
  }

  public final String toString()
  {
    return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (v.mM())
    {
      j.a(this, paramParcel, paramInt);
      return;
    }
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLng
 * JD-Core Version:    0.6.2
 */