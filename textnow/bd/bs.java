package textnow.bd;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"NewApi"})
final class bs
{
  private final Set<bu<?>> a;
  private final Map<bu<?>, List<bo>> b;

  bs()
  {
    if (Build.VERSION.SDK_INT >= 9);
    for (Object localObject = Collections.newSetFromMap(new ConcurrentHashMap()); ; localObject = new HashSet())
    {
      this.a = ((Set)localObject);
      this.b = new ConcurrentHashMap();
      return;
    }
  }

  public final void a(bo parambo)
  {
    try
    {
      bu localbu = parambo.b();
      if (this.a.contains(localbu))
        parambo.f();
      while (true)
      {
        return;
        Object localObject2 = (List)this.b.get(localbu);
        if (localObject2 == null)
        {
          localObject2 = new ArrayList();
          this.b.put(localbu, localObject2);
        }
        ((List)localObject2).add(parambo);
      }
    }
    finally
    {
    }
  }

  public final void a(bu<?> parambu)
  {
    try
    {
      this.a.remove(parambu);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(bo parambo)
  {
    try
    {
      bu localbu = parambo.b();
      if (this.a.contains(localbu))
        parambo.f();
      while (true)
      {
        return;
        this.a.add(localbu);
        List localList = (List)this.b.remove(localbu);
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            bo localbo = (bo)localIterator.next();
            if (localbo != parambo)
              localbo.f();
          }
        }
      }
    }
    finally
    {
    }
  }

  public final boolean c(bo parambo)
  {
    try
    {
      bu localbu = parambo.b();
      List localList = (List)this.b.get(localbu);
      if (localList != null)
      {
        localList.remove(parambo);
        if (localList.size() == 0)
          this.b.remove(localbu);
      }
      parambo.f();
      boolean bool = this.a.contains(parambo.b());
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bs
 * JD-Core Version:    0.6.2
 */