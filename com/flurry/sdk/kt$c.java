package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class kt$c extends kt
{
  protected final String i;
  protected final boolean j;
  protected final kt k;
  protected final kt l;

  protected kt$c(c paramc, jg<Object> paramjg)
  {
    super(paramc, paramjg);
    this.i = paramc.i;
    this.j = paramc.j;
    this.k = paramc.k;
    this.l = paramc.l;
  }

  public kt$c(String paramString, kt paramkt1, kt paramkt2, qv paramqv, boolean paramBoolean)
  {
    super(paramkt1.c(), paramkt1.a(), paramkt1.e, paramqv);
    this.i = paramString;
    this.k = paramkt1;
    this.l = paramkt2;
    this.j = paramBoolean;
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject)
  {
    a(paramObject, this.k.a(paramhj, paramiz));
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    this.k.a(paramObject1, paramObject2);
    if (paramObject2 != null)
    {
      if (this.j)
      {
        if ((paramObject2 instanceof Object[]))
          for (Object localObject3 : (Object[])paramObject2)
            if (localObject3 != null)
              this.l.a(localObject3, paramObject1);
        if ((paramObject2 instanceof Collection))
        {
          Iterator localIterator2 = ((Collection)paramObject2).iterator();
          while (localIterator2.hasNext())
          {
            Object localObject2 = localIterator2.next();
            if (localObject2 != null)
              this.l.a(localObject2, paramObject1);
          }
        }
        if ((paramObject2 instanceof Map))
        {
          Iterator localIterator1 = ((Map)paramObject2).values().iterator();
          while (localIterator1.hasNext())
          {
            Object localObject1 = localIterator1.next();
            if (localObject1 != null)
              this.l.a(localObject1, paramObject1);
          }
        }
        throw new IllegalStateException("Unsupported container type (" + paramObject2.getClass().getName() + ") when resolving reference '" + this.i + "'");
      }
      this.l.a(paramObject2, paramObject1);
    }
  }

  public final c b(jg<Object> paramjg)
  {
    return new c(this, paramjg);
  }

  public final mq b()
  {
    return this.k.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.c
 * JD-Core Version:    0.6.2
 */