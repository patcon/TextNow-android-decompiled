package com.flurry.sdk;

final class ma$b extends ma
{
  ma$b()
  {
    super(Byte.class);
  }

  public final Byte c(String paramString, iz paramiz)
  {
    int i = a(paramString);
    if ((i < -128) || (i > 127))
      throw paramiz.a(this.a, paramString, "overflow, value can not be represented as 8-bit value");
    return Byte.valueOf((byte)i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.b
 * JD-Core Version:    0.6.2
 */