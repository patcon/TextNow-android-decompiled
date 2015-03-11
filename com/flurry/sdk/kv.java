package com.flurry.sdk;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class kv extends jc
{
  protected final ConcurrentHashMap<sh, jg<Object>> a = new ConcurrentHashMap(64, 0.75F, 2);
  protected final HashMap<sh, jg<Object>> b = new HashMap(8);
  protected final rh c;
  protected jb d;

  public kv()
  {
    this(kq.h);
  }

  public kv(jb paramjb)
  {
    this.d = paramjb;
    this.c = new rh();
  }

  public im a(iy paramiy, sh paramsh)
  {
    return this.c.a(paramsh, paramiy);
  }

  public jc a(ip paramip)
  {
    return a(this.d.a(paramip));
  }

  public jc a(jd paramjd)
  {
    return a(this.d.a(paramjd));
  }

  public jc a(jm paramjm)
  {
    return a(this.d.a(paramjm));
  }

  public jc a(ky paramky)
  {
    return a(this.d.a(paramky));
  }

  public jg<Object> a(iy paramiy, sh paramsh, is paramis)
  {
    jg localjg = a(paramsh);
    if (localjg != null)
      if ((localjg instanceof iv))
        localjg = ((iv)localjg).a(paramiy, paramis);
    do
    {
      return localjg;
      localjg = d(paramiy, paramsh, paramis);
      if (localjg == null)
        localjg = b(paramsh);
    }
    while (!(localjg instanceof iv));
    return ((iv)localjg).a(paramiy, paramis);
  }

  protected jg<Object> a(sh paramsh)
  {
    if (paramsh == null)
      throw new IllegalArgumentException();
    return (jg)this.a.get(paramsh);
  }

  public kv a(jb paramjb)
  {
    if (getClass() != kv.class)
      throw new IllegalStateException("DeserializerProvider of type " + getClass().getName() + " does not override 'withFactory()' method");
    return new kv(paramjb);
  }

  protected void a(iy paramiy, js paramjs)
  {
    paramjs.a(paramiy, this);
  }

  public jg<Object> b(iy paramiy, sh paramsh, is paramis)
  {
    jg localjg = a(paramiy, paramsh, paramis);
    jy localjy = this.d.b(paramiy, paramsh, paramis);
    if (localjy != null)
      return new kv.a(localjy, localjg);
    return localjg;
  }

  protected jg<Object> b(sh paramsh)
  {
    if (!qy.d(paramsh.p()))
      throw new jh("Can not find a Value deserializer for abstract type " + paramsh);
    throw new jh("Can not find a Value deserializer for type " + paramsh);
  }

  public jl c(iy paramiy, sh paramsh, is paramis)
  {
    jl localjl = this.d.a(paramiy, paramsh, paramis);
    if ((localjl instanceof iw))
      localjl = ((iw)localjl).a(paramiy, paramis);
    if (localjl == null)
      localjl = c(paramsh);
    return localjl;
  }

  protected jl c(sh paramsh)
  {
    throw new jh("Can not find a (Map) Key deserializer for type " + paramsh);
  }

  protected jg<Object> d(iy paramiy, sh paramsh, is paramis)
  {
    int i;
    synchronized (this.b)
    {
      jg localjg1 = a(paramsh);
      if (localjg1 != null)
        return localjg1;
      i = this.b.size();
      if (i > 0)
      {
        jg localjg2 = (jg)this.b.get(paramsh);
        if (localjg2 != null)
          return localjg2;
      }
    }
    try
    {
      jg localjg3 = e(paramiy, paramsh, paramis);
      if ((i == 0) && (this.b.size() > 0))
        this.b.clear();
      return localjg3;
    }
    finally
    {
      localObject2 = finally;
      if ((i == 0) && (this.b.size() > 0))
        this.b.clear();
      throw localObject2;
    }
  }

  protected jg<Object> e(iy paramiy, sh paramsh, is paramis)
  {
    jg localjg2;
    try
    {
      jg localjg1 = f(paramiy, paramsh, paramis);
      localjg2 = localjg1;
      if (localjg2 == null)
      {
        localjg2 = null;
        return localjg2;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new jh(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
    boolean bool1 = localjg2 instanceof js;
    if (localjg2.getClass() == ko.class);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if ((!bool2) && (paramiy.a(iy.a.a)))
      {
        iq localiq = paramiy.a();
        Boolean localBoolean = localiq.a(mn.a(localjg2.getClass(), localiq, null));
        if (localBoolean != null)
          bool2 = localBoolean.booleanValue();
      }
      if (bool1)
      {
        this.b.put(paramsh, localjg2);
        a(paramiy, (js)localjg2);
        this.b.remove(paramsh);
      }
      if (!bool2)
        break;
      this.a.put(paramsh, localjg2);
      return localjg2;
    }
  }

  protected jg<Object> f(iy paramiy, sh paramsh, is paramis)
  {
    if (paramsh.r())
      return this.d.b(paramiy, this, paramsh, paramis);
    if (paramsh.f())
    {
      if (paramsh.b())
        return this.d.a(paramiy, this, (qi)paramsh, paramis);
      if (paramsh.j())
      {
        qn localqn = (qn)paramsh;
        if (localqn.l())
          return this.d.a(paramiy, this, (qo)localqn, paramis);
        return this.d.a(paramiy, this, localqn, paramis);
      }
      if (paramsh.i())
      {
        qk localqk = (qk)paramsh;
        if (localqk.a_())
          return this.d.a(paramiy, this, (ql)localqk, paramis);
        return this.d.a(paramiy, this, localqk, paramis);
      }
    }
    if (hh.class.isAssignableFrom(paramsh.p()))
      return this.d.c(paramiy, this, paramsh, paramis);
    return this.d.a(paramiy, this, paramsh, paramis);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kv
 * JD-Core Version:    0.6.2
 */