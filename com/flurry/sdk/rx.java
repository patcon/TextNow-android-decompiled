package com.flurry.sdk;

public final class rx extends rz
{
  protected final Object c;

  public rx(Object paramObject)
  {
    this.c = paramObject;
  }

  public final double a(double paramDouble)
  {
    if ((this.c instanceof Number))
      paramDouble = ((Number)this.c).doubleValue();
    return paramDouble;
  }

  public final void a(hf paramhf, jw paramjw)
  {
    if (this.c == null)
    {
      paramhf.f();
      return;
    }
    paramhf.a(this.c);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    rx localrx;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localrx = (rx)paramObject;
      if (this.c != null)
        break;
    }
    while (localrx.c == null);
    return false;
    return this.c.equals(localrx.c);
  }

  public final int hashCode()
  {
    return this.c.hashCode();
  }

  public final String n()
  {
    if (this.c == null)
      return "null";
    return this.c.toString();
  }

  public final String toString()
  {
    return String.valueOf(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rx
 * JD-Core Version:    0.6.2
 */