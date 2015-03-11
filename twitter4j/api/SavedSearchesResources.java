package twitter4j.api;

import twitter4j.ResponseList;
import twitter4j.SavedSearch;

public abstract interface SavedSearchesResources
{
  public abstract SavedSearch createSavedSearch(String paramString);

  public abstract SavedSearch destroySavedSearch(int paramInt);

  public abstract ResponseList<SavedSearch> getSavedSearches();

  public abstract SavedSearch showSavedSearch(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.SavedSearchesResources
 * JD-Core Version:    0.6.2
 */