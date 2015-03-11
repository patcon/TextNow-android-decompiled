package textnow.bk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class be
{
  private final Map<Object, Set<av>> a = new HashMap();
  private final Map<av, bf> b = new HashMap();
  private final Map<bh, av> c = new HashMap();

  public final List<av> a(aj paramaj, Object paramObject)
  {
    ArrayList localArrayList1;
    try
    {
      Set localSet = (Set)this.a.remove(paramObject);
      if (localSet != null)
      {
        localArrayList1 = new ArrayList(localSet.size());
        Iterator localIterator = localSet.iterator();
        while (localIterator.hasNext())
        {
          av localav = (av)localIterator.next();
          localArrayList1.add(localav);
          bf localbf = (bf)this.b.remove(localav);
          if (localbf != null)
          {
            bh localbh = localbf.b;
            this.c.remove(localbh);
            paramaj.a(localbh);
          }
        }
      }
    }
    finally
    {
    }
    for (ArrayList localArrayList2 = localArrayList1; ; localArrayList2 = null)
      return localArrayList2;
  }

  public final av a(bh parambh)
  {
    try
    {
      av localav = (av)this.c.get(parambh);
      if (localav != null)
        a(localav);
      return localav;
    }
    finally
    {
    }
  }

  public final bh a(av paramav)
  {
    try
    {
      bf localbf = (bf)this.b.remove(paramav);
      if (localbf != null)
      {
        Set localSet = (Set)this.a.get(localbf.a);
        if (localSet != null)
        {
          localSet.remove(paramav);
          if (localSet.size() == 0)
            this.a.remove(localbf.a);
        }
        this.c.remove(localbf.b);
      }
      for (bh localbh = localbf.b; ; localbh = null)
        return localbh;
    }
    finally
    {
    }
  }

  public final void a(av paramav, Object paramObject, bh parambh)
  {
    try
    {
      Object localObject2 = (Set)this.a.get(paramObject);
      if (localObject2 == null)
      {
        localObject2 = new HashSet();
        this.a.put(paramObject, localObject2);
      }
      ((Set)localObject2).add(paramav);
      bf localbf = new bf(this, paramObject, parambh);
      this.b.put(paramav, localbf);
      this.c.put(parambh, paramav);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.be
 * JD-Core Version:    0.6.2
 */