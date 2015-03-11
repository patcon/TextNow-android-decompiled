package textnow.bd;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class bc<KEY, VALUE> extends LinkedHashMap<KEY, VALUE>
{
  private final int a = 25;

  public bc(int paramInt1, int paramInt2)
  {
    super(34, 0.75F, true);
  }

  protected final boolean removeEldestEntry(Map.Entry<KEY, VALUE> paramEntry)
  {
    return size() >= this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bc
 * JD-Core Version:    0.6.2
 */