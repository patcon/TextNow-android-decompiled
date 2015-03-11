package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.Result;

abstract class hz$c<T extends Result> extends BaseImplementation.a<T, hy>
{
  public hz$c()
  {
    super(hd.BN);
  }

  protected abstract void a(hv paramhv);

  protected final void a(hy paramhy)
  {
    a(paramhy.fn());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hz.c
 * JD-Core Version:    0.6.2
 */