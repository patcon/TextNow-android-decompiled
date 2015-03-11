package com.flurry.sdk;

import java.io.IOException;

public class aw
{
  private static final String a = aw.class.getSimpleName();
  private final String b;
  private final long c;
  private final boolean d;
  private fh e;

  public aw(String paramString, long paramLong, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0))
      throw new IllegalArgumentException("The cache must have a name");
    this.b = paramString;
    this.c = paramLong;
    this.d = paramBoolean;
  }

  public aw.b a(String paramString)
  {
    if (this.e == null);
    while (paramString == null)
      return null;
    try
    {
      fh.c localc = this.e.a(ce.c(paramString));
      if (localc != null)
      {
        localb = new aw.b(this, localc, this.d, null);
        return localb;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        eo.a(3, a, "Exception during get for cache: " + this.b + " key: " + paramString, localIOException);
        fe.a(null);
        aw.b localb = null;
        continue;
        localb = null;
      }
    }
  }

  public void a()
  {
    try
    {
      this.e = fh.a(ce.a(this.b), 1, 1, this.c);
      return;
    }
    catch (IOException localIOException)
    {
      eo.a(3, a, "Could not open cache: " + this.b);
    }
  }

  public aw.c b(String paramString)
  {
    if (this.e == null);
    while (paramString == null)
      return null;
    try
    {
      fh.a locala = this.e.b(ce.c(paramString));
      if (locala != null)
      {
        localc = new aw.c(this, locala, this.d, null);
        return localc;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        eo.a(3, a, "Exception during get for cache: " + this.b + " key: " + paramString, localIOException);
        fe.a(null);
        aw.c localc = null;
        continue;
        localc = null;
      }
    }
  }

  public void b()
  {
    fe.a(this.e);
  }

  public void c()
  {
    d();
    a();
  }

  public boolean c(String paramString)
  {
    if (this.e == null);
    while (paramString == null)
      return false;
    try
    {
      boolean bool = this.e.c(ce.c(paramString));
      return bool;
    }
    catch (IOException localIOException)
    {
      eo.a(3, a, "Exception during remove for cache: " + this.b + " key: " + paramString, localIOException);
    }
    return false;
  }

  public void d()
  {
    if (this.e == null)
      return;
    try
    {
      this.e.a();
      return;
    }
    catch (IOException localIOException)
    {
      eo.a(3, a, "Exception during delete for cache: " + this.b, localIOException);
    }
  }

  public boolean d(String paramString)
  {
    if (this.e == null);
    while (paramString == null)
      return false;
    try
    {
      fh.c localc = this.e.a(ce.c(paramString));
      boolean bool = false;
      if (localc != null)
        bool = true;
      fe.a(localc);
      return bool;
    }
    catch (IOException localIOException)
    {
      eo.a(3, a, "Exception during exists for cache: " + this.b, localIOException);
      return false;
    }
    finally
    {
      fe.a(null);
    }
  }

  protected void finalize()
  {
    super.finalize();
    b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aw
 * JD-Core Version:    0.6.2
 */