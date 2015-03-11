package textnow.aj;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.ag.e;
import textnow.ag.s;
import textnow.ai.q;

final class c<E> extends s<Collection<E>>
{
  private final s<E> a;
  private final q<? extends Collection<E>> b;

  public c(e parame, Type paramType, s<E> params, q<? extends Collection<E>> paramq)
  {
    this.a = new o(parame, params, paramType);
    this.b = paramq;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.c
 * JD-Core Version:    0.6.2
 */