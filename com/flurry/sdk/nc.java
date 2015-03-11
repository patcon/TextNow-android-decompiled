package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class nc
{
  protected final jn<?> a;
  protected final boolean b;
  protected final sh c;
  protected final mn d;
  protected final ne<?> e;
  protected final iq f;
  protected final LinkedHashMap<String, nd> g = new LinkedHashMap();
  protected LinkedList<nd> h = null;
  protected LinkedList<mr> i = null;
  protected LinkedList<mr> j = null;
  protected LinkedList<mr> k = null;
  protected Set<String> l;
  protected Set<String> m;
  protected LinkedHashMap<Object, mq> n;

  protected nc(jn<?> paramjn, boolean paramBoolean, sh paramsh, mn parammn)
  {
    this.a = paramjn;
    this.b = paramBoolean;
    this.c = paramsh;
    this.d = parammn;
    boolean bool = paramjn.b();
    iq localiq = null;
    if (bool)
      localiq = this.a.a();
    this.f = localiq;
    if (this.f == null)
    {
      this.e = this.a.e();
      return;
    }
    this.e = this.f.a(parammn, this.a.e());
  }

  private Set<String> a(Set<String> paramSet, String paramString)
  {
    if (paramSet == null)
      paramSet = new HashSet();
    paramSet.add(paramString);
    return paramSet;
  }

  private void a(nd paramnd)
  {
    if (this.b);
    String str;
    do
    {
      return;
      str = paramnd.a();
      this.l = a(this.l, str);
    }
    while (!paramnd.t());
    this.m = a(this.m, str);
  }

  public jn<?> a()
  {
    return this.a;
  }

  protected void a(jr paramjr)
  {
    nd[] arrayOfnd = (nd[])this.g.values().toArray(new nd[this.g.size()]);
    this.g.clear();
    int i1 = arrayOfnd.length;
    int i2 = 0;
    nd localnd1;
    String str1;
    String str2;
    if (i2 < i1)
    {
      localnd1 = arrayOfnd[i2];
      str1 = localnd1.a();
      if (this.b)
        if (localnd1.b())
          str2 = paramjr.a(this.a, localnd1.g(), str1);
    }
    while (true)
    {
      label90: if (!str2.equals(localnd1.a()))
        localnd1 = localnd1.a(str2);
      nd localnd2 = (nd)this.g.get(str2);
      if (localnd2 == null)
        this.g.put(str2, localnd1);
      while (true)
      {
        i2++;
        break;
        if (!localnd1.d())
          break label300;
        str2 = paramjr.a(this.a, localnd1.i(), str1);
        break label90;
        if (localnd1.c())
        {
          str2 = paramjr.b(this.a, localnd1.h(), str1);
          break label90;
        }
        if (localnd1.e())
        {
          str2 = paramjr.a(this.a, localnd1.m(), str1);
          break label90;
        }
        if (localnd1.d())
        {
          str2 = paramjr.a(this.a, localnd1.i(), str1);
          break label90;
        }
        if (!localnd1.b())
          break label300;
        str2 = paramjr.a(this.a, localnd1.g(), str1);
        break label90;
        localnd2.b(localnd1);
      }
      return;
      label300: str2 = str1;
    }
  }

  protected void a(Object paramObject, mq parammq)
  {
    if (paramObject == null);
    do
    {
      return;
      if (this.n == null)
        this.n = new LinkedHashMap();
    }
    while ((mq)this.n.put(paramObject, parammq) == null);
    if (paramObject == null);
    for (String str = "[null]"; ; str = paramObject.getClass().getName())
      throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(paramObject) + "' (of type " + str + ")");
  }

  protected void a(String paramString)
  {
    throw new IllegalArgumentException("Problem with definition of " + this.d + ": " + paramString);
  }

  protected nd b(String paramString)
  {
    nd localnd = (nd)this.g.get(paramString);
    if (localnd == null)
    {
      localnd = new nd(paramString);
      this.g.put(paramString, localnd);
    }
    return localnd;
  }

  public sh b()
  {
    return this.c;
  }

  public mn c()
  {
    return this.d;
  }

  public List<it> d()
  {
    return new ArrayList(this.g.values());
  }

  public Map<Object, mq> e()
  {
    return this.n;
  }

  public mr f()
  {
    if (this.k != null)
    {
      if (this.k.size() > 1)
        a("Multiple value properties defined (" + this.k.get(0) + " vs " + this.k.get(1) + ")");
      return (mr)this.k.get(0);
    }
    return null;
  }

  public mr g()
  {
    if (this.i != null)
    {
      if (this.i.size() > 1)
        a("Multiple 'any-getters' defined (" + this.i.get(0) + " vs " + this.i.get(1) + ")");
      return (mr)this.i.getFirst();
    }
    return null;
  }

  public mr h()
  {
    if (this.j != null)
    {
      if (this.j.size() > 1)
        a("Multiple 'any-setters' defined (" + this.j.get(0) + " vs " + this.j.get(1) + ")");
      return (mr)this.j.getFirst();
    }
    return null;
  }

  public Set<String> i()
  {
    return this.l;
  }

  public Set<String> j()
  {
    return this.m;
  }

  public nc k()
  {
    this.g.clear();
    m();
    o();
    n();
    p();
    q();
    r();
    jr localjr = this.a.j();
    if (localjr != null)
      a(localjr);
    Iterator localIterator1 = this.g.values().iterator();
    while (localIterator1.hasNext())
      ((nd)localIterator1.next()).p();
    Iterator localIterator2 = this.g.values().iterator();
    while (localIterator2.hasNext())
      ((nd)localIterator2.next()).a(this.b);
    l();
    return this;
  }

  protected void l()
  {
    iq localiq = this.a.a();
    Boolean localBoolean = localiq.i(this.d);
    if (localBoolean == null);
    String[] arrayOfString;
    for (boolean bool = this.a.d(); ; bool = localBoolean.booleanValue())
    {
      arrayOfString = localiq.h(this.d);
      if ((bool) || (this.h != null) || (arrayOfString != null))
        break;
      return;
    }
    int i1 = this.g.size();
    if (bool);
    for (Object localObject1 = new TreeMap(); ; localObject1 = new LinkedHashMap(i1 + i1))
    {
      Iterator localIterator1 = this.g.values().iterator();
      while (localIterator1.hasNext())
      {
        nd localnd3 = (nd)localIterator1.next();
        ((Map)localObject1).put(localnd3.a(), localnd3);
      }
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(i1 + i1);
    int i3;
    String str1;
    Object localObject2;
    String str2;
    if (arrayOfString != null)
    {
      int i2 = arrayOfString.length;
      i3 = 0;
      if (i3 < i2)
      {
        str1 = arrayOfString[i3];
        localObject2 = (nd)((Map)localObject1).get(str1);
        if (localObject2 != null)
          break label382;
        Iterator localIterator3 = this.g.values().iterator();
        while (localIterator3.hasNext())
        {
          nd localnd2 = (nd)localIterator3.next();
          if (str1.equals(localnd2.l()))
          {
            str2 = localnd2.a();
            localObject2 = localnd2;
          }
        }
      }
    }
    while (true)
    {
      if (localObject2 != null)
        localLinkedHashMap.put(str2, localObject2);
      i3++;
      break;
      if (this.h != null)
      {
        Iterator localIterator2 = this.h.iterator();
        while (localIterator2.hasNext())
        {
          nd localnd1 = (nd)localIterator2.next();
          localLinkedHashMap.put(localnd1.a(), localnd1);
        }
      }
      localLinkedHashMap.putAll((Map)localObject1);
      this.g.clear();
      this.g.putAll(localLinkedHashMap);
      return;
      label382: str2 = str1;
    }
  }

  protected void m()
  {
    iq localiq = this.f;
    Iterator localIterator = this.d.l().iterator();
    mp localmp;
    String str;
    Object localObject1;
    if (localIterator.hasNext())
    {
      localmp = (mp)localIterator.next();
      str = localmp.b();
      if (localiq == null)
      {
        localObject1 = null;
        label50: if (!"".equals(localObject1))
          break label171;
      }
    }
    label164: label171: for (Object localObject2 = str; ; localObject2 = localObject1)
    {
      boolean bool1;
      if (localObject2 != null)
      {
        bool1 = true;
        label73: if (bool1)
          break label164;
      }
      for (boolean bool2 = this.e.a(localmp); ; bool2 = bool1)
      {
        if ((localiq != null) && (localiq.c(localmp)));
        for (boolean bool3 = true; ; bool3 = false)
        {
          b(str).a(localmp, (String)localObject2, bool2, bool3);
          break;
          if (this.b)
          {
            localObject1 = localiq.b(localmp);
            break label50;
          }
          localObject1 = localiq.c(localmp);
          break label50;
          bool1 = false;
          break label73;
        }
        return;
      }
    }
  }

  protected void n()
  {
    iq localiq = this.f;
    if (localiq == null)
      return;
    Iterator localIterator1 = this.d.i().iterator();
    while (localIterator1.hasNext())
    {
      mo localmo = (mo)localIterator1.next();
      if (this.h == null)
        this.h = new LinkedList();
      int i3 = localmo.f();
      for (int i4 = 0; i4 < i3; i4++)
      {
        mt localmt2 = localmo.c(i4);
        String str2 = localiq.a(localmt2);
        if (str2 != null)
        {
          nd localnd2 = b(str2);
          localnd2.a(localmt2, str2, true, false);
          this.h.add(localnd2);
        }
      }
    }
    Iterator localIterator2 = this.d.j().iterator();
    while (localIterator2.hasNext())
    {
      mr localmr = (mr)localIterator2.next();
      if (this.h == null)
        this.h = new LinkedList();
      int i1 = localmr.f();
      for (int i2 = 0; i2 < i1; i2++)
      {
        mt localmt1 = localmr.c(i2);
        String str1 = localiq.a(localmt1);
        if (str1 != null)
        {
          nd localnd1 = b(str1);
          localnd1.a(localmt1, str1, true, false);
          this.h.add(localnd1);
        }
      }
    }
  }

  protected void o()
  {
    iq localiq = this.f;
    Iterator localIterator = this.d.k().iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      int i1 = localmr.f();
      if (i1 == 0)
      {
        if (localiq != null)
        {
          if (localiq.f(localmr))
          {
            if (this.i == null)
              this.i = new LinkedList();
            this.i.add(localmr);
          }
          else if (localiq.c(localmr))
          {
            if (this.k == null)
              this.k = new LinkedList();
            this.k.add(localmr);
          }
        }
        else
        {
          Object localObject4;
          label135: Object localObject5;
          Object localObject6;
          boolean bool4;
          if (localiq == null)
          {
            localObject4 = null;
            if (localObject4 == null)
            {
              localObject5 = qx.a(localmr, localmr.b());
              if (localObject5 == null)
              {
                localObject5 = qx.b(localmr, localmr.b());
                if (localObject5 == null)
                  continue;
                boolean bool7 = this.e.b(localmr);
                localObject6 = localObject4;
                bool4 = bool7;
                label190: if (localiq != null)
                  break label292;
              }
            }
          }
          else
          {
            label292: for (boolean bool5 = false; ; bool5 = localiq.c(localmr))
            {
              b((String)localObject5).a(localmr, localObject6, bool4, bool5);
              break;
              localObject4 = localiq.b(localmr);
              break label135;
              boolean bool6 = this.e.a(localmr);
              localObject6 = localObject4;
              bool4 = bool6;
              break label190;
              String str2 = qx.a(localmr);
              if (str2 == null)
                str2 = localmr.b();
              if (((String)localObject4).length() == 0)
                localObject4 = str2;
              localObject5 = str2;
              localObject6 = localObject4;
              bool4 = true;
              break label190;
            }
          }
        }
      }
      else if (i1 == 1)
      {
        Object localObject1;
        label315: Object localObject2;
        Object localObject3;
        boolean bool1;
        if (localiq == null)
        {
          localObject1 = null;
          if (localObject1 == null)
          {
            localObject2 = qx.b(localmr);
            if (localObject2 == null)
              continue;
            boolean bool3 = this.e.c(localmr);
            localObject3 = localObject1;
            bool1 = bool3;
            label351: if (localiq != null)
              break label430;
          }
        }
        else
        {
          label430: for (boolean bool2 = false; ; bool2 = localiq.c(localmr))
          {
            b((String)localObject2).b(localmr, localObject3, bool1, bool2);
            break;
            localObject1 = localiq.d(localmr);
            break label315;
            String str1 = qx.b(localmr);
            if (str1 == null)
              str1 = localmr.b();
            if (((String)localObject1).length() == 0)
              localObject1 = str1;
            localObject2 = str1;
            localObject3 = localObject1;
            bool1 = true;
            break label351;
          }
        }
      }
      else if ((i1 == 2) && (localiq != null) && (localiq.e(localmr)))
      {
        if (this.j == null)
          this.j = new LinkedList();
        this.j.add(localmr);
      }
    }
  }

  protected void p()
  {
    iq localiq = this.f;
    if (localiq == null);
    while (true)
    {
      return;
      Iterator localIterator1 = this.d.l().iterator();
      while (localIterator1.hasNext())
      {
        mp localmp = (mp)localIterator1.next();
        a(localiq.d(localmp), localmp);
      }
      Iterator localIterator2 = this.d.k().iterator();
      while (localIterator2.hasNext())
      {
        mr localmr = (mr)localIterator2.next();
        if (localmr.f() == 1)
          a(localiq.d(localmr), localmr);
      }
    }
  }

  protected void q()
  {
    Iterator localIterator = this.g.entrySet().iterator();
    while (localIterator.hasNext())
    {
      nd localnd = (nd)((Map.Entry)localIterator.next()).getValue();
      if (!localnd.r())
      {
        localIterator.remove();
      }
      else if (localnd.s())
      {
        a(localnd);
        if (!localnd.q())
          localIterator.remove();
        else
          localnd.n();
      }
      else
      {
        localnd.o();
      }
    }
  }

  protected void r()
  {
    Iterator localIterator1 = this.g.entrySet().iterator();
    LinkedList localLinkedList = null;
    while (localIterator1.hasNext())
    {
      nd localnd3 = (nd)((Map.Entry)localIterator1.next()).getValue();
      String str2 = localnd3.u();
      if (str2 != null)
      {
        if (localLinkedList == null)
          localLinkedList = new LinkedList();
        localLinkedList.add(localnd3.a(str2));
        localIterator1.remove();
      }
    }
    if (localLinkedList != null)
    {
      Iterator localIterator2 = localLinkedList.iterator();
      while (localIterator2.hasNext())
      {
        nd localnd1 = (nd)localIterator2.next();
        String str1 = localnd1.a();
        nd localnd2 = (nd)this.g.get(str1);
        if (localnd2 == null)
          this.g.put(str1, localnd1);
        else
          localnd2.b(localnd1);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nc
 * JD-Core Version:    0.6.2
 */