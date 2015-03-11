package com.flurry.sdk;

import java.util.Arrays;

public final class sa
{
  final sa a;
  final boolean b;
  private int c;
  private int d;
  private int[] e;
  private sc[] f;
  private sa.a[] g;
  private int h;
  private int i;
  private transient boolean j;
  private boolean k;
  private boolean l;
  private boolean m;

  private sa(int paramInt, boolean paramBoolean)
  {
    this.a = null;
    this.b = paramBoolean;
    if (paramInt < n)
      paramInt = n;
    while (true)
    {
      c(paramInt);
      return;
      if ((paramInt & paramInt - 1) != 0)
      {
        while (n < paramInt)
          n += n;
        paramInt = n;
      }
    }
  }

  private sa(sa paramsa, boolean paramBoolean)
  {
    this.a = paramsa;
    this.b = paramBoolean;
    this.c = paramsa.c;
    this.d = paramsa.d;
    this.e = paramsa.e;
    this.f = paramsa.f;
    this.g = paramsa.g;
    this.h = paramsa.h;
    this.i = paramsa.i;
    this.j = false;
    this.k = true;
    this.l = true;
    this.m = true;
  }

  public static sa a()
  {
    return new sa(64, true);
  }

  private static sc a(int paramInt1, String paramString, int[] paramArrayOfInt, int paramInt2)
  {
    if (paramInt2 < 4);
    int[] arrayOfInt;
    int n;
    switch (paramInt2)
    {
    default:
      arrayOfInt = new int[paramInt2];
      n = 0;
    case 1:
    case 2:
    case 3:
    }
    while (n < paramInt2)
    {
      arrayOfInt[n] = paramArrayOfInt[n];
      n++;
      continue;
      return new sd(paramString, paramInt1, paramArrayOfInt[0]);
      return new se(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1]);
      return new sf(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
    }
    return new sg(paramString, paramInt1, arrayOfInt, paramInt2);
  }

  private void a(int paramInt, sc paramsc)
  {
    if (this.k)
      j();
    if (this.j)
      g();
    this.c = (1 + this.c);
    int n = paramInt & this.d;
    int i5;
    if (this.f[n] == null)
    {
      this.e[n] = (paramInt << 8);
      if (this.l)
        l();
      this.f[n] = paramsc;
      int i4 = this.e.length;
      if (this.c > i4 >> 1)
      {
        i5 = i4 >> 2;
        if (this.c <= i4 - i5)
          break label260;
        this.j = true;
      }
    }
    label200: 
    while (this.h < i5)
    {
      return;
      if (this.m)
        k();
      this.h = (1 + this.h);
      int i1 = this.e[n];
      int i2 = i1 & 0xFF;
      int i3;
      if (i2 == 0)
        if (this.i <= 254)
        {
          i3 = this.i;
          this.i = (1 + this.i);
          if (i3 >= this.g.length)
            m();
          this.e[n] = (i1 & 0xFFFFFF00 | i3 + 1);
        }
      while (true)
      {
        this.g[i3] = new sa.a(paramsc, this.g[i3]);
        break;
        i3 = i();
        break label200;
        i3 = i2 - 1;
      }
    }
    label260: this.j = true;
  }

  private void a(sa paramsa)
  {
    while (true)
    {
      try
      {
        int n = paramsa.c;
        int i1 = this.c;
        if (n <= i1)
          return;
        if (paramsa.c() > 6000)
        {
          c(64);
          continue;
        }
      }
      finally
      {
      }
      this.c = paramsa.c;
      this.e = paramsa.e;
      this.f = paramsa.f;
      this.k = true;
      this.l = true;
      this.d = paramsa.d;
      this.g = paramsa.g;
      this.h = paramsa.h;
      this.i = paramsa.i;
    }
  }

  public static final int b(int paramInt)
  {
    int n = paramInt ^ paramInt >>> 16;
    return n ^ n >>> 8;
  }

