package com.flurry.sdk;

public abstract class gw
  implements gv, Comparable<gv>
{
  public int a(gv paramgv)
  {
    return gs.b().a(this, paramgv, a());
  }

  public abstract fn a();

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (!(paramObject instanceof gv))
        return false;
      if (getClass() != paramObject.getClass())
        return false;
    }
    while (a((gv)paramObject) == 0);
    return false;
  }

  public int hashCode()
  {
    return gs.b().b(this, a());
  }

  public String toString()
  {
    return gs.b().a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gw
 * JD-Core Version:    0.6.2
 */