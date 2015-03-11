package textnow.z;

final class x
  implements z
{
  private final textnow.ad.a<?> a;
  private final boolean b;
  private final Class<?> c;
  private final t<?> d;
  private final l<?> e;

  private x(Object paramObject, textnow.ad.a<?> parama, boolean paramBoolean, Class<?> paramClass)
  {
    t localt;
    l locall;
    if ((paramObject instanceof t))
    {
      localt = (t)paramObject;
      this.d = localt;
      if (!(paramObject instanceof l))
        break label87;
      locall = (l)paramObject;
      label36: this.e = locall;
      if ((this.d == null) && (this.e == null))
        break label93;
    }
    label87: label93: for (boolean bool = true; ; bool = false)
    {
      textnow.ab.a.a(bool);
      this.a = parama;
      this.b = paramBoolean;
      this.c = paramClass;
      return;
      localt = null;
      break;
      locall = null;
      break label36;
    }
  }

  public final <T> y<T> a(f paramf, textnow.ad.a<T> parama)
  {
    boolean bool;
    if (this.a != null)
      if ((this.a.equals(parama)) || ((this.b) && (this.a.b() == parama.a())))
        bool = true;
    while (bool)
    {
      return new w(this.d, this.e, paramf, parama, this, (byte)0);
      bool = false;
      continue;
      bool = this.c.isAssignableFrom(parama.a());
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.x
 * JD-Core Version:    0.6.2
 */