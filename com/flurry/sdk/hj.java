package com.flurry.sdk;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class hj
  implements Closeable
{
  protected int a;
  protected hm b;
  protected hm c;

  protected hj()
  {
  }

  protected hj(int paramInt)
  {
    this.a = paramInt;
  }

  protected hi a(String paramString)
  {
    return new hi(paramString, i());
  }

  public abstract hn a();

  public boolean a(hj.a parama)
  {
    return (this.a & parama.c()) != 0;
  }

  public abstract byte[] a(ha paramha);

  public abstract hm b();

  public hm c()
  {
    hm localhm = b();
    if (localhm == hm.f)
      localhm = b();
    return localhm;
  }

  public abstract void close();

  public abstract hj d();

  public hm e()
  {
    return this.b;
  }

  public void f()
  {
    if (this.b != null)
    {
      this.c = this.b;
      this.b = null;
    }
  }

  public abstract String g();

  public abstract hg h();

  public abstract hg i();

  public boolean j()
  {
    return e() == hm.d;
  }

  public abstract String k();

  public abstract char[] l();

  public abstract int m();

  public abstract int n();

  public boolean o()
  {
    return false;
  }

  public abstract Number p();

  public abstract hj.b q();

  public byte r()
  {
    int i = t();
    if ((i < -128) || (i > 127))
      throw a("Numeric value (" + k() + ") out of range of Java byte");
    return (byte)i;
  }

  public short s()
  {
    int i = t();
    if ((i < -32768) || (i > 32767))
      throw a("Numeric value (" + k() + ") out of range of Java short");
    return (short)i;
  }

  public abstract int t();

  public abstract long u();

  public abstract BigInteger v();

  public abstract float w();

  public abstract double x();

  public abstract BigDecimal y();

  public Object z()
  {
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hj
 * JD-Core Version:    0.6.2
 */