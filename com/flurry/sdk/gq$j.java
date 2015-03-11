package com.flurry.sdk;

import java.util.List;
import java.util.Map;

public class gq$j extends gq
{
  public final gq z;

  private gq$j(gq paramgq, gq[] paramArrayOfgq)
  {
    super(gq.i.d, c(paramArrayOfgq));
    this.z = paramgq;
    this.b[0] = this;
  }

  private static gq[] c(gq[] paramArrayOfgq)
  {
    gq[] arrayOfgq = new gq[1 + paramArrayOfgq.length];
    System.arraycopy(paramArrayOfgq, 0, arrayOfgq, 1, paramArrayOfgq.length);
    return arrayOfgq;
  }

  public j b(Map<gq.m, gq.m> paramMap, Map<gq.m, List<gq.f>> paramMap1)
  {
    j localj = new j(this.z, new gq[a(this.b, 1)]);
    a(this.b, 1, localj.b, 1, paramMap, paramMap1);
    return localj;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gq.j
 * JD-Core Version:    0.6.2
 */