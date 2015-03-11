package com.flurry.sdk;

public enum hf$a
{
  final boolean h;
  final int i;

  static
  {
    a[] arrayOfa = new a[7];
    arrayOfa[0] = a;
    arrayOfa[1] = b;
    arrayOfa[2] = c;
    arrayOfa[3] = d;
    arrayOfa[4] = e;
    arrayOfa[5] = f;
    arrayOfa[6] = g;
  }

  private hf$a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    this.i = (1 << ordinal());
  }

  public static int a()
  {
    int k = 0;
    for (a locala : values())
      if (locala.b())
        k |= locala.c();
    return k;
  }

  public final boolean b()
  {
    return this.h;
  }

  public final int c()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hf.a
 * JD-Core Version:    0.6.2
 */