  public static final int b(int paramInt1, int paramInt2)
  {
    int n = paramInt2 + paramInt1 * 31;
    int i1 = n ^ n >>> 16;
    return i1 ^ i1 >>> 8;
  }

  public static final int b(int[] paramArrayOfInt, int paramInt)
  {
    int n = paramArrayOfInt[0];
    for (int i1 = 1; i1 < paramInt; i1++)
      n = n * 31 + paramArrayOfInt[i1];
    int i2 = n ^ n >>> 16;
    return i2 ^ i2 >>> 8;
  }

  private void c(int paramInt)
  {
    this.c = 0;
    this.e = new int[paramInt];
    this.f = new sc[paramInt];
    this.k = false;
    this.l = false;
    this.d = (paramInt - 1);
    this.m = true;
    this.g = null;
    this.i = 0;
    this.j = false;
  }

  public static sc e()
  {
    return sd.b();
  }

  private void f()
  {
    this.k = true;
    this.l = true;
    this.m = true;
  }

  private void g()
  {
    int n = 0;
    this.j = false;
    this.l = false;
    int i1 = this.e.length;
    int i2 = i1 + i1;
    if (i2 > 65536)
      h();
    int i4;
    label333: 
    do
    {
      int i5;
      do
      {
        return;
        this.e = new int[i2];
        this.d = (i2 - 1);
        sc[] arrayOfsc = this.f;
        this.f = new sc[i2];
        int i3 = 0;
        i4 = 0;
        while (i3 < i1)
        {
          sc localsc2 = arrayOfsc[i3];
          if (localsc2 != null)
          {
            i4++;
            int i12 = localsc2.hashCode();
            int i13 = i12 & this.d;
            this.f[i13] = localsc2;
            this.e[i13] = (i12 << 8);
          }
          i3++;
        }
        i5 = this.i;
      }
      while (i5 == 0);
      this.h = 0;
      this.i = 0;
      this.m = false;
      sa.a[] arrayOfa = this.g;
      this.g = new sa.a[arrayOfa.length];
      while (n < i5)
      {
        sa.a locala = arrayOfa[n];
        int i6 = i4;
        while (locala != null)
        {
          i6++;
          sc localsc1 = locala.a;
          int i7 = localsc1.hashCode();
          int i8 = i7 & this.d;
          int i9 = this.e[i8];
          if (this.f[i8] == null)
          {
            this.e[i8] = (i7 << 8);
            this.f[i8] = localsc1;
            locala = locala.b;
          }
          else
          {
            this.h = (1 + this.h);
            int i10 = i9 & 0xFF;
            int i11;
            if (i10 == 0)
              if (this.i <= 254)
              {
                i11 = this.i;
                this.i = (1 + this.i);
                if (i11 >= this.g.length)
                  m();
                this.e[i8] = (i9 & 0xFFFFFF00 | i11 + 1);
              }
            while (true)
            {
              this.g[i11] = new sa.a(localsc1, this.g[i11]);
              break;
              i11 = i();
              break label333;
              i11 = i10 - 1;
            }
          }
        }
        n++;
        i4 = i6;
      }
    }
    while (i4 == this.c);
    throw new RuntimeException("Internal error: count after rehash " + i4 + "; should be " + this.c);
  }

  private void h()
  {
    this.c = 0;
    Arrays.fill(this.e, 0);
    Arrays.fill(this.f, null);
    Arrays.fill(this.g, null);
    this.h = 0;
    this.i = 0;
  }

  private int i()
  {
    sa.a[] arrayOfa = this.g;
    int n = 2147483647;
    int i1 = -1;
    int i2 = 0;
    int i3 = this.i;
    int i4;
    if (i2 < i3)
    {
      i4 = arrayOfa[i2].a();
      if (i4 >= n)
        break label64;
      if (i4 == 1)
        return i2;
      i1 = i2;
    }
    while (true)
    {
      i2++;
      n = i4;
      break;
      return i1;
      label64: i4 = n;
    }
  }

