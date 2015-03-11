package textnow.aj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import textnow.ag.s;
import textnow.al.a;
import textnow.al.b;
import textnow.al.c;

public final class k<T> extends s<T>
{
  private final textnow.ai.q<T> a;
  private final Map<String, l> b;

  private k(textnow.ai.q<T> paramq, Map<String, l> paramMap)
  {
    this.a = paramq;
    this.b = paramMap;
  }

  public final T a(a parama)
  {
    if (parama.f() == b.i)
    {
      parama.j();
      return null;
    }
    Object localObject = this.a.a();
    try
    {
      parama.c();
      while (true)
      {
        if (!parama.e())
          break label111;
        String str = parama.g();
        locall = (l)this.b.get(str);
        if ((locall != null) && (locall.i))
          break;
        parama.n();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        l locall;
        throw new textnow.ag.q(localIllegalStateException);
        locall.a(parama, localObject);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    label111: parama.d();
    return localObject;
  }

  public final void a(c paramc, T paramT)
  {
    if (paramT == null)
    {
      paramc.f();
      return;
    }
    paramc.d();
    try
    {
      Iterator localIterator = this.b.values().iterator();
      while (localIterator.hasNext())
      {
        l locall = (l)localIterator.next();
        if (locall.h)
        {
          paramc.a(locall.g);
          locall.a(paramc, paramT);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError();
    }
    paramc.e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.k
 * JD-Core Version:    0.6.2
 */