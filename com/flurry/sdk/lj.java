package com.flurry.sdk;

import java.util.concurrent.atomic.AtomicReference;

public class lj extends mc<AtomicReference<?>>
  implements js
{
  protected final sh a;
  protected final is b;
  protected jg<?> c;

  public lj(sh paramsh, is paramis)
  {
    super(AtomicReference.class);
    this.a = paramsh;
    this.b = paramis;
  }

  public void a(iy paramiy, jc paramjc)
  {
    this.c = paramjc.a(paramiy, this.a, this.b);
  }

  public AtomicReference<?> b(hj paramhj, iz paramiz)
  {
    return new AtomicReference(this.c.a(paramhj, paramiz));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lj
 * JD-Core Version:    0.6.2
 */