package com.flurry.sdk;

import java.util.HashMap;

public abstract class nv extends jy
{
  protected final nh b;
  protected final sh c;
  protected final is d;
  protected final sh e;
  protected final HashMap<String, jg<Object>> f;
  protected jg<Object> g;

  protected nv(sh paramsh, nh paramnh, is paramis, Class<?> paramClass)
  {
    this.c = paramsh;
    this.b = paramnh;
    this.d = paramis;
    this.f = new HashMap();
    if (paramClass == null)
    {
      this.e = null;
      return;
    }
    this.e = paramsh.g(paramClass);
  }

  protected final jg<Object> a(iz paramiz)
  {
    if (this.e == null)
      return null;
    synchronized (this.e)
    {
      if (this.g == null)
        this.g = paramiz.b().a(paramiz.a(), this.e, this.d);
      jg localjg = this.g;
      return localjg;
    }
  }

  protected final jg<Object> a(iz paramiz, String paramString)
  {
    sh localsh;
    synchronized (this.f)
    {
      localObject2 = (jg)this.f.get(paramString);
      if (localObject2 == null)
      {
        localsh = this.b.a(paramString);
        if (localsh != null)
          break label89;
        if (this.e == null)
          throw paramiz.a(this.c, paramString);
      }
    }
    label89: jg localjg;
    for (Object localObject2 = a(paramiz); ; localObject2 = localjg)
    {
      this.f.put(paramString, localObject2);
      return localObject2;
      if ((this.c != null) && (this.c.getClass() == localsh.getClass()))
        localsh = this.c.f(localsh.p());
      localjg = paramiz.b().a(paramiz.a(), localsh, this.d);
    }
  }

  public String b()
  {
    return null;
  }

  public String c()
  {
    return this.c.p().getName();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[').append(getClass().getName());
    localStringBuilder.append("; base-type:").append(this.c);
    localStringBuilder.append("; id-resolver: ").append(this.b);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nv
 * JD-Core Version:    0.6.2
 */