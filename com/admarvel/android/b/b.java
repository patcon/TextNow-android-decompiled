package com.admarvel.android.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private BufferedReader a;
  private boolean b = true;
  private char c;
  private char d;
  private int e;
  private boolean f;

  public b(Reader paramReader)
  {
    this(paramReader, ',', '"', 0);
  }

  public b(Reader paramReader, char paramChar1, char paramChar2, int paramInt)
  {
    this.a = new BufferedReader(paramReader);
    this.c = paramChar1;
    this.d = paramChar2;
    this.e = paramInt;
  }

  private String[] a(String paramString)
  {
    if (paramString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new StringBuffer();
    int i = 0;
    String str = paramString;
    while (true)
    {
      Object localObject2;
      int j;
      if (i != 0)
      {
        ((StringBuffer)localObject1).append("\n");
        str = d();
        if (str == null);
      }
      else
      {
        localObject2 = localObject1;
        j = i;
        int k = 0;
        if (k < str.length())
        {
          char c1 = str.charAt(k);
          if (c1 == this.d)
            if ((j != 0) && (str.length() > k + 1) && (str.charAt(k + 1) == this.d))
            {
              ((StringBuffer)localObject2).append(str.charAt(k + 1));
              k++;
            }
          while (true)
          {
            k++;
            break;
            if (j == 0);
            for (j = 1; ; j = 0)
            {
              if ((k <= 2) || (str.charAt(k - 1) == this.c) || (str.length() <= k + 1) || (str.charAt(k + 1) == this.c))
                break label219;
              ((StringBuffer)localObject2).append(c1);
              break;
            }
            label219: continue;
            if ((c1 == this.c) && (j == 0))
            {
              localArrayList.add(((StringBuffer)localObject2).toString());
              localObject2 = new StringBuffer();
            }
            else
            {
              ((StringBuffer)localObject2).append(c1);
            }
          }
        }
        if (j != 0)
          break label303;
        localObject1 = localObject2;
      }
      localArrayList.add(((StringBuffer)localObject1).toString());
      return (String[])localArrayList.toArray(new String[0]);
      label303: i = j;
      localObject1 = localObject2;
    }
  }

  private String d()
  {
    if (!this.f)
    {
      for (int i = 0; i < this.e; i++)
        this.a.readLine();
      this.f = true;
    }
    String str = this.a.readLine();
    if (str == null)
      this.b = false;
    if (this.b)
      return str;
    return null;
  }

  public String[] a()
  {
    String str = d();
    if (this.b)
      return a(str);
    return null;
  }

  public void b()
  {
    this.a.close();
  }

  public ArrayList<String[]> c()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      while (true)
      {
        String[] arrayOfString = a();
        if (arrayOfString == null)
          break;
        localArrayList.add(arrayOfString);
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      localArrayList = null;
    }
    return localArrayList;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.b.b
 * JD-Core Version:    0.6.2
 */