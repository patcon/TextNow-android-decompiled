package textnow.ah;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public final class j<K, V> extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> g;
  Comparator<? super K> a;
  n<K, V> b;
  int c = 0;
  int d = 0;
  final n<K, V> e = new n();
  private j<K, V>.k h;
  private j<K, V>.l i;

  static
  {
    if (!j.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      f = bool;
      g = new Comparator()
      {
      };
      return;
    }
  }

  public j()
  {
    this(g);
  }

  private j(Comparator<? super K> paramComparator)
  {
    if (paramComparator != null);
    while (true)
    {
      this.a = paramComparator;
      return;
      paramComparator = g;
    }
  }

  private n<K, V> a(K paramK, boolean paramBoolean)
  {
    Comparator localComparator = this.a;
    Object localObject1 = this.b;
    Object localObject3;
    label66: label83: label117: int m;
    Object localObject2;
    if (localObject1 != null)
    {
      Comparable localComparable;
      if (localComparator == g)
      {
        localComparable = (Comparable)paramK;
        if (localComparable == null)
          break label66;
      }
      for (int k = localComparable.compareTo(((n)localObject1).f); ; k = localComparator.compare(paramK, ((n)localObject1).f))
      {
        if (k != 0)
          break label83;
        localObject3 = localObject1;
        return localObject3;
        localComparable = null;
        break;
      }
      if (k < 0);
      for (n localn3 = ((n)localObject1).b; ; localn3 = ((n)localObject1).c)
      {
        if (localn3 == null)
          break label117;
        localObject1 = localn3;
        break;
      }
      m = k;
      localObject2 = localObject1;
    }
    for (int j = m; ; j = 0)
    {
      localObject3 = null;
      if (!paramBoolean)
        break;
      n localn1 = this.e;
      if (localObject2 == null)
      {
        if ((localComparator == g) && (!(paramK instanceof Comparable)))
          throw new ClassCastException(paramK.getClass().getName() + " is not Comparable");
        localn2 = new n(localObject2, paramK, localn1, localn1.e);
        this.b = localn2;
        this.c = (1 + this.c);
        this.d = (1 + this.d);
        return localn2;
      }
      n localn2 = new n(localObject2, paramK, localn1, localn1.e);
      if (j < 0)
        localObject2.b = localn2;
      while (true)
      {
        b(localObject2, true);
        break;
        localObject2.c = localn2;
      }
      localObject2 = localObject1;
    }
  }

  private void a(n<K, V> paramn)
  {
    n localn1 = paramn.b;
    n localn2 = paramn.c;
    n localn3 = localn2.b;
    n localn4 = localn2.c;
    paramn.c = localn3;
    if (localn3 != null)
      localn3.a = paramn;
    a(paramn, localn2);
    localn2.b = paramn;
    paramn.a = localn2;
    int j;
    if (localn1 != null)
    {
      j = localn1.h;
      if (localn3 == null)
        break label131;
    }
    label131: for (int k = localn3.h; ; k = 0)
    {
      paramn.h = (1 + Math.max(j, k));
      int m = paramn.h;
      int n = 0;
      if (localn4 != null)
        n = localn4.h;
      localn2.h = (1 + Math.max(m, n));
      return;
      j = 0;
      break;
    }
  }

  private void a(n<K, V> paramn1, n<K, V> paramn2)
  {
    n localn = paramn1.a;
    paramn1.a = null;
    if (paramn2 != null)
      paramn2.a = localn;
    if (localn != null)
    {
      if (localn.b == paramn1)
      {
        localn.b = paramn2;
        return;
      }
      if ((!f) && (localn.c != paramn1))
        throw new AssertionError();
      localn.c = paramn2;
      return;
    }
    this.b = paramn2;
  }

  private n<K, V> b(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null);
    try
    {
      n localn = a(paramObject, false);
      localObject = localn;
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  private void b(n<K, V> paramn)
  {
    n localn1 = paramn.b;
    n localn2 = paramn.c;
    n localn3 = localn1.b;
    n localn4 = localn1.c;
    paramn.b = localn4;
    if (localn4 != null)
      localn4.a = paramn;
    a(paramn, localn1);
    localn1.c = paramn;
    paramn.a = localn1;
    int j;
    if (localn2 != null)
    {
      j = localn2.h;
      if (localn4 == null)
        break label131;
    }
    label131: for (int k = localn4.h; ; k = 0)
    {
      paramn.h = (1 + Math.max(j, k));
      int m = paramn.h;
      int n = 0;
      if (localn3 != null)
        n = localn3.h;
      localn1.h = (1 + Math.max(m, n));
      return;
      j = 0;
      break;
    }
  }

  private void b(n<K, V> paramn, boolean paramBoolean)
  {
    n localn1;
    n localn2;
    int j;
    label25: int k;
    label37: int m;
    int i3;
    label77: int i4;
    label89: int i5;
    if (paramn != null)
    {
      localn1 = paramn.b;
      localn2 = paramn.c;
      if (localn1 != null)
      {
        j = localn1.h;
        if (localn2 == null)
          break label134;
        k = localn2.h;
        m = j - k;
        if (m != -2)
          break label186;
        n localn5 = localn2.b;
        n localn6 = localn2.c;
        if (localn6 == null)
          break label140;
        i3 = localn6.h;
        if (localn5 == null)
          break label146;
        i4 = localn5.h;
        i5 = i4 - i3;
        if ((i5 != -1) && ((i5 != 0) || (paramBoolean)))
          break label152;
        a(paramn);
        label116: if (paramBoolean)
          break label259;
      }
    }
    while (true)
    {
      paramn = paramn.a;
      break;
      j = 0;
      break label25;
      label134: k = 0;
      break label37;
      label140: i3 = 0;
      break label77;
      label146: i4 = 0;
      break label89;
      label152: if ((!f) && (i5 != 1))
        throw new AssertionError();
      b(localn2);
      a(paramn);
      break label116;
      label186: int n;
      label216: int i1;
      label228: int i2;
      if (m == 2)
      {
        n localn3 = localn1.b;
        n localn4 = localn1.c;
        if (localn4 != null)
        {
          n = localn4.h;
          if (localn3 == null)
            break label266;
          i1 = localn3.h;
          i2 = i1 - n;
          if ((i2 != 1) && ((i2 != 0) || (paramBoolean)))
            break label272;
          b(paramn);
          label255: if (!paramBoolean)
            break label303;
        }
      }
      label259: label266: label272: label303: 
      do
      {
        return;
        n = 0;
        break label216;
        i1 = 0;
        break label228;
        if ((!f) && (i2 != -1))
          throw new AssertionError();
        a(localn1);
        b(paramn);
        break label255;
        break;
        if (m == 0)
        {
          paramn.h = (j + 1);
          if (!paramBoolean)
            break;
          return;
        }
        if ((!f) && (m != -1) && (m != 1))
          throw new AssertionError();
        paramn.h = (1 + Math.max(j, k));
      }
      while (!paramBoolean);
    }
  }

  final n<K, V> a(Object paramObject)
  {
    n localn = b(paramObject);
    if (localn != null)
      a(localn, true);
    return localn;
  }

  final n<K, V> a(Map.Entry<?, ?> paramEntry)
  {
    int j = 1;
    n localn = b(paramEntry.getKey());
    int k;
    if (localn != null)
    {
      Object localObject1 = localn.g;
      Object localObject2 = paramEntry.getValue();
      if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2))))
      {
        k = j;
        if (k == 0)
          break label73;
      }
    }
    while (true)
    {
      if (j == 0)
        break label78;
      return localn;
      k = 0;
      break;
      label73: j = 0;
    }
    label78: return null;
  }

  final void a(n<K, V> paramn, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramn.e.d = paramn.d;
      paramn.d.e = paramn.e;
    }
    n localn1 = paramn.b;
    n localn2 = paramn.c;
    n localn3 = paramn.a;
    n localn4;
    int j;
    if ((localn1 != null) && (localn2 != null))
      if (localn1.h > localn2.h)
      {
        localn4 = localn1.b();
        a(localn4, false);
        n localn5 = paramn.b;
        if (localn5 == null)
          break label258;
        j = localn5.h;
        localn4.b = localn5;
        localn5.a = localn4;
        paramn.b = null;
      }
    while (true)
    {
      n localn6 = paramn.c;
      int k = 0;
      if (localn6 != null)
      {
        k = localn6.h;
        localn4.c = localn6;
        localn6.a = localn4;
        paramn.c = null;
      }
      localn4.h = (1 + Math.max(j, k));
      a(paramn, localn4);
      return;
      localn4 = localn2.a();
      break;
      if (localn1 != null)
      {
        a(paramn, localn1);
        paramn.b = null;
      }
      while (true)
      {
        b(localn3, false);
        this.c = (-1 + this.c);
        this.d = (1 + this.d);
        return;
        if (localn2 != null)
        {
          a(paramn, localn2);
          paramn.c = null;
        }
        else
        {
          a(paramn, null);
        }
      }
      label258: j = 0;
    }
  }

  public final void clear()
  {
    this.b = null;
    this.c = 0;
    this.d = (1 + this.d);
    n localn = this.e;
    localn.e = localn;
    localn.d = localn;
  }

  public final boolean containsKey(Object paramObject)
  {
    return b(paramObject) != null;
  }

  public final Set<Map.Entry<K, V>> entrySet()
  {
    k localk1 = this.h;
    if (localk1 != null)
      return localk1;
    k localk2 = new k(this);
    this.h = localk2;
    return localk2;
  }

  public final V get(Object paramObject)
  {
    n localn = b(paramObject);
    if (localn != null)
      return localn.g;
    return null;
  }

  public final Set<K> keySet()
  {
    l locall1 = this.i;
    if (locall1 != null)
      return locall1;
    l locall2 = new l(this);
    this.i = locall2;
    return locall2;
  }

  public final V put(K paramK, V paramV)
  {
    if (paramK == null)
      throw new NullPointerException("key == null");
    n localn = a(paramK, true);
    Object localObject = localn.g;
    localn.g = paramV;
    return localObject;
  }

  public final V remove(Object paramObject)
  {
    n localn = a(paramObject);
    if (localn != null)
      return localn.g;
    return null;
  }

  public final int size()
  {
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ah.j
 * JD-Core Version:    0.6.2
 */