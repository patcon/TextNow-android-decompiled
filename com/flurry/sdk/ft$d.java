package com.flurry.sdk;

import java.util.List;

public class ft$d
  implements fy, Comparable<d>
{
  private final fn a;
  private final Object[] b;

  public ft$d(fn paramfn)
  {
    if ((paramfn == null) || (!fn.v.a.equals(paramfn.a())))
      throw new fk("Not a record schema: " + paramfn);
    this.a = paramfn;
    this.b = new Object[paramfn.b().size()];
  }

  public int a(d paramd)
  {
    return ft.a().a(this, paramd, this.a);
  }

  public fn a()
  {
    return this.a;
  }

  public Object a(int paramInt)
  {
    return this.b[paramInt];
  }

  public void a(int paramInt, Object paramObject)
  {
    this.b[paramInt] = paramObject;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    d locald;
    do
    {
      return true;
      if (!(paramObject instanceof d))
        return false;
      locald = (d)paramObject;
      if (!this.a.g().equals(locald.a.g()))
        return false;
    }
    while (ft.a().a(this, locald, this.a, true) == 0);
    return false;
  }

  public int hashCode()
  {
    return ft.a().b(this, this.a);
  }

  public String toString()
  {
    return ft.a().a(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ft.d
 * JD-Core Version:    0.6.2
 */