package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;

public final class ld
{
  protected final kx a;
  protected final HashMap<String, kt> b;
  protected Object[] c;
  protected final kt[] d;

  public ld(kx paramkx)
  {
    this.a = paramkx;
    this.b = new HashMap();
    kt[] arrayOfkt1 = paramkx.k();
    int i = arrayOfkt1.length;
    int j = 0;
    kt[] arrayOfkt2 = null;
    while (j < i)
    {
      kt localkt = arrayOfkt1[j];
      this.b.put(localkt.c(), localkt);
      if (localkt.a().t())
      {
        if (arrayOfObject == null)
          arrayOfObject = new Object[i];
        arrayOfObject[j] = qy.f(localkt.a().p());
      }
      if (localkt.k() != null)
      {
        if (arrayOfkt2 == null)
          arrayOfkt2 = new kt[i];
        arrayOfkt2[j] = localkt;
      }
      j++;
    }
    this.c = arrayOfObject;
    this.d = arrayOfkt2;
  }

  public final kt a(String paramString)
  {
    return (kt)this.b.get(paramString);
  }

  public final lf a(hj paramhj, iz paramiz)
  {
    lf locallf = new lf(paramhj, paramiz, this.b.size());
    if (this.d != null)
      locallf.a(this.d);
    return locallf;
  }

  public final Object a(lf paramlf)
  {
    Object localObject = this.a.a(paramlf.a(this.c));
    for (le localle = paramlf.a(); localle != null; localle = localle.a)
      localle.a(localObject);
    return localObject;
  }

  public final Collection<kt> a()
  {
    return this.b.values();
  }

  public final void a(kt paramkt, jg<Object> paramjg)
  {
    kt localkt = paramkt.a(paramjg);
    this.b.put(localkt.c(), localkt);
    Object localObject = paramjg.b();
    if (localObject != null)
    {
      if (this.c == null)
        this.c = new Object[this.b.size()];
      this.c[localkt.j()] = localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ld
 * JD-Core Version:    0.6.2
 */