package com.flurry.sdk;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class sq extends hf
{
  protected static final int b = hj.a.a();
  protected hn c;
  protected int d;
  protected boolean e;
  protected sq.b f;
  protected sq.b g;
  protected int h;
  protected hx i;

  public sq(hn paramhn)
  {
    this.c = paramhn;
    this.d = b;
    this.i = hx.g();
    sq.b localb = new sq.b();
    this.g = localb;
    this.f = localb;
    this.h = 0;
  }

  public hf a()
  {
    return this;
  }

  public hj a(hj paramhj)
  {
    sq.a locala = new sq.a(this.f, paramhj.a());
    locala.a(paramhj.h());
    return locala;
  }

  public hj a(hn paramhn)
  {
    return new sq.a(this.f, paramhn);
  }

  public void a(char paramChar)
  {
    i();
  }

  public void a(double paramDouble)
  {
    a(hm.j, Double.valueOf(paramDouble));
  }

  public void a(float paramFloat)
  {
    a(hm.j, Float.valueOf(paramFloat));
  }

  public void a(long paramLong)
  {
    a(hm.i, Long.valueOf(paramLong));
  }

  public void a(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    a(arrayOfByte);
  }

  public void a(hf paramhf)
  {
    sq.b localb1 = this.f;
    int j = -1;
    Object localObject1 = localb1;
    int k = j + 1;
    int m;
    Object localObject2;
    if (k >= 16)
    {
      sq.b localb2 = ((sq.b)localObject1).a();
      if (localb2 != null)
      {
        m = 0;
        localObject2 = localb2;
      }
    }
    while (true)
    {
      hm localhm = ((sq.b)localObject2).a(m);
      if (localhm != null)
      {
        Object localObject5;
        switch (1.a[localhm.ordinal()])
        {
        default:
          throw new RuntimeException("Internal error: should never end up through this code path");
        case 1:
          paramhf.d();
          j = m;
          localObject1 = localObject2;
          break;
        case 2:
          paramhf.e();
          j = m;
          localObject1 = localObject2;
          break;
        case 3:
          paramhf.b();
          j = m;
          localObject1 = localObject2;
          break;
        case 4:
          paramhf.c();
          j = m;
          localObject1 = localObject2;
          break;
        case 5:
          localObject5 = ((sq.b)localObject2).b(m);
          if ((localObject5 instanceof hp))
            paramhf.a((hp)localObject5);
        case 6:
        case 7:
        case 8:
          Object localObject3;
          while (true)
          {
            j = m;
            localObject1 = localObject2;
            break;
            paramhf.a((String)localObject5);
            j = m;
            localObject1 = localObject2;
            break;
            Object localObject4 = ((sq.b)localObject2).b(m);
            if ((localObject4 instanceof hp))
            {
              paramhf.b((hp)localObject4);
            }
            else
            {
              paramhf.b((String)localObject4);
              j = m;
              localObject1 = localObject2;
              break;
              Number localNumber = (Number)((sq.b)localObject2).b(m);
              if ((localNumber instanceof BigInteger))
              {
                paramhf.a((BigInteger)localNumber);
              }
              else if ((localNumber instanceof Long))
              {
                paramhf.a(localNumber.longValue());
              }
              else
              {
                paramhf.b(localNumber.intValue());
                j = m;
                localObject1 = localObject2;
                break;
                localObject3 = ((sq.b)localObject2).b(m);
                if ((localObject3 instanceof BigDecimal))
                {
                  paramhf.a((BigDecimal)localObject3);
                }
                else if ((localObject3 instanceof Float))
                {
                  paramhf.a(((Float)localObject3).floatValue());
                }
                else if ((localObject3 instanceof Double))
                {
                  paramhf.a(((Double)localObject3).doubleValue());
                }
                else if (localObject3 == null)
                {
                  paramhf.f();
                }
                else
                {
                  if (!(localObject3 instanceof String))
                    break label475;
                  paramhf.e((String)localObject3);
                }
              }
            }
          }
          throw new he("Unrecognized value type for VALUE_NUMBER_FLOAT: " + localObject3.getClass().getName() + ", can not serialize");
        case 9:
          paramhf.a(true);
          j = m;
          localObject1 = localObject2;
          break;
        case 10:
          paramhf.a(false);
          j = m;
          localObject1 = localObject2;
          break;
        case 11:
          paramhf.f();
          j = m;
          localObject1 = localObject2;
          break;
        case 12:
          label475: paramhf.a(((sq.b)localObject2).b(m));
          j = m;
          localObject1 = localObject2;
          break;
        }
      }
      return;
      localObject2 = localObject1;
      m = k;
    }
  }

  public void a(hh paramhh)
  {
    a(hm.g, paramhh);
  }

  protected final void a(hm paramhm)
  {
    sq.b localb = this.g.a(this.h, paramhm);
    if (localb == null)
    {
      this.h = (1 + this.h);
      return;
    }
    this.g = localb;
    this.h = 1;
  }

  protected final void a(hm paramhm, Object paramObject)
  {
    sq.b localb = this.g.a(this.h, paramhm, paramObject);
    if (localb == null)
    {
      this.h = (1 + this.h);
      return;
    }
    this.g = localb;
    this.h = 1;
  }

  public void a(hp paramhp)
  {
    a(hm.f, paramhp);
    this.i.a(paramhp.a());
  }

  public void a(im paramim)
  {
    a(hm.f, paramim);
    this.i.a(paramim.a());
  }

  public void a(Object paramObject)
  {
    a(hm.g, paramObject);
  }

  public final void a(String paramString)
  {
    a(hm.f, paramString);
    this.i.a(paramString);
  }

  public void a(BigDecimal paramBigDecimal)
  {
    if (paramBigDecimal == null)
    {
      f();
      return;
    }
    a(hm.j, paramBigDecimal);
  }

  public void a(BigInteger paramBigInteger)
  {
    if (paramBigInteger == null)
    {
      f();
      return;
    }
    a(hm.i, paramBigInteger);
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (hm localhm = hm.k; ; localhm = hm.l)
    {
      a(localhm);
      return;
    }
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    b(new String(paramArrayOfChar, paramInt1, paramInt2));
  }

  public final void b()
  {
    a(hm.d);
    this.i = this.i.h();
  }

  public void b(int paramInt)
  {
    a(hm.i, Integer.valueOf(paramInt));
  }

  public void b(hj paramhj)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    default:
      throw new RuntimeException("Internal error: should never end up through this code path");
    case 1:
      d();
      return;
    case 2:
      e();
      return;
    case 3:
      b();
      return;
    case 4:
      c();
      return;
    case 5:
      a(paramhj.g());
      return;
    case 6:
      if (paramhj.o())
      {
        a(paramhj.l(), paramhj.n(), paramhj.m());
        return;
      }
      b(paramhj.k());
      return;
    case 7:
      switch (1.b[paramhj.q().ordinal()])
      {
      default:
        a(paramhj.u());
        return;
      case 1:
        b(paramhj.t());
        return;
      case 2:
      }
      a(paramhj.v());
      return;
    case 8:
      switch (1.b[paramhj.q().ordinal()])
      {
      default:
        a(paramhj.x());
        return;
      case 3:
        a(paramhj.y());
        return;
      case 4:
      }
      a(paramhj.w());
      return;
    case 9:
      a(true);
      return;
    case 10:
      a(false);
      return;
    case 11:
      f();
      return;
    case 12:
    }
    a(paramhj.z());
  }

  public void b(hp paramhp)
  {
    if (paramhp == null)
    {
      f();
      return;
    }
    a(hm.h, paramhp);
  }

  public void b(String paramString)
  {
    if (paramString == null)
    {
      f();
      return;
    }
    a(hm.h, paramString);
  }

  public void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    i();
  }

  public final void c()
  {
    a(hm.e);
    hx localhx = this.i.j();
    if (localhx != null)
      this.i = localhx;
  }

  public void c(hj paramhj)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.f)
    {
      a(paramhj.g());
      localhm = paramhj.b();
    }
    switch (1.a[localhm.ordinal()])
    {
    case 2:
    default:
      b(paramhj);
      return;
    case 3:
      b();
      while (paramhj.b() != hm.e)
        c(paramhj);
      c();
      return;
    case 1:
    }
    d();
    while (paramhj.b() != hm.c)
      c(paramhj);
    e();
  }

  public void c(String paramString)
  {
    i();
  }

  public void close()
  {
    this.e = true;
  }

  public final void d()
  {
    a(hm.b);
    this.i = this.i.i();
  }

  public void d(String paramString)
  {
    i();
  }

  public final void e()
  {
    a(hm.c);
    hx localhx = this.i.j();
    if (localhx != null)
      this.i = localhx;
  }

  public void e(String paramString)
  {
    a(hm.j, paramString);
  }

  public void f()
  {
    a(hm.m);
  }

  public void g()
  {
  }

  public hj h()
  {
    return a(this.c);
  }

  protected void i()
  {
    throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[TokenBuffer: ");
    hj localhj = h();
    int j = 0;
    try
    {
      while (true)
      {
        hm localhm = localhj.b();
        if (localhm == null)
          break;
        if (j < 100)
        {
          if (j > 0)
            localStringBuilder.append(", ");
          localStringBuilder.append(localhm.toString());
        }
        j++;
      }
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
    if (j >= 100)
      localStringBuilder.append(" ... (truncated ").append(j - 100).append(" entries)");
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sq
 * JD-Core Version:    0.6.2
 */