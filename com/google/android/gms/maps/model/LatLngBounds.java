package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final g CREATOR = new g();
  private final int BR;
  public final LatLng northeast;
  public final LatLng southwest;

  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    o.b(paramLatLng1, "null southwest");
    o.b(paramLatLng2, "null northeast");
    if (paramLatLng2.latitude >= paramLatLng1.latitude);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.latitude);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.latitude);
      o.b(bool, "southern latitude exceeds northern latitude (%s > %s)", arrayOfObject);
      this.BR = paramInt;
      this.southwest = paramLatLng1;
      this.northeast = paramLatLng2;
      return;
    }
  }

  public LatLngBounds(LatLng paramLatLng1, LatLng paramLatLng2)
  {
    this(1, paramLatLng1, paramLatLng2);
  }

  private static double b(double paramDouble1, double paramDouble2)
  {
    return (360.0D + (paramDouble1 - paramDouble2)) % 360.0D;
  }

  public static LatLngBounds.Builder builder()
  {
    return new LatLngBounds.Builder();
  }

  private static double c(double paramDouble1, double paramDouble2)
  {
    return (360.0D + (paramDouble2 - paramDouble1)) % 360.0D;
  }

  private boolean c(double paramDouble)
  {
    return (this.southwest.latitude <= paramDouble) && (paramDouble <= this.northeast.latitude);
  }

  private boolean d(double paramDouble)
  {
    if (this.southwest.longitude <= this.northeast.longitude)
      if ((this.southwest.longitude > paramDouble) || (paramDouble > this.northeast.longitude));
    while ((this.southwest.longitude <= paramDouble) || (paramDouble <= this.northeast.longitude))
    {
      return true;
      return false;
    }
    return false;
  }

  public final boolean contains(LatLng paramLatLng)
  {
    return (c(paramLatLng.latitude)) && (d(paramLatLng.longitude));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds))
        return false;
      localLatLngBounds = (LatLngBounds)paramObject;
    }
    while ((this.southwest.equals(localLatLngBounds.southwest)) && (this.northeast.equals(localLatLngBounds.northeast)));
    return false;
  }

  public final LatLng getCenter()
  {
    double d1 = (this.southwest.latitude + this.northeast.latitude) / 2.0D;
    double d2 = this.northeast.longitude;
    double d3 = this.southwest.longitude;
    if (d3 <= d2);
    for (double d4 = (d2 + d3) / 2.0D; ; d4 = (d3 + (d2 + 360.0D)) / 2.0D)
      return new LatLng(d1, d4);
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.southwest;
    arrayOfObject[1] = this.northeast;
    return n.hashCode(arrayOfObject);
  }

  public final LatLngBounds including(LatLng paramLatLng)
  {
    double d1 = Math.min(this.southwest.latitude, paramLatLng.latitude);
    double d2 = Math.max(this.northeast.latitude, paramLatLng.latitude);
    double d3 = this.northeast.longitude;
    double d4 = this.southwest.longitude;
    double d5 = paramLatLng.longitude;
    double d6;
    if (!d(d5))
      if (b(d4, d5) < c(d3, d5))
        d6 = d3;
    while (true)
    {
      return new LatLngBounds(new LatLng(d1, d5), new LatLng(d2, d6));
      d6 = d5;
      d5 = d4;
      continue;
      d5 = d4;
      d6 = d3;
    }
  }

  public final String toString()
  {
    return n.h(this).a("southwest", this.southwest).a("northeast", this.northeast).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (v.mM())
    {
      h.a(this, paramParcel, paramInt);
      return;
    }
    g.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * JD-Core Version:    0.6.2
 */