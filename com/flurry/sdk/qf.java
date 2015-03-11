package com.flurry.sdk;

import java.util.TimeZone;

public class qf extends pt<TimeZone>
{
  public static final qf a = new qf();

  public qf()
  {
    super(TimeZone.class);
  }

  public void a(TimeZone paramTimeZone, hf paramhf, jw paramjw)
  {
    paramhf.b(paramTimeZone.getID());
  }

  public void a(TimeZone paramTimeZone, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.a(paramTimeZone, paramhf, TimeZone.class);
    a(paramTimeZone, paramhf, paramjw);
    paramjz.d(paramTimeZone, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qf
 * JD-Core Version:    0.6.2
 */