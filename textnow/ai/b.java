package textnow.ai;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.af.y;
import textnow.af.z;
import textnow.aj.a;

public final class b
  implements z
{
  private final textnow.ah.f a;

  public b(textnow.ah.f paramf)
  {
    this.a = paramf;
  }

  public final <T> y<T> a(textnow.af.f paramf, a<T> parama)
  {
    Type localType1 = parama.b();
    Class localClass = parama.a();
    if (!Collection.class.isAssignableFrom(localClass))
      return null;
    Type localType2 = textnow.ah.b.a(localType1, localClass);
    return new c(paramf, localType2, paramf.a(a.a(localType2)), this.a.a(parama));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.b
 * JD-Core Version:    0.6.2
 */