package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.o;

public final class LatLngBounds$Builder
{
  private double ajY = (1.0D / 0.0D);
  private double ajZ = (-1.0D / 0.0D);
  private double aka = (0.0D / 0.0D);
  private double akb = (0.0D / 0.0D);

  private boolean d(double paramDouble)
  {
    if (this.aka <= this.akb)
      if ((this.aka > paramDouble) || (paramDouble > this.akb));
    while ((this.aka <= paramDouble) || (paramDouble <= this.akb))
    {
      return true;
      return false;
    }
    return false;
  }

  public final LatLngBounds build()
  {
    if (!Double.isNaN(this.aka));
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "no included points");
      return new LatLngBounds(new LatLng(this.ajY, this.aka), new LatLng(this.ajZ, this.akb));
    }
  }

  public final Builder include(LatLng paramLatLng)
  {
    this.ajY = Math.min(this.ajY, paramLatLng.latitude);
    this.ajZ = Math.max(this.ajZ, paramLatLng.latitude);
    double d = paramLatLng.longitude;
    if (Double.isNaN(this.aka))
      this.aka = d;
    do
    {
      this.akb = d;
      do
        return this;
      while (d(d));
    }
    while (LatLngBounds.d(this.aka, d) >= LatLngBounds.e(this.akb, d));
    this.aka = d;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds.Builder
 * JD-Core Version:    0.6.2
 */