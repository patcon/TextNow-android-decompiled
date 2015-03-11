package textnow.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class h
  implements Set<Map.Entry<K, V>>
{
  h(f paramf)
  {
  }

  public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
  {
    int i = this.a.a();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.a.a(localEntry.getKey(), localEntry.getValue());
    }
    return i != this.a.a();
  }

  public final void clear()
  {
    this.a.c();
  }

  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    Map.Entry localEntry;
    int i;
    do
    {
      return false;
      localEntry = (Map.Entry)paramObject;
      i = this.a.a(localEntry.getKey());
    }
    while (i < 0);
    return b.a(this.a.a(i, 1), localEntry.getValue());
  }

  public final boolean containsAll(Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!contains(localIterator.next()))
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
      Object localObject1 = this.a.a(i, 0);
      Object localObject2 = this.a.a(i, 1);
      int k;
      if (localObject1 == null)
      {
        k = 0;
        label44: if (localObject2 != null)
          break label79;
      }
      label79: for (int m = 0; ; m = localObject2.hashCode())
      {
        int n = j + (m ^ k);
        i--;
        j = n;
        break;
        k = localObject1.hashCode();
        break label44;
      }
    }
    return j;
  }

  public final boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new j(this.a);
  }

  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final int size()
  {
    return this.a.a();
  }

  public final Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.e.h
 * JD-Core Version:    0.6.2
 */