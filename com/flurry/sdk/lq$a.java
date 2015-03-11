package com.flurry.sdk;

import java.lang.reflect.Method;

public class lq$a extends mc<Object>
{
  protected final Class<?> a;
  protected final Method b;

  public lq$a(Class<?> paramClass, mr parammr)
  {
    super(Enum.class);
    this.a = paramClass;
    this.b = parammr.e();
  }

  public Object a(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm != hm.h) && (localhm != hm.f))
      throw paramiz.b(this.a);
    String str = paramhj.k();
    try
    {
      Object localObject = this.b.invoke(this.a, new Object[] { str });
      return localObject;
    }
    catch (Exception localException)
    {
      qy.c(localException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lq.a
 * JD-Core Version:    0.6.2
 */