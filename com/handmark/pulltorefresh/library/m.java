package com.handmark.pulltorefresh.library;

public enum m
{
  private int g;

  static
  {
    m[] arrayOfm = new m[6];
    arrayOfm[0] = a;
    arrayOfm[1] = b;
    arrayOfm[2] = c;
    arrayOfm[3] = d;
    arrayOfm[4] = e;
    arrayOfm[5] = f;
  }

  private m(int paramInt)
  {
    this.g = paramInt;
  }

  static m a(int paramInt)
  {
    for (m localm : values())
      if (paramInt == localm.g)
        return localm;
    return a;
  }

  final int a()
  {
    return this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.m
 * JD-Core Version:    0.6.2
 */