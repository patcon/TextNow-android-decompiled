package com.flurry.sdk;

public class nd extends it
  implements Comparable<nd>
{
  protected final String a;
  protected final String b;
  protected nd.a<mp> c;
  protected nd.a<mt> d;
  protected nd.a<mr> e;
  protected nd.a<mr> f;

  public nd(nd paramnd, String paramString)
  {
    this.b = paramnd.b;
    this.a = paramString;
    this.c = paramnd.c;
    this.d = paramnd.d;
    this.e = paramnd.e;
    this.f = paramnd.f;
  }

  public nd(String paramString)
  {
    this.b = paramString;
    this.a = paramString;
  }

  private mv a(int paramInt, nd.a<? extends mq>[] paramArrayOfa)
  {
    mv localmv = ((mq)paramArrayOfa[paramInt].a).j();
    for (int i = paramInt + 1; i < paramArrayOfa.length; i++)
      if (paramArrayOfa[i] != null)
        return mv.a(localmv, a(i, paramArrayOfa));
    return localmv;
  }

  private <T> nd.a<T> a(nd.a<T> parama)
  {
    if (parama == null)
      return parama;
    return parama.a();
  }

  private static <T> nd.a<T> a(nd.a<T> parama1, nd.a<T> parama2)
  {
    if (parama1 == null)
      return parama2;
    if (parama2 == null)
      return parama1;
    return nd.a.a(parama1, parama2);
  }

  private <T> nd.a<T> b(nd.a<T> parama)
  {
    if (parama == null)
      return parama;
    return parama.b();
  }

  private nd.a<? extends mq> b(nd.a<? extends mq> parama1, nd.a<? extends mq> parama2)
  {
    Object localObject1 = parama2;
    Object localObject2 = parama1;
    if (localObject2 != null)
    {
      String str = ((nd.a)localObject2).c;
      if ((str != null) && (!str.equals(this.a)))
      {
        if (localObject1 != null)
          break label51;
        localObject1 = localObject2;
      }
      label51: 
      while (str.equals(((nd.a)localObject1).c))
      {
        localObject2 = ((nd.a)localObject2).b;
        break;
      }
      throw new IllegalStateException("Conflicting property name definitions: '" + ((nd.a)localObject1).c + "' (for " + ((nd.a)localObject1).a + ") vs '" + ((nd.a)localObject2).c + "' (for " + ((nd.a)localObject2).a + ")");
    }
    return localObject1;
  }

  private <T> nd.a<T> c(nd.a<T> parama)
  {
    if (parama == null)
      return parama;
    return parama.c();
  }

  private <T> boolean d(nd.a<T> parama)
  {
    while (parama != null)
    {
      if ((parama.c != null) && (parama.c.length() > 0))
        return true;
      parama = parama.b;
    }
    return false;
  }

  private <T> boolean e(nd.a<T> parama)
  {
    while (parama != null)
    {
      if (parama.d)
        return true;
      parama = parama.b;
    }
    return false;
  }

  private <T> boolean f(nd.a<T> parama)
  {
    while (parama != null)
    {
      if (parama.e)
        return true;
      parama = parama.b;
    }
    return false;
  }

  public int a(nd paramnd)
  {
    if (this.d != null)
    {
      if (paramnd.d == null)
        return -1;
    }
    else if (paramnd.d != null)
      return 1;
    return a().compareTo(paramnd.a());
  }

  public nd a(String paramString)
  {
    return new nd(this, paramString);
  }

  public String a()
  {
    return this.a;
  }

  public void a(mp parammp, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = new nd.a(parammp, this.c, paramString, paramBoolean1, paramBoolean2);
  }

  public void a(mr parammr, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.e = new nd.a(parammr, this.e, paramString, paramBoolean1, paramBoolean2);
  }

  public void a(mt parammt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = new nd.a(parammt, this.d, paramString, paramBoolean1, paramBoolean2);
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
      if (this.e != null)
      {
        nd.a[] arrayOfa5 = new nd.a[4];
        arrayOfa5[0] = this.e;
        arrayOfa5[1] = this.c;
        arrayOfa5[2] = this.d;
        arrayOfa5[3] = this.f;
        mv localmv5 = a(0, arrayOfa5);
        this.e = this.e.a(((mr)this.e.a).a(localmv5));
      }
    do
    {
      do
        return;
      while (this.c == null);
      nd.a[] arrayOfa4 = new nd.a[3];
      arrayOfa4[0] = this.c;
      arrayOfa4[1] = this.d;
      arrayOfa4[2] = this.f;
      mv localmv4 = a(0, arrayOfa4);
      this.c = this.c.a(((mp)this.c.a).a(localmv4));
      return;
      if (this.d != null)
      {
        nd.a[] arrayOfa3 = new nd.a[4];
        arrayOfa3[0] = this.d;
        arrayOfa3[1] = this.f;
        arrayOfa3[2] = this.c;
        arrayOfa3[3] = this.e;
        mv localmv3 = a(0, arrayOfa3);
        this.d = this.d.a(((mt)this.d.a).a(localmv3));
        return;
      }
      if (this.f != null)
      {
        nd.a[] arrayOfa2 = new nd.a[3];
        arrayOfa2[0] = this.f;
        arrayOfa2[1] = this.c;
        arrayOfa2[2] = this.e;
        mv localmv2 = a(0, arrayOfa2);
        this.f = this.f.a(((mr)this.f.a).a(localmv2));
        return;
      }
    }
    while (this.c == null);
    nd.a[] arrayOfa1 = new nd.a[2];
    arrayOfa1[0] = this.c;
    arrayOfa1[1] = this.e;
    mv localmv1 = a(0, arrayOfa1);
    this.c = this.c.a(((mp)this.c.a).a(localmv1));
  }

  public void b(mr parammr, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.f = new nd.a(parammr, this.f, paramString, paramBoolean1, paramBoolean2);
  }

  public void b(nd paramnd)
  {
    this.c = a(this.c, paramnd.c);
    this.d = a(this.d, paramnd.d);
    this.e = a(this.e, paramnd.e);
    this.f = a(this.f, paramnd.f);
  }

  public boolean b()
  {
    return this.e != null;
  }

  public boolean c()
  {
    return this.f != null;
  }

  public boolean d()
  {
    return this.c != null;
  }

  public boolean e()
  {
    return this.d != null;
  }

  public mr g()
  {
    if (this.e == null)
    {
      localObject1 = null;
      return localObject1;
    }
    mr localmr = (mr)this.e.a;
    nd.a locala = this.e.b;
    Object localObject1 = localmr;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (locala != null)
    {
      localObject2 = (mr)locala.a;
      localClass1 = ((mr)localObject1).h();
      localClass2 = ((mr)localObject2).h();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      locala = locala.b;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Conflicting getter definitions for property \"" + a() + "\": " + ((mr)localObject1).n() + " vs " + ((mr)localObject2).n());
      localObject2 = localObject1;
    }
  }

  public mr h()
  {
    if (this.f == null)
    {
      localObject1 = null;
      return localObject1;
    }
    mr localmr = (mr)this.f.a;
    nd.a locala = this.f.b;
    Object localObject1 = localmr;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (locala != null)
    {
      localObject2 = (mr)locala.a;
      localClass1 = ((mr)localObject1).h();
      localClass2 = ((mr)localObject2).h();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      locala = locala.b;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Conflicting setter definitions for property \"" + a() + "\": " + ((mr)localObject1).n() + " vs " + ((mr)localObject2).n());
      localObject2 = localObject1;
    }
  }

  public mp i()
  {
    if (this.c == null)
    {
      localObject1 = null;
      return localObject1;
    }
    mp localmp = (mp)this.c.a;
    nd.a locala = this.c.b;
    Object localObject1 = localmp;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (locala != null)
    {
      localObject2 = (mp)locala.a;
      localClass1 = ((mp)localObject1).h();
      localClass2 = ((mp)localObject2).h();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      locala = locala.b;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Multiple fields representing property \"" + a() + "\": " + ((mp)localObject1).f() + " vs " + ((mp)localObject2).f());
      localObject2 = localObject1;
    }
  }

  public mq j()
  {
    Object localObject = g();
    if (localObject == null)
      localObject = i();
    return localObject;
  }

  public mq k()
  {
    Object localObject = m();
    if (localObject == null)
    {
      localObject = h();
      if (localObject == null)
        localObject = i();
    }
    return localObject;
  }

  public String l()
  {
    return this.b;
  }

  public mt m()
  {
    if (this.d == null)
      return null;
    nd.a locala;
    for (Object localObject = this.d; ; localObject = locala)
    {
      if ((((mt)((nd.a)localObject).a).f() instanceof mo))
        return (mt)((nd.a)localObject).a;
      locala = ((nd.a)localObject).b;
      if (locala == null)
        return (mt)this.d.a;
    }
  }

  public void n()
  {
    this.c = a(this.c);
    this.e = a(this.e);
    this.f = a(this.f);
    this.d = a(this.d);
  }

  public void o()
  {
    this.e = b(this.e);
    this.d = b(this.d);
    if (this.e == null)
    {
      this.c = b(this.c);
      this.f = b(this.f);
    }
  }

  public void p()
  {
    this.c = c(this.c);
    this.e = c(this.e);
    this.f = c(this.f);
    this.d = c(this.d);
  }

  public boolean q()
  {
    return (d(this.c)) || (d(this.e)) || (d(this.f)) || (d(this.d));
  }

  public boolean r()
  {
    return (e(this.c)) || (e(this.e)) || (e(this.f)) || (e(this.d));
  }

  public boolean s()
  {
    return (f(this.c)) || (f(this.e)) || (f(this.f)) || (f(this.d));
  }

  public boolean t()
  {
    return (f(this.c)) || (f(this.f)) || (f(this.d));
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[Property '").append(this.a).append("'; ctors: ").append(this.d).append(", field(s): ").append(this.c).append(", getter(s): ").append(this.e).append(", setter(s): ").append(this.f);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public String u()
  {
    nd.a locala1 = b(this.c, null);
    nd.a locala2 = b(this.e, locala1);
    nd.a locala3 = b(this.f, locala2);
    nd.a locala4 = b(this.d, locala3);
    if (locala4 == null)
      return null;
    return locala4.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nd
 * JD-Core Version:    0.6.2
 */