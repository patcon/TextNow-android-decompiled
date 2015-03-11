package textnow.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class f<K, V>
{
  f<K, V>.h b;
  f<K, V>.i c;
  f<K, V>.k d;

  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
      if (!paramCollection.contains(localIterator.next()))
        localIterator.remove();
    return i != paramMap.size();
  }

  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    if (paramSet == paramObject);
    while (true)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        Set localSet = (Set)paramObject;
        try
        {
          if (paramSet.size() == localSet.size())
          {
            boolean bool = paramSet.containsAll(localSet);
            if (bool);
          }
          else
          {
            return false;
          }
        }
        catch (NullPointerException localNullPointerException)
        {
          return false;
        }
        catch (ClassCastException localClassCastException)
        {
          return false;
        }
      }
    }
    return false;
  }

  protected abstract int a();

  protected abstract int a(Object paramObject);

  protected abstract Object a(int paramInt1, int paramInt2);

  protected abstract V a(int paramInt, V paramV);

  protected abstract void a(int paramInt);

  protected abstract void a(K paramK, V paramV);

  public final <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    int i = a();
    if (paramArrayOfT.length < i);
    for (Object localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); ; localObject = paramArrayOfT)
    {
      for (int j = 0; j < i; j++)
        localObject[j] = a(j, paramInt);
      if (localObject.length > i)
        localObject[i] = null;
      return localObject;
    }
  }

  protected abstract int b(Object paramObject);

  protected abstract Map<K, V> b();

  public final Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = a(j, paramInt);
    return arrayOfObject;
  }

  protected abstract void c();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.e.f
 * JD-Core Version:    0.6.2
 */