package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.internal.http.HttpParameter;

public final class Paging
  implements Serializable
{
  static final String COUNT = "count";
  private static HttpParameter[] NULL_PARAMETER_ARRAY = new HttpParameter[0];
  private static List<HttpParameter> NULL_PARAMETER_LIST = new ArrayList(0);
  static final String PER_PAGE = "per_page";
  static char[] S = { 's' };
  static char[] SMCP = { 115, 109, 99, 112 };
  private static final long serialVersionUID = -3285857427993796670L;
  private int count = -1;
  private long maxId = -1L;
  private int page = -1;
  private long sinceId = -1L;

  public Paging()
  {
  }

  public Paging(int paramInt)
  {
    setPage(paramInt);
  }

  public Paging(int paramInt1, int paramInt2)
  {
    this(paramInt1);
    setCount(paramInt2);
  }

  public Paging(int paramInt1, int paramInt2, long paramLong)
  {
    this(paramInt1, paramInt2);
    setSinceId(paramLong);
  }

  public Paging(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this(paramInt1, paramInt2, paramLong1);
    setMaxId(paramLong2);
  }

  public Paging(int paramInt, long paramLong)
  {
    this(paramInt);
    setSinceId(paramLong);
  }

  public Paging(long paramLong)
  {
    setSinceId(paramLong);
  }

  private void addPostParameter(char[] paramArrayOfChar, char paramChar, List<HttpParameter> paramList, String paramString, long paramLong)
  {
    int i = paramArrayOfChar.length;
    for (int j = 0; ; j++)
    {
      int k = 0;
      if (j < i)
      {
        if (paramArrayOfChar[j] == paramChar)
          k = 1;
      }
      else
      {
        if ((k != 0) || (-1L == paramLong))
          break;
        throw new IllegalStateException("Paging parameter [" + paramString + "] is not supported with this operation.");
      }
    }
    if (-1L != paramLong)
      paramList.add(new HttpParameter(paramString, String.valueOf(paramLong)));
  }

  final HttpParameter[] asPostParameterArray()
  {
    List localList = asPostParameterList(SMCP, "count");
    if (localList.size() == 0)
      return NULL_PARAMETER_ARRAY;
    return (HttpParameter[])localList.toArray(new HttpParameter[localList.size()]);
  }

  final HttpParameter[] asPostParameterArray(char[] paramArrayOfChar, String paramString)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfChar.length);
    addPostParameter(paramArrayOfChar, 's', localArrayList, "since_id", getSinceId());
    addPostParameter(paramArrayOfChar, 'm', localArrayList, "max_id", getMaxId());
    addPostParameter(paramArrayOfChar, 'c', localArrayList, paramString, getCount());
    addPostParameter(paramArrayOfChar, 'p', localArrayList, "page", getPage());
    if (localArrayList.size() == 0)
      return NULL_PARAMETER_ARRAY;
    return (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()]);
  }

  final List<HttpParameter> asPostParameterList()
  {
    return asPostParameterList(SMCP, "count");
  }

  final List<HttpParameter> asPostParameterList(char[] paramArrayOfChar)
  {
    return asPostParameterList(paramArrayOfChar, "count");
  }

  final List<HttpParameter> asPostParameterList(char[] paramArrayOfChar, String paramString)
  {
    Object localObject = new ArrayList(paramArrayOfChar.length);
    addPostParameter(paramArrayOfChar, 's', (List)localObject, "since_id", getSinceId());
    addPostParameter(paramArrayOfChar, 'm', (List)localObject, "max_id", getMaxId());
    addPostParameter(paramArrayOfChar, 'c', (List)localObject, paramString, getCount());
    addPostParameter(paramArrayOfChar, 'p', (List)localObject, "page", getPage());
    if (((List)localObject).size() == 0)
      localObject = NULL_PARAMETER_LIST;
    return localObject;
  }

  public final Paging count(int paramInt)
  {
    setCount(paramInt);
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Paging localPaging;
    do
    {
      return true;
      if (!(paramObject instanceof Paging))
        return false;
      localPaging = (Paging)paramObject;
      if (this.count != localPaging.count)
        return false;
      if (this.maxId != localPaging.maxId)
        return false;
      if (this.page != localPaging.page)
        return false;
    }
    while (this.sinceId == localPaging.sinceId);
    return false;
  }

  public final int getCount()
  {
    return this.count;
  }

  public final long getMaxId()
  {
    return this.maxId;
  }

  public final int getPage()
  {
    return this.page;
  }

  public final long getSinceId()
  {
    return this.sinceId;
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * this.page + this.count) + (int)(this.sinceId ^ this.sinceId >>> 32)) + (int)(this.maxId ^ this.maxId >>> 32);
  }

  public final Paging maxId(long paramLong)
  {
    setMaxId(paramLong);
    return this;
  }

  public final void setCount(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("count should be positive integer. passed:" + paramInt);
    this.count = paramInt;
  }

  public final void setMaxId(long paramLong)
  {
    if (paramLong < 1L)
      throw new IllegalArgumentException("max_id should be positive integer. passed:" + paramLong);
    this.maxId = paramLong;
  }

  public final void setPage(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("page should be positive integer. passed:" + paramInt);
    this.page = paramInt;
  }

  public final void setSinceId(long paramLong)
  {
    if (paramLong < 1L)
      throw new IllegalArgumentException("since_id should be positive integer. passed:" + paramLong);
    this.sinceId = paramLong;
  }

  public final Paging sinceId(long paramLong)
  {
    setSinceId(paramLong);
    return this;
  }

  public final String toString()
  {
    return "Paging{page=" + this.page + ", count=" + this.count + ", sinceId=" + this.sinceId + ", maxId=" + this.maxId + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Paging
 * JD-Core Version:    0.6.2
 */