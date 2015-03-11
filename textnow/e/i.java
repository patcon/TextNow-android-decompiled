package textnow.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class i
  implements Set<K>
{
  i(f paramf)
  {
  }

  public final boolean add(K paramK)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean addAll(Collection<? extends K> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final void clear()
  {
    this.a.c();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.a(paramObject) >= 0;
  }

  public final boolean containsAll(Collection<?> paramCollection)
  {
    Map localMap = this.a.b();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!localMap.containsKey(localIterator.next()))
        return false;
    return true;
  }

  public final boolean equals(Object paramObject)
  {
    return f.a(this, paramObject);
  }

  public final int hashCode()
  {
    int i = -1 + this.a.a();
    int j = 0;
    if (i >= 0)
    {
      Object localObject = this.a.a(i, 0);
      if (localObject == null);
      for (int k = 0; ; k = localObject.hashCode())
      {
        j += k;
        i--;
        break;
      }
    }
    return j;
  }

  public final boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public final Iterator<K> iterator()
  {
    return new g(this.a, 0);
  }

  public final boolean remove(Object paramObject)
  {
    int i = this.a.a(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    Map localMap = this.a.b();
    int i = localMap.size();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      localMap.remove(localIterator.next());
    return i != localMap.size();
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    return f.a(this.a.b(), paramCollection);
  }

  public final int size()
  {
    return this.a.a();
  }

  public final Object[] toArray()
  {
    return this.a.b(0);
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.a.a(paramArrayOfT, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.e.i
 * JD-Core Version:    0.6.2
 */