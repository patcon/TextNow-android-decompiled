package textnow.ac;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import textnow.ab.g;
import textnow.ab.p;
import textnow.ae.c;
import textnow.z.e;
import textnow.z.y;
import textnow.z.z;

public final class j
  implements z
{
  private final textnow.ab.f a;
  private final e b;
  private final g c;

  public j(textnow.ab.f paramf, e parame, g paramg)
  {
    this.a = paramf;
    this.b = parame;
    this.c = paramg;
  }

  private Map<String, l> a(final textnow.z.f paramf, textnow.ad.a<?> parama, Class<?> paramClass)
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
          Type localType6 = textnow.ab.b.a(localType4, paramClass, localType5);
          textnow.aa.b localb = (textnow.aa.b)localField.getAnnotation(textnow.aa.b.class);
          if (localb == null);
          for (String str = this.b.a(localField); ; str = localb.a())
          {
            final textnow.ad.a locala = textnow.ad.a.a(localType6);
            l local1 = new l(str, bool1, bool2)
            {
              final y<?> a = paramf.a(locala);

              final void a(textnow.ae.a paramAnonymousa, Object paramAnonymousObject)
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
      parama = textnow.ad.a.a(textnow.ab.b.a(localType2, paramClass, localType3));
      paramClass = parama.a();
    }
    return localLinkedHashMap;
  }

  private boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }

  public final <T> y<T> a(textnow.z.f paramf, textnow.ad.a<T> parama)
  {
    Class localClass = parama.a();
    if (!Object.class.isAssignableFrom(localClass))
      return null;
    return new k(this.a.a(parama), a(paramf, parama, localClass), (byte)0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.j
 * JD-Core Version:    0.6.2
 */