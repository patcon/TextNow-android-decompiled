package textnow.ap;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import textnow.am.e;
import textnow.am.s;
import textnow.am.t;
import textnow.ar.c;

public final class a<E> extends s<Object>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      Type localType1 = paramAnonymousa.b();
      if ((!(localType1 instanceof GenericArrayType)) && ((!(localType1 instanceof Class)) || (!((Class)localType1).isArray())))
        return null;
      Type localType2 = textnow.ao.b.d(localType1);
      return new a(paramAnonymouse, paramAnonymouse.a(textnow.aq.a.a(localType2)), textnow.ao.b.b(localType2));
    }
  };
  private final Class<E> b;
  private final s<E> c;

  public a(e parame, s<E> params, Class<E> paramClass)
  {
    this.c = new o(parame, params, paramClass);
    this.b = paramClass;
  }

  public final Object a(textnow.ar.a parama)
  {
    if (parama.f() == textnow.ar.b.i)
    {
      parama.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    parama.a();
    while (parama.e())
      localArrayList.add(this.c.a(parama));
    parama.b();
    Object localObject = Array.newInstance(this.b, localArrayList.size());
    for (int i = 0; i < localArrayList.size(); i++)
      Array.set(localObject, i, localArrayList.get(i));
    return localObject;
  }

  public final void a(c paramc, Object paramObject)
  {
    if (paramObject == null)
    {
      paramc.f();
      return;
    }
    paramc.b();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      this.c.a(paramc, localObject);
      i++;
    }
    paramc.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.a
 * JD-Core Version:    0.6.2
 */