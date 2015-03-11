package com.flurry.sdk;

final class ma$a extends ma
{
  ma$a()
  {
    super(Boolean.class);
  }

  public final Boolean c(String paramString, iz paramiz)
  {
    if ("true".equals(paramString))
      return Boolean.TRUE;
    if ("false".equals(paramString))
      return Boolean.FALSE;
    throw paramiz.a(this.a, paramString, "value not 'true' or 'false'");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.a
 * JD-Core Version:    0.6.2
 */