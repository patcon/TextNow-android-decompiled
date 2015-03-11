package com.flurry.sdk;

import java.util.Date;

public abstract class lz<T> extends jg<T>
{
  protected final Class<?> q;

  protected lz(sh paramsh)
  {
    if (paramsh == null);
    for (Class localClass = null; ; localClass = paramsh.p())
    {
      this.q = localClass;
      return;
    }
  }

  protected lz(Class<?> paramClass)
  {
    this.q = paramClass;
  }

  protected static final double b(String paramString)
  {
    if ("2.2250738585072012e-308".equals(paramString))
      return 2.225073858507201E-308D;
    return Double.parseDouble(paramString);
  }

  protected final double A(hj paramhj, iz paramiz)
  {
    double d1 = 0.0D;
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      d1 = paramhj.x();
    do
    {
      String str;
      do
      {
        return d1;
        if (localhm != hm.h)
          break;
        str = paramhj.k().trim();
      }
      while (str.length() == 0);
      switch (str.charAt(0))
      {
      default:
      case 'I':
      case 'N':
      case '-':
      }
      try
      {
        do
        {
          do
          {
            do
            {
              double d2 = b(str);
              return d2;
            }
            while ((!"Infinity".equals(str)) && (!"INF".equals(str)));
            return (1.0D / 0.0D);
          }
          while (!"NaN".equals(str));
          return (0.0D / 0.0D);
        }
        while ((!"-Infinity".equals(str)) && (!"-INF".equals(str)));
        return (-1.0D / 0.0D);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid double value");
      }
    }
    while (localhm == hm.m);
    throw paramiz.a(this.q, localhm);
  }

