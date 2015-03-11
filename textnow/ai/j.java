package textnow.ai;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import textnow.af.e;
import textnow.af.y;
import textnow.af.z;
import textnow.ah.g;
import textnow.ah.p;
import textnow.ak.c;

public final class j
  implements z
{
  private final textnow.ah.f a;
  private final e b;
  private final g c;

  public j(textnow.ah.f paramf, e parame, g paramg)
  {
    this.a = paramf;
    this.b = parame;
    this.c = paramg;
  }

  private Map<String, l> a(final textnow.af.f paramf, textnow.aj.a<?> parama, Class<?> paramClass)
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
          Type localType6 = textnow.ah.b.a(localType4, paramClass, localType5);
          textnow.ag.b localb = (textnow.ag.b)localField.getAnnotation(textnow.ag.b.class);
          if (localb == null);
          for (String str = this.b.a(localField); ; str = localb.a())
          {
            final textnow.aj.a locala = textnow.aj.a.a(localType6);
            l local1 = new l(str, bool1, bool2)
            {
              final y<?> a = paramf.a(locala);

              final void a(textnow.ak.a paramAnonymousa, Object paramAnonymousObject)
              {
                Object localObject = this.a.a(paramAnonymousa);
                if ((localObject != null) || (!this.e))
                  localField.set(paramAnonymousObject, localObject);
              }

              final void a(c paramAnonymousc, Object paramAnonymousObject)
              {
                Object localObject = localField.get(paramAnonymousObject);
                new o(paramf, this.a, locala.b()).a(paramAnonymousc, localObject);
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
      parama = textnow.aj.a.a(textnow.ah.b.a(localType2, paramClass, localType3));
      paramClass = parama.a();
    }
    return localLinkedHashMap;
  }

  private boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }

  public final <T> y<T> a(textnow.af.f paramf, textnow.aj.a<T> parama)
  {
    Class localClass = parama.a();
    if (!Object.class.isAssignableFrom(localClass))
      return null;
    return new k(this.a.a(parama), a(paramf, parama, localClass), (byte)0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.j
 * JD-Core Version:    0.6.2
 */