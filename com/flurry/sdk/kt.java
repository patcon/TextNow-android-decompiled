package com.flurry.sdk;

import java.io.IOException;

public abstract class kt
  implements is
{
  protected final String a;
  protected final sh b;
  protected final qv c;
  protected jg<Object> d;
  protected jy e;
  protected kt.e f;
  protected String g;
  protected int h = -1;

  protected kt(kt paramkt)
  {
    this.a = paramkt.a;
    this.b = paramkt.b;
    this.c = paramkt.c;
    this.d = paramkt.d;
    this.e = paramkt.e;
    this.f = paramkt.f;
    this.g = paramkt.g;
    this.h = paramkt.h;
  }

  protected kt(kt paramkt, jg<Object> paramjg)
  {
    this.a = paramkt.a;
    this.b = paramkt.b;
    this.c = paramkt.c;
    this.e = paramkt.e;
    this.g = paramkt.g;
    this.h = paramkt.h;
    this.d = paramjg;
    kt.e locale = null;
    if (paramjg == null);
    while (true)
    {
      this.f = locale;
      return;
      Object localObject = paramjg.b();
      locale = null;
      if (localObject != null)
        locale = new kt.e(this.b, localObject);
    }
  }

  protected kt(String paramString, sh paramsh, jy paramjy, qv paramqv)
  {
    if ((paramString == null) || (paramString.length() == 0));
    for (this.a = ""; ; this.a = sm.a.a(paramString))
    {
      this.b = paramsh;
      this.c = paramqv;
      this.e = paramjy;
      return;
    }
  }

  public abstract kt a(jg<Object> paramjg);

  public sh a()
  {
    return this.b;
  }

  protected IOException a(Exception paramException)
  {
    if ((paramException instanceof IOException))
      throw ((IOException)paramException);
    if ((paramException instanceof RuntimeException))
      throw ((RuntimeException)paramException);
    while (paramException.getCause() != null)
      paramException = paramException.getCause();
    throw new jh(paramException.getMessage(), null, paramException);
  }

  public final Object a(hj paramhj, iz paramiz)
  {
    if (paramhj.e() == hm.m)
    {
      if (this.f == null)
        return null;
      return this.f.a(paramiz);
    }
    if (this.e != null)
      return this.d.a(paramhj, paramiz, this.e);
    return this.d.a(paramhj, paramiz);
  }

  public void a(int paramInt)
  {
    if (this.h != -1)
      throw new IllegalStateException("Property '" + c() + "' already had index (" + this.h + "), trying to assign " + paramInt);
    this.h = paramInt;
  }

  public abstract void a(hj paramhj, iz paramiz, Object paramObject);

  protected void a(Exception paramException, Object paramObject)
  {
    if ((paramException instanceof IllegalArgumentException))
    {
      String str1;
      StringBuilder localStringBuilder;
      if (paramObject == null)
      {
        str1 = "[NULL]";
        localStringBuilder = new StringBuilder("Problem deserializing property '").append(d());
        localStringBuilder.append("' (expected type: ").append(a());
        localStringBuilder.append("; actual type: ").append(str1).append(")");
        String str2 = paramException.getMessage();
        if (str2 == null)
          break label117;
        localStringBuilder.append(", problem: ").append(str2);
      }
      while (true)
      {
        throw new jh(localStringBuilder.toString(), null, paramException);
        str1 = paramObject.getClass().getName();
        break;
        label117: localStringBuilder.append(" (no error message provided)");
      }
    }
    a(paramException);
  }

  public abstract void a(Object paramObject1, Object paramObject2);

  public void a(String paramString)
  {
    this.g = paramString;
  }

  public abstract mq b();

  public final String c()
  {
    return this.a;
  }

  @Deprecated
  public String d()
  {
    return this.a;
  }

  public String e()
  {
    return this.g;
  }

  public boolean f()
  {
    return this.d != null;
  }

  public boolean g()
  {
    return this.e != null;
  }

  public jg<Object> h()
  {
    return this.d;
  }

  public jy i()
  {
    return this.e;
  }

  public int j()
  {
    return this.h;
  }

  public Object k()
  {
    return null;
  }

  public String toString()
  {
    return "[property '" + c() + "']";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt
 * JD-Core Version:    0.6.2
 */