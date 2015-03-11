package textnow.ab;

import java.util.AbstractSet;
import java.util.Iterator;

final class l extends AbstractSet<K>
{
  l(j paramj)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }

  public final Iterator<K> iterator()
  {
    // Byte code:
    //   0: new 28	textnow/ab/l$1
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 31	textnow/ab/l$1:<init>	(Ltextnow/ab/l;)V
    //   8: areturn
  }

  public final boolean remove(Object paramObject)
  {
    return this.a.a(paramObject) != null;
  }

  public final int size()
  {
    return this.a.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ab.l
 * JD-Core Version:    0.6.2
 */