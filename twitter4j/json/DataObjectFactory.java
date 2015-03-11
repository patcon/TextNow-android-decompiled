package twitter4j.json;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import twitter4j.AccountTotals;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.OEmbed;
import twitter4j.Place;
import twitter4j.RateLimitStatus;
import twitter4j.Relationship;
import twitter4j.SavedSearch;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

public final class DataObjectFactory
{
  private static final Constructor<IDs> IDsConstructor;
  private static final Constructor<AccountTotals> accountTotalsConstructor;
  private static final Constructor<Category> categoryConstructor;
  private static final Constructor<DirectMessage> directMessageConstructor;
  private static final Constructor<Location> locationConstructor;
  private static final Constructor<OEmbed> oembedConstructor;
  private static final Constructor<Place> placeConstructor;
  private static final Method rateLimitStatusConstructor;
  private static final ThreadLocal<Map> rawJsonMap;
  private static final Constructor<Relationship> relationshipConstructor;
  private static final Constructor<SavedSearch> savedSearchConstructor;
  private static final Constructor<Status> statusConstructor;
  private static final Constructor<StatusDeletionNotice> statusDeletionNoticeConstructor;
  private static final Constructor<Trend> trendConstructor;
  private static final Constructor<Trends> trendsConstructor;
  private static final Constructor<User> userConstructor;
  private static final Constructor<UserList> userListConstructor;

