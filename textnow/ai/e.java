package textnow.ai;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import textnow.af.j;
import textnow.af.m;
import textnow.af.o;
import textnow.af.p;
import textnow.af.r;
import textnow.ak.a;
import textnow.ak.b;

public final class e extends a
{
  private static final Reader a = new Reader()
  {
    public final void close()
    {
      throw new AssertionError();
    }

    public final int read(char[] paramAnonymousArrayOfChar, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      throw new AssertionError();
    }
  };
  private static final Object b = new Object();
  private final List<Object> c = new ArrayList();

  public e(m paramm)
  {
    super(a);
    this.c.add(paramm);
  }

  private void a(b paramb)
  {
    if (f() != paramb)
      throw new IllegalStateException("Expected " + paramb + " but was " + f());
  }

  private Object q()
  {
    return this.c.get(-1 + this.c.size());
  }

  private Object r()
  {
    return this.c.remove(-1 + this.c.size());
  }

  public final void a()
  {
    a(b.a);
    j localj = (j)q();
    this.c.add(localj.iterator());
  }

  public final void b()
  {
    a(b.b);
    r();
    r();
  }

  public final void c()
  {
    a(b.c);
    p localp = (p)q();
    this.c.add(localp.a().iterator());
  }

  public final void close()
  {
    this.c.clear();
    this.c.add(b);
  }

  public final void d()
  {
    a(b.d);
    r();
    r();
  }

  public final boolean e()
  {
    b localb = f();
    return (localb != b.d) && (localb != b.b);
  }

  public final b f()
  {
    Object localObject;
    boolean bool;
    while (true)
    {
      if (this.c.isEmpty())
        return b.j;
      localObject = q();
      if (!(localObject instanceof Iterator))
        break label109;
      bool = this.c.get(-2 + this.c.size()) instanceof p;
      Iterator localIterator = (Iterator)localObject;
      if (!localIterator.hasNext())
        break;
      if (bool)
        return b.e;
      this.c.add(localIterator.next());
    }
    if (bool)
      return b.d;
    return b.b;
    label109: if ((localObject instanceof p))
      return b.c;
    if ((localObject instanceof j))
      return b.a;
    if ((localObject instanceof r))
    {
      r localr = (r)localObject;
      if (localr.p())
        return b.f;
      if (localr.a())
        return b.h;
      if (localr.o())
        return b.g;
      throw new AssertionError();
    }
    if ((localObject instanceof o))
      return b.i;
    if (localObject == b)
      throw new IllegalStateException("JsonReader is closed");
    throw new AssertionError();
  }

  public final String g()
  {
    a(b.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    return (String)localEntry.getKey();
  }

  public final String h()
  {
    b localb = f();
    if ((localb != b.f) && (localb != b.g))
      throw new IllegalStateException("Expected " + b.f + " but was " + localb);
    return ((r)r()).c();
  }

  public final boolean i()
  {
    a(b.h);
    return ((r)r()).g();
  }

  public final void j()
  {
    a(b.i);
    r();
  }

  public final double k()
  {
    b localb = f();
    if ((localb != b.g) && (localb != b.f))
      throw new IllegalStateException("Expected " + b.g + " but was " + localb);
    double d = ((r)q()).d();
    if ((!p()) && ((Double.isNaN(d)) || (Double.isInfinite(d))))
      throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
    r();
    return d;
  }

  public final long l()
  {
    b localb = f();
    if ((localb != b.g) && (localb != b.f))
      throw new IllegalStateException("Expected " + b.g + " but was " + localb);
    long l = ((r)q()).e();
    r();
    return l;
  }

  public final int m()
  {
    b localb = f();
    if ((localb != b.g) && (localb != b.f))
      throw new IllegalStateException("Expected " + b.g + " but was " + localb);
    int i = ((r)q()).f();
    r();
    return i;
  }

  public final void n()
  {
    if (f() == b.e)
    {
      g();
      return;
    }
    r();
  }

  public final void o()
  {
    a(b.e);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    this.c.add(new r((String)localEntry.getKey()));
  }

  public final String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.e
 * JD-Core Version:    0.6.2
 */