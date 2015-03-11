package com.flurry.sdk;

final class ma$g extends ma
{
  protected final ra<?> b;
  protected final mr c;

  protected ma$g(ra<?> paramra, mr parammr)
  {
    super(paramra.a());
    this.b = paramra;
    this.c = parammr;
  }

  public final Object b(String paramString, iz paramiz)
  {
    if (this.c != null);
    Object localObject1;
    do
    {
      try
      {
        Object localObject2 = this.c.a(paramString);
        localObject1 = localObject2;
        return localObject1;
      }
      catch (Exception localException)
      {
        qy.c(localException);
      }
      localObject1 = this.b.a(paramString);
    }
    while (localObject1 != null);
    throw paramiz.a(this.a, paramString, "not one of values for Enum class");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.g
 * JD-Core Version:    0.6.2
 */