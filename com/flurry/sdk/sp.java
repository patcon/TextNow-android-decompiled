package com.flurry.sdk;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class sp
{
  static final char[] a = new char[0];
  private final si b;
  private char[] c;
  private int d;
  private int e;
  private ArrayList<char[]> f;
  private boolean g = false;
  private int h;
  private char[] i;
  private int j;
  private String k;
  private char[] l;

  public sp(si paramsi)
  {
    this.b = paramsi;
  }

  private final char[] b(int paramInt)
  {
    if (this.b != null)
      return this.b.a(si.b.c, paramInt);
    return new char[Math.max(paramInt, 1000)];
  }

  private void c(int paramInt)
  {
    int m = this.e;
    this.e = 0;
    char[] arrayOfChar = this.c;
    this.c = null;
    int n = this.d;
    this.d = -1;
    int i1 = m + paramInt;
    if ((this.i == null) || (i1 > this.i.length))
      this.i = b(i1);
    if (m > 0)
      System.arraycopy(arrayOfChar, n, this.i, 0, m);
    this.h = 0;
    this.j = m;
  }

  private void d(int paramInt)
  {
    if (this.f == null)
      this.f = new ArrayList();
    char[] arrayOfChar1 = this.i;
    this.g = true;
    this.f.add(arrayOfChar1);
    this.h += arrayOfChar1.length;
    int m = arrayOfChar1.length;
    int n = m >> 1;
    if (n < paramInt);
    while (true)
    {
      char[] arrayOfChar2 = e(Math.min(262144, m + paramInt));
      this.j = 0;
      this.i = arrayOfChar2;
      return;
      paramInt = n;
    }
  }

  private final char[] e(int paramInt)
  {
    return new char[paramInt];
  }

  private final void o()
  {
    this.g = false;
    this.f.clear();
    this.h = 0;
    this.j = 0;
  }

  private char[] p()
  {
    if (this.k != null)
      return this.k.toCharArray();
    if (this.d >= 0)
    {
      if (this.e <= 0)
        return a;
      char[] arrayOfChar3 = e(this.e);
      System.arraycopy(this.c, this.d, arrayOfChar3, 0, this.e);
      return arrayOfChar3;
    }
    int m = c();
    if (m <= 0)
      return a;
    char[] arrayOfChar1 = e(m);
    int i3;
    if (this.f != null)
    {
      int i1 = this.f.size();
      int i2 = 0;
      i3 = 0;
      while (i2 < i1)
      {
        char[] arrayOfChar2 = (char[])this.f.get(i2);
        int i4 = arrayOfChar2.length;
        System.arraycopy(arrayOfChar2, 0, arrayOfChar1, i3, i4);
        i3 += i4;
        i2++;
      }
    }
    for (int n = i3; ; n = 0)
    {
      System.arraycopy(this.i, 0, arrayOfChar1, n, this.j);
      return arrayOfChar1;
    }
  }

  public final void a()
  {
    if (this.b == null)
      b();
    while (this.i == null)
      return;
    b();
    char[] arrayOfChar = this.i;
    this.i = null;
    this.b.a(si.b.c, arrayOfChar);
  }

  public final void a(char paramChar)
  {
    if (this.d >= 0)
      c(16);
    this.k = null;
    this.l = null;
    char[] arrayOfChar = this.i;
    if (this.j >= arrayOfChar.length)
    {
      d(1);
      arrayOfChar = this.i;
    }
    int m = this.j;
    this.j = (m + 1);
    arrayOfChar[m] = paramChar;
  }

  public final void a(int paramInt)
  {
    this.j = paramInt;
  }

  public final void a(String paramString)
  {
    this.c = null;
    this.d = -1;
    this.e = 0;
    this.k = paramString;
    this.l = null;
    if (this.g)
      o();
    this.j = 0;
  }

  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.d >= 0)
      c(paramInt2);
    this.k = null;
    this.l = null;
    char[] arrayOfChar = this.i;
    int m = arrayOfChar.length - this.j;
    if (m >= paramInt2)
    {
      paramString.getChars(paramInt1, paramInt1 + paramInt2, arrayOfChar, this.j);
      this.j = (paramInt2 + this.j);
      return;
    }
    if (m > 0)
    {
      paramString.getChars(paramInt1, paramInt1 + m, arrayOfChar, this.j);
      paramInt2 -= m;
      paramInt1 += m;
    }
    d(paramInt2);
    paramString.getChars(paramInt1, paramInt1 + paramInt2, this.i, 0);
    this.j = paramInt2;
  }

  public final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.k = null;
    this.l = null;
    this.c = paramArrayOfChar;
    this.d = paramInt1;
    this.e = paramInt2;
    if (this.g)
      o();
  }

  public final void b()
  {
    this.d = -1;
    this.j = 0;
    this.e = 0;
    this.c = null;
    this.k = null;
    this.l = null;
    if (this.g)
      o();
  }

  public final void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.c = null;
    this.d = -1;
    this.e = 0;
    this.k = null;
    this.l = null;
    if (this.g)
      o();
    while (true)
    {
      this.h = 0;
      this.j = 0;
      c(paramArrayOfChar, paramInt1, paramInt2);
      return;
      if (this.i == null)
        this.i = b(paramInt2);
    }
  }

  public final int c()
  {
    if (this.d >= 0)
      return this.e;
    if (this.l != null)
      return this.l.length;
    if (this.k != null)
      return this.k.length();
    return this.h + this.j;
  }

  public final void c(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.d >= 0)
      c(paramInt2);
    this.k = null;
    this.l = null;
    char[] arrayOfChar = this.i;
    int m = arrayOfChar.length - this.j;
    if (m >= paramInt2)
    {
      System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, this.j, paramInt2);
      this.j = (paramInt2 + this.j);
      return;
    }
    if (m > 0)
    {
      System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, this.j, m);
      paramInt1 += m;
      paramInt2 -= m;
    }
    d(paramInt2);
    System.arraycopy(paramArrayOfChar, paramInt1, this.i, 0, paramInt2);
    this.j = paramInt2;
  }

  public final int d()
  {
    if (this.d >= 0)
      return this.d;
    return 0;
  }

  public final char[] e()
  {
    if (this.d >= 0)
      return this.c;
    if (this.l != null)
      return this.l;
    if (this.k != null)
    {
      char[] arrayOfChar = this.k.toCharArray();
      this.l = arrayOfChar;
      return arrayOfChar;
    }
    if (!this.g)
      return this.i;
    return g();
  }

  public final String f()
  {
    if (this.k == null)
    {
      if (this.l == null)
        break label34;
      this.k = new String(this.l);
    }
    while (true)
    {
      return this.k;
      label34: if (this.d >= 0)
      {
        if (this.e <= 0)
        {
          this.k = "";
          return "";
        }
        this.k = new String(this.c, this.d, this.e);
      }
      else
      {
        int m = this.h;
        int n = this.j;
        if (m == 0)
        {
          if (n == 0);
          for (String str = ""; ; str = new String(this.i, 0, n))
          {
            this.k = str;
            break;
          }
        }
        StringBuilder localStringBuilder = new StringBuilder(m + n);
        if (this.f != null)
        {
          int i1 = this.f.size();
          for (int i2 = 0; i2 < i1; i2++)
          {
            char[] arrayOfChar = (char[])this.f.get(i2);
            localStringBuilder.append(arrayOfChar, 0, arrayOfChar.length);
          }
        }
        localStringBuilder.append(this.i, 0, this.j);
        this.k = localStringBuilder.toString();
      }
    }
  }

  public final char[] g()
  {
    char[] arrayOfChar = this.l;
    if (arrayOfChar == null)
    {
      arrayOfChar = p();
      this.l = arrayOfChar;
    }
    return arrayOfChar;
  }

  public final BigDecimal h()
  {
    if (this.l != null)
      return new BigDecimal(this.l);
    if (this.d >= 0)
      return new BigDecimal(this.c, this.d, this.e);
    if (this.h == 0)
      return new BigDecimal(this.i, 0, this.j);
    return new BigDecimal(g());
  }

  public final double i()
  {
    return ii.c(f());
  }

  public final char[] j()
  {
    if (this.d >= 0)
      c(1);
    while (true)
    {
      return this.i;
      char[] arrayOfChar = this.i;
      if (arrayOfChar == null)
        this.i = b(0);
      else if (this.j >= arrayOfChar.length)
        d(1);
    }
  }

  public final char[] k()
  {
    this.d = -1;
    this.j = 0;
    this.e = 0;
    this.c = null;
    this.k = null;
    this.l = null;
    if (this.g)
      o();
    char[] arrayOfChar = this.i;
    if (arrayOfChar == null)
    {
      arrayOfChar = b(0);
      this.i = arrayOfChar;
    }
    return arrayOfChar;
  }

  public final int l()
  {
    return this.j;
  }

  public final char[] m()
  {
    if (this.f == null)
      this.f = new ArrayList();
    this.g = true;
    this.f.add(this.i);
    int m = this.i.length;
    this.h = (m + this.h);
    char[] arrayOfChar = e(Math.min(m + (m >> 1), 262144));
    this.j = 0;
    this.i = arrayOfChar;
    return arrayOfChar;
  }

  public final char[] n()
  {
    char[] arrayOfChar = this.i;
    int m = arrayOfChar.length;
    if (m == 262144);
    for (int n = 262145; ; n = Math.min(262144, m + (m >> 1)))
    {
      this.i = e(n);
      System.arraycopy(arrayOfChar, 0, this.i, 0, m);
      return this.i;
    }
  }

  public final String toString()
  {
    return f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sp
 * JD-Core Version:    0.6.2
 */