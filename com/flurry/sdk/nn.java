package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.As;

public class nn extends nj
{
  protected final String a;

  public nn(sh paramsh, nh paramnh, is paramis, Class<?> paramClass, String paramString)
  {
    super(paramsh, paramnh, paramis, paramClass);
    this.a = paramString;
  }

  public JsonTypeInfo.As a()
  {
    return JsonTypeInfo.As.PROPERTY;
  }

  public Object a(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    hm localhm2;
    sq localsq;
    if (localhm1 == hm.b)
    {
      localhm1 = paramhj.b();
      localhm2 = localhm1;
      localsq = null;
    }
    while (true)
    {
      if (localhm2 != hm.f)
        break label161;
      String str = paramhj.g();
      paramhj.b();
      if (this.a.equals(str))
      {
        jg localjg = a(paramiz, paramhj.k());
        if (localsq != null)
          paramhj = so.a(localsq.a(paramhj), paramhj);
        paramhj.b();
        return localjg.a(paramhj, paramiz);
        if (localhm1 == hm.d)
          return a(paramhj, paramiz, null);
        if (localhm1 == hm.f)
          break;
        return a(paramhj, paramiz, null);
      }
      if (localsq == null)
        localsq = new sq(null);
      localsq.a(str);
      localsq.c(paramhj);
      localhm2 = paramhj.b();
    }
    label161: return a(paramhj, paramiz, localsq);
  }

  protected Object a(hj paramhj, iz paramiz, sq paramsq)
  {
    Object localObject;
    if (this.e != null)
    {
      jg localjg = a(paramiz);
      if (paramsq != null)
      {
        paramsq.e();
        paramhj = paramsq.a(paramhj);
        paramhj.b();
      }
      localObject = localjg.a(paramhj, paramiz);
    }
    do
    {
      return localObject;
      localObject = f(paramhj, paramiz);
    }
    while (localObject != null);
    if (paramhj.e() == hm.d)
      return super.d(paramhj, paramiz);
    throw paramiz.a(paramhj, hm.f, "missing property '" + this.a + "' that is to contain type id  (for class " + c() + ")");
  }

  public String b()
  {
    return this.a;
  }

  public Object d(hj paramhj, iz paramiz)
  {
    if (paramhj.e() == hm.d)
      return super.b(paramhj, paramiz);
    return a(paramhj, paramiz);
  }

  protected Object f(hj paramhj, iz paramiz)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
              return null;
            while (!this.c.p().isAssignableFrom(String.class));
            return paramhj.k();
          }
          while (!this.c.p().isAssignableFrom(Integer.class));
          return Integer.valueOf(paramhj.t());
        }
        while (!this.c.p().isAssignableFrom(Double.class));
        return Double.valueOf(paramhj.x());
      }
      while (!this.c.p().isAssignableFrom(Boolean.class));
      return Boolean.TRUE;
    }
    while (!this.c.p().isAssignableFrom(Boolean.class));
    return Boolean.FALSE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nn
 * JD-Core Version:    0.6.2
 */