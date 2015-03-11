package com.flurry.sdk;

import java.nio.ByteBuffer;

public class gm extends gk
  implements gn.a
{
  protected gf c;

  gm(gq paramgq, gf paramgf)
  {
    super(paramgq);
    a(paramgf);
  }

  private void b(int paramInt)
  {
    this.a.a(gq.k);
    gq.h localh = (gq.h)this.a.c();
    if (paramInt != localh.A)
      throw new fl("Incorrect length for fixed binary: expected " + localh.A + " but received " + paramInt + " bytes.");
  }

  public gm a(gf paramgf)
  {
    this.a.e();
    this.c = paramgf;
    return this;
  }

  public gq a(gq paramgq1, gq paramgq2)
  {
    return null;
  }

  public gy a(gy paramgy)
  {
    this.a.a(gq.i);
    return this.c.a(paramgy);
  }

  public ByteBuffer a(ByteBuffer paramByteBuffer)
  {
    this.a.a(gq.j);
    return this.c.a(paramByteBuffer);
  }

  protected void a()
  {
    this.a.a(gq.k);
    gq.h localh = (gq.h)this.a.c();
    this.c.a(localh.A);
  }

  public void a(int paramInt)
  {
    b(paramInt);
    this.c.a(paramInt);
  }

  public void b()
  {
    this.a.a(gq.c);
    this.c.b();
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramInt2);
    this.c.b(paramArrayOfByte, paramInt1, paramInt2);
  }

  public boolean c()
  {
    this.a.a(gq.d);
    return this.c.c();
  }

  public int d()
  {
    this.a.a(gq.e);
    return this.c.d();
  }

  public long e()
  {
    this.a.a(gq.f);
    return this.c.e();
  }

  public float f()
  {
    this.a.a(gq.g);
    return this.c.f();
  }

  public double g()
  {
    this.a.a(gq.h);
    return this.c.g();
  }

  public String h()
  {
    this.a.a(gq.i);
    return this.c.h();
  }

  public void i()
  {
    this.a.a(gq.i);
    this.c.i();
  }

  public void j()
  {
    this.a.a(gq.j);
    this.c.j();
  }

  public int k()
  {
    this.a.a(gq.l);
    gq.h localh = (gq.h)this.a.c();
    int i = this.c.k();
    if ((i < 0) || (i >= localh.A))
      throw new fl("Enumeration out of range: max is " + localh.A + " but received " + i);
    return i;
  }

  public long m()
  {
    this.a.a(gq.n);
    long l = this.c.m();
    if (l == 0L)
      this.a.a(gq.o);
    return l;
  }

  public long n()
  {
    this.a.b();
    long l = this.c.n();
    if (l == 0L)
      this.a.a(gq.o);
    return l;
  }

  public long o()
  {
    this.a.a(gq.n);
    for (long l1 = this.c.o(); l1 != 0L; l1 = this.c.o())
      while (true)
      {
        long l2 = l1 - 1L;
        if (l1 <= 0L)
          break;
        this.a.f();
        l1 = l2;
      }
    this.a.a(gq.o);
    return 0L;
  }

  public long p()
  {
    this.a.a(gq.p);
    long l = this.c.p();
    if (l == 0L)
      this.a.a(gq.q);
    return l;
  }

  public long q()
  {
    this.a.b();
    long l = this.c.q();
    if (l == 0L)
      this.a.a(gq.q);
    return l;
  }

  public long r()
  {
    this.a.a(gq.p);
    for (long l1 = this.c.r(); l1 != 0L; l1 = this.c.r())
      while (true)
      {
        long l2 = l1 - 1L;
        if (l1 <= 0L)
          break;
        this.a.f();
        l1 = l2;
      }
    this.a.a(gq.q);
    return 0L;
  }

  public int s()
  {
    this.a.a(gq.m);
    gq.a locala = (gq.a)this.a.c();
    int i = this.c.s();
    this.a.c(locala.a(i));
    return i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gm
 * JD-Core Version:    0.6.2
 */