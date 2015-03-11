package textnow.ah;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import textnow.af.m;
import textnow.af.n;
import textnow.af.o;
import textnow.af.u;
import textnow.af.y;
import textnow.ai.p;
import textnow.ak.a;
import textnow.ak.c;
import textnow.ak.d;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ah.q
 * JD-Core Version:    0.6.2
 */