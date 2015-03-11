package textnow.p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.Iterator;

public final class w extends BaseAdapter
  implements SectionIndexer
{
  protected ArrayList<ListAdapter> a = new ArrayList();

  public final void a(ListAdapter paramListAdapter)
  {
    this.a.add(paramListAdapter);
    paramListAdapter.registerDataSetObserver(new x(this, (byte)0));
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final int getCount()
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    while (localIterator.hasNext())
      i += ((ListAdapter)localIterator.next()).getCount();
    return i;
  }

  public final Object getItem(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i)
        return localListAdapter.getItem(paramInt);
      paramInt -= i;
    }
    return null;
  }

  public final long getItemId(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i)
        return localListAdapter.getItemId(paramInt);
      paramInt -= i;
    }
    return -1L;
  }

  public final int getItemViewType(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int j = localListAdapter.getCount();
      if (paramInt < j)
        return i + localListAdapter.getItemViewType(paramInt);
      paramInt -= j;
      i += localListAdapter.getViewTypeCount();
    }
    return -1;
  }

  public final int getPositionForSection(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    boolean bool = localIterator.hasNext();
    int j = 0;
    ListAdapter localListAdapter;
    Object[] arrayOfObject;
    if (bool)
    {
      localListAdapter = (ListAdapter)localIterator.next();
      if (!(localListAdapter instanceof SectionIndexer))
        break label101;
      arrayOfObject = ((SectionIndexer)localListAdapter).getSections();
      if (arrayOfObject == null)
        break label114;
    }
    label101: label114: for (int k = arrayOfObject.length; ; k = 0)
    {
      if (paramInt < k)
      {
        j = i + ((SectionIndexer)localListAdapter).getPositionForSection(paramInt);
        return j;
      }
      if (arrayOfObject != null)
        paramInt -= k;
      i += localListAdapter.getCount();
      break;
    }
  }

  public final int getSectionForPosition(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    boolean bool1 = localIterator.hasNext();
    int j = 0;
    ListAdapter localListAdapter;
    int k;
    if (bool1)
    {
      localListAdapter = (ListAdapter)localIterator.next();
      k = localListAdapter.getCount();
      if (paramInt >= k)
        break label85;
      boolean bool2 = localListAdapter instanceof SectionIndexer;
      j = 0;
      if (bool2)
        j = i + ((SectionIndexer)localListAdapter).getSectionForPosition(paramInt);
    }
    return j;
    label85: Object[] arrayOfObject;
    if ((localListAdapter instanceof SectionIndexer))
    {
      arrayOfObject = ((SectionIndexer)localListAdapter).getSections();
      if (arrayOfObject == null);
    }
    for (int m = i + arrayOfObject.length; ; m = i)
    {
      paramInt -= k;
      i = m;
      break;
    }
  }

  public final Object[] getSections()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      if ((localListAdapter instanceof SectionIndexer))
      {
        Object[] arrayOfObject = ((SectionIndexer)localListAdapter).getSections();
        if (arrayOfObject != null)
        {
          int i = arrayOfObject.length;
          for (int j = 0; j < i; j++)
            localArrayList.add(arrayOfObject[j]);
        }
      }
    }
    if (localArrayList.size() == 0)
      return new String[0];
    return localArrayList.toArray(new Object[0]);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i)
        return localListAdapter.getView(paramInt, paramView, paramViewGroup);
      paramInt -= i;
    }
    return null;
  }

  public final int getViewTypeCount()
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    while (localIterator.hasNext())
      i += ((ListAdapter)localIterator.next()).getViewTypeCount();
    return Math.max(i, 1);
  }

  public final boolean isEnabled(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter = (ListAdapter)localIterator.next();
      int i = localListAdapter.getCount();
      if (paramInt < i)
        return localListAdapter.isEnabled(paramInt);
      paramInt -= i;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.w
 * JD-Core Version:    0.6.2
 */