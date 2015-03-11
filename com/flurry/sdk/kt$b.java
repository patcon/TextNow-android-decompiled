package com.flurry.sdk;

import java.lang.reflect.Constructor;

public final class kt$b extends kt
{
  protected final kt i;
  protected final Constructor<?> j;

  protected kt$b(b paramb, jg<Object> paramjg)
  {
    super(paramb, paramjg);
    this.i = paramb.i.a(paramjg);
    this.j = paramb.j;
  }

  public kt$b(kt paramkt, Constructor<?> paramConstructor)
  {
    super(paramkt);
    this.i = paramkt;
    this.j = paramConstructor;
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject)
  {
    Object localObject1;
    if (paramhj.e() == hm.m)
    {
      kt.e locale = this.f;
      localObject1 = null;
      if (locale != null);
    }
    while (true)
    {
      a(paramObject, localObject1);
      return;
      localObject1 = this.f.a(paramiz);
      continue;
      if (this.e != null)
      {
        localObject1 = this.d.a(paramhj, paramiz, this.e);
        continue;
      }
      try
      {
        Object localObject2 = this.j.newInstance(new Object[] { paramObject });
        localObject1 = localObject2;
        this.d.a(paramhj, paramiz, localObject1);
      }
      catch (Exception localException)
      {
        while (true)
        {
          qy.b(localException, "Failed to instantiate class " + this.j.getDeclaringClass().getName() + ", problem: " + localException.getMessage());
          localObject1 = null;
        }
      }
    }
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    this.i.a(paramObject1, paramObject2);
  }

  public final b b(jg<Object> paramjg)
  {
    return new b(this, paramjg);
  }

  public final mq b()
  {
    return this.i.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.b
 * JD-Core Version:    0.6.2
 */