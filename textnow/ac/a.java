package textnow.ac;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import textnow.ae.c;
import textnow.z.f;
import textnow.z.y;
import textnow.z.z;

public final class a<E> extends y<Object>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.ad.a<T> paramAnonymousa)
    {
      Type localType1 = paramAnonymousa.b();
      if ((!(localType1 instanceof GenericArrayType)) && ((!(localType1 instanceof Class)) || (!((Class)localType1).isArray())))
        return null;
      Type localType2 = textnow.ab.b.d(localType1);
      return new a(paramAnonymousf, paramAnonymousf.a(textnow.ad.a.a(localType2)), textnow.ab.b.b(localType2));
    }
  };
  private final Class<E> b;
  private final y<E> c;

  public a(f paramf, y<E> paramy, Class<E> paramClass)
  {
    this.c = new o(paramf, paramy, paramClass);
    this.b = paramClass;
  }

  public final Object a(textnow.ae.a parama)
  {
    if (parama.f() == textnow.ae.b.i)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.a
 * JD-Core Version:    0.6.2
 */