package com.flurry.sdk;

import java.util.StringTokenizer;

final class qu$a extends StringTokenizer
{
  protected final String a;
  protected int b;
  protected String c;

  public qu$a(String paramString)
  {
    super(paramString, "<,>", true);
    this.a = paramString;
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
    this.b -= paramString.length();
  }

  public final String b()
  {
    return this.a.substring(this.b);
  }

  public final boolean hasMoreTokens()
  {
    return (this.c != null) || (super.hasMoreTokens());
  }

  public final String nextToken()
  {
    String str;
    if (this.c != null)
    {
      str = this.c;
      this.c = null;
    }
    while (true)
    {
      this.b += str.length();
      return str;
      str = super.nextToken();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qu.a
 * JD-Core Version:    0.6.2
 */