package textnow.bd;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

final class ae<T>
  implements Queue<T>
{
  private af<T> a = null;
  private af<T> b = null;
  private Map<T, af<T>> c = new HashMap();

  public final boolean add(T paramT)
  {
    while (true)
    {
      af localaf;
      try
      {
        if (this.c.containsKey(paramT))
        {
          localaf = (af)this.c.get(paramT);
          remove(paramT);
          af.a(localaf, null);
          af.b(localaf, null);
          if (this.b == null)
          {
            this.a = localaf;
            this.b = localaf;
            this.c.put(paramT, localaf);
            return true;
          }
        }
        else
        {
          localaf = new af(paramT);
          continue;
        }
      }
      finally
      {
      }
      this.b.a(localaf);
      localaf.b(this.b);
      this.b = localaf;
    }
  }

  public final boolean addAll(Collection<? extends T> paramCollection)
  {
    try
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
        add(localIterator.next());
    }
    finally
    {
    }
    return true;
  }

  public final void clear()
  {
    try
    {
      this.a = null;
      this.b = null;
      this.c = new HashMap();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean contains(Object paramObject)
  {
    try
    {
      boolean bool = this.c.containsKey(paramObject);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean containsAll(Collection<?> paramCollection)
  {
    try
    {
      Iterator localIterator = paramCollection.iterator();
      boolean bool2;
      do
      {
        if (!localIterator.hasNext())
          break;
        Object localObject2 = localIterator.next();
        bool2 = this.c.containsKey(localObject2);
      }
      while (bool2);
      for (boolean bool1 = false; ; bool1 = true)
        return bool1;
    }
    finally
    {
    }
  }

  public final T element()
  {
    return null;
  }

  public final boolean isEmpty()
  {
    try
    {
      af localaf = this.a;
      if (localaf == null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final Iterator<T> iterator()
  {
    try
    {
      Iterator local1 = new Iterator()
      {
        private af<T> b = ae.a(ae.this);

        public final boolean hasNext()
        {
          return this.b != null;
        }

        public final T next()
        {
          if (this.b == null)
            throw new NoSuchElementException("No more elements inside of the iterator.");
          Object localObject = this.b.a;
          this.b = this.b.a();
          return localObject;
        }

        public final void remove()
        {
          throw new UnsupportedOperationException();
        }
      };
      return local1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean offer(T paramT)
  {
    try
    {
      add(paramT);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final T peek()
  {
    try
    {
      af localaf = this.a;
      if (localaf == null);
      for (Object localObject2 = null; ; localObject2 = this.a.a)
        return localObject2;
    }
    finally
    {
    }
  }

  public final T poll()
  {
    try
    {
      af localaf = this.a;
      Object localObject2 = null;
      if (localaf != null)
      {
        this.c.remove(this.a.a);
        localObject2 = this.a.a;
        this.a = af.c(this.a);
        if (this.a == null)
          break label68;
        this.a.b(null);
      }
      while (true)
      {
        return localObject2;
        label68: this.b = null;
      }
    }
    finally
    {
    }
  }

  public final T remove()
  {
    try
    {
      if (this.a == null)
        throw new NoSuchElementException();
    }
    finally
    {
    }
    Object localObject2 = poll();
    return localObject2;
  }

  public final boolean remove(Object paramObject)
  {
    try
    {
      af localaf1 = (af)this.c.remove(paramObject);
      if (localaf1 == null);
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        af localaf2 = localaf1.b();
        af localaf3 = localaf1.a();
        if (localaf2 != null)
          localaf2.a(localaf3);
        if (localaf3 != null)
          localaf3.b(localaf2);
        if (localaf2 == null)
          this.a = localaf3;
        if (localaf3 == null)
          this.b = localaf2;
      }
    }
    finally
    {
    }
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    return false;
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    return false;
  }

  public final int size()
  {
    try
    {
      int i = this.c.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Object[] toArray()
  {
    try
    {
      Object[] arrayOfObject = new Object[size()];
      af localaf;
      for (Object localObject2 = this.a; localObject2 != null; localObject2 = localaf)
      {
        arrayOfObject[0] = localObject2;
        localaf = ((af)localObject2).a();
      }
      return arrayOfObject;
    }
    finally
    {
    }
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.ae
 * JD-Core Version:    0.6.2
 */