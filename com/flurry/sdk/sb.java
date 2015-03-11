package com.flurry.sdk;

import java.util.Arrays;

public final class sb
{
  static final sb a = new sb();
  protected sb b;
  protected final boolean c;
  protected final boolean d;
  protected String[] e;
  protected sb.a[] f;
  protected int g;
  protected int h;
  protected int i;
  protected boolean j;

  private sb()
  {
    this.d = true;
    this.c = true;
    this.j = true;
    a(64);
  }

  private sb(sb paramsb, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, sb.a[] paramArrayOfa, int paramInt)
  {
    this.b = paramsb;
    this.d = paramBoolean1;
    this.c = paramBoolean2;
    this.e = paramArrayOfString;
    this.f = paramArrayOfa;
    this.g = paramInt;
    int k = paramArrayOfString.length;
    this.h = (k - (k >> 2));
    this.i = (k - 1);
    this.j = false;
  }

  public static int a(String paramString)
  {
    int k = paramString.charAt(0);
    int m = 1;
    int n = paramString.length();
    while (m < n)
    {
      k = k * 31 + paramString.charAt(m);
      m++;
    }
    return k;
  }

  public static int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int k = paramArrayOfChar[0];
    for (int m = 1; m < paramInt2; m++)
      k = k * 31 + paramArrayOfChar[m];
    return k;
  }

  public static sb a()
  {
    return a.e();
  }

  private void a(int paramInt)
  {
    this.e = new String[paramInt];
    this.f = new sb.a[paramInt >> 1];
    this.i = (paramInt - 1);
    this.g = 0;
    this.h = (paramInt - (paramInt >> 2));
  }

  private void a(sb paramsb)
  {
    try
    {
      if (paramsb.c() > 12000)
        a(64);
      while (true)
      {
        this.j = false;
        do
          return;
        while (paramsb.c() <= c());
        this.e = paramsb.e;
        this.f = paramsb.f;
        this.g = paramsb.g;
        this.h = paramsb.h;
        this.i = paramsb.i;
      }
    }
    finally
    {
    }
  }

  private sb e()
  {
    return new sb(null, true, true, this.e, this.f, this.g);
  }

  private void f()
  {
    String[] arrayOfString = this.e;
    int k = arrayOfString.length;
    this.e = new String[k];
    System.arraycopy(arrayOfString, 0, this.e, 0, k);
    sb.a[] arrayOfa = this.f;
    int m = arrayOfa.length;
    this.f = new sb.a[m];
    System.arraycopy(arrayOfa, 0, this.f, 0, m);
  }

  private void g()
  {
    int k = this.e.length;
    int m = k + k;
    if (m > 65536)
    {
      this.g = 0;
      Arrays.fill(this.e, null);
      Arrays.fill(this.f, null);
      this.j = true;
    }
    label155: int i3;
    do
    {
      return;
      String[] arrayOfString = this.e;
      sb.a[] arrayOfa = this.f;
      this.e = new String[m];
      this.f = new sb.a[m >> 1];
      this.i = (m - 1);
      this.h += this.h;
      int n = 0;
      int i1 = 0;
      if (n < k)
      {
        String str2 = arrayOfString[n];
        int i8;
        if (str2 != null)
        {
          i1++;
          i8 = a(str2) & this.i;
          if (this.e[i8] != null)
            break label155;
          this.e[i8] = str2;
        }
        while (true)
        {
          n++;
          break;
          int i9 = i8 >> 1;
          this.f[i9] = new sb.a(str2, this.f[i9]);
        }
      }
      int i2 = k >> 1;
      i3 = i1;
      for (int i4 = 0; i4 < i2; i4++)
      {
        sb.a locala = arrayOfa[i4];
        if (locala != null)
        {
          int i5 = i3 + 1;
          String str1 = locala.a();
          int i6 = a(str1) & this.i;
          if (this.e[i6] == null)
            this.e[i6] = str1;
          while (true)
          {
            locala = locala.b();
            i3 = i5;
            break;
            int i7 = i6 >> 1;
            this.f[i7] = new sb.a(str1, this.f[i7]);
          }
        }
      }
    }
    while (i3 == this.g);
    throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + i3 + ".");
  }

  public final sb a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      sb localsb = new sb(this, paramBoolean1, paramBoolean2, this.e, this.f, this.g);
      return localsb;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 <= 0)
      return "";
    if (!this.d)
      return new String(paramArrayOfChar, paramInt1, paramInt2);
    int k = paramInt3 & this.i;
    String str1 = this.e[k];
    if (str1 != null)
    {
      if (str1.length() == paramInt2)
      {
        int i1 = 0;
        do
        {
          if (str1.charAt(i1) != paramArrayOfChar[(paramInt1 + i1)])
            break;
          i1++;
        }
        while (i1 < paramInt2);
        if (i1 == paramInt2)
          return str1;
      }
      sb.a locala = this.f[(k >> 1)];
      if (locala != null)
      {
        String str3 = locala.a(paramArrayOfChar, paramInt1, paramInt2);
        if (str3 != null)
          return str3;
      }
    }
    int m;
    if (!this.j)
    {
      f();
      this.j = true;
      m = k;
    }
    while (true)
    {
      this.g = (1 + this.g);
      String str2 = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (this.c)
        str2 = sm.a.a(str2);
      if (this.e[m] == null)
      {
        this.e[m] = str2;
        return str2;
        if (this.g >= this.h)
        {
          g();
          m = a(paramArrayOfChar, paramInt1, paramInt2) & this.i;
        }
      }
      else
      {
        int n = m >> 1;
        this.f[n] = new sb.a(str2, this.f[n]);
        return str2;
        m = k;
      }
    }
  }

  public final void b()
  {
    if (!d());
    while (this.b == null)
      return;
    this.b.a(this);
    this.j = false;
  }

  public final int c()
  {
    return this.g;
  }

  public final boolean d()
  {
    return this.j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sb
 * JD-Core Version:    0.6.2
 */