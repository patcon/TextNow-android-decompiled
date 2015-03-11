package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class rw extends ro
{
  protected LinkedHashMap<String, hh> c = null;

  public rw(rs paramrs)
  {
    super(paramrs);
  }

  private final hh b(String paramString, hh paramhh)
  {
    if (this.c == null)
      this.c = new LinkedHashMap();
    return (hh)this.c.put(paramString, paramhh);
  }

  public hh a(String paramString)
  {
    if (this.c != null)
      return (hh)this.c.get(paramString);
    return null;
  }

  public hh a(String paramString, hh paramhh)
  {
    if (paramhh == null)
      paramhh = s();
    return b(paramString, paramhh);
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.d();
    if (this.c != null)
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramhf.a((String)localEntry.getKey());
        ((rk)localEntry.getValue()).a(paramhf, paramjw);
      }
    }
    paramhf.e();
  }

  public void a(hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.b(this, paramhf);
    if (this.c != null)
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramhf.a((String)localEntry.getKey());
        ((rk)localEntry.getValue()).a(paramhf, paramjw);
      }
    }
    paramjz.e(this, paramhf);
  }

  public boolean c()
  {
    return true;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (paramObject == null)
      return false;
    if (paramObject.getClass() != getClass())
      return false;
    rw localrw = (rw)paramObject;
    if (localrw.p() != p())
      return false;
    if (this.c != null)
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        hh localhh1 = (hh)localEntry.getValue();
        hh localhh2 = localrw.a(str);
        if ((localhh2 == null) || (!localhh2.equals(localhh1)))
          return false;
      }
    }
    return true;
  }

  public int hashCode()
  {
    if (this.c == null)
      return -1;
    return this.c.hashCode();
  }

  public int p()
  {
    if (this.c == null)
      return 0;
    return this.c.size();
  }

  public Iterator<hh> q()
  {
    if (this.c == null)
      return ro.a.a();
    return this.c.values().iterator();
  }

  public Iterator<String> r()
  {
    if (this.c == null)
      return ro.b.a();
    return this.c.keySet().iterator();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(32 + (p() << 4));
    localStringBuilder.append("{");
    if (this.c != null)
    {
      Iterator localIterator = this.c.entrySet().iterator();
      int j;
      for (int i = 0; localIterator.hasNext(); i = j)
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (i > 0)
          localStringBuilder.append(",");
        j = i + 1;
        ry.a(localStringBuilder, (String)localEntry.getKey());
        localStringBuilder.append(':');
        localStringBuilder.append(((hh)localEntry.getValue()).toString());
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rw
 * JD-Core Version:    0.6.2
 */