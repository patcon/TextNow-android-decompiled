package textnow.af;

import java.io.IOException;
import java.io.StringWriter;
import textnow.ah.q;
import textnow.ak.c;

public abstract class m
{
  public Number b()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public String c()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public double d()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public long e()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public int f()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public boolean g()
  {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }

  public final boolean h()
  {
    return this instanceof j;
  }

  public final boolean i()
  {
    return this instanceof p;
  }

  public final boolean j()
  {
    return this instanceof r;
  }

  public final boolean k()
  {
    return this instanceof o;
  }

  public final p l()
  {
    if ((this instanceof p))
      return (p)this;
    throw new IllegalStateException("Not a JSON Object: " + this);
  }

  public final j m()
  {
    if ((this instanceof j))
      return (j)this;
    throw new IllegalStateException("This is not a JSON Array.");
  }

  public final r n()
  {
    if ((this instanceof r))
      return (r)this;
    throw new IllegalStateException("This is not a JSON Primitive.");
  }

  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      c localc = new c(localStringWriter);
      localc.b(true);
      q.a(this, localc);
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.m
 * JD-Core Version:    0.6.2
 */