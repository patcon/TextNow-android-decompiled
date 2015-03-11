package com.flurry.sdk;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ds<K, V>
{
  private final Map<K, List<V>> a = new HashMap();
  private int b;

  private List<V> a(K paramK, boolean paramBoolean)
  {
    Object localObject = (List)this.a.get(paramK);
    if ((paramBoolean) && (localObject == null))
      if (this.b <= 0)
        break label55;
    label55: for (localObject = new ArrayList(this.b); ; localObject = new ArrayList())
    {
      this.a.put(paramK, localObject);
      return localObject;
    }
  }

  public List<V> a(K paramK)
  {
    List localList;
    if (paramK == null)
      localList = Collections.emptyList();
    do
    {
      return localList;
      localList = a(paramK, false);
    }
    while (localList != null);
    return Collections.emptyList();
  }

  public void a()
  {
    this.a.clear();
  }

  public void a(ds<K, V> paramds)
  {
    if (paramds == null);
    while (true)
    {
      return;
      Iterator localIterator = paramds.a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.a.put(localEntry.getKey(), localEntry.getValue());
      }
    }
  }

  public void a(K paramK, V paramV)
  {
    if (paramK == null)
      return;
    a(paramK, true).add(paramV);
  }

  public Collection<Map.Entry<K, V>> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.a.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
      while (localIterator2.hasNext())
      {
        Object localObject = localIterator2.next();
        localArrayList.add(new AbstractMap.SimpleImmutableEntry(localEntry.getKey(), localObject));
      }
    }
    return localArrayList;
  }

  public boolean b(K paramK)
  {
    if (paramK == null)
      return false;
    return (List)this.a.remove(paramK) != null;
  }

  public boolean b(K paramK, V paramV)
  {
    boolean bool = false;
    if (paramK == null);
    List localList;
    do
    {
      do
      {
        return bool;
        localList = a(paramK, false);
        bool = false;
      }
      while (localList == null);
      bool = localList.remove(paramV);
    }
    while (localList.size() != 0);
    this.a.remove(paramK);
    return bool;
  }

  public Set<K> c()
  {
    return this.a.keySet();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ds
 * JD-Core Version:    0.6.2
 */