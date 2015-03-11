package com.facebook.model;

import com.facebook.FacebookGraphObjectException;
import com.facebook.internal.Validate;
import java.util.AbstractList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

final class GraphObject$Factory$GraphObjectListImpl<T> extends AbstractList<T>
  implements GraphObjectList<T>
{
  private final Class<?> itemType;
  private final JSONArray state;

  public GraphObject$Factory$GraphObjectListImpl(JSONArray paramJSONArray, Class<?> paramClass)
  {
    Validate.notNull(paramJSONArray, "state");
    Validate.notNull(paramClass, "itemType");
    this.state = paramJSONArray;
    this.itemType = paramClass;
  }

  private void checkIndex(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.state.length()))
      throw new IndexOutOfBoundsException();
  }

  private void put(int paramInt, T paramT)
  {
    Object localObject = GraphObject.Factory.access$200(paramT);
    try
    {
      this.state.put(paramInt, localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      throw new IllegalArgumentException(localJSONException);
    }
  }

  public final void add(int paramInt, T paramT)
  {
    if (paramInt < 0)
      throw new IndexOutOfBoundsException();
    if (paramInt < size())
      throw new UnsupportedOperationException("Only adding items at the end of the list is supported.");
    put(paramInt, paramT);
  }

  public final <U extends GraphObject> GraphObjectList<U> castToListOf(Class<U> paramClass)
  {
    if (GraphObject.class.isAssignableFrom(this.itemType))
    {
      if (paramClass.isAssignableFrom(this.itemType))
        return this;
      return GraphObject.Factory.createList(this.state, paramClass);
    }
    throw new FacebookGraphObjectException("Can't cast GraphObjectCollection of non-GraphObject type " + this.itemType);
  }

  public final void clear()
  {
    throw new UnsupportedOperationException();
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    do
    {
      return false;
      if (this == paramObject)
        return true;
    }
    while (getClass() != paramObject.getClass());
    GraphObjectListImpl localGraphObjectListImpl = (GraphObjectListImpl)paramObject;
    return this.state.equals(localGraphObjectListImpl.state);
  }

  public final T get(int paramInt)
  {
    checkIndex(paramInt);
    return GraphObject.Factory.coerceValueToExpectedType(this.state.opt(paramInt), this.itemType, null);
  }

  public final JSONArray getInnerJSONArray()
  {
    return this.state;
  }

  public final int hashCode()
  {
    return this.state.hashCode();
  }

  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public final T set(int paramInt, T paramT)
  {
    checkIndex(paramInt);
    Object localObject = get(paramInt);
    put(paramInt, paramT);
    return localObject;
  }

  public final int size()
  {
    return this.state.length();
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.itemType.getSimpleName();
    arrayOfObject[1] = this.state;
    return String.format("GraphObjectList{itemType=%s, state=%s}", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphObject.Factory.GraphObjectListImpl
 * JD-Core Version:    0.6.2
 */