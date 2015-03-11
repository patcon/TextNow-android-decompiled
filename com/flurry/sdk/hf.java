package com.flurry.sdk;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class hf
  implements Closeable
{
  protected ho a;

  public abstract hf a();

  public hf a(int paramInt)
  {
    return this;
  }

  public hf a(ho paramho)
  {
    this.a = paramho;
    return this;
  }

  public hf a(id paramid)
  {
    return this;
  }

  public abstract void a(char paramChar);

  public abstract void a(double paramDouble);

  public abstract void a(float paramFloat);

  public abstract void a(long paramLong);

  public abstract void a(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void a(hh paramhh);

  public void a(hp paramhp)
  {
    a(paramhp.a());
  }

  public void a(im paramim)
  {
    a(paramim.a());
  }

  public abstract void a(Object paramObject);

  public abstract void a(String paramString);

  public final void a(String paramString, int paramInt)
  {
    a(paramString);
    b(paramInt);
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    a(paramString);
    a(paramBoolean);
  }

  public abstract void a(BigDecimal paramBigDecimal);

  public abstract void a(BigInteger paramBigInteger);

  public abstract void a(boolean paramBoolean);

  public void a(byte[] paramArrayOfByte)
  {
    a(hb.a(), paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public abstract void a(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public abstract void b();

  public abstract void b(int paramInt);

  public void b(hp paramhp)
  {
    b(paramhp.a());
  }

  public abstract void b(String paramString);

  public abstract void b(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public abstract void c();

  public abstract void c(String paramString);

  public abstract void close();

  public abstract void d();

  public abstract void d(String paramString);

  public abstract void e();

  public abstract void e(String paramString);

  public abstract void f();

  public final void f(String paramString)
  {
    a(paramString);
    b();
  }

  public abstract void g();

  public final void g(String paramString)
  {
    a(paramString);
    d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hf
 * JD-Core Version:    0.6.2
 */