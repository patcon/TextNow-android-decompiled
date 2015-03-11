package com.flurry.sdk;

import java.util.EnumSet;
import java.util.Iterator;

public class pj extends pb<EnumSet<? extends Enum<?>>>
{
  public pj(sh paramsh, is paramis)
  {
    super(EnumSet.class, paramsh, true, null, paramis, null);
  }

  public pf<?> a(jz paramjz)
  {
    return this;
  }

  public void a(EnumSet<? extends Enum<?>> paramEnumSet, hf paramhf, jw paramjw)
  {
    jk localjk1 = this.d;
    Iterator localIterator = paramEnumSet.iterator();
    jk localjk2 = localjk1;
    while (localIterator.hasNext())
    {
      Enum localEnum = (Enum)localIterator.next();
      if (localjk2 == null)
        localjk2 = paramjw.a(localEnum.getDeclaringClass(), this.e);
      localjk2.a(localEnum, paramhf, paramjw);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pj
 * JD-Core Version:    0.6.2
 */