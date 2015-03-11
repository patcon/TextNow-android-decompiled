package textnow.ac;

import java.lang.reflect.Type;
import java.util.Map;
import textnow.ab.b;
import textnow.ab.o;
import textnow.ad.a;
import textnow.z.y;
import textnow.z.z;

public final class g
  implements z
{
  private final textnow.ab.f a;
  private final boolean b;

  public g(textnow.ab.f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }

  public final <T> y<T> a(textnow.z.f paramf, a<T> parama)
  {
    Type localType1 = parama.b();
    if (!Map.class.isAssignableFrom(parama.a()))
      return null;
    Type[] arrayOfType = b.b(localType1, b.b(localType1));
    Type localType2 = arrayOfType[0];
    if ((localType2 == Boolean.TYPE) || (localType2 == Boolean.class));
    for (y localy1 = p.f; ; localy1 = paramf.a(a.a(localType2)))
    {
      y localy2 = paramf.a(a.a(arrayOfType[1]));
      o localo = this.a.a(parama);
      return new h(this, paramf, arrayOfType[0], localy1, arrayOfType[1], localy2, localo);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.g
 * JD-Core Version:    0.6.2
 */