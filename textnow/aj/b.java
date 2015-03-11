package textnow.aj;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.ag.e;
import textnow.ag.s;
import textnow.ag.t;
import textnow.ai.f;
import textnow.ak.a;

public final class b
  implements t
{
  private final f a;

  public b(f paramf)
  {
    this.a = paramf;
  }

  public final <T> s<T> a(e parame, a<T> parama)
  {
    Type localType1 = parama.b();
    Class localClass = parama.a();
    if (!Collection.class.isAssignableFrom(localClass))
      return null;
    Type localType2 = textnow.ai.b.a(localType1, localClass);
    return new c(parame, localType2, parame.a(a.a(localType2)), this.a.a(parama));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.b
 * JD-Core Version:    0.6.2
 */