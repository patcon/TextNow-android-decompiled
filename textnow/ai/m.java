package textnow.ai;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class m extends AbstractSet<Map.Entry<K, V>>
{
  m(j paramj)
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
    //   0: new 30	textnow/ai/m$1
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 33	textnow/ai/m$1:<init>	(Ltextnow/ai/m;)V
    //   8: areturn
  }

  public final boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    p localp;
    do
    {
      return false;
      localp = this.a.a((Map.Entry)paramObject);
    }
    while (localp == null);
    this.a.a(localp, true);
    return true;
  }

  public final int size()
  {
    return this.a.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.m
 * JD-Core Version:    0.6.2
 */