  protected Date B(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.i)
      return new Date(paramhj.u());
    if (localhm == hm.m)
      return (Date)b();
    if (localhm == hm.h)
      try
      {
        String str = paramhj.k().trim();
        if (str.length() == 0)
          return (Date)c();
        Date localDate = paramiz.a(str);
        return localDate;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid representation (error: " + localIllegalArgumentException.getMessage() + ")");
      }
    throw paramiz.a(this.q, localhm);
  }

  protected jg<Object> a(iy paramiy, jc paramjc, sh paramsh, is paramis)
  {
    return paramjc.a(paramiy, paramsh, paramis);
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.d(paramhj, paramiz);
  }

  protected void a(hj paramhj, iz paramiz, Object paramObject, String paramString)
  {
    if (paramObject == null)
      paramObject = f();
    if (paramiz.a(paramhj, this, paramObject, paramString))
      return;
    a(paramiz, paramObject, paramString);
    paramhj.d();
  }

  protected void a(iz paramiz, Object paramObject, String paramString)
  {
    if (paramiz.a(iy.a.k))
      throw paramiz.a(paramObject, paramString);
  }

  protected boolean a(jg<?> paramjg)
  {
    return (paramjg != null) && (paramjg.getClass().getAnnotation(kb.class) != null);
  }

  public Class<?> f()
  {
    return this.q;
  }

  protected final boolean n(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.k);
    label65: String str;
    do
    {
      do
      {
        return true;
        if (localhm == hm.l)
          return false;
        if (localhm == hm.m)
          return false;
        if (localhm != hm.i)
          break label65;
        if (paramhj.q() != hj.b.a)
          break;
      }
      while (paramhj.t() != 0);
      return false;
      return p(paramhj, paramiz);
      if (localhm != hm.h)
        break;
      str = paramhj.k().trim();
    }
    while ("true".equals(str));
    if (("false".equals(str)) || (str.length() == 0))
      return Boolean.FALSE.booleanValue();
    throw paramiz.b(this.q, "only \"true\" or \"false\" recognized");
    throw paramiz.a(this.q, localhm);
  }

  protected final Boolean o(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.k)
      return Boolean.TRUE;
    if (localhm == hm.l)
      return Boolean.FALSE;
    if (localhm == hm.i)
    {
      if (paramhj.q() == hj.b.a)
      {
        if (paramhj.t() == 0)
          return Boolean.FALSE;
        return Boolean.TRUE;
      }
      return Boolean.valueOf(p(paramhj, paramiz));
    }
    if (localhm == hm.m)
      return (Boolean)b();
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if ("true".equals(str))
        return Boolean.TRUE;
      if ("false".equals(str))
        return Boolean.FALSE;
      if (str.length() == 0)
        return (Boolean)c();
      throw paramiz.b(this.q, "only \"true\" or \"false\" recognized");
    }
    throw paramiz.a(this.q, localhm);
  }

  protected final boolean p(hj paramhj, iz paramiz)
  {
    if (paramhj.q() == hj.b.b)
    {
      if (paramhj.u() == 0L);
      for (Boolean localBoolean = Boolean.FALSE; ; localBoolean = Boolean.TRUE)
        return localBoolean.booleanValue();
    }
    String str = paramhj.k();
    if (("0.0".equals(str)) || ("0".equals(str)))
      return Boolean.FALSE.booleanValue();
    return Boolean.TRUE.booleanValue();
  }

  protected Byte q(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Byte.valueOf(paramhj.r());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      int i;
      try
      {
        if (str.length() == 0)
          return (Byte)c();
        i = ii.a(str);
        if ((i < -128) || (i > 127))
          throw paramiz.b(this.q, "overflow, value can not be represented as 8-bit value");
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Byte value");
      }
      return Byte.valueOf((byte)i);
    }
    if (localhm == hm.m)
      return (Byte)b();
    throw paramiz.a(this.q, localhm);
  }

  protected Short r(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Short.valueOf(paramhj.s());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      int i;
      try
      {
        if (str.length() == 0)
          return (Short)c();
        i = ii.a(str);
        if ((i < -32768) || (i > 32767))
          throw paramiz.b(this.q, "overflow, value can not be represented as 16-bit value");
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Short value");
      }
      return Short.valueOf((short)i);
    }
    if (localhm == hm.m)
      return (Short)b();
    throw paramiz.a(this.q, localhm);
  }

  protected final short s(hj paramhj, iz paramiz)
  {
    int i = t(paramhj, paramiz);
    if ((i < -32768) || (i > 32767))
      throw paramiz.b(this.q, "overflow, value can not be represented as 16-bit value");
    return (short)i;
  }

  protected final int t(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    int i;
    if ((localhm1 == hm.i) || (localhm1 == hm.j))
      i = paramhj.t();
    label160: hm localhm2;
    do
    {
      String str;
      int j;
      do
      {
        return i;
        if (localhm1 != hm.h)
          break;
        str = paramhj.k().trim();
        long l;
        try
        {
          j = str.length();
          if (j <= 9)
            break label160;
          l = Long.parseLong(str);
          if ((l < -2147483648L) || (l > 2147483647L))
            throw paramiz.b(this.q, "Overflow: numeric value (" + str + ") out of range of int (" + -2147483648 + " - " + 2147483647 + ")");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          throw paramiz.b(this.q, "not a valid int value");
        }
        return (int)l;
        i = 0;
      }
      while (j == 0);
      int k = ii.a(str);
      return k;
      localhm2 = hm.m;
      i = 0;
    }
    while (localhm1 == localhm2);
    throw paramiz.a(this.q, localhm1);
  }

  protected final Integer u(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Integer.valueOf(paramhj.t());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      int i;
      long l;
      try
      {
        i = str.length();
        if (i <= 9)
          break label166;
        l = Long.parseLong(str);
        if ((l < -2147483648L) || (l > 2147483647L))
          throw paramiz.b(this.q, "Overflow: numeric value (" + str + ") out of range of Integer (" + -2147483648 + " - " + 2147483647 + ")");
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Integer value");
      }
      int j = (int)l;
      return Integer.valueOf(j);
      label166: if (i == 0)
        return (Integer)c();
      Integer localInteger = Integer.valueOf(ii.a(str));
      return localInteger;
    }
    if (localhm == hm.m)
      return (Integer)b();
    throw paramiz.a(this.q, localhm);
  }

  protected final Long v(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Long.valueOf(paramhj.u());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if (str.length() == 0)
        return (Long)c();
      try
      {
        Long localLong = Long.valueOf(ii.b(str));
        return localLong;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Long value");
      }
    }
    if (localhm == hm.m)
      return (Long)b();
    throw paramiz.a(this.q, localhm);
  }

  protected final long w(hj paramhj, iz paramiz)
  {
    long l1 = 0L;
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      l1 = paramhj.u();
    do
    {
      String str;
      do
      {
        return l1;
        if (localhm != hm.h)
          break;
        str = paramhj.k().trim();
      }
      while (str.length() == 0);
      try
      {
        long l2 = ii.b(str);
        return l2;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid long value");
      }
    }
    while (localhm == hm.m);
    throw paramiz.a(this.q, localhm);
  }

  protected final Float x(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Float.valueOf(paramhj.w());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if (str.length() == 0)
        return (Float)c();
      switch (str.charAt(0))
      {
      default:
      case 'I':
      case 'N':
      case '-':
      }
      try
      {
        do
        {
          do
          {
            do
            {
              Float localFloat = Float.valueOf(Float.parseFloat(str));
              return localFloat;
            }
            while ((!"Infinity".equals(str)) && (!"INF".equals(str)));
            return Float.valueOf((1.0F / 1.0F));
          }
          while (!"NaN".equals(str));
          return Float.valueOf((0.0F / 0.0F));
        }
        while ((!"-Infinity".equals(str)) && (!"-INF".equals(str)));
        return Float.valueOf((1.0F / -1.0F));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Float value");
      }
    }
    if (localhm == hm.m)
      return (Float)b();
    throw paramiz.a(this.q, localhm);
  }

  protected final float y(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    float f1;
    if ((localhm1 == hm.i) || (localhm1 == hm.j))
      f1 = paramhj.w();
    hm localhm2;
    do
    {
      String str;
      int i;
      do
      {
        return f1;
        if (localhm1 != hm.h)
          break;
        str = paramhj.k().trim();
        i = str.length();
        f1 = 0.0F;
      }
      while (i == 0);
      switch (str.charAt(0))
      {
      default:
      case 'I':
      case 'N':
      case '-':
      }
      try
      {
        do
        {
          do
          {
            do
            {
              float f2 = Float.parseFloat(str);
              return f2;
            }
            while ((!"Infinity".equals(str)) && (!"INF".equals(str)));
            return (1.0F / 1.0F);
          }
          while (!"NaN".equals(str));
          return (0.0F / 0.0F);
        }
        while ((!"-Infinity".equals(str)) && (!"-INF".equals(str)));
        return (1.0F / -1.0F);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid float value");
      }
      localhm2 = hm.m;
      f1 = 0.0F;
    }
    while (localhm1 == localhm2);
    throw paramiz.a(this.q, localhm1);
  }

  protected final Double z(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return Double.valueOf(paramhj.x());
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if (str.length() == 0)
        return (Double)c();
      switch (str.charAt(0))
      {
      default:
      case 'I':
      case 'N':
      case '-':
      }
      try
      {
        do
        {
          do
          {
            do
            {
              Double localDouble = Double.valueOf(b(str));
              return localDouble;
            }
            while ((!"Infinity".equals(str)) && (!"INF".equals(str)));
            return Double.valueOf((1.0D / 0.0D));
          }
          while (!"NaN".equals(str));
          return Double.valueOf((0.0D / 0.0D));
        }
        while ((!"-Infinity".equals(str)) && (!"-INF".equals(str)));
        return Double.valueOf((-1.0D / 0.0D));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid Double value");
      }
    }
    if (localhm == hm.m)
      return (Double)b();
    throw paramiz.a(this.q, localhm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz
 * JD-Core Version:    0.6.2
 */