package com.facebook;

import com.facebook.model.GraphObject;

abstract interface Response$PagingInfo extends GraphObject
{
  public abstract String getNext();

  public abstract String getPrevious();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.Response.PagingInfo
 * JD-Core Version:    0.6.2
 */