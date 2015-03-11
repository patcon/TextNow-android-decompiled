package textnow.ao;

import java.util.Map.Entry;

final class p<K, V>
  implements Map.Entry<K, V>
{
  p<K, V> a;
  p<K, V> b;
  p<K, V> c;
  p<K, V> d;
  p<K, V> e;
  final K f;
  final int g;
  V h;
  int i;

  p()
  {
    this.f = null;
    this.g = -1;
    this.e = this;
    this.d = this;
  }

  p(p<K, V> paramp1, K paramK, int paramInt, p<K, V> paramp2, p<K, V> paramp3)
  {
    this.a = paramp1;
    this.f = paramK;
    this.g = paramInt;
    this.i = 1;
    this.d = paramp2;
    this.e = paramp3;
    paramp3.d = this;
    paramp2.e = this;
  }

  public final p<K, V> a()
  {
    p localp;
    for (Object localObject = this.b; localObject != null; localObject = localp)
    {
      localp = ((p)localObject).b;
      this = (p)localObject;
    }
    return this;
  }

  public final p<K, V> b()
  {
    p localp;
    for (Object localObject = this.c; localObject != null; localObject = localp)
    {
      localp = ((p)localObject).c;
      this = (p)localObject;
    }
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    Map.Entry localEntry;
    if (bool1)
    {
      localEntry = (Map.Entry)paramObject;
      if (this.f != null)
        break label67;
      Object localObject2 = localEntry.getKey();
      bool2 = false;
      if (localObject2 == null)
      {
        if (this.h != null)
          break label93;
        Object localObject1 = localEntry.getValue();
        bool2 = false;
        if (localObject1 != null);
      }
    }
    while (true)
    {
      bool2 = true;
      label67: label93: boolean bool4;
      do
      {
        boolean bool3;
        do
        {
          return bool2;
          bool3 = this.f.equals(localEntry.getKey());
          bool2 = false;
        }
        while (!bool3);
        break;
        bool4 = this.h.equals(localEntry.getValue());
        bool2 = false;
      }
      while (!bool4);
    }
  }

  public final K getKey()
  {
    return this.f;
  }

  public final V getValue()
  {
    return this.h;
  }

  public final int hashCode()
  {
    int j;
    int k;
    if (this.f == null)
    {
      j = 0;
      Object localObject = this.h;
      k = 0;
      if (localObject != null)
        break label35;
    }
    while (true)
    {
      return j ^ k;
      j = this.f.hashCode();
      break;
      label35: k = this.h.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    Object localObject = this.h;
    this.h = paramV;
    return localObject;
  }

  public final String toString()
  {
    return this.f + "=" + this.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.p
 * JD-Core Version:    0.6.2
 */