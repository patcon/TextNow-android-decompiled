package textnow.bd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class ag<T>
  implements Iterable<T>
{
  private ah<T> a = null;
  private ah<T> b = null;
  private final Map<T, ah<T>> c = new HashMap();

  private boolean b(T paramT)
  {
    try
    {
      ah localah1 = (ah)this.c.remove(paramT);
      if (localah1 == null);
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        ah localah2 = localah1.b();
        ah localah3 = localah1.a();
        if (localah2 != null)
          localah2.a(localah3);
        if (localah3 != null)
          localah3.b(localah2);
        if (localah2 == null)
          this.a = localah3;
        if (localah3 == null)
          this.b = localah2;
      }
    }
    finally
    {
    }
  }

  public final int a()
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

  public final boolean a(T paramT)
  {
    while (true)
    {
      ah localah;
      try
      {
        if (this.c.containsKey(paramT))
        {
          localah = (ah)this.c.get(paramT);
          b(paramT);
          ah.a(localah, null);
          ah.b(localah, null);
          if (this.b == null)
          {
            this.a = localah;
            this.b = localah;
            this.c.put(paramT, localah);
            return true;
          }
        }
        else
        {
          localah = new ah(paramT);
          continue;
        }
      }
      finally
      {
      }
      this.b.a(localah);
      localah.b(this.b);
      this.b = localah;
    }
  }

  public final T b()
  {
    try
    {
      ah localah = this.b;
      Object localObject2 = null;
      if (localah != null)
      {
        localObject2 = this.b.a;
        this.b = ah.c(this.b);
        if (this.b != null)
          ah.a(this.b, null);
        this.c.remove(localObject2);
      }
      return localObject2;
    }
    finally
    {
    }
  }

  public final T c()
  {
    ah localah = this.b;
    Object localObject = null;
    if (localah != null)
      localObject = this.b.a;
    return localObject;
  }

  public final Iterator<T> iterator()
  {
    try
    {
      Iterator local1 = new Iterator()
      {
        private ah<T> b = ag.a(ag.this);

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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.ag
 * JD-Core Version:    0.6.2
 */