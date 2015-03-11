package com.facebook;

import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;

abstract interface TestSession$FqlResponse extends GraphObject
{
  public abstract GraphObjectList<TestSession.FqlResult> getData();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.FqlResponse
 * JD-Core Version:    0.6.2
 */