  private void j()
  {
    int[] arrayOfInt = this.e;
    int n = this.e.length;
    this.e = new int[n];
    System.arraycopy(arrayOfInt, 0, this.e, 0, n);
    this.k = false;
  }

  private void k()
  {
    sa.a[] arrayOfa = this.g;
    if (arrayOfa == null)
      this.g = new sa.a[32];
    while (true)
    {
      this.m = false;
      return;
      int n = arrayOfa.length;
      this.g = new sa.a[n];
      System.arraycopy(arrayOfa, 0, this.g, 0, n);
    }
  }

  private void l()
  {
    sc[] arrayOfsc = this.f;
    int n = arrayOfsc.length;
    this.f = new sc[n];
    System.arraycopy(arrayOfsc, 0, this.f, 0, n);
    this.l = false;
  }

  private void m()
  {
    sa.a[] arrayOfa = this.g;
    int n = arrayOfa.length;
    this.g = new sa.a[n + n];
    System.arraycopy(arrayOfa, 0, this.g, 0, n);
  }

  public final sa a(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      sa localsa = new sa(this, paramBoolean2);
      return localsa;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final sc a(int paramInt)
  {
    int n = b(paramInt);
    int i1 = n & this.d;
    int i2 = this.e[i1];
    sc localsc;
    if ((n ^ i2 >> 8) << 8 == 0)
    {
      localsc = this.f[i1];
      if (localsc != null);
    }
    sa.a locala;
    do
    {
      int i3;
      do
      {
        do
        {
          return null;
          if (!localsc.a(paramInt))
            break;
          return localsc;
        }
        while (i2 == 0);
        i3 = i2 & 0xFF;
      }
      while (i3 <= 0);
      int i4 = i3 - 1;
      locala = this.g[i4];
    }
    while (locala == null);
    return locala.a(n, paramInt, 0);
  }

  public final sc a(int paramInt1, int paramInt2)
  {
    int n = b(paramInt1, paramInt2);
    int i1 = n & this.d;
    int i2 = this.e[i1];
    sc localsc;
    if ((n ^ i2 >> 8) << 8 == 0)
    {
      localsc = this.f[i1];
      if (localsc != null);
    }
    sa.a locala;
    do
    {
      int i3;
      do
      {
        do
        {
          return null;
          if (!localsc.a(paramInt1, paramInt2))
            break;
          return localsc;
        }
        while (i2 == 0);
        i3 = i2 & 0xFF;
      }
      while (i3 <= 0);
      int i4 = i3 - 1;
      locala = this.g[i4];
    }
    while (locala == null);
    return locala.a(n, paramInt1, paramInt2);
  }

  public final sc a(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    if (this.b)
      paramString = sm.a.a(paramString);
    int n = b(paramArrayOfInt, paramInt);
    sc localsc = a(n, paramString, paramArrayOfInt, paramInt);
    a(n, localsc);
    return localsc;
  }

  public final sc a(int[] paramArrayOfInt, int paramInt)
  {
    int n = b(paramArrayOfInt, paramInt);
    int i1 = n & this.d;
    int i2 = this.e[i1];
    if ((n ^ i2 >> 8) << 8 == 0)
    {
      sc localsc = this.f[i1];
      if ((localsc == null) || (localsc.a(paramArrayOfInt, paramInt)))
        return localsc;
    }
    else if (i2 == 0)
    {
      return null;
    }
    int i3 = i2 & 0xFF;
    if (i3 > 0)
    {
      int i4 = i3 - 1;
      sa.a locala = this.g[i4];
      if (locala != null)
        return locala.a(n, paramArrayOfInt, paramInt);
    }
    return null;
  }

  public final void b()
  {
    if ((d()) && (this.a != null))
    {
      this.a.a(this);
      f();
    }
  }

  public final int c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return !this.k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sa
 * JD-Core Version:    0.6.2
 */