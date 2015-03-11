package com.facebook;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface TestSession$FqlResult extends GraphObject
{
  public abstract GraphObjectList<GraphObject> getFqlResultSet();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.FqlResult
 * JD-Core Version:    0.6.2
 */