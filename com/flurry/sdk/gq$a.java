package com.flurry.sdk;

import java.util.List;
import java.util.Map;

public class gq$a extends gq
{
  public final String[] A;
  public final gq[] z;

  private gq$a(gq[] paramArrayOfgq, String[] paramArrayOfString)
  {
    super(gq.i.e);
    this.z = paramArrayOfgq;
    this.A = paramArrayOfString;
  }

  public gq a(int paramInt)
  {
    return this.z[paramInt];
  }

  public a b(Map<gq.m, gq.m> paramMap, Map<gq.m, List<gq.f>> paramMap1)
  {
    gq[] arrayOfgq = new gq[this.z.length];
    for (int i = 0; i < arrayOfgq.length; i++)
      arrayOfgq[i] = this.z[i].a(paramMap, paramMap1);
    return new a(arrayOfgq, this.A);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gq.a
 * JD-Core Version:    0.6.2
 */