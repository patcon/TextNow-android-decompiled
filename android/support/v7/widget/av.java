package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class av
{
  private SparseArray<ArrayList<be>> a = new SparseArray();
  private SparseIntArray b = new SparseIntArray();
  private int c = 0;

  public final be a(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      int i = -1 + localArrayList.size();
      be localbe = (be)localArrayList.get(i);
      localArrayList.remove(i);
      return localbe;
    }
    return null;
  }

  public final void a(be parambe)
  {
    int i = parambe.e;
    ArrayList localArrayList = (ArrayList)this.a.get(i);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.a.put(i, localArrayList);
      if (this.b.indexOfKey(i) < 0)
        this.b.put(i, 5);
    }
    if (this.b.get(i) <= localArrayList.size())
      return;
    parambe.m();
    localArrayList.add(parambe);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.av
 * JD-Core Version:    0.6.2
 */