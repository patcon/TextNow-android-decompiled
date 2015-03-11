package com.flurry.sdk;

public enum hm
{
  final String n;
  final char[] o;
  final byte[] p;

  static
  {
    hm[] arrayOfhm = new hm[13];
    arrayOfhm[0] = a;
    arrayOfhm[1] = b;
    arrayOfhm[2] = c;
    arrayOfhm[3] = d;
    arrayOfhm[4] = e;
    arrayOfhm[5] = f;
    arrayOfhm[6] = g;
    arrayOfhm[7] = h;
    arrayOfhm[8] = i;
    arrayOfhm[9] = j;
    arrayOfhm[10] = k;
    arrayOfhm[11] = l;
    arrayOfhm[12] = m;
  }

  private hm(String paramString)
  {
    if (paramString == null)
    {
      this.n = null;
      this.o = null;
      this.p = null;
    }
    while (true)
    {
      return;
      this.n = paramString;
      this.o = paramString.toCharArray();
      int i2 = this.o.length;
      this.p = new byte[i2];
      for (int i3 = 0; i3 < i2; i3++)
        this.p[i3] = ((byte)this.o[i3]);
    }
  }

  public final String a()
  {
    return this.n;
  }

  public final char[] b()
  {
    return this.o;
  }

  public final boolean c()
  {
    return (this == i) || (this == j);
  }

  public final boolean d()
  {
    return ordinal() >= g.ordinal();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hm
 * JD-Core Version:    0.6.2
 */