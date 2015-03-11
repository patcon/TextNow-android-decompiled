package textnow.z;

import textnow.ab.q;
import textnow.ae.c;

final class w<T> extends y<T>
{
  private final t<T> a;
  private final l<T> b;
  private final f c;
  private final textnow.ad.a<T> d;
  private final z e;
  private y<T> f;

  private w(t<T> paramt, l<T> paraml, f paramf, textnow.ad.a<T> parama, z paramz)
  {
    this.a = paramt;
    this.b = paraml;
    this.c = paramf;
    this.d = parama;
    this.e = paramz;
  }

  private y<T> a()
  {
    y localy1 = this.f;
    if (localy1 != null)
      return localy1;
    y localy2 = this.c.a(this.e, this.d);
    this.f = localy2;
    return localy2;
  }

  public static z a(textnow.ad.a<?> parama, Object paramObject)
  {
    return new x(paramObject, parama, false, null, (byte)0);
  }

  public final T a(textnow.ae.a parama)
  {
    if (this.b == null)
      return a().a(parama);
    m localm = q.a(parama);
    if (localm.k())
      return null;
    return this.b.deserialize(localm, this.d.b(), this.c.a);
  }

  public final void a(c paramc, T paramT)
  {
    if (this.a == null)
    {
      a().a(paramc, paramT);
      return;
    }
    if (paramT == null)
    {
      paramc.f();
      return;
    }
    q.a(this.a.a(paramT, this.d.b(), this.c.b), paramc);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.w
 * JD-Core Version:    0.6.2
 */