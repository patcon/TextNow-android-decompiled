package textnow.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V> extends o<K, V>
  implements Map<K, V>
{
  f<K, V> a;

  private f<K, V> a()
  {
    if (this.a == null)
      this.a = new f()
      {
        protected final int a()
        {
          return a.this.h;
        }

        protected final int a(Object paramAnonymousObject)
        {
          return a.this.a(paramAnonymousObject);
        }

        protected final Object a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return a.this.g[(paramAnonymousInt2 + (paramAnonymousInt1 << 1))];
        }

        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          return a.this.a(paramAnonymousInt, paramAnonymousV);
        }

        protected final void a(int paramAnonymousInt)
        {
          a.this.d(paramAnonymousInt);
        }

        protected final void a(K paramAnonymousK, V paramAnonymousV)
        {
          a.this.put(paramAnonymousK, paramAnonymousV);
        }

        protected final int b(Object paramAnonymousObject)
        {
          return a.this.b(paramAnonymousObject);
        }

        protected final Map<K, V> b()
        {
          return a.this;
        }

        protected final void c()
        {
          a.this.clear();
        }
      };
    return this.a;
  }

  public final boolean a(Collection<?> paramCollection)
  {
    return f.a(this, paramCollection);
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    f localf = a();
    if (localf.b == null)
      localf.b = new h(localf);
    return localf.b;
  }

  public Set<K> keySet()
  {
    f localf = a();
    if (localf.c == null)
      localf.c = new i(localf);
    return localf.c;
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.h + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection<V> values()
  {
    f localf = a();
    if (localf.d == null)
      localf.d = new k(localf);
    return localf.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.e.a
 * JD-Core Version:    0.6.2
 */