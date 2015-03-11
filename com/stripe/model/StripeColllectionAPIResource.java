package com.stripe.model;

import com.stripe.net.APIResource;
import java.util.List;

public abstract class StripeColllectionAPIResource<T> extends APIResource
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

  public String getURL()
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

  public void setURL(String paramString)
  {
    this.url = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.StripeColllectionAPIResource
 * JD-Core Version:    0.6.2
 */