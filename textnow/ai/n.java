package textnow.ai;

import java.util.AbstractSet;
import java.util.Iterator;

final class n extends AbstractSet<K>
{
  n(j paramj)
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
    //   0: new 28	textnow/ai/n$1
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 31	textnow/ai/n$1:<init>	(Ltextnow/ai/n;)V
    //   8: areturn
  }

  public final boolean remove(Object paramObject)
  {
    return this.a.a(paramObject) != null;
  }

  public final int size()
  {
    return this.a.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.n
 * JD-Core Version:    0.6.2
 */