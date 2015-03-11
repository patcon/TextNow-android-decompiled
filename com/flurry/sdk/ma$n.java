package com.flurry.sdk;

final class ma$n extends ma
{
  private static final n b = new n(String.class);
  private static final n c = new n(Object.class);

  private ma$n(Class<?> paramClass)
  {
    super(paramClass);
  }

  public static n a(Class<?> paramClass)
  {
    if (paramClass == String.class)
      return b;
    if (paramClass == Object.class)
      return c;
    return new n(paramClass);
  }

  public final String c(String paramString, iz paramiz)
  {
    return paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.n
 * JD-Core Version:    0.6.2
 */