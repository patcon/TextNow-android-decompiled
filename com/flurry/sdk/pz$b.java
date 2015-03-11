package com.flurry.sdk;

import java.util.Iterator;

@kb
public class pz$b extends pb<Iterator<?>>
{
  public pz$b(sh paramsh, boolean paramBoolean, jz paramjz, is paramis)
  {
    super(Iterator.class, paramsh, paramBoolean, paramjz, paramis, null);
  }

  public pf<?> a(jz paramjz)
  {
    return new b(this.b, this.a, paramjz, this.e);
  }

  public void a(Iterator<?> paramIterator, hf paramhf, jw paramjw)
  {
    Object localObject1 = null;
    jz localjz;
    jk localjk1;
    if (paramIterator.hasNext())
    {
      localjz = this.c;
      localjk1 = null;
    }
    while (true)
    {
      Object localObject2 = paramIterator.next();
      if (localObject2 == null)
        paramjw.a(paramhf);
      while (!paramIterator.hasNext())
      {
        return;
        Class localClass = localObject2.getClass();
        if (localClass == localObject1);
        for (jk localjk2 = localjk1; ; localjk2 = localjk1)
        {
          if (localjz != null)
            break label107;
          localjk2.a(localObject2, paramhf, paramjw);
          break;
          localjk1 = paramjw.a(localClass, this.e);
          localObject1 = localClass;
        }
        label107: localjk2.a(localObject2, paramhf, paramjw, localjz);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pz.b
 * JD-Core Version:    0.6.2
 */