package com.facebook.widget;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface GraphObjectPagingLoader$PagedResults extends GraphObject
{
  public abstract GraphObjectList<GraphObject> getData();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.widget.GraphObjectPagingLoader.PagedResults
 * JD-Core Version:    0.6.2
 */