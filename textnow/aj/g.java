package textnow.aj;

import java.lang.reflect.Type;
import java.util.Map;
import textnow.ag.e;
import textnow.ag.s;
import textnow.ag.t;
import textnow.ai.b;
import textnow.ai.f;
import textnow.ai.q;
import textnow.ak.a;

public final class g
  implements t
{
  private final f a;
  private final boolean b;

  public g(f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }

  public final <T> s<T> a(e parame, a<T> parama)
  {
    Type localType1 = parama.b();
    if (!Map.class.isAssignableFrom(parama.a()))
      return null;
    Type[] arrayOfType = b.b(localType1, b.b(localType1));
    Type localType2 = arrayOfType[0];
    if ((localType2 == Boolean.TYPE) || (localType2 == Boolean.class));
    for (s locals1 = p.f; ; locals1 = parame.a(a.a(localType2)))
    {
      s locals2 = parame.a(a.a(arrayOfType[1]));
      q localq = this.a.a(parama);
      return new h(this, parame, arrayOfType[0], locals1, arrayOfType[1], locals2, localq);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.g
 * JD-Core Version:    0.6.2
 */