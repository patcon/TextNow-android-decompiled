package cz.acrobits.ali;

import java.util.HashSet;
import java.util.Iterator;

public final class PointerQueue
{
  private HashSet<PointerHolder> mSet = new HashSet();

  public final <T extends PointerHolder> T add(T paramT)
  {
    if (paramT != null)
      this.mSet.add(paramT);
    return paramT;
  }

  public final void release()
  {
    Iterator localIterator = this.mSet.iterator();
    while (localIterator.hasNext())
      ((PointerHolder)localIterator.next()).release();
    this.mSet.clear();
  }

  public final boolean remove(PointerHolder paramPointerHolder)
  {
    return this.mSet.remove(paramPointerHolder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.PointerQueue
 * JD-Core Version:    0.6.2
 */