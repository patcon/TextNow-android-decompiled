package com.enflick.android.TextNow.activities.phone;

import com.enflick.android.TextNow.tasks.b;

public final class a
{
  public static int a = 378;
  public static int b = 40;
  public static int c = 850;
  private int d;
  private int e;
  private float f;
  private int g;

  private a(int paramInt)
  {
    this.g = paramInt;
  }

  public final int a()
  {
    if ((0x1 & this.g) > 0)
      return this.d;
    return 0;
  }

  public final boolean a(b paramb)
  {
    if (paramb == null);
    while ((((0x1 & this.g) > 0) && (paramb.a() > this.d)) || (((0x2 & this.g) > 0) && (paramb.c() < this.e)) || (((0x4 & this.g) > 0) && (paramb.d() > this.f)))
      return true;
    return false;
  }

  public final int b()
  {
    if ((0x2 & this.g) > 0)
      return this.e;
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.a
 * JD-Core Version:    0.6.2
 */