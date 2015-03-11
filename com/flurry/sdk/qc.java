package com.flurry.sdk;

import java.util.Calendar;
import java.util.Date;

public class qc
{
  protected static final jk<Object> a = new qb();
  protected static final jk<Object> b = new qc.c();

  public static jk<Object> a(sh paramsh)
  {
    if (paramsh == null)
      return a;
    Class localClass = paramsh.p();
    if (localClass == String.class)
      return b;
    if (localClass == Object.class)
      return a;
    if (Date.class.isAssignableFrom(localClass))
      return qc.b.a;
    if (Calendar.class.isAssignableFrom(localClass))
      return qc.a.a;
    return a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qc
 * JD-Core Version:    0.6.2
 */