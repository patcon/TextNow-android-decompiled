package com.google.android.gms.maps.model;

import com.google.android.gms.internal.hm;

public final class LatLngBounds$Builder
{
  private double aaK = (1.0D / 0.0D);
  private double aaL = (-1.0D / 0.0D);
  private double aaM = (0.0D / 0.0D);
  private double aaN = (0.0D / 0.0D);

  private boolean d(double paramDouble)
  {
    if (this.aaM <= this.aaN)
      if ((this.aaM > paramDouble) || (paramDouble > this.aaN));
    while ((this.aaM <= paramDouble) || (paramDouble <= this.aaN))
    {
      return true;
      return false;
    }
    return false;
  }

  public final LatLngBounds build()
  {
    if (!Double.isNaN(this.aaM));
    for (boolean bool = true; ; bool = false)
    {
      hm.a(bool, "no included points");
      return new LatLngBounds(new LatLng(this.aaK, this.aaM), new LatLng(this.aaL, this.aaN));
    }
  }

  public final Builder include(LatLng paramLatLng)
  {
    this.aaK = Math.min(this.aaK, paramLatLng.latitude);
    this.aaL = Math.max(this.aaL, paramLatLng.latitude);
    double d = paramLatLng.longitude;
    if (Double.isNaN(this.aaM))
      this.aaM = d;
    do
    {
      this.aaN = d;
      do
        return this;
      while (d(d));
    }
    while (LatLngBounds.d(this.aaM, d) >= LatLngBounds.e(this.aaN, d));
    this.aaM = d;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds.Builder
 * JD-Core Version:    0.6.2
 */