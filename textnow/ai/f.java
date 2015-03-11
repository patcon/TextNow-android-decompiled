package textnow.ai;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import textnow.af.j;
import textnow.af.m;
import textnow.af.o;
import textnow.af.p;
import textnow.af.r;
import textnow.ak.c;

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
  private static final r b = new r("closed");
  private final List<m> c = new ArrayList();
  private String d;
  private m e = o.a;

  public f()
  {
    super(a);
  }

  private void a(m paramm)
  {
    if (this.d != null)
    {
      if ((!paramm.k()) || (i()))
        ((p)j()).a(this.d, paramm);
      this.d = null;
      return;
    }
    if (this.c.isEmpty())
    {
      this.e = paramm;
      return;
    }
    m localm = j();
    if ((localm instanceof j))
    {
      ((j)localm).a(paramm);
      return;
    }
    throw new IllegalStateException();
  }

  private m j()
  {
    return (m)this.c.get(-1 + this.c.size());
  }

  public final m a()
  {
    if (!this.c.isEmpty())
      throw new IllegalStateException("Expected one JSON element but was " + this.c);
    return this.e;
  }

  public final c a(long paramLong)
  {
    a(new r(Long.valueOf(paramLong)));
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
    a(new r(paramNumber));
    return this;
  }

  public final c a(String paramString)
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof p))
    {
      this.d = paramString;
      return this;
    }
    throw new IllegalStateException();
  }

  public final c a(boolean paramBoolean)
  {
    a(new r(Boolean.valueOf(paramBoolean)));
    return this;
  }

  public final c b()
  {
    j localj = new j();
    a(localj);
    this.c.add(localj);
    return this;
  }

  public final c b(String paramString)
  {
    if (paramString == null)
      return f();
    a(new r(paramString));
    return this;
  }

  public final c c()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof j))
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
    p localp = new p();
    a(localp);
    this.c.add(localp);
    return this;
  }

  public final c e()
  {
    if ((this.c.isEmpty()) || (this.d != null))
      throw new IllegalStateException();
    if ((j() instanceof p))
    {
      this.c.remove(-1 + this.c.size());
      return this;
    }
    throw new IllegalStateException();
  }

  public final c f()
  {
    a(o.a);
    return this;
  }

  public final void flush()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.f
 * JD-Core Version:    0.6.2
 */