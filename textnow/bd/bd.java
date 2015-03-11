package textnow.bd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class bd
{
  private final Map<Object, Set<au>> a = new HashMap();
  private final Map<au, be> b = new HashMap();
  private final Map<bg, au> c = new HashMap();

  public final List<au> a(ai paramai, Object paramObject)
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
          au localau = (au)localIterator.next();
          localArrayList1.add(localau);
          be localbe = (be)this.b.remove(localau);
          if (localbe != null)
          {
            bg localbg = localbe.b;
            this.c.remove(localbg);
            paramai.a(localbg);
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

  public final au a(bg parambg)
  {
    try
    {
      au localau = (au)this.c.get(parambg);
      if (localau != null)
        a(localau);
      return localau;
    }
    finally
    {
    }
  }

  public final bg a(au paramau)
  {
    try
    {
      be localbe = (be)this.b.remove(paramau);
      if (localbe != null)
      {
        Set localSet = (Set)this.a.get(localbe.a);
        if (localSet != null)
        {
          localSet.remove(paramau);
          if (localSet.size() == 0)
            this.a.remove(localbe.a);
        }
        this.c.remove(localbe.b);
      }
      for (bg localbg = localbe.b; ; localbg = null)
        return localbg;
    }
    finally
    {
    }
  }

  public final void a(au paramau, Object paramObject, bg parambg)
  {
    try
    {
      Object localObject2 = (Set)this.a.get(paramObject);
      if (localObject2 == null)
      {
        localObject2 = new HashSet();
        this.a.put(paramObject, localObject2);
      }
      ((Set)localObject2).add(paramau);
      be localbe = new be(this, paramObject, parambg);
      this.b.put(paramau, localbe);
      this.c.put(parambg, paramau);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bd
 * JD-Core Version:    0.6.2
 */