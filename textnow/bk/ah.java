package textnow.bk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class ah<T>
  implements Iterable<T>
{
  private ai<T> a = null;
  private ai<T> b = null;
  private final Map<T, ai<T>> c = new HashMap();

  private boolean b(T paramT)
  {
    try
    {
      ai localai1 = (ai)this.c.remove(paramT);
      if (localai1 == null);
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        ai localai2 = localai1.b();
        ai localai3 = localai1.a();
        if (localai2 != null)
          localai2.a(localai3);
        if (localai3 != null)
          localai3.b(localai2);
        if (localai2 == null)
          this.a = localai3;
        if (localai3 == null)
          this.b = localai2;
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
      ai localai;
      try
      {
        if (this.c.containsKey(paramT))
        {
          localai = (ai)this.c.get(paramT);
          b(paramT);
          ai.a(localai, null);
          ai.b(localai, null);
          if (this.b == null)
          {
            this.a = localai;
            this.b = localai;
            this.c.put(paramT, localai);
            return true;
          }
        }
        else
        {
          localai = new ai(paramT);
          continue;
        }
      }
      finally
      {
      }
      this.b.a(localai);
      localai.b(this.b);
      this.b = localai;
    }
  }

  public final T b()
  {
    try
    {
      ai localai = this.b;
      Object localObject2 = null;
      if (localai != null)
      {
        localObject2 = this.b.a;
        this.b = ai.c(this.b);
        if (this.b != null)
          ai.a(this.b, null);
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
    ai localai = this.b;
    Object localObject = null;
    if (localai != null)
      localObject = this.b.a;
    return localObject;
  }

  public final Iterator<T> iterator()
  {
    try
    {
      Iterator local1 = new Iterator()
      {
        private ai<T> b = ah.a(ah.this);

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.ah
 * JD-Core Version:    0.6.2
 */