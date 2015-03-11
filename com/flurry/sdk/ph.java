package com.flurry.sdk;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

@kb
public class ph extends pf<EnumMap<? extends Enum<?>, ?>>
  implements jt
{
  protected final boolean a;
  protected final rb b;
  protected final sh c;
  protected final is d;
  protected jk<Object> e;
  protected final jz f;

  public ph(sh paramsh, boolean paramBoolean, rb paramrb, jz paramjz, is paramis, jk<Object> paramjk)
  {
    super(EnumMap.class, false);
    boolean bool1;
    if (!paramBoolean)
    {
      bool1 = false;
      if (paramsh != null)
      {
        boolean bool2 = paramsh.u();
        bool1 = false;
        if (!bool2);
      }
    }
    else
    {
      bool1 = true;
    }
    this.a = bool1;
    this.c = paramsh;
    this.b = paramrb;
    this.f = paramjz;
    this.d = paramis;
    this.e = paramjk;
  }

  public pf<?> a(jz paramjz)
  {
    return new ph(this.c, this.a, this.b, paramjz, this.d, this.e);
  }

  public void a(jw paramjw)
  {
    if ((this.a) && (this.e == null))
      this.e = paramjw.a(this.c, this.d);
  }

  public void a(EnumMap<? extends Enum<?>, ?> paramEnumMap, hf paramhf, jw paramjw)
  {
    paramhf.d();
    if (!paramEnumMap.isEmpty())
      b(paramEnumMap, paramhf, paramjw);
    paramhf.e();
  }

  protected void a(EnumMap<? extends Enum<?>, ?> paramEnumMap, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    rb localrb1 = this.b;
    Iterator localIterator = paramEnumMap.entrySet().iterator();
    rb localrb2 = localrb1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Enum localEnum = (Enum)localEntry.getKey();
      if (localrb2 == null)
        localrb2 = ((pi)paramjw.a(localEnum.getDeclaringClass(), this.d)).d();
      paramhf.a(localrb2.a(localEnum));
      Object localObject = localEntry.getValue();
      if (localObject == null)
        paramjw.a(paramhf);
      else
        try
        {
          paramjk.a(localObject, paramhf, paramjw);
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramEnumMap, ((Enum)localEntry.getKey()).name());
        }
    }
  }

  public void a(EnumMap<? extends Enum<?>, ?> paramEnumMap, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.b(paramEnumMap, paramhf);
    if (!paramEnumMap.isEmpty())
      b(paramEnumMap, paramhf, paramjw);
    paramjz.e(paramEnumMap, paramhf);
  }

  protected void b(EnumMap<? extends Enum<?>, ?> paramEnumMap, hf paramhf, jw paramjw)
  {
    if (this.e != null)
      a(paramEnumMap, paramhf, paramjw, this.e);
    while (true)
    {
      return;
      rb localrb1 = this.b;
      Iterator localIterator = paramEnumMap.entrySet().iterator();
      rb localrb2 = localrb1;
      Object localObject1 = null;
      Object localObject2 = null;
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Enum localEnum = (Enum)localEntry.getKey();
        if (localrb2 == null)
          localrb2 = ((pi)paramjw.a(localEnum.getDeclaringClass(), this.d)).d();
        paramhf.a(localrb2.a(localEnum));
        Object localObject3 = localEntry.getValue();
        if (localObject3 == null)
        {
          paramjw.a(paramhf);
        }
        else
        {
          Object localObject4 = localObject3.getClass();
          Object localObject5;
          if (localObject4 == localObject1)
          {
            localObject4 = localObject1;
            localObject5 = localObject2;
          }
          try
          {
            while (true)
            {
              ((jk)localObject2).a(localObject3, paramhf, paramjw);
              localObject2 = localObject5;
              localObject1 = localObject4;
              break;
              localObject2 = paramjw.a((Class)localObject4, this.d);
              localObject5 = localObject2;
            }
          }
          catch (Exception localException)
          {
            a(paramjw, localException, paramEnumMap, ((Enum)localEntry.getKey()).name());
            localObject2 = localObject5;
            localObject1 = localObject4;
          }
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ph
 * JD-Core Version:    0.6.2
 */