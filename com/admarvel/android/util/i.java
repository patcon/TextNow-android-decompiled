package com.admarvel.android.util;

public class i
{
  public String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (true)
    {
      int j = paramString.indexOf("&#", i);
      int m;
      if (j != -1)
      {
        int k = paramString.indexOf(';', j);
        if (k != -1)
        {
          m = j + 2;
          int n = -1;
          if (m < k)
          {
            int i1 = paramString.charAt(m);
            if ((48 <= i1) && (i1 <= 57))
            {
              if (n == -1);
              for (int i2 = 0; ; i2 = n * 10)
              {
                n = -48 + (i2 + i1);
                m++;
                break;
              }
            }
          }
          if (m != k)
            n = -1;
          if (n != -1)
          {
            localStringBuffer.append((char)n);
            i = k + 1;
            continue;
          }
          while (i < m)
          {
            localStringBuffer.append(paramString.charAt(i));
            i++;
          }
        }
      }
      else
      {
        if (localStringBuffer.length() == 0)
          return paramString;
        localStringBuffer.append(paramString.substring(i, paramString.length()));
        return localStringBuffer.toString();
        i = m;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.i
 * JD-Core Version:    0.6.2
 */