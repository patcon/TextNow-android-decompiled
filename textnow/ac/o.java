package textnow.ac;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import textnow.ae.c;
import textnow.z.f;
import textnow.z.y;

final class o<T> extends y<T>
{
  private final f a;
  private final y<T> b;
  private final Type c;

  o(f paramf, y<T> paramy, Type paramType)
  {
    this.a = paramf;
    this.b = paramy;
    this.c = paramType;
  }

  public final T a(textnow.ae.a parama)
  {
    return this.b.a(parama);
  }

  public final void a(c paramc, T paramT)
  {
    y localy1 = this.b;
    Object localObject = this.c;
    if ((paramT != null) && ((localObject == Object.class) || ((localObject instanceof TypeVariable)) || ((localObject instanceof Class))))
      localObject = paramT.getClass();
    if (localObject != this.c)
    {
      localy2 = this.a.a(textnow.ad.a.a((Type)localObject));
      if ((!(localy2 instanceof k)) || ((this.b instanceof k)));
    }
    for (y localy2 = this.b; ; localy2 = localy1)
    {
      localy2.a(paramc, paramT);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.o
 * JD-Core Version:    0.6.2
 */