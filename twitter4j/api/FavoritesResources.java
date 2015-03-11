package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;

public abstract interface FavoritesResources
{
  public abstract Status createFavorite(long paramLong);

  public abstract Status destroyFavorite(long paramLong);

  public abstract ResponseList<Status> getFavorites();

  public abstract ResponseList<Status> getFavorites(long paramLong);

  public abstract ResponseList<Status> getFavorites(long paramLong, Paging paramPaging);

  public abstract ResponseList<Status> getFavorites(String paramString);

  public abstract ResponseList<Status> getFavorites(String paramString, Paging paramPaging);

  public abstract ResponseList<Status> getFavorites(Paging paramPaging);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.FavoritesResources
 * JD-Core Version:    0.6.2
 */