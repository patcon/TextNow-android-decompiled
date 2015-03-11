package com.flurry.sdk;

import java.util.Arrays;

public class sl$b
  implements hs
{
  static final String a;
  static final char[] b;

  static
  {
    try
    {
      String str2 = System.getProperty("line.separator");
      str1 = str2;
      if (str1 == null)
        str1 = "\n";
      a = str1;
      char[] arrayOfChar = new char[64];
      b = arrayOfChar;
      Arrays.fill(arrayOfChar, ' ');
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str1 = null;
    }
  }

  public void a(hf paramhf, int paramInt)
  {
    paramhf.c(a);
    int i = paramInt + paramInt;
    while (i > 64)
    {
      paramhf.b(b, 0, 64);
      i -= b.length;
    }
    paramhf.b(b, 0, i);
  }

  public boolean a()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sl.b
 * JD-Core Version:    0.6.2
 */