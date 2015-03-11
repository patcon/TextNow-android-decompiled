package textnow.ap;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.am.e;
import textnow.am.s;
import textnow.ao.q;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.c
 * JD-Core Version:    0.6.2
 */