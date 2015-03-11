package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class nt extends ng
{
  protected LinkedHashSet<nf> a;

  public Collection<nf> a(mn parammn, jn<?> paramjn, iq paramiq)
  {
    HashMap localHashMap = new HashMap();
    if (this.a != null)
    {
      Class localClass = parammn.d();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        nf localnf = (nf)localIterator.next();
        if (localClass.isAssignableFrom(localnf.a()))
          a(mn.b(localnf.a(), paramiq, paramjn), localnf, paramjn, paramiq, localHashMap);
      }
    }
    a(parammn, new nf(parammn.d(), null), paramjn, paramiq, localHashMap);
    return new ArrayList(localHashMap.values());
  }

  public Collection<nf> a(mq parammq, jn<?> paramjn, iq paramiq)
  {
    HashMap localHashMap = new HashMap();
    if (this.a != null)
    {
      Class localClass = parammq.d();
      Iterator localIterator2 = this.a.iterator();
      while (localIterator2.hasNext())
      {
        nf localnf3 = (nf)localIterator2.next();
        if (localClass.isAssignableFrom(localnf3.a()))
          a(mn.b(localnf3.a(), paramiq, paramjn), localnf3, paramjn, paramiq, localHashMap);
      }
    }
    List localList = paramiq.a(parammq);
    if (localList != null)
    {
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        nf localnf2 = (nf)localIterator1.next();
        a(mn.b(localnf2.a(), paramiq, paramjn), localnf2, paramjn, paramiq, localHashMap);
      }
    }
    nf localnf1 = new nf(parammq.d(), null);
    a(mn.b(parammq.d(), paramiq, paramjn), localnf1, paramjn, paramiq, localHashMap);
    return new ArrayList(localHashMap.values());
  }

  protected void a(mn parammn, nf paramnf, jn<?> paramjn, iq paramiq, HashMap<nf, nf> paramHashMap)
  {
    if (!paramnf.c())
    {
      String str = paramiq.g(parammn);
      if (str != null)
        paramnf = new nf(paramnf.a(), str);
    }
    if (paramHashMap.containsKey(paramnf))
      if ((paramnf.c()) && (!((nf)paramHashMap.get(paramnf)).c()))
        paramHashMap.put(paramnf, paramnf);
    List localList;
    do
    {
      return;
      paramHashMap.put(paramnf, paramnf);
      localList = paramiq.a(parammn);
    }
    while ((localList == null) || (localList.isEmpty()));
    Iterator localIterator = localList.iterator();
    label114: nf localnf1;
    mn localmn;
    if (localIterator.hasNext())
    {
      localnf1 = (nf)localIterator.next();
      localmn = mn.b(localnf1.a(), paramiq, paramjn);
      if (localnf1.c())
        break label194;
    }
    label194: for (nf localnf2 = new nf(localnf1.a(), paramiq.g(localmn)); ; localnf2 = localnf1)
    {
      a(localmn, localnf2, paramjn, paramiq, paramHashMap);
      break label114;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nt
 * JD-Core Version:    0.6.2
 */