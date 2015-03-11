package textnow.ag;

import java.io.IOException;
import java.io.StringWriter;
import textnow.ai.s;
import textnow.al.c;

public abstract class j
{
  public Number a()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public String b()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public double c()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public long d()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public int e()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public boolean f()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public final boolean g()
  {
    return this instanceof h;
  }

  public final boolean h()
  {
    return this instanceof m;
  }

  public final boolean i()
  {
    return this instanceof o;
  }

  public final boolean j()
  {
    return this instanceof l;
  }

  public final m k()
  {
    if ((this instanceof m))
      return (m)this;
    throw new IllegalStateException("Not a JSON Object: " + this);
  }

  public final h l()
  {
    if ((this instanceof h))
      return (h)this;
    throw new IllegalStateException("This is not a JSON Array.");
  }

  public final o m()
  {
    if ((this instanceof o))
      return (o)this;
    throw new IllegalStateException("This is not a JSON Primitive.");
  }

  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      c localc = new c(localStringWriter);
      localc.b(true);
      s.a(this, localc);
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ag.j
 * JD-Core Version:    0.6.2
 */