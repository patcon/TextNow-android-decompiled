package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class gq$m extends gq
  implements Iterable<gq>
{
  private gq$m(gq[] paramArrayOfgq)
  {
    super(gq.i.c, paramArrayOfgq);
  }

  public final int a()
  {
    return a(this.b, 0);
  }

  public m b(Map<m, m> paramMap, Map<m, List<gq.f>> paramMap1)
  {
    Object localObject = (m)paramMap.get(this);
    if (localObject == null)
    {
      m localm = new m(new gq[a()]);
      paramMap.put(this, localm);
      ArrayList localArrayList = new ArrayList();
      paramMap1.put(localm, localArrayList);
      a(this.b, 0, localm.b, 0, paramMap, paramMap1);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        gq.f localf = (gq.f)localIterator.next();
        System.arraycopy(localm.b, 0, localf.a, localf.b, localm.b.length);
      }
      paramMap1.remove(localm);
      localObject = localm;
    }
    return localObject;
  }

  public Iterator<gq> iterator()
  {
    return new Iterator()
    {
      private int b = gq.m.this.b.length;

      public gq a()
      {
        if (this.b > 0)
        {
          gq[] arrayOfgq = gq.m.this.b;
          int i = -1 + this.b;
          this.b = i;
          return arrayOfgq[i];
        }
        throw new NoSuchElementException();
      }

      public boolean hasNext()
      {
        return this.b > 0;
      }

      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gq.m
 * JD-Core Version:    0.6.2
 */