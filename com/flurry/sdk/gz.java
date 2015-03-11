package com.flurry.sdk;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class gz<K, V>
  implements Map<K, V>
{
  private final ReferenceQueue<K> a = new ReferenceQueue();
  private Map<gz<K, V>.a, V> b = new HashMap();

  private void a()
  {
    try
    {
      Reference localReference;
      for (Object localObject2 = this.a.poll(); localObject2 != null; localObject2 = localReference)
      {
        gz.a locala = (gz.a)localObject2;
        this.b.remove(locala);
        localReference = this.a.poll();
      }
      return;
    }
    finally
    {
    }
  }

  public void clear()
  {
    this.b.clear();
    a();
  }

  public boolean containsKey(Object paramObject)
  {
    a();
    return this.b.containsKey(new gz.a(this, paramObject));
  }

  public boolean containsValue(Object paramObject)
  {
    a();
    return this.b.containsValue(paramObject);
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    a();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.b.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashSet.add(new Map.Entry()
      {
        public K getKey()
        {
          return this.a;
        }

        public V getValue()
        {
          return this.b;
        }

        public V setValue(V paramAnonymousV)
        {
          throw new UnsupportedOperationException();
        }
      });
    }
    return Collections.unmodifiableSet(localHashSet);
  }

  public boolean equals(Object paramObject)
  {
    return this.b.equals(((gz)paramObject).b);
  }

  public V get(Object paramObject)
  {
    a();
    return this.b.get(new gz.a(this, paramObject));
  }

  public int hashCode()
  {
    a();
    return this.b.hashCode();
  }

  public boolean isEmpty()
  {
    a();
    return this.b.isEmpty();
  }

  public Set<K> keySet()
  {
    a();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
      localHashSet.add(((gz.a)localIterator.next()).get());
    return Collections.unmodifiableSet(localHashSet);
  }

  public V put(K paramK, V paramV)
  {
    a();
    return this.b.put(new gz.a(this, paramK), paramV);
  }

  public void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException();
  }

  public V remove(Object paramObject)
  {
    a();
    return this.b.remove(new gz.a(this, paramObject));
  }

  public int size()
  {
    a();
    return this.b.size();
  }

  public Collection<V> values()
  {
    a();
    return this.b.values();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gz
 * JD-Core Version:    0.6.2
 */