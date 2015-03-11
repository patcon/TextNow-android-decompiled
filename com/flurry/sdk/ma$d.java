package com.flurry.sdk;

final class ma$d extends ma
{
  ma$d()
  {
    super(Character.class);
  }

  public final Character c(String paramString, iz paramiz)
  {
    if (paramString.length() == 1)
      return Character.valueOf(paramString.charAt(0));
    throw paramiz.a(this.a, paramString, "can only convert 1-character Strings");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.d
 * JD-Core Version:    0.6.2
 */