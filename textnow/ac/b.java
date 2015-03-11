package textnow.ac;

import java.lang.reflect.Type;
import java.util.Collection;
import textnow.ad.a;
import textnow.z.y;
import textnow.z.z;

public final class b
  implements z
{
  private final textnow.ab.f a;

  public b(textnow.ab.f paramf)
  {
    this.a = paramf;
  }

  public final <T> y<T> a(textnow.z.f paramf, a<T> parama)
  {
    Type localType1 = parama.b();
    Class localClass = parama.a();
    if (!Collection.class.isAssignableFrom(localClass))
      return null;
    Type localType2 = textnow.ab.b.a(localType1, localClass);
    return new c(paramf, localType2, paramf.a(a.a(localType2)), this.a.a(parama));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.b
 * JD-Core Version:    0.6.2
 */