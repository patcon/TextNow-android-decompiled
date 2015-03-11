package com.flurry.sdk;

import java.util.Locale;

public class lt$d extends lt<Locale>
{
  public lt$d()
  {
    super(Locale.class);
  }

  protected Locale b(String paramString, iz paramiz)
  {
    int i = paramString.indexOf('_');
    if (i < 0)
      return new Locale(paramString);
    String str1 = paramString.substring(0, i);
    String str2 = paramString.substring(i + 1);
    int j = str2.indexOf('_');
    if (j < 0)
      return new Locale(str1, str2);
    return new Locale(str1, str2.substring(0, j), str2.substring(j + 1));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lt.d
 * JD-Core Version:    0.6.2
 */