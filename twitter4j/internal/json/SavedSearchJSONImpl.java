package twitter4j.internal.json;

import java.util.Date;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

final class SavedSearchJSONImpl extends TwitterResponseImpl
  implements SavedSearch
{
  private static final long serialVersionUID = 3083819860391598212L;
  private Date createdAt;
  private int id;
  private String name;
  private int position;
  private String query;

  SavedSearchJSONImpl(HttpResponse paramHttpResponse, Configuration paramConfiguration)
  {
    super(paramHttpResponse);
    if (paramConfiguration.isJSONStoreEnabled())
      DataObjectFactoryUtil.clearThreadLocalMap();
    JSONObject localJSONObject = paramHttpResponse.asJSONObject();
    init(localJSONObject);
    if (paramConfiguration.isJSONStoreEnabled())
      DataObjectFactoryUtil.registerJSONObject(this, localJSONObject);
  }

  SavedSearchJSONImpl(JSONObject paramJSONObject)
  {
    init(paramJSONObject);
  }

  static ResponseList<SavedSearch> createSavedSearchList(HttpResponse paramHttpResponse, Configuration paramConfiguration)
  {
    if (paramConfiguration.isJSONStoreEnabled())
      DataObjectFactoryUtil.clearThreadLocalMap();
    JSONArray localJSONArray = paramHttpResponse.asJSONArray();
    while (true)
    {
      int i;
      try
      {
        ResponseListImpl localResponseListImpl = new ResponseListImpl(localJSONArray.length(), paramHttpResponse);
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          SavedSearchJSONImpl localSavedSearchJSONImpl = new SavedSearchJSONImpl(localJSONObject);
          localResponseListImpl.add(localSavedSearchJSONImpl);
          if (paramConfiguration.isJSONStoreEnabled())
            DataObjectFactoryUtil.registerJSONObject(localSavedSearchJSONImpl, localJSONObject);
        }
        else
        {
          if (paramConfiguration.isJSONStoreEnabled())
            DataObjectFactoryUtil.registerJSONObject(localResponseListImpl, localJSONArray);
          return localResponseListImpl;
        }
      }
      catch (JSONException localJSONException)
      {
        throw new TwitterException(localJSONException.getMessage() + ":" + paramHttpResponse.asString(), localJSONException);
      }
      i++;
    }
  }

  private void init(JSONObject paramJSONObject)
  {
    this.createdAt = z_T4JInternalParseUtil.getDate("created_at", paramJSONObject, "EEE MMM dd HH:mm:ss z yyyy");
    this.query = z_T4JInternalParseUtil.getUnescapedString("query", paramJSONObject);
    this.position = z_T4JInternalParseUtil.getInt("position", paramJSONObject);
    this.name = z_T4JInternalParseUtil.getUnescapedString("name", paramJSONObject);
    this.id = z_T4JInternalParseUtil.getInt("id", paramJSONObject);
  }

  public final int compareTo(SavedSearch paramSavedSearch)
  {
    return this.id - paramSavedSearch.getId();
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    SavedSearch localSavedSearch;
    do
    {
      return true;
      if (!(paramObject instanceof SavedSearch))
        return false;
      localSavedSearch = (SavedSearch)paramObject;
    }
    while (this.id == localSavedSearch.getId());
    return false;
  }

  public final Date getCreatedAt()
  {
    return this.createdAt;
  }

  public final int getId()
  {
    return this.id;
  }

  public final String getName()
  {
    return this.name;
  }

  public final int getPosition()
  {
    return this.position;
  }

  public final String getQuery()
  {
    return this.query;
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 * this.createdAt.hashCode() + this.query.hashCode()) + this.position) + this.name.hashCode()) + this.id;
  }

  public final String toString()
  {
    return "SavedSearchJSONImpl{createdAt=" + this.createdAt + ", query='" + this.query + '\'' + ", position=" + this.position + ", name='" + this.name + '\'' + ", id=" + this.id + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.json.SavedSearchJSONImpl
 * JD-Core Version:    0.6.2
 */