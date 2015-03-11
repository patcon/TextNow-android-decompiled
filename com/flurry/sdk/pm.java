package com.flurry.sdk;

import java.util.Iterator;

@kb
public class pm extends pb<Iterable<?>>
{
  public pm(sh paramsh, boolean paramBoolean, jz paramjz, is paramis)
  {
    super(Iterable.class, paramsh, paramBoolean, paramjz, paramis, null);
  }

  public pf<?> a(jz paramjz)
  {
    return new pm(this.b, this.a, paramjz, this.e);
  }

  public void a(Iterable<?> paramIterable, hf paramhf, jw paramjw)
  {
    Object localObject1 = null;
    Iterator localIterator = paramIterable.iterator();
    jz localjz;
    jk localjk1;
    if (localIterator.hasNext())
    {
      localjz = this.c;
      localjk1 = null;
    }
    while (true)
    {
      Object localObject2 = localIterator.next();
      if (localObject2 == null)
        paramjw.a(paramhf);
      while (!localIterator.hasNext())
      {
        return;
        Class localClass = localObject2.getClass();
        if (localClass == localObject1);
        for (jk localjk2 = localjk1; ; localjk2 = localjk1)
        {
          if (localjz != null)
            break label118;
          localjk2.a(localObject2, paramhf, paramjw);
          break;
          localjk1 = paramjw.a(localClass, this.e);
          localObject1 = localClass;
        }
        label118: localjk2.a(localObject2, paramhf, paramjw, localjz);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pm
 * JD-Core Version:    0.6.2
 */