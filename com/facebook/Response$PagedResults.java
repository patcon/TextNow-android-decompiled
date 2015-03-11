package com.facebook;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface Response$PagedResults extends GraphObject
{
  public abstract GraphObjectList<GraphObject> getData();

  public abstract Response.PagingInfo getPaging();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.Response.PagedResults
 * JD-Core Version:    0.6.2
 */