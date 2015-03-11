package textnow.e;

import java.util.Collection;
import java.util.Iterator;

final class k
  implements Collection<V>
{
  k(f paramf)
  {
  }

  public final boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean addAll(Collection<? extends V> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final void clear()
  {
    this.a.c();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.b(paramObject) >= 0;
  }

  public final boolean containsAll(Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!contains(localIterator.next()))
        return false;
    return true;
  }

  public final boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public final Iterator<V> iterator()
  {
    return new g(this.a, 1);
  }

  public final boolean remove(Object paramObject)
  {
    int i = this.a.b(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      if (paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        i--;
        j--;
        bool = true;
      }
      i++;
    }
    return bool;
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      if (!paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        i--;
        j--;
        bool = true;
      }
      i++;
    }
    return bool;
  }

  public final int size()
  {
    return this.a.a();
  }

  public final Object[] toArray()
  {
    return this.a.b(1);
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.a.a(paramArrayOfT, 1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.e.k
 * JD-Core Version:    0.6.2
 */