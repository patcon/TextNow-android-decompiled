package com.handmark.pulltorefresh.library;

public enum e
{
  public static e f = b;
  public static e g = c;
  private int h;

  static
  {
    e[] arrayOfe = new e[5];
    arrayOfe[0] = a;
    arrayOfe[1] = b;
    arrayOfe[2] = c;
    arrayOfe[3] = d;
    arrayOfe[4] = e;
    i = arrayOfe;
  }

  private e(int paramInt)
  {
    this.h = paramInt;
  }

  static e a()
  {
    return b;
  }

  static e a(int paramInt)
  {
    for (e locale : values())
      if (paramInt == locale.h)
        return locale;
    return b;
  }

  final boolean b()
  {
    return (this != a) && (this != e);
  }

  public final boolean c()
  {
    return (this == b) || (this == d);
  }

  public final boolean d()
  {
    return (this == c) || (this == d) || (this == e);
  }

  final int e()
  {
    return this.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.e
 * JD-Core Version:    0.6.2
 */