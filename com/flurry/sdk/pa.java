package com.flurry.sdk;

public class pa extends pc
{
  public pa(pc parampc)
  {
    super(parampc);
  }

  public jk<Object> a()
  {
    return this;
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw)
  {
    if (this.e != null)
    {
      c(paramObject, paramhf, paramjw);
      return;
    }
    b(paramObject, paramhf, paramjw);
  }

  public boolean b()
  {
    return true;
  }

  public String toString()
  {
    return "UnwrappingBeanSerializer for " + c().getName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pa
 * JD-Core Version:    0.6.2
 */