package textnow.ap;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import textnow.am.h;
import textnow.am.j;
import textnow.am.l;
import textnow.am.m;
import textnow.am.o;
import textnow.ar.c;

public final class f extends c
{
  private static final Writer a = new Writer()
  {
    public final void close()
    {
      throw new AssertionError();
    }

    public final void flush()
    {
      throw new AssertionError();
    }

    public final void write(char[] paramAnonymousArrayOfChar, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      throw new AssertionError();
    }
  };
  private static final o b = new o("closed");
  private final List<j> c = new ArrayList();
  private String d;
  private j e = l.a;

  public f()
  {
    super(a);
  }

  private void a(j paramj)
  {
    if (this.d != null)
    {
      if ((!paramj.j()) || (i()))
        ((m)j()).a(this.d, paramj);
      this.d = null;
      return;
    }
    if (this.c.isEmpty())
    {
      this.e = paramj;
      return;
    }
    j localj = j();
    if ((localj instanceof h))
    {
      ((h)localj).a(paramj);
      return;
    }
    throw new IllegalStateException();
  }

  private j j()
  {
    return (j)this.c.get(-1 + this.c.size());
  }

  public final j a()
  {
    if (!this.c.isEmpty())
      throw new IllegalStateException("Expected one JSON element but was " + this.c);
    return this.e;
  }

  public final c a(long paramLong)
  {
    a(new o(Long.valueOf(paramLong)));
    return this;
  }

  public final c a(Number paramNumber)
  {
    if (paramNumber == null)
      return f();
    if (!g())
    {
      double d1 = paramNumber.doubleValue();
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1)))
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramNumber);
    }
    a(new o(paramNumber));
    return this;
  }

  public final c a(String paramString)
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof m))
    {
      this.d = paramString;
      return this;
    }
    throw new IllegalStateException();
  }

  public final c a(boolean paramBoolean)
  {
    a(new o(Boolean.valueOf(paramBoolean)));
    return this;
  }

  public final c b()
  {
    h localh = new h();
    a(localh);
    this.c.add(localh);
    return this;
  }

  public final c b(String paramString)
  {
    if (paramString == null)
      return f();
    a(new o(paramString));
    return this;
  }

  public final c c()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof h))
    {
      this.c.remove(-1 + this.c.size());
      return this;
    }
    throw new IllegalStateException();
  }

  public final void close()
  {
    if (!this.c.isEmpty())
      throw new IOException("Incomplete document");
    this.c.add(b);
  }

  public final c d()
  {
    m localm = new m();
    a(localm);
    this.c.add(localm);
    return this;
  }

  public final c e()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof m))
    {
      this.c.remove(-1 + this.c.size());
      return this;
    }
    throw new IllegalStateException();
  }

  public final c f()
  {
    a(l.a);
    return this;
  }

  public final void flush()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.f
 * JD-Core Version:    0.6.2
 */