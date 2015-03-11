package textnow.bk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

final class af<T>
  implements Queue<T>
{
  private ag<T> a = null;
  private ag<T> b = null;
  private Map<T, ag<T>> c = new HashMap();

  public final boolean add(T paramT)
  {
    while (true)
    {
      ag localag;
      try
      {
        if (this.c.containsKey(paramT))
        {
          localag = (ag)this.c.get(paramT);
          remove(paramT);
          ag.a(localag, null);
          ag.b(localag, null);
          if (this.b == null)
          {
            this.a = localag;
            this.b = localag;
            this.c.put(paramT, localag);
            return true;
          }
        }
        else
        {
          localag = new ag(paramT);
          continue;
        }
      }
      finally
      {
      }
      this.b.a(localag);
      localag.b(this.b);
      this.b = localag;
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
      ag localag = this.a;
      if (localag == null)
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
        private ag<T> b = af.a(af.this);

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
      ag localag = this.a;
      if (localag == null);
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
      ag localag = this.a;
      Object localObject2 = null;
      if (localag != null)
      {
        this.c.remove(this.a.a);
        localObject2 = this.a.a;
        this.a = ag.c(this.a);
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
      ag localag1 = (ag)this.c.remove(paramObject);
      if (localag1 == null);
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        ag localag2 = localag1.b();
        ag localag3 = localag1.a();
        if (localag2 != null)
          localag2.a(localag3);
        if (localag3 != null)
          localag3.b(localag2);
        if (localag2 == null)
          this.a = localag3;
        if (localag3 == null)
          this.b = localag2;
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
      ag localag;
      for (Object localObject2 = this.a; localObject2 != null; localObject2 = localag)
      {
        arrayOfObject[0] = localObject2;
        localag = ((ag)localObject2).a();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.af
 * JD-Core Version:    0.6.2
 */