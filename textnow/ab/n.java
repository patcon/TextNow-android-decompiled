package textnow.ab;

import java.util.Map.Entry;

final class n<K, V>
  implements Map.Entry<K, V>
{
  n<K, V> a;
  n<K, V> b;
  n<K, V> c;
  n<K, V> d;
  n<K, V> e;
  final K f;
  V g;
  int h;

  n()
  {
    this.f = null;
    this.e = this;
    this.d = this;
  }

  n(n<K, V> paramn1, K paramK, n<K, V> paramn2, n<K, V> paramn3)
  {
    this.a = paramn1;
    this.f = paramK;
    this.h = 1;
    this.d = paramn2;
    this.e = paramn3;
    paramn3.d = this;
    paramn2.e = this;
  }

  public final n<K, V> a()
  {
    n localn;
    for (Object localObject = this.b; localObject != null; localObject = localn)
    {
      localn = ((n)localObject).b;
      this = (n)localObject;
    }
    return this;
  }

  public final n<K, V> b()
  {
    n localn;
    for (Object localObject = this.c; localObject != null; localObject = localn)
    {
      localn = ((n)localObject).c;
      this = (n)localObject;
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
        if (this.g != null)
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
        bool4 = this.g.equals(localEntry.getValue());
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
    return this.g;
  }

  public final int hashCode()
  {
    int i;
    int j;
    if (this.f == null)
    {
      i = 0;
      Object localObject = this.g;
      j = 0;
      if (localObject != null)
        break label35;
    }
    while (true)
    {
      return i ^ j;
      i = this.f.hashCode();
      break;
      label35: j = this.g.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    Object localObject = this.g;
    this.g = paramV;
    return localObject;
  }

  public final String toString()
  {
    return this.f + "=" + this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ab.n
 * JD-Core Version:    0.6.2
 */