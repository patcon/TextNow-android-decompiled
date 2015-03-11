package com.flurry.sdk;

final class nd$a<T>
{
  public final T a;
  public final a<T> b;
  public final String c;
  public final boolean d;
  public final boolean e;

  public nd$a(T paramT, a<T> parama, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramT;
    this.b = parama;
    a locala;
    if (paramString == null)
    {
      paramString = null;
      locala = this;
    }
    while (true)
    {
      locala.c = paramString;
      this.d = paramBoolean1;
      this.e = paramBoolean2;
      return;
      if (paramString.length() == 0)
      {
        locala = this;
        paramString = null;
      }
      else
      {
        locala = this;
      }
    }
  }

  private a<T> b(a<T> parama)
  {
    if (this.b == null)
      return a(parama);
    return a(this.b.b(parama));
  }

  public final a<T> a()
  {
    if (this.e)
      if (this.b == null)
        this = null;
    a locala;
    do
    {
      do
      {
        return this;
        this = this.b;
        break;
      }
      while (this.b == null);
      locala = this.b.a();
    }
    while (locala == this.b);
    return a(locala);
  }

  public final a<T> a(a<T> parama)
  {
    if (parama == this.b)
      return this;
    return new a(this.a, parama, this.c, this.d, this.e);
  }

  public final a<T> a(T paramT)
  {
    if (paramT == this.a)
      return this;
    return new a(paramT, this.b, this.c, this.d, this.e);
  }

  public final a<T> b()
  {
    if (this.b == null);
    for (a locala = null; ; locala = this.b.b())
    {
      if (this.d)
        locala = a(locala);
      return locala;
    }
  }

  public final a<T> c()
  {
    if (this.b == null)
      return this;
    a locala = this.b.c();
    if (this.c != null)
    {
      if (locala.c == null)
        return a(null);
      return a(locala);
    }
    if (locala.c != null)
      return locala;
    if (this.d == locala.d)
      return a(locala);
    if (this.d)
      return a(null);
    return locala;
  }

  public final String toString()
  {
    String str = this.a.toString() + "[visible=" + this.d + "]";
    if (this.b != null)
      str = str + ", " + this.b.toString();
    return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nd.a
 * JD-Core Version:    0.6.2
 */