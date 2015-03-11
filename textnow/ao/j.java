package textnow.ao;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public final class j<K, V> extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> h;
  Comparator<? super K> a;
  p<K, V>[] b;
  final p<K, V> c;
  int d = 0;
  int e = 0;
  int f;
  private j<K, V>.m i;
  private j<K, V>.n j;

  static
  {
    if (!j.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      g = bool;
      h = new Comparator()
      {
      };
      return;
    }
  }

  public j()
  {
    this(h);
  }

  private j(Comparator<? super K> paramComparator)
  {
    if (paramComparator != null);
    while (true)
    {
      this.a = paramComparator;
      this.c = new p();
      this.b = new p[16];
      this.f = (this.b.length / 2 + this.b.length / 4);
      return;
      paramComparator = h;
    }
  }

  private p<K, V> a(K paramK, boolean paramBoolean)
  {
    Comparator localComparator = this.a;
    p[] arrayOfp = this.b;
    int k = paramK.hashCode();
    int m = k ^ (k >>> 20 ^ k >>> 12);
    int n = m ^ m >>> 7 ^ m >>> 4;
    int i1 = n & -1 + arrayOfp.length;
    Object localObject1 = arrayOfp[i1];
    int i4;
    Object localObject2;
    if (localObject1 != null)
    {
      Comparable localComparable;
      if (localComparator == h)
      {
        localComparable = (Comparable)paramK;
        if (localComparable == null)
          break label120;
      }
      label120: for (i4 = localComparable.compareTo(((p)localObject1).f); ; i4 = localComparator.compare(paramK, ((p)localObject1).f))
      {
        if (i4 != 0)
          break label137;
        localObject2 = localObject1;
        return localObject2;
        localComparable = null;
        break;
      }
      label137: if (i4 < 0);
      for (p localp3 = ((p)localObject1).b; ; localp3 = ((p)localObject1).c)
      {
        if (localp3 == null)
          break label171;
        localObject1 = localp3;
        break;
      }
    }
    label171: for (int i2 = i4; ; i2 = 0)
    {
      localObject2 = null;
      if (!paramBoolean)
        break;
      p localp1 = this.c;
      if (localObject1 == null)
      {
        if ((localComparator == h) && (!(paramK instanceof Comparable)))
          throw new ClassCastException(paramK.getClass().getName() + " is not Comparable");
        localp2 = new p((p)localObject1, paramK, n, localp1, localp1.e);
        arrayOfp[i1] = localp2;
        int i3 = this.d;
        this.d = (i3 + 1);
        if (i3 > this.f)
        {
          this.b = a(this.b);
          this.f = (this.b.length / 2 + this.b.length / 4);
        }
        this.e = (1 + this.e);
        return localp2;
      }
      p localp2 = new p((p)localObject1, paramK, n, localp1, localp1.e);
      if (i2 < 0)
        ((p)localObject1).b = localp2;
      while (true)
      {
        b((p)localObject1, true);
        break;
        ((p)localObject1).c = localp2;
      }
    }
  }

  private void a(p<K, V> paramp)
  {
    p localp1 = paramp.b;
    p localp2 = paramp.c;
    p localp3 = localp2.b;
    p localp4 = localp2.c;
    paramp.c = localp3;
    if (localp3 != null)
      localp3.a = paramp;
    a(paramp, localp2);
    localp2.b = paramp;
    paramp.a = localp2;
    int k;
    if (localp1 != null)
    {
      k = localp1.i;
      if (localp3 == null)
        break label131;
    }
    label131: for (int m = localp3.i; ; m = 0)
    {
      paramp.i = (1 + Math.max(k, m));
      int n = paramp.i;
      int i1 = 0;
      if (localp4 != null)
        i1 = localp4.i;
      localp2.i = (1 + Math.max(n, i1));
      return;
      k = 0;
      break;
    }
  }

  private void a(p<K, V> paramp1, p<K, V> paramp2)
  {
    p localp = paramp1.a;
    paramp1.a = null;
    if (paramp2 != null)
      paramp2.a = localp;
    if (localp != null)
    {
      if (localp.b == paramp1)
      {
        localp.b = paramp2;
        return;
      }
      if ((!g) && (localp.c != paramp1))
        throw new AssertionError();
      localp.c = paramp2;
      return;
    }
    int k = paramp1.g & -1 + this.b.length;
    this.b[k] = paramp2;
  }

  private static <K, V> p<K, V>[] a(p<K, V>[] paramArrayOfp)
  {
    int k = paramArrayOfp.length;
    p[] arrayOfp = new p[k * 2];
    l locall = new l();
    k localk1 = new k();
    k localk2 = new k();
    int m = 0;
    if (m < k)
    {
      Object localObject1 = paramArrayOfp[m];
      int i1;
      Object localObject2;
      if (localObject1 != null)
      {
        locall.a((p)localObject1);
        int n = 0;
        i1 = 0;
        while (true)
        {
          p localp1 = locall.a();
          if (localp1 == null)
            break;
          if ((k & localp1.g) == 0)
            i1++;
          else
            n++;
        }
        if ((i1 <= 0) || (n <= 0))
          break label206;
        localk1.a(i1);
        localk2.a(n);
        locall.a((p)localObject1);
        while (true)
        {
          p localp2 = locall.a();
          if (localp2 == null)
            break;
          if ((k & localp2.g) == 0)
            localk1.a(localp2);
          else
            localk2.a(localp2);
        }
        localObject1 = localk1.a();
        localObject2 = localk2.a();
      }
      while (true)
      {
        arrayOfp[m] = localObject1;
        arrayOfp[(m + k)] = localObject2;
        m++;
        break;
        label206: if (i1 > 0)
        {
          localObject2 = null;
        }
        else
        {
          localObject2 = localObject1;
          localObject1 = null;
        }
      }
    }
    return arrayOfp;
  }

  private p<K, V> b(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null);
    try
    {
      p localp = a(paramObject, false);
      localObject = localp;
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  private void b(p<K, V> paramp)
  {
    p localp1 = paramp.b;
    p localp2 = paramp.c;
    p localp3 = localp1.b;
    p localp4 = localp1.c;
    paramp.b = localp4;
    if (localp4 != null)
      localp4.a = paramp;
    a(paramp, localp1);
    localp1.c = paramp;
    paramp.a = localp1;
    int k;
    if (localp2 != null)
    {
      k = localp2.i;
      if (localp4 == null)
        break label131;
    }
    label131: for (int m = localp4.i; ; m = 0)
    {
      paramp.i = (1 + Math.max(k, m));
      int n = paramp.i;
      int i1 = 0;
      if (localp3 != null)
        i1 = localp3.i;
      localp1.i = (1 + Math.max(n, i1));
      return;
      k = 0;
      break;
    }
  }

  private void b(p<K, V> paramp, boolean paramBoolean)
  {
    p localp1;
    p localp2;
    int k;
    label25: int m;
    label37: int n;
    int i4;
    label77: int i5;
    label89: int i6;
    if (paramp != null)
    {
      localp1 = paramp.b;
      localp2 = paramp.c;
      if (localp1 != null)
      {
        k = localp1.i;
        if (localp2 == null)
          break label134;
        m = localp2.i;
        n = k - m;
        if (n != -2)
          break label186;
        p localp5 = localp2.b;
        p localp6 = localp2.c;
        if (localp6 == null)
          break label140;
        i4 = localp6.i;
        if (localp5 == null)
          break label146;
        i5 = localp5.i;
        i6 = i5 - i4;
        if ((i6 != -1) && ((i6 != 0) || (paramBoolean)))
          break label152;
        a(paramp);
        label116: if (paramBoolean)
          break label259;
      }
    }
    while (true)
    {
      paramp = paramp.a;
      break;
      k = 0;
      break label25;
      label134: m = 0;
      break label37;
      label140: i4 = 0;
      break label77;
      label146: i5 = 0;
      break label89;
      label152: if ((!g) && (i6 != 1))
        throw new AssertionError();
      b(localp2);
      a(paramp);
      break label116;
      label186: int i1;
      label216: int i2;
      label228: int i3;
      if (n == 2)
      {
        p localp3 = localp1.b;
        p localp4 = localp1.c;
        if (localp4 != null)
        {
          i1 = localp4.i;
          if (localp3 == null)
            break label266;
          i2 = localp3.i;
          i3 = i2 - i1;
          if ((i3 != 1) && ((i3 != 0) || (paramBoolean)))
            break label272;
          b(paramp);
          label255: if (!paramBoolean)
            break label303;
        }
      }
      label259: label266: label272: label303: 
      do
      {
        return;
        i1 = 0;
        break label216;
        i2 = 0;
        break label228;
        if ((!g) && (i3 != -1))
          throw new AssertionError();
        a(localp1);
        b(paramp);
        break label255;
        break;
        if (n == 0)
        {
          paramp.i = (k + 1);
          if (!paramBoolean)
            break;
          return;
        }
        if ((!g) && (n != -1) && (n != 1))
          throw new AssertionError();
        paramp.i = (1 + Math.max(k, m));
      }
      while (!paramBoolean);
    }
  }

  final p<K, V> a(Object paramObject)
  {
    p localp = b(paramObject);
    if (localp != null)
      a(localp, true);
    return localp;
  }

  final p<K, V> a(Map.Entry<?, ?> paramEntry)
  {
    int k = 1;
    p localp = b(paramEntry.getKey());
    int m;
    if (localp != null)
    {
      Object localObject1 = localp.h;
      Object localObject2 = paramEntry.getValue();
      if ((localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2))))
      {
        m = k;
        if (m == 0)
          break label73;
      }
    }
    while (true)
    {
      if (k == 0)
        break label78;
      return localp;
      m = 0;
      break;
      label73: k = 0;
    }
    label78: return null;
  }

  final void a(p<K, V> paramp, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramp.e.d = paramp.d;
      paramp.d.e = paramp.e;
      paramp.e = null;
      paramp.d = null;
    }
    p localp1 = paramp.b;
    p localp2 = paramp.c;
    p localp3 = paramp.a;
    p localp4;
    int k;
    if ((localp1 != null) && (localp2 != null))
      if (localp1.i > localp2.i)
      {
        localp4 = localp1.b();
        a(localp4, false);
        p localp5 = paramp.b;
        if (localp5 == null)
          break label268;
        k = localp5.i;
        localp4.b = localp5;
        localp5.a = localp4;
        paramp.b = null;
      }
    while (true)
    {
      p localp6 = paramp.c;
      int m = 0;
      if (localp6 != null)
      {
        m = localp6.i;
        localp4.c = localp6;
        localp6.a = localp4;
        paramp.c = null;
      }
      localp4.i = (1 + Math.max(k, m));
      a(paramp, localp4);
      return;
      localp4 = localp2.a();
      break;
      if (localp1 != null)
      {
        a(paramp, localp1);
        paramp.b = null;
      }
      while (true)
      {
        b(localp3, false);
        this.d = (-1 + this.d);
        this.e = (1 + this.e);
        return;
        if (localp2 != null)
        {
          a(paramp, localp2);
          paramp.c = null;
        }
        else
        {
          a(paramp, null);
        }
      }
      label268: k = 0;
    }
  }

  public final void clear()
  {
    Arrays.fill(this.b, null);
    this.d = 0;
    this.e = (1 + this.e);
    p localp1 = this.c;
    p localp2;
    for (Object localObject = localp1.d; localObject != localp1; localObject = localp2)
    {
      localp2 = ((p)localObject).d;
      ((p)localObject).e = null;
      ((p)localObject).d = null;
    }
    localp1.e = localp1;
    localp1.d = localp1;
  }

  public final boolean containsKey(Object paramObject)
  {
    return b(paramObject) != null;
  }

  public final Set<Map.Entry<K, V>> entrySet()
  {
    m localm1 = this.i;
    if (localm1 != null)
      return localm1;
    m localm2 = new m(this);
    this.i = localm2;
    return localm2;
  }

  public final V get(Object paramObject)
  {
    p localp = b(paramObject);
    if (localp != null)
      return localp.h;
    return null;
  }

  public final Set<K> keySet()
  {
    n localn1 = this.j;
    if (localn1 != null)
      return localn1;
    n localn2 = new n(this);
    this.j = localn2;
    return localn2;
  }

  public final V put(K paramK, V paramV)
  {
    if (paramK == null)
      throw new NullPointerException("key == null");
    p localp = a(paramK, true);
    Object localObject = localp.h;
    localp.h = paramV;
    return localObject;
  }

  public final V remove(Object paramObject)
  {
    p localp = a(paramObject);
    if (localp != null)
      return localp.h;
    return null;
  }

  public final int size()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.j
 * JD-Core Version:    0.6.2
 */