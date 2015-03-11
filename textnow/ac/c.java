package textnow.ac;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.z.f;
import textnow.z.y;

final class c<E> extends y<Collection<E>>
{
  private final y<E> a;
  private final textnow.ab.o<? extends Collection<E>> b;

  public c(f paramf, Type paramType, y<E> paramy, textnow.ab.o<? extends Collection<E>> paramo)
  {
    this.a = new o(paramf, paramy, paramType);
    this.b = paramo;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.c
 * JD-Core Version:    0.6.2
 */