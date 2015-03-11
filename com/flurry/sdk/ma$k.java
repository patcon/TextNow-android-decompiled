package com.flurry.sdk;

final class ma$k extends ma
{
  ma$k()
  {
    super(Integer.class);
  }

  public final Short c(String paramString, iz paramiz)
  {
    int i = a(paramString);
    if ((i < -32768) || (i > 32767))
      throw paramiz.a(this.a, paramString, "overflow, value can not be represented as 16-bit value");
    return Short.valueOf((short)i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.k
 * JD-Core Version:    0.6.2
 */