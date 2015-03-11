package com.flurry.sdk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@kb
public class po extends pf<Map<?, ?>>
  implements jt
{
  protected static final sh a = qs.b();
  protected final is b;
  protected final HashSet<String> c;
  protected final boolean d;
  protected final sh e;
  protected final sh f;
  protected jk<Object> g;
  protected jk<Object> h;
  protected final jz i;
  protected ov j;

  protected po()
  {
    this(null, null, null, false, null, null, null, null);
  }

  protected po(HashSet<String> paramHashSet, sh paramsh1, sh paramsh2, boolean paramBoolean, jz paramjz, jk<Object> paramjk1, jk<Object> paramjk2, is paramis)
  {
    super(Map.class, false);
    this.b = paramis;
    this.c = paramHashSet;
    this.e = paramsh1;
    this.f = paramsh2;
    this.d = paramBoolean;
    this.i = paramjz;
    this.g = paramjk1;
    this.h = paramjk2;
    this.j = ov.a();
  }

  public static po a(String[] paramArrayOfString, sh paramsh, boolean paramBoolean, jz paramjz, is paramis, jk<Object> paramjk1, jk<Object> paramjk2)
  {
    HashSet localHashSet = a(paramArrayOfString);
    sh localsh1;
    sh localsh2;
    boolean bool2;
    if (paramsh == null)
    {
      localsh1 = a;
      localsh2 = localsh1;
      if (paramBoolean)
        break label87;
      if ((localsh2 == null) || (!localsh2.u()))
        break label81;
      bool2 = true;
    }
    label39: label81: label87: for (boolean bool1 = bool2; ; bool1 = paramBoolean)
    {
      return new po(localHashSet, localsh1, localsh2, bool1, paramjz, paramjk1, paramjk2, paramis);
      localsh1 = paramsh.k();
      localsh2 = paramsh.g();
      break;
      bool2 = false;
      break label39;
    }
  }

  private static HashSet<String> a(String[] paramArrayOfString)
  {
    Object localObject;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new HashSet(paramArrayOfString.length);
      int k = paramArrayOfString.length;
      for (int m = 0; m < k; m++)
        ((HashSet)localObject).add(paramArrayOfString[m]);
    }
  }

  protected final jk<Object> a(ov paramov, sh paramsh, jw paramjw)
  {
    ov.d locald = paramov.a(paramsh, paramjw, this.b);
    if (paramov != locald.b)
      this.j = locald.b;
    return locald.a;
  }

  protected final jk<Object> a(ov paramov, Class<?> paramClass, jw paramjw)
  {
    ov.d locald = paramov.a(paramClass, paramjw, this.b);
    if (paramov != locald.b)
      this.j = locald.b;
    return locald.a;
  }

  public pf<?> a(jz paramjz)
  {
    po localpo = new po(this.c, this.e, this.f, this.d, paramjz, this.g, this.h, this.b);
    if (this.h != null)
      localpo.h = this.h;
    return localpo;
  }

  public void a(jw paramjw)
  {
    if ((this.d) && (this.h == null))
      this.h = paramjw.a(this.f, this.b);
    if (this.g == null)
      this.g = paramjw.b(this.e, this.b);
  }

  public void a(Map<?, ?> paramMap, hf paramhf, jw paramjw)
  {
    paramhf.d();
    if (!paramMap.isEmpty())
    {
      if (this.h == null)
        break label36;
      a(paramMap, paramhf, paramjw, this.h);
    }
    while (true)
    {
      paramhf.e();
      return;
      label36: b(paramMap, paramhf, paramjw);
    }
  }

  protected void a(Map<?, ?> paramMap, hf paramhf, jw paramjw, jk<Object> paramjk)
  {
    jk localjk = this.g;
    HashSet localHashSet = this.c;
    jz localjz = this.i;
    int k;
    Iterator localIterator;
    if (!paramjw.a(ju.a.v))
    {
      k = 1;
      localIterator = paramMap.entrySet().iterator();
    }
    while (true)
    {
      label44: if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject1 = localEntry.getValue();
      Object localObject2 = localEntry.getKey();
      if (localObject2 == null)
        paramjw.c().a(null, paramhf, paramjw);
      while (true)
      {
        if (localObject1 != null)
          break label155;
        paramjw.a(paramhf);
        break label44;
        k = 0;
        break;
        if (((k != 0) && (localObject1 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject2))))
          break label44;
        localjk.a(localObject2, paramhf, paramjw);
      }
      label155: if (localjz == null)
        try
        {
          paramjk.a(localObject1, paramhf, paramjw);
        }
        catch (Exception localException)
        {
          a(paramjw, localException, paramMap, "" + localObject2);
        }
      else
        paramjk.a(localObject1, paramhf, paramjw, localjz);
    }
  }

  public void a(Map<?, ?> paramMap, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.b(paramMap, paramhf);
    if (!paramMap.isEmpty())
    {
      if (this.h == null)
        break label42;
      a(paramMap, paramhf, paramjw, this.h);
    }
    while (true)
    {
      paramjz.e(paramMap, paramhf);
      return;
      label42: b(paramMap, paramhf, paramjw);
    }
  }

  public void b(Map<?, ?> paramMap, hf paramhf, jw paramjw)
  {
    if (this.i != null)
    {
      c(paramMap, paramhf, paramjw);
      return;
    }
    jk localjk1 = this.g;
    HashSet localHashSet = this.c;
    int k;
    Object localObject1;
    label63: Object localObject2;
    Object localObject3;
    if (!paramjw.a(ju.a.v))
    {
      k = 1;
      ov localov1 = this.j;
      Iterator localIterator = paramMap.entrySet().iterator();
      localObject1 = localov1;
      if (!localIterator.hasNext())
        break label307;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localObject2 = localEntry.getValue();
      localObject3 = localEntry.getKey();
      if (localObject3 != null)
        break label137;
      paramjw.c().a(null, paramhf, paramjw);
    }
    while (true)
    {
      if (localObject2 != null)
        break label174;
      paramjw.a(paramhf);
      break label63;
      k = 0;
      break;
      label137: if (((k != 0) && (localObject2 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject3))))
        break label63;
      localjk1.a(localObject3, paramhf, paramjw);
    }
    label174: Class localClass = localObject2.getClass();
    jk localjk2 = ((ov)localObject1).a(localClass);
    jk localjk4;
    jk localjk5;
    Object localObject4;
    if (localjk2 == null)
      if (this.f.e())
      {
        localjk4 = a((ov)localObject1, paramjw.a(this.f, localClass), paramjw);
        ov localov2 = this.j;
        localjk5 = localjk4;
        localObject4 = localov2;
      }
    for (jk localjk3 = localjk5; ; localjk3 = localjk2)
    {
      try
      {
        localjk3.a(localObject2, paramhf, paramjw);
        localObject1 = localObject4;
        break label63;
        localjk4 = a((ov)localObject1, localClass, paramjw);
      }
      catch (Exception localException)
      {
        a(paramjw, localException, paramMap, "" + localObject3);
        localObject1 = localObject4;
      }
      break label63;
      label307: break;
      localObject4 = localObject1;
    }
  }

  protected void c(Map<?, ?> paramMap, hf paramhf, jw paramjw)
  {
    jk localjk = this.g;
    HashSet localHashSet = this.c;
    int k;
    Iterator localIterator;
    Object localObject1;
    Object localObject2;
    if (!paramjw.a(ju.a.v))
    {
      k = 1;
      localIterator = paramMap.entrySet().iterator();
      localObject1 = null;
      localObject2 = null;
    }
    while (true)
    {
      label44: if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject3 = localEntry.getValue();
      Object localObject4 = localEntry.getKey();
      if (localObject4 == null)
        paramjw.c().a(null, paramhf, paramjw);
      while (true)
      {
        if (localObject3 != null)
          break label155;
        paramjw.a(paramhf);
        break label44;
        k = 0;
        break;
        if (((k != 0) && (localObject3 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject4))))
          break label44;
        localjk.a(localObject4, paramhf, paramjw);
      }
      label155: Object localObject5 = localObject3.getClass();
      Object localObject6;
      if (localObject5 == localObject1)
      {
        localObject5 = localObject1;
        localObject6 = localObject2;
      }
      try
      {
        while (true)
        {
          ((jk)localObject2).a(localObject3, paramhf, paramjw, this.i);
          localObject2 = localObject6;
          localObject1 = localObject5;
          break;
          localObject2 = paramjw.a((Class)localObject5, this.b);
          localObject6 = localObject2;
        }
      }
      catch (Exception localException)
      {
        a(paramjw, localException, paramMap, "" + localObject4);
        localObject2 = localObject6;
        localObject1 = localObject5;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.po
 * JD-Core Version:    0.6.2
 */