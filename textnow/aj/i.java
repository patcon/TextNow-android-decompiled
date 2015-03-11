package textnow.aj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import textnow.ag.e;
import textnow.ag.s;
import textnow.ag.t;
import textnow.ai.j;
import textnow.al.b;
import textnow.al.c;

public final class i extends s<Object>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.ak.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() == Object.class)
        return new i(paramAnonymouse, (byte)0);
      return null;
    }
  };
  private final e b;

  private i(e parame)
  {
    this.b = parame;
  }

  public final Object a(textnow.al.a parama)
  {
    b localb = parama.f();
    switch (2.a[localb.ordinal()])
    {
    default:
      throw new IllegalStateException();
    case 1:
      ArrayList localArrayList = new ArrayList();
      parama.a();
      while (parama.e())
        localArrayList.add(a(parama));
      parama.b();
      return localArrayList;
    case 2:
      j localj = new j();
      parama.c();
      while (parama.e())
        localj.put(parama.g(), a(parama));
      parama.d();
      return localj;
    case 3:
      return parama.h();
    case 4:
      return Double.valueOf(parama.k());
    case 5:
      return Boolean.valueOf(parama.i());
    case 6:
    }
    parama.j();
    return null;
  }

  public final void a(c paramc, Object paramObject)
  {
    if (paramObject == null)
    {
      paramc.f();
      return;
    }
    s locals = this.b.a(paramObject.getClass());
    if ((locals instanceof i))
    {
      paramc.d();
      paramc.e();
      return;
    }
    locals.a(paramc, paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.i
 * JD-Core Version:    0.6.2
 */