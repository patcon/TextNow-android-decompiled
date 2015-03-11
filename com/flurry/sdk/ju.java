package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import java.util.HashMap;

public class ju extends jn.c<ju.a, ju>
{
  protected kg.a a = null;
  protected Class<?> b;
  protected on c;

  public ju(iu<? extends ir> paramiu, iq paramiq, ne<?> paramne, ng paramng, jr paramjr, qs paramqs, je paramje)
  {
    super(paramiu, paramiq, paramne, paramng, paramjr, paramqs, paramje, d(ju.a.class));
    this.c = null;
  }

  protected ju(ju paramju, jn.a parama)
  {
    super(paramju, parama, paramju.h);
    this.a = paramju.a;
    this.b = paramju.b;
    this.c = paramju.c;
  }

  protected ju(ju paramju, HashMap<qj, Class<?>> paramHashMap, ng paramng)
  {
    this(paramju, paramju.e);
    this.f = paramHashMap;
    this.h = paramng;
  }

  public iq a()
  {
    if (a(ju.a.a))
      return super.a();
    return iq.a();
  }

  public <T extends ir> T a(sh paramsh)
  {
    return i().a(this, paramsh, this);
  }

  public jk<Object> a(mm parammm, Class<? extends jk<?>> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      jk localjk = localje.a(this, parammm, paramClass);
      if (localjk != null)
        return localjk;
    }
    return (jk)qy.b(paramClass, c());
  }

  public ju a(ng paramng)
  {
    HashMap localHashMap = this.f;
    this.g = true;
    return new ju(this, localHashMap, paramng);
  }

  @Deprecated
  public void a(ju.a parama, boolean paramBoolean)
  {
    super.a(parama, paramBoolean);
  }

  public boolean a(ju.a parama)
  {
    return (this.i & parama.b()) != 0;
  }

  public <T extends ir> T b(sh paramsh)
  {
    return i().a(this, paramsh, this);
  }

  @Deprecated
  public void b(ju.a parama)
  {
    super.b(parama);
  }

  public boolean b()
  {
    return a(ju.a.a);
  }

  @Deprecated
  public void c(ju.a parama)
  {
    super.a(parama);
  }

  public boolean c()
  {
    return a(ju.a.e);
  }

  public boolean d()
  {
    return a(ju.a.l);
  }

  public ne<?> e()
  {
    ne localne = super.e();
    if (!a(ju.a.b))
      localne = localne.a(JsonAutoDetect.Visibility.NONE);
    if (!a(ju.a.c))
      localne = localne.b(JsonAutoDetect.Visibility.NONE);
    if (!a(ju.a.d))
      localne = localne.e(JsonAutoDetect.Visibility.NONE);
    return localne;
  }

  public Class<?> f()
  {
    return this.b;
  }

  public kg.a g()
  {
    if (this.a != null)
      return this.a;
    if (a(ju.a.g))
      return kg.a.a;
    return kg.a.b;
  }

  public on h()
  {
    return this.c;
  }

  public String toString()
  {
    return "[SerializationConfig: flags=0x" + Integer.toHexString(this.i) + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ju
 * JD-Core Version:    0.6.2
 */