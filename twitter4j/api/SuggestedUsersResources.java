package twitter4j.api;

import twitter4j.Category;
import twitter4j.ResponseList;
import twitter4j.User;

public abstract interface SuggestedUsersResources
{
  public abstract ResponseList<User> getMemberSuggestions(String paramString);

  public abstract ResponseList<Category> getSuggestedUserCategories();

  public abstract ResponseList<User> getUserSuggestions(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.SuggestedUsersResources
 * JD-Core Version:    0.6.2
 */