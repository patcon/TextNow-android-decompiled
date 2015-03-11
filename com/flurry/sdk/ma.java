package com.flurry.sdk;

public abstract class ma extends jl
{
  protected final Class<?> a;

  protected ma(Class<?> paramClass)
  {
    this.a = paramClass;
  }

  protected int a(String paramString)
  {
    return Integer.parseInt(paramString);
  }

  public Class<?> a()
  {
    return this.a;
  }

  public final Object a(String paramString, iz paramiz)
  {
    Object localObject2;
    if (paramString == null)
      localObject2 = null;
    while (true)
    {
      return localObject2;
      try
      {
        Object localObject1 = b(paramString, paramiz);
        localObject2 = localObject1;
        if (localObject2 != null)
          continue;
        throw paramiz.a(this.a, paramString, "not a valid representation");
      }
      catch (Exception localException)
      {
        throw paramiz.a(this.a, paramString, "not a valid representation: " + localException.getMessage());
      }
    }
  }

  protected long b(String paramString)
  {
    return Long.parseLong(paramString);
  }

  protected abstract Object b(String paramString, iz paramiz);

  protected double c(String paramString)
  {
    return ii.c(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma
 * JD-Core Version:    0.6.2
 */