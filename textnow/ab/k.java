package textnow.ab;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class k extends AbstractSet<Map.Entry<K, V>>
{
  k(j paramj)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return ((paramObject instanceof Map.Entry)) && (this.a.a((Map.Entry)paramObject) != null);
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    // Byte code:
    //   0: new 30	textnow/ab/k$1
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 33	textnow/ab/k$1:<init>	(Ltextnow/ab/k;)V
    //   8: areturn
  }

  public final boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    n localn;
    do
    {
      return false;
      localn = this.a.a((Map.Entry)paramObject);
    }
    while (localn == null);
    this.a.a(localn, true);
    return true;
  }

  public final int size()
  {
    return this.a.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ab.k
 * JD-Core Version:    0.6.2
 */