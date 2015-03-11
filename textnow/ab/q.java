package textnow.ab;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import textnow.ac.p;
import textnow.ae.a;
import textnow.ae.c;
import textnow.ae.d;
import textnow.z.m;
import textnow.z.n;
import textnow.z.o;
import textnow.z.u;
import textnow.z.y;

public final class q
{
  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer))
      return (Writer)paramAppendable;
    return new r(paramAppendable, (byte)0);
  }

  public static m a(a parama)
  {
    int i = 1;
    try
    {
      parama.f();
      i = 0;
      m localm = (m)p.P.a(parama);
      return localm;
    }
    catch (EOFException localEOFException)
    {
      if (i != 0)
        return o.a;
      throw new u(localEOFException);
    }
    catch (d locald)
    {
      throw new u(locald);
    }
    catch (IOException localIOException)
    {
      throw new n(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new u(localNumberFormatException);
    }
  }

  public static void a(m paramm, c paramc)
  {
    p.P.a(paramc, paramm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ab.q
 * JD-Core Version:    0.6.2
 */