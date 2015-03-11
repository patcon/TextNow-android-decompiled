package textnow.ac;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import textnow.ab.j;
import textnow.ae.b;
import textnow.ae.c;
import textnow.z.f;
import textnow.z.y;
import textnow.z.z;

public final class i extends y<Object>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.ad.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() == Object.class)
        return new i(paramAnonymousf, (byte)0);
      return null;
    }
  };
  private final f b;

  private i(f paramf)
  {
    this.b = paramf;
  }

  public final Object a(textnow.ae.a parama)
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
    y localy = this.b.a(paramObject.getClass());
    if ((localy instanceof i))
    {
      paramc.d();
      paramc.e();
      return;
    }
    localy.a(paramc, paramObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.i
 * JD-Core Version:    0.6.2
 */