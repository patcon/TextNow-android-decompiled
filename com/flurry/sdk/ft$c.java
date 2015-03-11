package com.flurry.sdk;

import java.util.Arrays;

public class ft$c
  implements fx, Comparable<c>
{
  private fn a;
  private byte[] b;

  protected ft$c()
  {
  }

  public ft$c(fn paramfn)
  {
    a(paramfn);
  }

  public int a(c paramc)
  {
    return ga.a(this.b, 0, this.b.length, paramc.b, 0, paramc.b.length);
  }

  public fn a()
  {
    return this.a;
  }

  protected void a(fn paramfn)
  {
    this.a = paramfn;
    this.b = new byte[paramfn.l()];
  }

  public byte[] b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (((paramObject instanceof fx)) && (Arrays.equals(this.b, ((fx)paramObject).b())))
      return true;
    return false;
  }

  public int hashCode()
  {
    return Arrays.hashCode(this.b);
  }

  public String toString()
  {
    return Arrays.toString(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ft.c
 * JD-Core Version:    0.6.2
 */