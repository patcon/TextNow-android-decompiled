package com.flurry.sdk;

public enum cn
{
  private String d;

  static
  {
    cn[] arrayOfcn = new cn[3];
    arrayOfcn[0] = a;
    arrayOfcn[1] = b;
    arrayOfcn[2] = c;
  }

  private cn(String paramString)
  {
    this.d = paramString;
  }

  public static cn a(String paramString)
  {
    if (b.a().equals(paramString))
      return b;
    if (c.a().equals(paramString))
      return c;
    return a;
  }

  public final String a()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cn
 * JD-Core Version:    0.6.2
 */