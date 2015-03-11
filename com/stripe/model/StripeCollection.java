package com.stripe.model;

import java.util.List;

public abstract class StripeCollection<T> extends StripeObject
{
  Integer count;
  List<T> data;
  Boolean hasMore;
  Integer totalCount;
  String url;

  public Integer getCount()
  {
    return this.count;
  }

  public List<T> getData()
  {
    return this.data;
  }

  public Boolean getHasMore()
  {
    return this.hasMore;
  }

  public Integer getTotalCount()
  {
    return this.totalCount;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setCount(Integer paramInteger)
  {
    this.count = paramInteger;
  }

  public void setData(List<T> paramList)
  {
    this.data = paramList;
  }

  public void setHasMore(Boolean paramBoolean)
  {
    this.hasMore = paramBoolean;
  }

  public void setTotalCount(Integer paramInteger)
  {
    this.totalCount = paramInteger;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.StripeCollection
 * JD-Core Version:    0.6.2
 */