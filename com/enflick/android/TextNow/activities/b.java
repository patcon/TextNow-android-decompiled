package com.enflick.android.TextNow.activities;

import textnow.i.a;

public final class b
{
  private a a;
  private android.support.v7.app.d b;
  private int c;
  private int d;
  private c e;

  public b(android.support.v7.app.d paramd, int paramInt1, int paramInt2, c paramc)
  {
    this.b = paramd;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramc;
  }

  public final int a()
  {
    if (this.a == null)
      return 3;
    return 2;
  }

  public final void b()
  {
    if (this.a != null)
      this.a.b();
  }

  public final void c()
  {
    if (this.a != null)
      this.a.c();
  }

  public final void d()
  {
    this.b.a(new d(this));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.b
 * JD-Core Version:    0.6.2
 */