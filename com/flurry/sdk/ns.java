package com.flurry.sdk;

public class ns extends nr
{
  protected final String a;
  protected final String b;

  protected ns(sh paramsh, qs paramqs)
  {
    super(paramsh, paramqs);
    String str = paramsh.p().getName();
    int i = str.lastIndexOf('.');
    if (i < 0)
    {
      this.a = "";
      this.b = ".";
      return;
    }
    this.b = str.substring(0, i + 1);
    this.a = str.substring(0, i);
  }

  public sh a(String paramString)
  {
    StringBuilder localStringBuilder;
    if (paramString.startsWith("."))
    {
      localStringBuilder = new StringBuilder(paramString.length() + this.a.length());
      if (this.a.length() != 0)
        break label60;
      localStringBuilder.append(paramString.substring(1));
    }
    while (true)
    {
      paramString = localStringBuilder.toString();
      return super.a(paramString);
      label60: localStringBuilder.append(this.a).append(paramString);
    }
  }

  public String a(Object paramObject)
  {
    String str = paramObject.getClass().getName();
    if (str.startsWith(this.b))
      str = str.substring(-1 + this.b.length());
    return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ns
 * JD-Core Version:    0.6.2
 */