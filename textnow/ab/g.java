package textnow.ab;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import textnow.aa.d;
import textnow.z.b;
import textnow.z.f;
import textnow.z.y;
import textnow.z.z;

public final class g
  implements Cloneable, z
{
  public static final g a = new g();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private boolean e;
  private List<b> f = Collections.emptyList();
  private List<b> g = Collections.emptyList();

  private g a()
  {
    try
    {
      g localg = (g)super.clone();
      return localg;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError();
  }

  private static boolean a(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }

  private boolean a(textnow.aa.c paramc, d paramd)
  {
    int i;
    if ((paramc != null) && (paramc.a() > this.b))
    {
      i = 0;
      if (i == 0)
        break label63;
      if ((paramd == null) || (paramd.a() > this.b))
        break label57;
    }
    label57: for (int j = 0; ; j = 1)
    {
      if (j == 0)
        break label63;
      return true;
      i = 1;
      break;
    }
    label63: return false;
  }

  private boolean b(Class<?> paramClass)
  {
    if (paramClass.isMemberClass())
    {
      if ((0x8 & paramClass.getModifiers()) != 0);
      for (int i = 1; i == 0; i = 0)
        return true;
    }
    return false;
  }

  public final <T> y<T> a(final f paramf, final textnow.ad.a<T> parama)
  {
    Class localClass = parama.a();
    final boolean bool1 = a(localClass, true);
    final boolean bool2 = a(localClass, false);
    if ((!bool1) && (!bool2))
      return null;
    return new y()
    {
      private y<T> f;

      private y<T> a()
      {
        y localy1 = this.f;
        if (localy1 != null)
          return localy1;
        y localy2 = paramf.a(g.this, parama);
        this.f = localy2;
        return localy2;
      }

      public final T a(textnow.ae.a paramAnonymousa)
      {
        if (bool2)
        {
          paramAnonymousa.n();
          return null;
        }
        return a().a(paramAnonymousa);
      }

      public final void a(textnow.ae.c paramAnonymousc, T paramAnonymousT)
      {
        if (bool1)
        {
          paramAnonymousc.f();
          return;
        }
        a().a(paramAnonymousc, paramAnonymousT);
      }
    };
  }

  public final boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    if ((this.b != -1.0D) && (!a((textnow.aa.c)paramClass.getAnnotation(textnow.aa.c.class), (d)paramClass.getAnnotation(d.class))))
      return true;
    if ((!this.d) && (b(paramClass)))
      return true;
    if (a(paramClass))
      return true;
    if (paramBoolean);
    for (List localList = this.f; ; localList = this.g)
    {
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((b)localIterator.next()).b());
      return true;
    }
    return false;
  }

  public final boolean a(Field paramField, boolean paramBoolean)
  {
    if ((this.c & paramField.getModifiers()) != 0)
      return true;
    if ((this.b != -1.0D) && (!a((textnow.aa.c)paramField.getAnnotation(textnow.aa.c.class), (d)paramField.getAnnotation(d.class))))
      return true;
    if (paramField.isSynthetic())
      return true;
    if (this.e)
    {
      textnow.aa.a locala = (textnow.aa.a)paramField.getAnnotation(textnow.aa.a.class);
      if (locala != null)
      {
        if (!paramBoolean)
          break label100;
        if (locala.a())
          break label110;
      }
      label100: 
      while (!locala.b())
        return true;
    }
    label110: if ((!this.d) && (b(paramField.getType())))
      return true;
    if (a(paramField.getType()))
      return true;
    if (paramBoolean);
    for (List localList = this.f; !localList.isEmpty(); localList = this.g)
    {
      new textnow.z.c(paramField);
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((b)localIterator.next()).a());
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ab.g
 * JD-Core Version:    0.6.2
 */