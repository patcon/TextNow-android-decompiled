package twitter4j.internal.json;

import java.io.Serializable;
import twitter4j.Trend;
import twitter4j.internal.org.json.JSONObject;

final class TrendJSONImpl
  implements Serializable, Trend
{
  private static final long serialVersionUID = 1925956704460743946L;
  private String name;
  private String query = null;
  private String url = null;

  TrendJSONImpl(JSONObject paramJSONObject)
  {
    this(paramJSONObject, false);
  }

  TrendJSONImpl(JSONObject paramJSONObject, boolean paramBoolean)
  {
    this.name = z_T4JInternalParseUtil.getRawString("name", paramJSONObject);
    this.url = z_T4JInternalParseUtil.getRawString("url", paramJSONObject);
    this.query = z_T4JInternalParseUtil.getRawString("query", paramJSONObject);
    if (paramBoolean)
      DataObjectFactoryUtil.registerJSONObject(this, paramJSONObject);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Trend localTrend;
    do
    {
      return true;
      if (!(paramObject instanceof Trend))
        return false;
      localTrend = (Trend)paramObject;
      if (!this.name.equals(localTrend.getName()))
        return false;
      if (this.query != null)
      {
        if (this.query.equals(localTrend.getQuery()));
      }
      else
        while (localTrend.getQuery() != null)
          return false;
      if (this.url == null)
        break;
    }
    while (this.url.equals(localTrend.getURL()));
    while (true)
    {
      return false;
      if (localTrend.getURL() == null)
        break;
    }
  }

  public final String getName()
  {
    return this.name;
  }

  public final String getQuery()
  {
    return this.query;
  }

  public final String getURL()
  {
    return this.url;
  }

  public final String getUrl()
  {
    return getURL();
  }

  public final int hashCode()
  {
    int i = 31 * this.name.hashCode();
    if (this.url != null);
    for (int j = this.url.hashCode(); ; j = 0)
    {
      int k = 31 * (j + i);
      String str = this.query;
      int m = 0;
      if (str != null)
        m = this.query.hashCode();
      return k + m;
    }
  }

  public final String toString()
  {
    return "TrendJSONImpl{name='" + this.name + '\'' + ", url='" + this.url + '\'' + ", query='" + this.query + '\'' + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.json.TrendJSONImpl
 * JD-Core Version:    0.6.2
 */