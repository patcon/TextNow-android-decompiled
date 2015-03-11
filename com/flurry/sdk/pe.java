package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;

public class pe extends pb<Collection<?>>
{
  public pe(sh paramsh, boolean paramBoolean, jz paramjz, is paramis, jk<Object> paramjk)
  {
    super(Collection.class, paramsh, paramBoolean, paramjz, paramis, paramjk);
  }

  public pf<?> a(jz paramjz)
  {
    return new pe(this.b, this.a, paramjz, this.e, this.d);
  }

  public void a(Collection<?> paramCollection, hf paramhf, jw paramjw)
  {
    if (this.d != null)
      a(paramCollection, paramhf, paramjw, this.d);
    Iterator localIterator;
    do
    {
      return;
      localIterator = paramCollection.iterator();
    }
    while (!localIterator.hasNext());
    Object localObject1 = this.f;
    jz localjz = this.c;
    int i = 0;
    while (true)
    {
      Object localObject2;
      Class localClass;
      Object localObject3;
      try
      {
        localObject2 = localIterator.next();
        if (localObject2 == null)
        {
          paramjw.a(paramhf);
          i++;
          if (localIterator.hasNext())
            continue;
          return;
        }
        localClass = localObject2.getClass();
        localObject3 = ((ov)localObject1).a(localClass);
        if (localObject3 == null)
        {
          if (this.b.e())
          {
            localjk1 = a((ov)localObject1, paramjw.a(this.b, localClass), paramjw);
            ov localov = this.f;
            jk localjk2 = localjk1;
            localObject1 = localov;
            localObject3 = localjk2;
          }
        }
        else
        {
          if (localjz != null)
            break label197;
          ((jk)localObject3).a(localObject2, paramhf, paramjw);
          continue;
        }
      }
      catch (Exception localException)
      {
        a(paramjw, localException, paramCollection, i);
        return;
      }
      jk localjk1 = a((ov)localObject1, localClass, paramjw);
      continue;
      label197: ((jk)localObject3).a(localObject2, paramhf, paramjw, localjz);
    }
  }

  public void a(Collection<?> paramCollection, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    Iterator localIterator = paramCollection.iterator();
    jz localjz;
    int i;
    if (localIterator.hasNext())
    {
      localjz = this.c;
      i = 0;
    }
    while (true)
    {
      Object localObject = localIterator.next();
      if (localObject == null);
      try
      {
        paramjw.a(paramhf);
        while (true)
        {
          i++;
          if (localIterator.hasNext())
            break;
          return;
          if (localjz != null)
            break label92;
          paramjk.a(localObject, paramhf, paramjw);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          a(paramjw, localException, paramCollection, i);
          continue;
          label92: paramjk.a(localObject, paramhf, paramjw, localjz);
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pe
 * JD-Core Version:    0.6.2
 */