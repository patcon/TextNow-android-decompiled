package com.flurry.sdk;

import java.io.UnsupportedEncodingException;

public class gy
  implements CharSequence, Comparable<gy>
{
  private static final byte[] a = new byte[0];
  private byte[] b = a;
  private int c;
  private String d;

  public gy()
  {
  }

  public gy(gy paramgy)
  {
    this.c = paramgy.c;
    this.b = new byte[paramgy.c];
    System.arraycopy(paramgy.b, 0, this.b, 0, this.c);
    this.d = paramgy.d;
  }

  public gy(String paramString)
  {
    this.b = a(paramString);
    this.c = this.b.length;
    this.d = paramString;
  }

  public static final byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return new byte[0];
  }

  public int a(gy paramgy)
  {
    return ga.a(this.b, 0, this.c, paramgy.b, 0, paramgy.c);
  }

  public gy a(int paramInt)
  {
    if (this.c < paramInt)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.b, 0, arrayOfByte, 0, this.c);
      this.b = arrayOfByte;
    }
    this.c = paramInt;
    this.d = null;
    return this;
  }

  public byte[] a()
  {
    return this.b;
  }

  public int b()
  {
    return this.c;
  }

  public char charAt(int paramInt)
  {
    return toString().charAt(paramInt);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    gy localgy;
    int i;
    int j;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof gy;
        bool2 = false;
      }
      while (!bool1);
      localgy = (gy)paramObject;
      i = this.c;
      j = localgy.c;
      bool2 = false;
    }
    while (i != j);
    byte[] arrayOfByte = localgy.b;
    for (int k = 0; ; k++)
    {
      if (k >= this.c)
        break label98;
      int m = this.b[k];
      int n = arrayOfByte[k];
      bool2 = false;
      if (m != n)
        break;
    }
    label98: return true;
  }

  public int hashCode()
  {
    int i = 0;
    int j = 0;
    while (i < this.c)
    {
      j = j * 31 + this.b[i];
      i++;
    }
    return j;
  }

  public int length()
  {
    return toString().length();
  }

  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return toString().subSequence(paramInt1, paramInt2);
  }

  public String toString()
  {
    if (this.d == null);
    try
    {
      this.d = new String(this.b, 0, this.c, "UTF-8");
      return this.d;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        localUnsupportedEncodingException.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gy
 * JD-Core Version:    0.6.2
 */