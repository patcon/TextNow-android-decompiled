package com.flurry.sdk;

class fn$m
{
  private final String a;
  private final String b;
  private final String c;

  public fn$m(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      this.c = null;
      this.b = null;
      this.a = null;
      return;
    }
    int i = paramString1.lastIndexOf('.');
    if (i < 0)
    {
      this.b = paramString2;
      this.a = fn.g(paramString1);
      if (this.b != null)
        break label99;
    }
    label99: for (String str = this.a; ; str = this.b + "." + this.a)
    {
      this.c = str;
      return;
      this.b = paramString1.substring(0, i);
      this.a = fn.g(paramString1.substring(i + 1, paramString1.length()));
      break;
    }
  }

  public String a(String paramString)
  {
    if ((this.b == null) || (this.b.equals(paramString)))
      return this.a;
    return this.c;
  }

  public void a(fn.o paramo, hf paramhf)
  {
    if (this.a != null)
      paramhf.a("name", this.a);
    if (this.b != null)
    {
      if (!this.b.equals(paramo.a()))
        paramhf.a("namespace", this.b);
      if (paramo.a() == null)
        paramo.a(this.b);
    }
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    m localm;
    do
    {
      return true;
      if (!(paramObject instanceof m))
        return false;
      localm = (m)paramObject;
      if (this.c != null)
        break;
    }
    while (localm.c == null);
    return false;
    return this.c.equals(localm.c);
  }

  public int hashCode()
  {
    if (this.c == null)
      return 0;
    return this.c.hashCode();
  }

  public String toString()
  {
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.m
 * JD-Core Version:    0.6.2
 */