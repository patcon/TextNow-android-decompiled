package textnow.ap;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import textnow.am.d;
import textnow.am.e;
import textnow.am.s;
import textnow.am.t;
import textnow.ao.f;
import textnow.ao.g;
import textnow.ao.r;
import textnow.ar.c;

public final class j
  implements t
{
  private final f a;
  private final d b;
  private final g c;

  public j(f paramf, d paramd, g paramg)
  {
    this.a = paramf;
    this.b = paramd;
    this.c = paramg;
  }

  private Map<String, l> a(final e parame, textnow.aq.a<?> parama, Class<?> paramClass)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramClass.isInterface())
      return localLinkedHashMap;
    Type localType1 = parama.b();
    while (paramClass != Object.class)
    {
      for (final Field localField : paramClass.getDeclaredFields())
      {
        boolean bool1 = a(localField, true);
        boolean bool2 = a(localField, false);
        if ((bool1) || (bool2))
        {
          localField.setAccessible(true);
          Type localType4 = parama.b();
          Type localType5 = localField.getGenericType();
          Type localType6 = textnow.ao.b.a(localType4, paramClass, localType5);
          textnow.an.b localb = (textnow.an.b)localField.getAnnotation(textnow.an.b.class);
          if (localb == null);
          for (String str = this.b.a(localField); ; str = localb.a())
          {
            final textnow.aq.a locala = textnow.aq.a.a(localType6);
            l local1 = new l(str, bool1, bool2)
            {
              final s<?> a = parame.a(locala);

              final void a(textnow.ar.a paramAnonymousa, Object paramAnonymousObject)
              {
                Object localObject = this.a.a(paramAnonymousa);
                if ((localObject != null) || (!this.e))
                  localField.set(paramAnonymousObject, localObject);
              }

              final void a(c paramAnonymousc, Object paramAnonymousObject)
              {
                Object localObject = localField.get(paramAnonymousObject);
                new o(parame, this.a, locala.b()).a(paramAnonymousc, localObject);
              }
            };
            l locall = (l)localLinkedHashMap.put(local1.g, local1);
            if (locall == null)
              break;
            throw new IllegalArgumentException(localType1 + " declares multiple JSON fields named " + locall.g);
          }
        }
      }
      Type localType2 = parama.b();
      Type localType3 = paramClass.getGenericSuperclass();
      parama = textnow.aq.a.a(textnow.ao.b.a(localType2, paramClass, localType3));
      paramClass = parama.a();
    }
    return localLinkedHashMap;
  }

  private boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }

  public final <T> s<T> a(e parame, textnow.aq.a<T> parama)
  {
    Class localClass = parama.a();
    if (!Object.class.isAssignableFrom(localClass))
      return null;
    return new k(this.a.a(parama), a(parame, parama, localClass), (byte)0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.j
 * JD-Core Version:    0.6.2
 */