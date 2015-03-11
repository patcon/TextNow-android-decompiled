package com.flurry.sdk;

import java.util.ArrayList;

public abstract class lt<T> extends mc<T>
{
  protected lt(Class<?> paramClass)
  {
    super(paramClass);
  }

  public static Iterable<lt<?>> d()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new lt.i());
    localArrayList.add(new lt.h());
    localArrayList.add(new lt.g());
    localArrayList.add(new lt.b());
    localArrayList.add(new lt.e());
    localArrayList.add(new lt.d());
    localArrayList.add(new lt.c());
    localArrayList.add(new lt.f());
    localArrayList.add(new lt.a());
    return localArrayList;
  }

  public final T a(hj paramhj, iz paramiz)
  {
    String str;
    Object localObject2;
    if (paramhj.e() == hm.h)
    {
      str = paramhj.k().trim();
      int i = str.length();
      localObject2 = null;
      if (i != 0);
    }
    while (true)
    {
      return localObject2;
      try
      {
        Object localObject3 = a(str, paramiz);
        localObject2 = localObject3;
        if (localObject2 != null)
          continue;
        label55: throw paramiz.b(this.q, "not a valid textual representation");
        if (paramhj.e() == hm.g)
        {
          Object localObject1 = paramhj.z();
          localObject2 = null;
          if (localObject1 == null)
            continue;
          if (this.q.isAssignableFrom(localObject1.getClass()))
            return localObject1;
          return a(localObject1, paramiz);
        }
        throw paramiz.b(this.q);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label55;
      }
    }
  }

  protected T a(Object paramObject, iz paramiz)
  {
    throw paramiz.b("Don't know how to convert embedded Object of type " + paramObject.getClass().getName() + " into " + this.q.getName());
  }

  protected abstract T a(String paramString, iz paramiz);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lt
 * JD-Core Version:    0.6.2
 */