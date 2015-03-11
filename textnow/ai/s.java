package textnow.ai;

import java.io.Writer;
import textnow.ag.j;
import textnow.aj.p;
import textnow.al.c;

public final class s
{
  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer))
      return (Writer)paramAppendable;
    return new t(paramAppendable, (byte)0);
  }

  public static void a(j paramj, c paramc)
  {
    p.P.a(paramc, paramj);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.s
 * JD-Core Version:    0.6.2
 */