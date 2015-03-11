package textnow.ai;

import java.lang.reflect.Type;
import java.util.Map;
import textnow.af.y;
import textnow.af.z;
import textnow.ah.b;
import textnow.ah.o;
import textnow.aj.a;

public final class g
  implements z
{
  private final textnow.ah.f a;
  private final boolean b;

  public g(textnow.ah.f paramf, boolean paramBoolean)
  {
    this.a = paramf;
    this.b = paramBoolean;
  }

  public final <T> y<T> a(textnow.af.f paramf, a<T> parama)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.g
 * JD-Core Version:    0.6.2
 */