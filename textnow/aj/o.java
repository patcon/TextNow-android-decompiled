package textnow.aj;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import textnow.ag.e;
import textnow.ag.s;
import textnow.al.c;

final class o<T> extends s<T>
{
  private final e a;
  private final s<T> b;
  private final Type c;

  o(e parame, s<T> params, Type paramType)
  {
    this.a = parame;
    this.b = params;
    this.c = paramType;
  }

  public final T a(textnow.al.a parama)
  {
    return this.b.a(parama);
  }

  public final void a(c paramc, T paramT)
  {
    s locals1 = this.b;
    Object localObject = this.c;
    if ((paramT != null) && ((localObject == Object.class) || ((localObject instanceof TypeVariable)) || ((localObject instanceof Class))))
      localObject = paramT.getClass();
    if (localObject != this.c)
    {
      locals2 = this.a.a(textnow.ak.a.a((Type)localObject));
      if ((!(locals2 instanceof k)) || ((this.b instanceof k)));
    }
    for (s locals2 = this.b; ; locals2 = locals1)
    {
      locals2.a(paramc, paramT);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.o
 * JD-Core Version:    0.6.2
 */