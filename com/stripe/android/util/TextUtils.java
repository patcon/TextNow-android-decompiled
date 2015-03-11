package com.stripe.android.util;

public class TextUtils
{
  public static boolean hasAnyPrefix(String paramString, String[] paramArrayOfString)
  {
    if (paramString == null);
    while (true)
    {
      return false;
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
        if (paramString.startsWith(paramArrayOfString[j]))
          return true;
    }
  }

  public static boolean isBlank(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }

  public static boolean isWholePositiveNumber(String paramString)
  {
    if (paramString == null)
      return false;
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label36;
      if (!Character.isDigit(arrayOfChar[j]))
        break;
    }
    label36: return true;
  }

  public static String nullIfBlank(String paramString)
  {
    if (isBlank(paramString))
      paramString = null;
    return paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.util.TextUtils
 * JD-Core Version:    0.6.2
 */