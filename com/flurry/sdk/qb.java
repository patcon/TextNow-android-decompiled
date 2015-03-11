package com.flurry.sdk;

import java.util.Date;

public class qb extends pw<Object>
{
  static final qb a = new qb();

  public qb()
  {
    super(Object.class);
  }

  public void a(Object paramObject, hf paramhf, jw paramjw)
  {
    if ((paramObject instanceof Date))
    {
      paramjw.b((Date)paramObject, paramhf);
      return;
    }
    paramhf.a(paramObject.toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qb
 * JD-Core Version:    0.6.2
 */