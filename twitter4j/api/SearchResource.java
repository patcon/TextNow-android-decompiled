package twitter4j.api;

import twitter4j.Query;
import twitter4j.QueryResult;

public abstract interface SearchResource
{
  public abstract QueryResult search(Query paramQuery);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.SearchResource
 * JD-Core Version:    0.6.2
 */