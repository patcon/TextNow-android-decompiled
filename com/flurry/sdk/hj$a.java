package com.flurry.sdk;

public enum hj$a
{
  final boolean k;

  static
  {
    a[] arrayOfa = new a[10];
    arrayOfa[0] = a;
    arrayOfa[1] = b;
    arrayOfa[2] = c;
    arrayOfa[3] = d;
    arrayOfa[4] = e;
    arrayOfa[5] = f;
    arrayOfa[6] = g;
    arrayOfa[7] = h;
    arrayOfa[8] = i;
    arrayOfa[9] = j;
  }

  private hj$a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public static int a()
  {
    int m = 0;
    for (a locala : values())
      if (locala.b())
        m |= locala.c();
    return m;
  }

  public final boolean a(int paramInt)
  {
    return (paramInt & c()) != 0;
  }

  public final boolean b()
  {
    return this.k;
  }

  public final int c()
  {
    return 1 << ordinal();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hj.a
 * JD-Core Version:    0.6.2
 */