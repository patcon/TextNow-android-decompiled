package com.flurry.sdk;

public final class ry extends rz
{
  static final ry c = new ry("");
  final String d;

  public ry(String paramString)
  {
    this.d = paramString;
  }

  protected static void a(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append('"');
    sk.a(paramStringBuilder, paramString);
    paramStringBuilder.append('"');
  }

  public static ry b(String paramString)
  {
    if (paramString == null)
      return null;
    if (paramString.length() == 0)
      return c;
    return new ry(paramString);
  }

  public final double a(double paramDouble)
  {
    return ii.a(this.d, paramDouble);
  }

  public final void a(hf paramhf, jw paramjw)
  {
    if (this.d == null)
    {
      paramhf.f();
      return;
    }
    paramhf.b(this.d);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramObject == null);
      localClass1 = paramObject.getClass();
      localClass2 = getClass();
      bool = false;
    }
    while (localClass1 != localClass2);
    return ((ry)paramObject).d.equals(this.d);
  }

  public final boolean f()
  {
    return true;
  }

  public final int hashCode()
  {
    return this.d.hashCode();
  }

  public final String i()
  {
    return this.d;
  }

  public final String n()
  {
    return this.d;
  }

  public final String toString()
  {
    int i = this.d.length();
    StringBuilder localStringBuilder = new StringBuilder(i + 2 + (i >> 4));
    a(localStringBuilder, this.d);
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ry
 * JD-Core Version:    0.6.2
 */