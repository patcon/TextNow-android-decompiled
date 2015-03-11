package textnow.bk;

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
final class bu
{
  private final Set<bw<?>> a;
  private final Map<bw<?>, List<bq>> b;

  bu()
  {
    if (Build.VERSION.SDK_INT >= 9);
    for (Object localObject = Collections.newSetFromMap(new ConcurrentHashMap()); ; localObject = new HashSet())
    {
      this.a = ((Set)localObject);
      this.b = new ConcurrentHashMap();
      return;
    }
  }

  public final void a(bq parambq)
  {
    try
    {
      bw localbw = parambq.b();
      if (this.a.contains(localbw))
        parambq.f();
      while (true)
      {
        return;
        Object localObject2 = (List)this.b.get(localbw);
        if (localObject2 == null)
        {
          localObject2 = new ArrayList();
          this.b.put(localbw, localObject2);
        }
        ((List)localObject2).add(parambq);
      }
    }
    finally
    {
    }
  }

  public final void a(bw<?> parambw)
  {
    try
    {
      this.a.remove(parambw);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(bq parambq)
  {
    try
    {
      bw localbw = parambq.b();
      if (this.a.contains(localbw))
        parambq.f();
      while (true)
      {
        return;
        this.a.add(localbw);
        List localList = (List)this.b.remove(localbw);
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            bq localbq = (bq)localIterator.next();
            if (localbq != parambq)
              localbq.f();
          }
        }
      }
    }
    finally
    {
    }
  }

  public final boolean c(bq parambq)
  {
    try
    {
      bw localbw = parambq.b();
      List localList = (List)this.b.get(localbw);
      if (localList != null)
      {
        localList.remove(parambq);
        if (localList.size() == 0)
          this.b.remove(localbw);
      }
      parambq.f();
      boolean bool = this.a.contains(parambq.b());
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bu
 * JD-Core Version:    0.6.2
 */