package textnow.ai;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.af.f;
import textnow.af.y;

final class c<E> extends y<Collection<E>>
{
  private final y<E> a;
  private final textnow.ah.o<? extends Collection<E>> b;

  public c(f paramf, Type paramType, y<E> paramy, textnow.ah.o<? extends Collection<E>> paramo)
  {
    this.a = new o(paramf, paramy, paramType);
    this.b = paramo;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.c
 * JD-Core Version:    0.6.2
 */