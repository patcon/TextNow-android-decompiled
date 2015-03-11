package com.flurry.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ou
{
  private final ou.a[] a;
  private final int b;

  public ou(Map<ox.a, jk<Object>> paramMap)
  {
    int i = a(paramMap.size());
    this.b = i;
    int j = i - 1;
    ou.a[] arrayOfa = new ou.a[i];
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ox.a locala = (ox.a)localEntry.getKey();
      int k = j & locala.hashCode();
      arrayOfa[k] = new ou.a(arrayOfa[k], locala, (jk)localEntry.getValue());
    }
    this.a = arrayOfa;
  }

  private static final int a(int paramInt)
  {
    if (paramInt <= 64);
    int j;
    for (int i = paramInt + paramInt; ; i = paramInt + (paramInt >> 2))
    {
      j = 8;
      while (j < i)
        j += j;
    }
    return j;
  }

  public jk<Object> a(ox.a parama)
  {
    int i = parama.hashCode() & -1 + this.a.length;
    ou.a locala = this.a[i];
    if (locala == null)
      return null;
    if (parama.equals(locala.a))
      return locala.b;
    do
    {
      locala = locala.c;
      if (locala == null)
        break;
    }
    while (!parama.equals(locala.a));
    return locala.b;
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ou
 * JD-Core Version:    0.6.2
 */