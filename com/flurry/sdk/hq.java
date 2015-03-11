package com.flurry.sdk;

public class hq
  implements Comparable<hq>
{
  private static final hq e = new hq(0, 0, 0, null);
  protected final int a;
  protected final int b;
  protected final int c;
  protected final String d;

  public hq(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
  }

  public int a(hq paramhq)
  {
    int i = this.a - paramhq.a;
    if (i == 0)
    {
      i = this.b - paramhq.b;
      if (i == 0)
        i = this.c - paramhq.c;
    }
    return i;
  }

  public boolean a()
  {
    return (this.d != null) && (this.d.length() > 0);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    hq localhq;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localhq = (hq)paramObject;
    }
    while ((localhq.a == this.a) && (localhq.b == this.b) && (localhq.c == this.c));
    return false;
  }

  public int hashCode()
  {
    return this.a + this.b + this.c;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a).append('.');
    localStringBuilder.append(this.b).append('.');
    localStringBuilder.append(this.c);
    if (a())
      localStringBuilder.append('-').append(this.d);
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hq
 * JD-Core Version:    0.6.2
 */