package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Map;
import twitter4j.AccountSettings;
import twitter4j.AccountTotals;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.Friendship;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.OEmbed;
import twitter4j.PagableResponseList;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.api.HelpResources.Language;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONObject;

public abstract interface z_T4JInternalFactory extends Serializable
{
  public abstract UserList createAUserList(HttpResponse paramHttpResponse);

  public abstract UserList createAUserList(JSONObject paramJSONObject);

  public abstract AccountSettings createAccountSettings(HttpResponse paramHttpResponse);

  public abstract AccountTotals createAccountTotals(HttpResponse paramHttpResponse);

  public abstract ResponseList<Category> createCategoryList(HttpResponse paramHttpResponse);

  public abstract DirectMessage createDirectMessage(HttpResponse paramHttpResponse);

  public abstract DirectMessage createDirectMessage(JSONObject paramJSONObject);

  public abstract ResponseList<DirectMessage> createDirectMessageList(HttpResponse paramHttpResponse);

  public abstract <T> ResponseList<T> createEmptyResponseList();

  public abstract ResponseList<Friendship> createFriendshipList(HttpResponse paramHttpResponse);

  public abstract IDs createIDs(HttpResponse paramHttpResponse);

  public abstract ResponseList<HelpResources.Language> createLanguageList(HttpResponse paramHttpResponse);

  public abstract ResponseList<Location> createLocationList(HttpResponse paramHttpResponse);

  public abstract OEmbed createOEmbed(HttpResponse paramHttpResponse);

  public abstract PagableResponseList<User> createPagableUserList(HttpResponse paramHttpResponse);

  public abstract PagableResponseList<UserList> createPagableUserListList(HttpResponse paramHttpResponse);

  public abstract Place createPlace(HttpResponse paramHttpResponse);

  public abstract ResponseList<Place> createPlaceList(HttpResponse paramHttpResponse);

  public abstract QueryResult createQueryResult(HttpResponse paramHttpResponse, Query paramQuery);

  public abstract Map<String, RateLimitStatus> createRateLimitStatuses(HttpResponse paramHttpResponse);

  public abstract Relationship createRelationship(HttpResponse paramHttpResponse);

  public abstract SavedSearch createSavedSearch(HttpResponse paramHttpResponse);

  public abstract ResponseList<SavedSearch> createSavedSearchList(HttpResponse paramHttpResponse);

  public abstract SimilarPlaces createSimilarPlaces(HttpResponse paramHttpResponse);

  public abstract Status createStatus(HttpResponse paramHttpResponse);

  public abstract Status createStatus(JSONObject paramJSONObject);

  public abstract ResponseList<Status> createStatusList(HttpResponse paramHttpResponse);

  public abstract Trends createTrends(HttpResponse paramHttpResponse);

  public abstract TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse paramHttpResponse);

  public abstract User createUser(HttpResponse paramHttpResponse);

  public abstract User createUser(JSONObject paramJSONObject);

  public abstract ResponseList<User> createUserList(HttpResponse paramHttpResponse);

  public abstract ResponseList<User> createUserListFromJSONArray(HttpResponse paramHttpResponse);

  public abstract ResponseList<User> createUserListFromJSONArray_Users(HttpResponse paramHttpResponse);

  public abstract ResponseList<UserList> createUserListList(HttpResponse paramHttpResponse);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.json.z_T4JInternalFactory
 * JD-Core Version:    0.6.2
 */