  static
  {
    try
    {
      Constructor localConstructor1 = Class.forName("twitter4j.internal.json.StatusJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      statusConstructor = localConstructor1;
      localConstructor1.setAccessible(true);
      Constructor localConstructor2 = Class.forName("twitter4j.internal.json.UserJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      userConstructor = localConstructor2;
      localConstructor2.setAccessible(true);
      Constructor localConstructor3 = Class.forName("twitter4j.internal.json.RelationshipJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      relationshipConstructor = localConstructor3;
      localConstructor3.setAccessible(true);
      Constructor localConstructor4 = Class.forName("twitter4j.internal.json.PlaceJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      placeConstructor = localConstructor4;
      localConstructor4.setAccessible(true);
      Constructor localConstructor5 = Class.forName("twitter4j.internal.json.SavedSearchJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      savedSearchConstructor = localConstructor5;
      localConstructor5.setAccessible(true);
      Constructor localConstructor6 = Class.forName("twitter4j.internal.json.TrendJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      trendConstructor = localConstructor6;
      localConstructor6.setAccessible(true);
      Constructor localConstructor7 = Class.forName("twitter4j.internal.json.TrendsJSONImpl").getDeclaredConstructor(new Class[] { String.class });
      trendsConstructor = localConstructor7;
      localConstructor7.setAccessible(true);
      Constructor localConstructor8 = Class.forName("twitter4j.internal.json.IDsJSONImpl").getDeclaredConstructor(new Class[] { String.class });
      IDsConstructor = localConstructor8;
      localConstructor8.setAccessible(true);
      Method localMethod = Class.forName("twitter4j.internal.json.RateLimitStatusJSONImpl").getDeclaredMethod("createRateLimitStatuses", new Class[] { JSONObject.class });
      rateLimitStatusConstructor = localMethod;
      localMethod.setAccessible(true);
      Constructor localConstructor9 = Class.forName("twitter4j.internal.json.CategoryJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      categoryConstructor = localConstructor9;
      localConstructor9.setAccessible(true);
      Constructor localConstructor10 = Class.forName("twitter4j.internal.json.DirectMessageJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      directMessageConstructor = localConstructor10;
      localConstructor10.setAccessible(true);
      Constructor localConstructor11 = Class.forName("twitter4j.internal.json.LocationJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      locationConstructor = localConstructor11;
      localConstructor11.setAccessible(true);
      Constructor localConstructor12 = Class.forName("twitter4j.internal.json.UserListJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      userListConstructor = localConstructor12;
      localConstructor12.setAccessible(true);
      Constructor localConstructor13 = Class.forName("twitter4j.StatusDeletionNoticeImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      statusDeletionNoticeConstructor = localConstructor13;
      localConstructor13.setAccessible(true);
      Constructor localConstructor14 = Class.forName("twitter4j.internal.json.AccountTotalsJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      accountTotalsConstructor = localConstructor14;
      localConstructor14.setAccessible(true);
      Constructor localConstructor15 = Class.forName("twitter4j.internal.json.OEmbedJSONImpl").getDeclaredConstructor(new Class[] { JSONObject.class });
      oembedConstructor = localConstructor15;
      localConstructor15.setAccessible(true);
      rawJsonMap = new ThreadLocal()
      {
        protected final Map initialValue()
        {
          return new HashMap();
        }
      };
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new ExceptionInInitializerError(localNoSuchMethodException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new ExceptionInInitializerError(localClassNotFoundException);
    }
  }

  private DataObjectFactory()
  {
    throw new AssertionError("not intended to be instantiated.");
  }

  static void clearThreadLocalMap()
  {
    ((Map)rawJsonMap.get()).clear();
  }

  public static AccountTotals createAccountTotals(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      AccountTotals localAccountTotals = (AccountTotals)accountTotalsConstructor.newInstance(new Object[] { localJSONObject });
      return localAccountTotals;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Category createCategory(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Category localCategory = (Category)categoryConstructor.newInstance(new Object[] { localJSONObject });
      return localCategory;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static DirectMessage createDirectMessage(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      DirectMessage localDirectMessage = (DirectMessage)directMessageConstructor.newInstance(new Object[] { localJSONObject });
      return localDirectMessage;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static IDs createIDs(String paramString)
  {
    try
    {
      IDs localIDs = (IDs)IDsConstructor.newInstance(new Object[] { paramString });
      return localIDs;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
  }

  public static Location createLocation(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Location localLocation = (Location)locationConstructor.newInstance(new Object[] { localJSONObject });
      return localLocation;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static OEmbed createOEmbed(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      OEmbed localOEmbed = (OEmbed)oembedConstructor.newInstance(new Object[] { localJSONObject });
      return localOEmbed;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Object createObject(String paramString)
  {
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject(paramString);
      JSONObjectType.Type localType = JSONObjectType.determine(localJSONObject);
      switch (2.$SwitchMap$twitter4j$json$JSONObjectType$Type[localType.ordinal()])
      {
      case 1:
        Constructor localConstructor3 = directMessageConstructor;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localJSONObject.getJSONObject("direct_message");
        return registerJSONObject(localConstructor3.newInstance(arrayOfObject3), localJSONObject);
      case 2:
        return registerJSONObject(statusConstructor.newInstance(new Object[] { localJSONObject }), localJSONObject);
      case 3:
        Constructor localConstructor2 = directMessageConstructor;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localJSONObject.getJSONObject("direct_message");
        return registerJSONObject(localConstructor2.newInstance(arrayOfObject2), localJSONObject);
      case 4:
        Constructor localConstructor1 = statusDeletionNoticeConstructor;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localJSONObject.getJSONObject("delete").getJSONObject("status");
        Object localObject = registerJSONObject(localConstructor1.newInstance(arrayOfObject1), localJSONObject);
        return localObject;
      case 5:
      case 6:
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
    return localJSONObject;
  }

  public static Place createPlace(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Place localPlace = (Place)placeConstructor.newInstance(new Object[] { localJSONObject });
      return localPlace;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Map<String, RateLimitStatus> createRateLimitStatus(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Map localMap = (Map)rateLimitStatusConstructor.invoke(Class.forName("twitter4j.internal.json.RateLimitStatusJSONImpl"), new Object[] { localJSONObject });
      return localMap;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new TwitterException(localClassNotFoundException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Relationship createRelationship(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Relationship localRelationship = (Relationship)relationshipConstructor.newInstance(new Object[] { localJSONObject });
      return localRelationship;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static SavedSearch createSavedSearch(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      SavedSearch localSavedSearch = (SavedSearch)savedSearchConstructor.newInstance(new Object[] { localJSONObject });
      return localSavedSearch;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Status createStatus(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Status localStatus = (Status)statusConstructor.newInstance(new Object[] { localJSONObject });
      return localStatus;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Trend createTrend(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Trend localTrend = (Trend)trendConstructor.newInstance(new Object[] { localJSONObject });
      return localTrend;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static Trends createTrends(String paramString)
  {
    try
    {
      Trends localTrends = (Trends)trendsConstructor.newInstance(new Object[] { paramString });
      return localTrends;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new TwitterException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new AssertionError(localInvocationTargetException);
    }
  }

  public static User createUser(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      User localUser = (User)userConstructor.newInstance(new Object[] { localJSONObject });
      return localUser;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static UserList createUserList(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      UserList localUserList = (UserList)userListConstructor.newInstance(new Object[] { localJSONObject });
      return localUserList;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new TwitterException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new TwitterException(localInvocationTargetException);
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public static String getRawJSON(Object paramObject)
  {
    Object localObject = ((Map)rawJsonMap.get()).get(paramObject);
    if ((localObject instanceof String))
      return (String)localObject;
    if (localObject != null)
      return localObject.toString();
    return null;
  }

  static <T> T registerJSONObject(T paramT, Object paramObject)
  {
    ((Map)rawJsonMap.get()).put(paramT, paramObject);
    return paramT;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.json.DataObjectFactory
 * JD-Core Version:    0.6.2
 */