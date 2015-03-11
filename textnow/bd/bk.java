package textnow.bd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bk<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE>
{
  private final Map<OPERATION_KEY, List<OPERATION_LIST_VALUE>> a = new HashMap();
  private final Map<KEY_REFERENCE, OPERATION_KEY> b = new HashMap();

  private List<KEY_REFERENCE> a(OPERATION_KEY paramOPERATION_KEY, List<OPERATION_LIST_VALUE> paramList, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      if (paramList != null)
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = parambl.a(paramOPERATION_KEY, localIterator.next());
          this.b.remove(localObject2);
          localArrayList.add(localObject2);
        }
      }
    }
    finally
    {
    }
    return localArrayList;
  }

  private void c(OPERATION_KEY paramOPERATION_KEY)
  {
    try
    {
      this.a.put(paramOPERATION_KEY, new ArrayList());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final OPERATION_LIST_VALUE a(KEY_REFERENCE paramKEY_REFERENCE, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        Object localObject2 = this.b.remove(paramKEY_REFERENCE);
        if (localObject2 != null)
        {
          List localList = (List)this.a.get(localObject2);
          if (localList != null)
          {
            Iterator localIterator = localList.iterator();
            boolean bool = localIterator.hasNext();
            Object localObject3 = null;
            if (bool)
            {
              Object localObject4 = localIterator.next();
              if (!paramKEY_REFERENCE.equals(parambl.a(localObject2, localObject4)))
                continue;
              localObject3 = localObject4;
            }
            if (localObject3 != null)
            {
              localList.remove(localObject3);
              if (localList.isEmpty())
                this.a.remove(localObject2);
            }
            localObject5 = localObject3;
            return localObject5;
          }
        }
      }
      finally
      {
      }
      Object localObject5 = null;
    }
  }

  public final List<OPERATION_LIST_VALUE> a(OPERATION_KEY paramOPERATION_KEY, bk<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambk, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl)
  {
    label94: 
    try
    {
      localObject2 = (List)this.a.remove(paramOPERATION_KEY);
      List localList = a(paramOPERATION_KEY, (List)localObject2, parambl);
      if (localObject2 != null)
      {
        parambk.c(paramOPERATION_KEY);
        int i = ((List)localObject2).size();
        int j = 0;
        if (j >= i)
          break label94;
        parambk.a(paramOPERATION_KEY, ((List)localObject2).get(j), localList.get(j));
        j++;
      }
    }
    finally
    {
    }
    Object localObject2 = new ArrayList();
    return localObject2;
  }

  public final List<OPERATION_LIST_VALUE> a(OPERATION_KEY paramOPERATION_KEY, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl)
  {
    List localList;
    try
    {
      localList = (List)this.a.remove(paramOPERATION_KEY);
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = localIterator.next();
          this.b.remove(parambl.a(paramOPERATION_KEY, localObject2));
        }
      }
    }
    finally
    {
    }
    return localList;
  }

  public final void a(OPERATION_KEY paramOPERATION_KEY, OPERATION_LIST_VALUE paramOPERATION_LIST_VALUE, KEY_REFERENCE paramKEY_REFERENCE)
  {
    try
    {
      Object localObject2 = (List)this.a.get(paramOPERATION_KEY);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        this.a.put(paramOPERATION_KEY, localObject2);
      }
      ((List)localObject2).add(paramOPERATION_LIST_VALUE);
      this.b.put(paramKEY_REFERENCE, paramOPERATION_KEY);
      return;
    }
    finally
    {
    }
  }

  public final void a(OPERATION_KEY paramOPERATION_KEY, bm<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambm, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl)
  {
    try
    {
      List localList1 = (List)this.a.remove(paramOPERATION_KEY);
      List localList2 = a(paramOPERATION_KEY, localList1, parambl);
      if (localList1 != null)
      {
        int i = localList1.size();
        int j = 0;
        if (j < i)
        {
          parambm.a(paramOPERATION_KEY, localList1.get(j), localList2.get(j));
          j++;
        }
      }
    }
    finally
    {
    }
  }

  public final void a(OPERATION_KEY paramOPERATION_KEY, bn<OPERATION_LIST_VALUE> parambn, bl<OPERATION_KEY, OPERATION_LIST_VALUE, KEY_REFERENCE> parambl)
  {
    try
    {
      List localList = (List)this.a.get(paramOPERATION_KEY);
      int i;
      if (localList != null)
        i = localList.size();
      for (int j = 0; ; j++)
      {
        if (j < i)
        {
          Object localObject2 = localList.get(j);
          if (!parambn.a(localObject2))
            continue;
          localList.remove(j);
          this.b.remove(parambl.a(paramOPERATION_KEY, localObject2));
          if (localList.size() == 0)
            this.a.remove(paramOPERATION_KEY);
        }
        return;
      }
    }
    finally
    {
    }
  }

  public final boolean a(OPERATION_KEY paramOPERATION_KEY)
  {
    try
    {
      boolean bool = this.a.containsKey(paramOPERATION_KEY);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean b(KEY_REFERENCE paramKEY_REFERENCE)
  {
    try
    {
      boolean bool = this.b.containsKey(paramKEY_REFERENCE);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bk
 * JD-Core Version:    0.6.2
 */