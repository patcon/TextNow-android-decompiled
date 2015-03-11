package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.internal.http.HttpParameter;

public final class Query
  implements Serializable
{
  public static final String KILOMETERS = "km";
  public static final String MILES = "mi";
  public static final String MIXED = "mixed";
  public static final String POPULAR = "popular";
  public static final String RECENT = "recent";
  private static HttpParameter WITH_TWITTER_USER_ID = new HttpParameter("with_twitter_user_id", "true");
  private static final long serialVersionUID = -8108425822233599808L;
  private int count = -1;
  private String geocode = null;
  private String lang = null;
  private String locale = null;
  private long maxId = -1L;
  private String nextPageQuery = null;
  private String query = null;
  private String resultType = null;
  private String since = null;
  private long sinceId = -1L;
  private String until = null;

  public Query()
  {
  }

  public Query(String paramString)
  {
    this.query = paramString;
  }

  private void appendParameter(String paramString, long paramLong, List<HttpParameter> paramList)
  {
    if (0L <= paramLong)
      paramList.add(new HttpParameter(paramString, String.valueOf(paramLong)));
  }

  private void appendParameter(String paramString1, String paramString2, List<HttpParameter> paramList)
  {
    if (paramString2 != null)
      paramList.add(new HttpParameter(paramString1, paramString2));
  }

  private static Query createWithNextPageQuery(String paramString)
  {
    Query localQuery = new Query();
    localQuery.nextPageQuery = paramString;
    return localQuery;
  }

  final HttpParameter[] asHttpParameterArray()
  {
    ArrayList localArrayList = new ArrayList(12);
    appendParameter("q", this.query, localArrayList);
    appendParameter("lang", this.lang, localArrayList);
    appendParameter("locale", this.locale, localArrayList);
    appendParameter("max_id", this.maxId, localArrayList);
    appendParameter("count", this.count, localArrayList);
    appendParameter("since", this.since, localArrayList);
    appendParameter("since_id", this.sinceId, localArrayList);
    appendParameter("geocode", this.geocode, localArrayList);
    appendParameter("until", this.until, localArrayList);
    appendParameter("result_type", this.resultType, localArrayList);
    localArrayList.add(WITH_TWITTER_USER_ID);
    return (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()]);
  }

  public final Query count(int paramInt)
  {
    this.count = paramInt;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Query localQuery;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localQuery = (Query)paramObject;
      if (this.maxId != localQuery.maxId)
        return false;
      if (this.count != localQuery.count)
        return false;
      if (this.sinceId != localQuery.sinceId)
        return false;
      if (this.geocode != null)
      {
        if (this.geocode.equals(localQuery.geocode));
      }
      else
        while (localQuery.geocode != null)
          return false;
      if (this.lang != null)
      {
        if (this.lang.equals(localQuery.lang));
      }
      else
        while (localQuery.lang != null)
          return false;
      if (this.locale != null)
      {
        if (this.locale.equals(localQuery.locale));
      }
      else
        while (localQuery.locale != null)
          return false;
      if (this.nextPageQuery != null)
      {
        if (this.nextPageQuery.equals(localQuery.nextPageQuery));
      }
      else
        while (localQuery.nextPageQuery != null)
          return false;
      if (this.query != null)
      {
        if (this.query.equals(localQuery.query));
      }
      else
        while (localQuery.query != null)
          return false;
      if (this.resultType != null)
      {
        if (this.resultType.equals(localQuery.resultType));
      }
      else
        while (localQuery.resultType != null)
          return false;
      if (this.since != null)
      {
        if (this.since.equals(localQuery.since));
      }
      else
        while (localQuery.since != null)
          return false;
      if (this.until == null)
        break;
    }
    while (this.until.equals(localQuery.until));
    while (true)
    {
      return false;
      if (localQuery.until == null)
        break;
    }
  }

  public final Query geoCode(GeoLocation paramGeoLocation, double paramDouble, String paramString)
  {
    setGeoCode(paramGeoLocation, paramDouble, paramString);
    return this;
  }

  public final int getCount()
  {
    return this.count;
  }

  public final String getGeocode()
  {
    return this.geocode;
  }

  public final String getLang()
  {
    return this.lang;
  }

  public final String getLocale()
  {
    return this.locale;
  }

  public final long getMaxId()
  {
    return this.maxId;
  }

  public final String getQuery()
  {
    return this.query;
  }

  public final String getResultType()
  {
    return this.resultType;
  }

  public final String getSince()
  {
    return this.since;
  }

  public final long getSinceId()
  {
    return this.sinceId;
  }

  public final String getUntil()
  {
    return this.until;
  }

  public final int hashCode()
  {
    int i;
    int k;
    label35: int n;
    label59: int i2;
    label110: int i4;
    label153: int i6;
    label179: int i7;
    if (this.query != null)
    {
      i = this.query.hashCode();
      int j = i * 31;
      if (this.lang == null)
        break label249;
      k = this.lang.hashCode();
      int m = 31 * (k + j);
      if (this.locale == null)
        break label254;
      n = this.locale.hashCode();
      int i1 = 31 * (31 * (31 * (n + m) + (int)(this.maxId ^ this.maxId >>> 32)) + this.count);
      if (this.since == null)
        break label260;
      i2 = this.since.hashCode();
      int i3 = 31 * (31 * (i2 + i1) + (int)(this.sinceId ^ this.sinceId >>> 32));
      if (this.geocode == null)
        break label266;
      i4 = this.geocode.hashCode();
      int i5 = 31 * (i4 + i3);
      if (this.until == null)
        break label272;
      i6 = this.until.hashCode();
      i7 = 31 * (i6 + i5);
      if (this.resultType == null)
        break label278;
    }
    label260: label266: label272: label278: for (int i8 = this.resultType.hashCode(); ; i8 = 0)
    {
      int i9 = 31 * (i8 + i7);
      String str = this.nextPageQuery;
      int i10 = 0;
      if (str != null)
        i10 = this.nextPageQuery.hashCode();
      return i9 + i10;
      i = 0;
      break;
      label249: k = 0;
      break label35;
      label254: n = 0;
      break label59;
      i2 = 0;
      break label110;
      i4 = 0;
      break label153;
      i6 = 0;
      break label179;
    }
  }

  public final Query lang(String paramString)
  {
    this.lang = paramString;
    return this;
  }

  public final Query locale(String paramString)
  {
    this.locale = paramString;
    return this;
  }

  public final Query maxId(long paramLong)
  {
    this.maxId = paramLong;
    return this;
  }

  final String nextPage()
  {
    return this.nextPageQuery;
  }

  public final Query query(String paramString)
  {
    this.query = paramString;
    return this;
  }

  public final Query resultType(String paramString)
  {
    this.resultType = paramString;
    return this;
  }

  public final void setCount(int paramInt)
  {
    this.count = paramInt;
  }

  public final void setGeoCode(GeoLocation paramGeoLocation, double paramDouble, String paramString)
  {
    this.geocode = (paramGeoLocation.getLatitude() + "," + paramGeoLocation.getLongitude() + "," + paramDouble + paramString);
  }

  public final void setLang(String paramString)
  {
    this.lang = paramString;
  }

  public final void setLocale(String paramString)
  {
    this.locale = paramString;
  }

  public final void setMaxId(long paramLong)
  {
    this.maxId = paramLong;
  }

  public final void setQuery(String paramString)
  {
    this.query = paramString;
  }

  public final void setResultType(String paramString)
  {
    this.resultType = paramString;
  }

  public final void setSince(String paramString)
  {
    this.since = paramString;
  }

  public final void setSinceId(long paramLong)
  {
    this.sinceId = paramLong;
  }

  public final void setUntil(String paramString)
  {
    this.until = paramString;
  }

  public final Query since(String paramString)
  {
    this.since = paramString;
    return this;
  }

  public final Query sinceId(long paramLong)
  {
    this.sinceId = paramLong;
    return this;
  }

  public final String toString()
  {
    return "Query{query='" + this.query + '\'' + ", lang='" + this.lang + '\'' + ", locale='" + this.locale + '\'' + ", maxId=" + this.maxId + ", count=" + this.count + ", since='" + this.since + '\'' + ", sinceId=" + this.sinceId + ", geocode='" + this.geocode + '\'' + ", until='" + this.until + '\'' + ", resultType='" + this.resultType + '\'' + ", nextPageQuery='" + this.nextPageQuery + '\'' + '}';
  }

  public final Query until(String paramString)
  {
    this.until = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Query
 * JD-Core Version:    0.6.2
 */