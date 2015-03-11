package com.facebook.model;

import java.util.List;
import org.json.JSONArray;

public abstract interface GraphObjectList<T> extends List<T>
{
  public abstract <U extends GraphObject> GraphObjectList<U> castToListOf(Class<U> paramClass);

  public abstract JSONArray getInnerJSONArray();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphObjectList
 * JD-Core Version:    0.6.2
 */