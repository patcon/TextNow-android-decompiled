package com.flurry.sdk;

public class oj extends pc
{
  public oj(sh paramsh, oi[] paramArrayOfoi1, oi[] paramArrayOfoi2, of paramof, Object paramObject)
  {
    super(paramsh, paramArrayOfoi1, paramArrayOfoi2, paramof, paramObject);
  }

  public oj(Class<?> paramClass, oi[] paramArrayOfoi1, oi[] paramArrayOfoi2, of paramof, Object paramObject)
  {
    super(paramClass, paramArrayOfoi1, paramArrayOfoi2, paramof, paramObject);
  }

  public static oj a(Class<?> paramClass)
  {
    return new oj(paramClass, a, null, null, null);
  }

  public jk<Object> a()
  {
    return new pa(this);
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw)
  {
    paramhf.d();
    if (this.e != null)
      c(paramObject, paramhf, paramjw);
    while (true)
    {
      paramhf.e();
      return;
      b(paramObject, paramhf, paramjw);
    }
  }

  public String toString()
  {
    return "BeanSerializer for " + c().getName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oj
 * JD-Core Version:    0.6.2
 */