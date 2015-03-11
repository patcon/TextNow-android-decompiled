package com.enflick.android.TextNow.views.imagezoom;

public final class b
  implements a
{
  public final double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (paramDouble1 == paramDouble4)
      return 0.0D + paramDouble3;
    return 0.0D + paramDouble3 * (1.0D + -Math.pow(2.0D, -10.0D * paramDouble1 / paramDouble4));
  }

  public final double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (paramDouble1 == 0.0D)
      return 0.0D;
    if (paramDouble1 == paramDouble4)
      return 0.0D + paramDouble3;
    double d = paramDouble1 / (paramDouble4 / 2.0D);
    if (d < 1.0D)
      return 0.0D + paramDouble3 / 2.0D * Math.pow(2.0D, 10.0D * (d - 1.0D));
    return 0.0D + paramDouble3 / 2.0D * (2.0D + -Math.pow(2.0D, -10.0D * (d - 1.0D)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.imagezoom.b
 * JD-Core Version:    0.6.2
 */