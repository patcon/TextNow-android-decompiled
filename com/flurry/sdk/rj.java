package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;

public final class rj extends ro
{
  protected ArrayList<hh> c;

  public rj(rs paramrs)
  {
    super(paramrs);
  }

  private boolean a(ArrayList<hh> paramArrayList)
  {
    int i = paramArrayList.size();
    if (p() != i)
      return false;
    for (int j = 0; j < i; j++)
      if (!((hh)this.c.get(j)).equals(paramArrayList.get(j)))
        return false;
    return true;
  }

  private void b(hh paramhh)
  {
    if (this.c == null)
      this.c = new ArrayList();
    this.c.add(paramhh);
  }

  public final hh a(String paramString)
  {
    return null;
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.b();
    if (this.c != null)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        ((rk)localIterator.next()).a(paramhf, paramjw);
    }
    paramhf.c();
  }

  public final void a(hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.c(this, paramhf);
    if (this.c != null)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        ((rk)localIterator.next()).a(paramhf, paramjw);
    }
    paramjz.f(this, paramhf);
  }

  public final void a(hh paramhh)
  {
    if (paramhh == null)
      paramhh = s();
    b(paramhh);
  }

  public final boolean b()
  {
    return true;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    rj localrj;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localrj = (rj)paramObject;
      if ((this.c != null) && (this.c.size() != 0))
        break;
    }
    while (localrj.p() == 0);
    return false;
    return localrj.a(this.c);
  }

  public final int hashCode()
  {
    if (this.c == null)
    {
      j = 1;
      return j;
    }
    int i = this.c.size();
    Iterator localIterator = this.c.iterator();
    int j = i;
    label29: hh localhh;
    if (localIterator.hasNext())
    {
      localhh = (hh)localIterator.next();
      if (localhh == null)
        break label69;
    }
    label69: for (int k = j ^ localhh.hashCode(); ; k = j)
    {
      j = k;
      break label29;
      break;
    }
  }

  public final int p()
  {
    if (this.c == null)
      return 0;
    return this.c.size();
  }

  public final Iterator<hh> q()
  {
    if (this.c == null)
      return ro.a.a();
    return this.c.iterator();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(16 + (p() << 4));
    localStringBuilder.append('[');
    if (this.c != null)
    {
      int i = this.c.size();
      for (int j = 0; j < i; j++)
      {
        if (j > 0)
          localStringBuilder.append(',');
        localStringBuilder.append(((hh)this.c.get(j)).toString());
      }
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rj
 * JD-Core Version:    0.6.2
 */