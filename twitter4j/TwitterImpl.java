package twitter4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import twitter4j.api.DirectMessagesResources;
import twitter4j.api.FavoritesResources;
import twitter4j.api.FriendsFollowersResources;
import twitter4j.api.HelpResources;
import twitter4j.api.HelpResources.Language;
import twitter4j.api.ListsResources;
import twitter4j.api.PlacesGeoResources;
import twitter4j.api.SavedSearchesResources;
import twitter4j.api.SearchResource;
import twitter4j.api.SpamReportingResource;
import twitter4j.api.SuggestedUsersResources;
import twitter4j.api.TimelinesResources;
import twitter4j.api.TrendsResources;
import twitter4j.api.TweetsResources;
import twitter4j.api.UsersResources;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpClientWrapper;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.json.z_T4JInternalFactory;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;
import twitter4j.internal.util.z_T4JInternalStringUtil;

class TwitterImpl extends TwitterBaseImpl
  implements Twitter
{
  private static final Map<Configuration, HttpParameter[]> implicitParamsMap = new HashMap();
  private static final Map<Configuration, String> implicitParamsStrMap = new HashMap();
  private static final long serialVersionUID = -1486360080128882436L;
  private final HttpParameter[] IMPLICIT_PARAMS;
  private final String IMPLICIT_PARAMS_STR;
  private final HttpParameter INCLUDE_MY_RETWEET;

  TwitterImpl(Configuration paramConfiguration, Authorization paramAuthorization)
  {
    super(paramConfiguration, paramAuthorization);
    this.INCLUDE_MY_RETWEET = new HttpParameter("include_my_retweet", paramConfiguration.isIncludeMyRetweetEnabled());
    HttpParameter[] arrayOfHttpParameter = (HttpParameter[])implicitParamsMap.get(paramConfiguration);
    Object localObject = (String)implicitParamsStrMap.get(paramConfiguration);
    String str1;
    String str2;
    label82: int i;
    label98: StringBuilder localStringBuilder;
    if (arrayOfHttpParameter == null)
    {
      if (!paramConfiguration.isIncludeEntitiesEnabled())
        break label334;
      str1 = "1";
      if (!paramConfiguration.isIncludeRTsEnabled())
        break label341;
      str2 = "1";
      if (paramConfiguration.getContributingTo() == -1L)
        break label348;
      i = 1;
      localStringBuilder = new StringBuilder().append("include_entities=").append(str1).append("&include_rts=").append(str2);
      if (i == 0)
        break label354;
    }
    label334: label341: label348: label354: for (String str3 = "&contributingto=" + paramConfiguration.getContributingTo(); ; str3 = "")
    {
      String str4 = str3;
      implicitParamsStrMap.put(paramConfiguration, str4);
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(new HttpParameter("include_entities", str1));
      localArrayList.add(new HttpParameter("include_rts", str2));
      if (i != 0)
        localArrayList.add(new HttpParameter("contributingto", paramConfiguration.getContributingTo()));
      if (paramConfiguration.isTrimUserEnabled())
        localArrayList.add(new HttpParameter("trim_user", "1"));
      arrayOfHttpParameter = (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()]);
      implicitParamsMap.put(paramConfiguration, arrayOfHttpParameter);
      localObject = str4;
      this.IMPLICIT_PARAMS = arrayOfHttpParameter;
      this.IMPLICIT_PARAMS_STR = ((String)localObject);
      return;
      str1 = "0";
      break;
      str2 = "0";
      break label82;
      i = 0;
      break label98;
    }
  }

  private void addParameterToList(List<HttpParameter> paramList, String paramString1, String paramString2)
  {
    if (paramString2 != null)
      paramList.add(new HttpParameter(paramString1, paramString2));
  }

  private void checkFileValidity(File paramFile)
  {
    if (!paramFile.exists())
      throw new TwitterException(new FileNotFoundException(paramFile + " is not found."));
    if (!paramFile.isFile())
      throw new TwitterException(new IOException(paramFile + " is not a file."));
  }

  private HttpResponse get(String paramString)
  {
    ensureAuthorizationEnabled();
    if (paramString.contains("?"));
    for (String str = paramString + "&" + this.IMPLICIT_PARAMS_STR; !this.conf.isMBeanEnabled(); str = paramString + "?" + this.IMPLICIT_PARAMS_STR)
      return this.http.get(str, this.auth);
    long l1 = System.currentTimeMillis();
    try
    {
      HttpResponse localHttpResponse = this.http.get(str, this.auth);
      long l3 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(str, l3, isOk(localHttpResponse));
      return localHttpResponse;
    }
    finally
    {
      long l2 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(str, l2, isOk(null));
    }
  }

  private HttpResponse get(String paramString, HttpParameter[] paramArrayOfHttpParameter)
  {
    ensureAuthorizationEnabled();
    if (!this.conf.isMBeanEnabled())
      return this.http.get(paramString, mergeImplicitParams(paramArrayOfHttpParameter), this.auth);
    long l1 = System.currentTimeMillis();
    try
    {
      HttpResponse localHttpResponse = this.http.get(paramString, mergeImplicitParams(paramArrayOfHttpParameter), this.auth);
      long l3 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l3, isOk(localHttpResponse));
      return localHttpResponse;
    }
    finally
    {
      long l2 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l2, isOk(null));
    }
  }

  private boolean isOk(HttpResponse paramHttpResponse)
  {
    return (paramHttpResponse != null) && (paramHttpResponse.getStatusCode() < 300);
  }

  private HttpParameter[] mergeImplicitParams(HttpParameter[] paramArrayOfHttpParameter)
  {
    return mergeParameters(paramArrayOfHttpParameter, this.IMPLICIT_PARAMS);
  }

  private HttpParameter[] mergeParameters(HttpParameter[] paramArrayOfHttpParameter, HttpParameter paramHttpParameter)
  {
    if ((paramArrayOfHttpParameter != null) && (paramHttpParameter != null))
    {
      HttpParameter[] arrayOfHttpParameter = new HttpParameter[1 + paramArrayOfHttpParameter.length];
      System.arraycopy(paramArrayOfHttpParameter, 0, arrayOfHttpParameter, 0, paramArrayOfHttpParameter.length);
      arrayOfHttpParameter[(-1 + arrayOfHttpParameter.length)] = paramHttpParameter;
      paramArrayOfHttpParameter = arrayOfHttpParameter;
    }
    do
    {
      return paramArrayOfHttpParameter;
      if ((paramArrayOfHttpParameter == null) && (paramHttpParameter == null))
        return new HttpParameter[0];
    }
    while (paramArrayOfHttpParameter != null);
    return new HttpParameter[] { paramHttpParameter };
  }

  private HttpParameter[] mergeParameters(HttpParameter[] paramArrayOfHttpParameter1, HttpParameter[] paramArrayOfHttpParameter2)
  {
    if ((paramArrayOfHttpParameter1 != null) && (paramArrayOfHttpParameter2 != null))
    {
      HttpParameter[] arrayOfHttpParameter = new HttpParameter[paramArrayOfHttpParameter1.length + paramArrayOfHttpParameter2.length];
      System.arraycopy(paramArrayOfHttpParameter1, 0, arrayOfHttpParameter, 0, paramArrayOfHttpParameter1.length);
      System.arraycopy(paramArrayOfHttpParameter2, 0, arrayOfHttpParameter, paramArrayOfHttpParameter1.length, paramArrayOfHttpParameter2.length);
      paramArrayOfHttpParameter1 = arrayOfHttpParameter;
    }
    do
    {
      return paramArrayOfHttpParameter1;
      if ((paramArrayOfHttpParameter1 == null) && (paramArrayOfHttpParameter2 == null))
        return new HttpParameter[0];
    }
    while (paramArrayOfHttpParameter1 != null);
    return paramArrayOfHttpParameter2;
  }

  private HttpResponse post(String paramString)
  {
    ensureAuthorizationEnabled();
    if (!this.conf.isMBeanEnabled())
      return this.http.post(paramString, this.IMPLICIT_PARAMS, this.auth);
    long l1 = System.currentTimeMillis();
    try
    {
      HttpResponse localHttpResponse = this.http.post(paramString, this.IMPLICIT_PARAMS, this.auth);
      long l3 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l3, isOk(localHttpResponse));
      return localHttpResponse;
    }
    finally
    {
      long l2 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l2, isOk(null));
    }
  }

  private HttpResponse post(String paramString, HttpParameter[] paramArrayOfHttpParameter)
  {
    ensureAuthorizationEnabled();
    if (!this.conf.isMBeanEnabled())
      return this.http.post(paramString, mergeImplicitParams(paramArrayOfHttpParameter), this.auth);
    long l1 = System.currentTimeMillis();
    try
    {
      HttpResponse localHttpResponse = this.http.post(paramString, mergeImplicitParams(paramArrayOfHttpParameter), this.auth);
      long l3 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l3, isOk(localHttpResponse));
      return localHttpResponse;
    }
    finally
    {
      long l2 = System.currentTimeMillis() - l1;
      TwitterAPIMonitor.getInstance().methodCalled(paramString, l2, isOk(null));
    }
  }

  private UserList updateUserList(String paramString1, boolean paramBoolean, String paramString2, HttpParameter[] paramArrayOfHttpParameter)
  {
    ArrayList localArrayList = new ArrayList();
    Collections.addAll(localArrayList, paramArrayOfHttpParameter);
    if (paramString1 != null)
      localArrayList.add(new HttpParameter("name", paramString1));
    if (paramBoolean);
    for (String str = "public"; ; str = "private")
    {
      localArrayList.add(new HttpParameter("mode", str));
      if (paramString2 != null)
        localArrayList.add(new HttpParameter("description", paramString2));
      return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/update.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
    }
  }

  public UserList addUserListMember(int paramInt, long paramLong)
  {
    return null;
  }

  public UserList addUserListMember(long paramLong1, String paramString, long paramLong2)
  {
    return null;
  }

  public UserList addUserListMembers(int paramInt, long[] paramArrayOfLong)
  {
    return createUserListMembers(paramInt, paramArrayOfLong);
  }

  public UserList addUserListMembers(int paramInt, String[] paramArrayOfString)
  {
    return createUserListMembers(paramInt, paramArrayOfString);
  }

  public UserList addUserListMembers(long paramLong, String paramString, long[] paramArrayOfLong)
  {
    return createUserListMembers(paramLong, paramString, paramArrayOfLong);
  }

  public UserList addUserListMembers(long paramLong, String paramString, String[] paramArrayOfString)
  {
    return createUserListMembers(paramLong, paramString, paramArrayOfString);
  }

  public User createBlock(long paramLong)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json?user_id=" + paramLong));
  }

  public User createBlock(String paramString)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json?screen_name=" + paramString));
  }

  public Status createFavorite(long paramLong)
  {
    return this.factory.createStatus(post(this.conf.getRestBaseURL() + "favorites/create.json?id=" + paramLong));
  }

  public User createFriendship(long paramLong)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + paramLong));
  }

  public User createFriendship(long paramLong, boolean paramBoolean)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + paramLong + "&follow=" + paramBoolean));
  }

  public User createFriendship(String paramString)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?screen_name=" + paramString));
  }

  public User createFriendship(String paramString, boolean paramBoolean)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?screen_name=" + paramString + "&follow=" + paramBoolean));
  }

  public Place createPlace(String paramString1, String paramString2, String paramString3, GeoLocation paramGeoLocation, String paramString4)
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(new HttpParameter("name", paramString1));
    localArrayList.add(new HttpParameter("contained_within", paramString2));
    localArrayList.add(new HttpParameter("token", paramString3));
    localArrayList.add(new HttpParameter("lat", paramGeoLocation.getLatitude()));
    localArrayList.add(new HttpParameter("long", paramGeoLocation.getLongitude()));
    if (paramString4 != null)
      localArrayList.add(new HttpParameter("attribute:street_address", paramString4));
    return this.factory.createPlace(post(this.conf.getRestBaseURL() + "geo/place.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
  }

  public SavedSearch createSavedSearch(String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "saved_searches/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("query", paramString);
    return localz_T4JInternalFactory.createSavedSearch(post(str, arrayOfHttpParameter));
  }

  public UserList createUserList(String paramString1, boolean paramBoolean, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new HttpParameter("name", paramString1));
    if (paramBoolean);
    for (String str = "public"; ; str = "private")
    {
      localArrayList.add(new HttpParameter("mode", str));
      if (paramString2 != null)
        localArrayList.add(new HttpParameter("description", paramString2));
      return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/create.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
    }
  }

  public UserList createUserListMember(int paramInt, long paramLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("list_id", paramInt);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMember(long paramLong1, String paramString, long paramLong2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong2);
    arrayOfHttpParameter[1] = new HttpParameter("owner_id", paramLong1);
    arrayOfHttpParameter[2] = new HttpParameter("slug", paramString);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMember(String paramString1, String paramString2, long paramLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[2] = new HttpParameter("slug", paramString2);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(int paramInt, long[] paramArrayOfLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    arrayOfHttpParameter[1] = new HttpParameter("user_id", z_T4JInternalStringUtil.join(paramArrayOfLong));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(int paramInt, String[] paramArrayOfString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    arrayOfHttpParameter[1] = new HttpParameter("screen_name", z_T4JInternalStringUtil.join(paramArrayOfString));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(long paramLong, String paramString, long[] paramArrayOfLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    arrayOfHttpParameter[2] = new HttpParameter("user_id", z_T4JInternalStringUtil.join(paramArrayOfLong));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(long paramLong, String paramString, String[] paramArrayOfString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    arrayOfHttpParameter[2] = new HttpParameter("screen_name", z_T4JInternalStringUtil.join(paramArrayOfString));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(String paramString1, String paramString2, long[] paramArrayOfLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    arrayOfHttpParameter[2] = new HttpParameter("user_id", z_T4JInternalStringUtil.join(paramArrayOfLong));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListMembers(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/create_all.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    arrayOfHttpParameter[2] = new HttpParameter("screen_name", z_T4JInternalStringUtil.join(paramArrayOfString));
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListSubscription(int paramInt)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListSubscription(long paramLong, String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList createUserListSubscription(String paramString1, String paramString2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/create.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList deleteUserListMember(int paramInt, long paramLong)
  {
    return destroyUserListMember(paramInt, paramLong);
  }

  public UserList deleteUserListMember(long paramLong1, String paramString, long paramLong2)
  {
    return destroyUserListMember(paramLong1, paramString, paramLong2);
  }

  public User destroyBlock(long paramLong)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json?user_id=" + paramLong));
  }

  public User destroyBlock(String paramString)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json?screen_name=" + paramString));
  }

  public DirectMessage destroyDirectMessage(long paramLong)
  {
    return this.factory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/destroy.json?id=" + paramLong));
  }

  public Status destroyFavorite(long paramLong)
  {
    return this.factory.createStatus(post(this.conf.getRestBaseURL() + "favorites/destroy.json?id=" + paramLong));
  }

  public User destroyFriendship(long paramLong)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json?user_id=" + paramLong));
  }

  public User destroyFriendship(String paramString)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json?screen_name=" + paramString));
  }

  public SavedSearch destroySavedSearch(int paramInt)
  {
    return this.factory.createSavedSearch(post(this.conf.getRestBaseURL() + "saved_searches/destroy/" + paramInt + ".json"));
  }

  public Status destroyStatus(long paramLong)
  {
    return this.factory.createStatus(post(this.conf.getRestBaseURL() + "statuses/destroy/" + paramLong + ".json"));
  }

  public UserList destroyUserList(int paramInt)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserList(long paramLong, String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserList(String paramString1, String paramString2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListMember(int paramInt, long paramLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    arrayOfHttpParameter[1] = new HttpParameter("user_id", paramLong);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListMember(long paramLong1, String paramString, long paramLong2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    arrayOfHttpParameter[2] = new HttpParameter("user_id", paramLong2);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListMember(String paramString1, String paramString2, long paramLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/members/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    arrayOfHttpParameter[2] = new HttpParameter("user_id", paramLong);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListSubscription(int paramInt)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListSubscription(long paramLong, String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public UserList destroyUserListSubscription(String paramString1, String paramString2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/subscribers/destroy.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    return localz_T4JInternalFactory.createAUserList(post(str, arrayOfHttpParameter));
  }

  public DirectMessagesResources directMessages()
  {
    return this;
  }

  public FavoritesResources favorites()
  {
    return this;
  }

  public FriendsFollowersResources friendsFollowers()
  {
    return this;
  }

  public TwitterAPIConfiguration getAPIConfiguration()
  {
    return this.factory.createTwitterAPIConfiguration(get(this.conf.getRestBaseURL() + "help/configuration.json"));
  }

  public AccountSettings getAccountSettings()
  {
    return this.factory.createAccountSettings(get(this.conf.getRestBaseURL() + "account/settings.json"));
  }

  public ResponseList<Location> getAvailableTrends()
  {
    return this.factory.createLocationList(get(this.conf.getRestBaseURL() + "trends/available.json"));
  }

  public ResponseList<Location> getAvailableTrends(GeoLocation paramGeoLocation)
  {
    return getClosestTrends(paramGeoLocation);
  }

  public IDs getBlocksIDs()
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json"));
  }

  public IDs getBlocksIDs(long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json?cursor=" + paramLong));
  }

  public PagableResponseList<User> getBlocksList()
  {
    return getBlocksList(-1L);
  }

  public PagableResponseList<User> getBlocksList(long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "blocks/list.json?cursor=" + paramLong));
  }

  public ResponseList<Location> getClosestTrends(GeoLocation paramGeoLocation)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "trends/closest.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("lat", paramGeoLocation.getLatitude());
    arrayOfHttpParameter[1] = new HttpParameter("long", paramGeoLocation.getLongitude());
    return localz_T4JInternalFactory.createLocationList(get(str, arrayOfHttpParameter));
  }

  public ResponseList<User> getContributees(long paramLong)
  {
    return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json?user_id=" + paramLong));
  }

  public ResponseList<User> getContributees(String paramString)
  {
    return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json?screen_name=" + paramString));
  }

  public ResponseList<User> getContributors(long paramLong)
  {
    return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json?user_id=" + paramLong));
  }

  public ResponseList<User> getContributors(String paramString)
  {
    return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json?screen_name=" + paramString));
  }

  public ResponseList<DirectMessage> getDirectMessages()
  {
    return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json"));
  }

  public ResponseList<DirectMessage> getDirectMessages(Paging paramPaging)
  {
    return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json", paramPaging.asPostParameterArray()));
  }

  public ResponseList<Status> getFavorites()
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json"));
  }

  public ResponseList<Status> getFavorites(long paramLong)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json?user_id=" + paramLong));
  }

  public ResponseList<Status> getFavorites(long paramLong, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "favorites/list.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter, paramPaging.asPostParameterArray())));
  }

  public ResponseList<Status> getFavorites(String paramString)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json?screen_name=" + paramString));
  }

  public ResponseList<Status> getFavorites(String paramString, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "favorites/list.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("screen_name", paramString);
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter, paramPaging.asPostParameterArray())));
  }

  public ResponseList<Status> getFavorites(Paging paramPaging)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", paramPaging.asPostParameterArray()));
  }

  public IDs getFollowersIDs(long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?cursor=" + paramLong));
  }

  public IDs getFollowersIDs(long paramLong1, long paramLong2)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?user_id=" + paramLong1 + "&cursor=" + paramLong2));
  }

  public IDs getFollowersIDs(String paramString, long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?screen_name=" + paramString + "&cursor=" + paramLong));
  }

  public PagableResponseList<User> getFollowersList(long paramLong1, long paramLong2)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?user_id=" + paramLong1 + "&cursor=" + paramLong2));
  }

  public PagableResponseList<User> getFollowersList(String paramString, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?screen_name=" + paramString + "&cursor=" + paramLong));
  }

  public IDs getFriendsIDs(long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?cursor=" + paramLong));
  }

  public IDs getFriendsIDs(long paramLong1, long paramLong2)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?user_id=" + paramLong1 + "&cursor=" + paramLong2));
  }

  public IDs getFriendsIDs(String paramString, long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?screen_name=" + paramString + "&cursor=" + paramLong));
  }

  public PagableResponseList<User> getFriendsList(long paramLong1, long paramLong2)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?user_id=" + paramLong1 + "&cursor=" + paramLong2));
  }

  public PagableResponseList<User> getFriendsList(String paramString, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?screen_name=" + paramString + "&cursor=" + paramLong));
  }

  public Place getGeoDetails(String paramString)
  {
    return this.factory.createPlace(get(this.conf.getRestBaseURL() + "geo/id/" + paramString + ".json"));
  }

  public ResponseList<Status> getHomeTimeline()
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/home_timeline.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatusList(get(str, arrayOfHttpParameter));
  }

  public ResponseList<Status> getHomeTimeline(Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/home_timeline.json";
    HttpParameter[] arrayOfHttpParameter1 = paramPaging.asPostParameterArray();
    HttpParameter[] arrayOfHttpParameter2 = new HttpParameter[1];
    arrayOfHttpParameter2[0] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter1, arrayOfHttpParameter2)));
  }

  public IDs getIncomingFriendships(long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friendships/incoming.json?cursor=" + paramLong));
  }

  public ResponseList<HelpResources.Language> getLanguages()
  {
    return this.factory.createLanguageList(get(this.conf.getRestBaseURL() + "help/languages.json"));
  }

  public Trends getLocationTrends(int paramInt)
  {
    return getPlaceTrends(paramInt);
  }

  public ResponseList<User> getMemberSuggestions(String paramString)
  {
    try
    {
      HttpResponse localHttpResponse = get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(paramString, "UTF-8") + "/members.json");
      return this.factory.createUserListFromJSONArray(localHttpResponse);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
  }

  public ResponseList<Status> getMentions()
  {
    return getMentionsTimeline();
  }

  public ResponseList<Status> getMentions(Paging paramPaging)
  {
    return getMentionsTimeline(paramPaging);
  }

  public ResponseList<Status> getMentionsTimeline()
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json"));
  }

  public ResponseList<Status> getMentionsTimeline(Paging paramPaging)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json", paramPaging.asPostParameterArray()));
  }

  public OEmbed getOEmbed(OEmbedRequest paramOEmbedRequest)
  {
    return this.factory.createOEmbed(get(this.conf.getRestBaseURL() + "statuses/oembed.json", paramOEmbedRequest.asHttpParameterArray()));
  }

  public IDs getOutgoingFriendships(long paramLong)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friendships/outgoing.json?cursor=" + paramLong));
  }

  public Trends getPlaceTrends(int paramInt)
  {
    return this.factory.createTrends(get(this.conf.getRestBaseURL() + "trends/place.json?id=" + paramInt));
  }

  public String getPrivacyPolicy()
  {
    try
    {
      String str = get(this.conf.getRestBaseURL() + "help/privacy.json").asJSONObject().getString("privacy");
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public Map<String, RateLimitStatus> getRateLimitStatus()
  {
    return this.factory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json"));
  }

  public Map<String, RateLimitStatus> getRateLimitStatus(String[] paramArrayOfString)
  {
    return this.factory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json?resources=" + z_T4JInternalStringUtil.join(paramArrayOfString)));
  }

  public IDs getRetweeterIds(long paramLong1, int paramInt, long paramLong2)
  {
    return this.factory.createIDs(get(this.conf.getRestBaseURL() + "statuses/retweeters/ids.json?id=" + paramLong1 + "&cursor=" + paramLong2 + "&count=" + paramInt));
  }

  public IDs getRetweeterIds(long paramLong1, long paramLong2)
  {
    return getRetweeterIds(paramLong1, 100, paramLong2);
  }

  public ResponseList<Status> getRetweets(long paramLong)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets/" + paramLong + ".json?count=100"));
  }

  public ResponseList<Status> getRetweetsOfMe()
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json"));
  }

  public ResponseList<Status> getRetweetsOfMe(Paging paramPaging)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json", paramPaging.asPostParameterArray()));
  }

  public ResponseList<SavedSearch> getSavedSearches()
  {
    return this.factory.createSavedSearchList(get(this.conf.getRestBaseURL() + "saved_searches/list.json"));
  }

  public ResponseList<DirectMessage> getSentDirectMessages()
  {
    return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json"));
  }

  public ResponseList<DirectMessage> getSentDirectMessages(Paging paramPaging)
  {
    return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json", paramPaging.asPostParameterArray()));
  }

  public SimilarPlaces getSimilarPlaces(GeoLocation paramGeoLocation, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(new HttpParameter("lat", paramGeoLocation.getLatitude()));
    localArrayList.add(new HttpParameter("long", paramGeoLocation.getLongitude()));
    localArrayList.add(new HttpParameter("name", paramString1));
    if (paramString2 != null)
      localArrayList.add(new HttpParameter("contained_within", paramString2));
    if (paramString3 != null)
      localArrayList.add(new HttpParameter("attribute:street_address", paramString3));
    return this.factory.createSimilarPlaces(get(this.conf.getRestBaseURL() + "geo/similar_places.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
  }

  public ResponseList<Category> getSuggestedUserCategories()
  {
    return this.factory.createCategoryList(get(this.conf.getRestBaseURL() + "users/suggestions.json"));
  }

  public String getTermsOfService()
  {
    try
    {
      String str = get(this.conf.getRestBaseURL() + "help/tos.json").asJSONObject().getString("tos");
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public PagableResponseList<User> getUserListMembers(int paramInt, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?list_id=" + paramInt + "&cursor=" + paramLong));
  }

  public PagableResponseList<User> getUserListMembers(long paramLong1, String paramString, long paramLong2)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?owner_id=" + paramLong1 + "&slug=" + paramString + "&cursor=" + paramLong2));
  }

  public PagableResponseList<User> getUserListMembers(String paramString1, String paramString2, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?owner_screen_name=" + paramString1 + "&slug=" + paramString2 + "&cursor=" + paramLong));
  }

  public PagableResponseList<UserList> getUserListMemberships(long paramLong)
  {
    return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?cursor=" + paramLong));
  }

  public PagableResponseList<UserList> getUserListMemberships(long paramLong1, long paramLong2)
  {
    return getUserListMemberships(paramLong1, paramLong2, false);
  }

  public PagableResponseList<UserList> getUserListMemberships(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?user_id=" + paramLong1 + "&cursor=" + paramLong2 + "&filter_to_owned_lists=" + paramBoolean));
  }

  public PagableResponseList<UserList> getUserListMemberships(String paramString, long paramLong)
  {
    return getUserListMemberships(paramString, paramLong, false);
  }

  public PagableResponseList<UserList> getUserListMemberships(String paramString, long paramLong, boolean paramBoolean)
  {
    return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?screen_name=" + paramString + "&cursor=" + paramLong + "&filter_to_owned_lists=" + paramBoolean));
  }

  public ResponseList<Status> getUserListStatuses(int paramInt, Paging paramPaging)
  {
    return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paramPaging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter("list_id", paramInt))));
  }

  public ResponseList<Status> getUserListStatuses(long paramLong, String paramString, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/statuses.json";
    HttpParameter[] arrayOfHttpParameter1 = paramPaging.asPostParameterArray(Paging.SMCP, "count");
    HttpParameter[] arrayOfHttpParameter2 = new HttpParameter[2];
    arrayOfHttpParameter2[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter2[1] = new HttpParameter("slug", paramString);
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter1, arrayOfHttpParameter2)));
  }

  public ResponseList<Status> getUserListStatuses(String paramString1, String paramString2, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "lists/statuses.json";
    HttpParameter[] arrayOfHttpParameter1 = paramPaging.asPostParameterArray(Paging.SMCP, "count");
    HttpParameter[] arrayOfHttpParameter2 = new HttpParameter[2];
    arrayOfHttpParameter2[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter2[1] = new HttpParameter("slug", paramString2);
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter1, arrayOfHttpParameter2)));
  }

  public PagableResponseList<User> getUserListSubscribers(int paramInt, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?list_id=" + paramInt + "&cursor=" + paramLong));
  }

  public PagableResponseList<User> getUserListSubscribers(long paramLong1, String paramString, long paramLong2)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?owner_id=" + paramLong1 + "&slug=" + paramString + "&cursor=" + paramLong2));
  }

  public PagableResponseList<User> getUserListSubscribers(String paramString1, String paramString2, long paramLong)
  {
    return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?owner_screen_name=" + paramString1 + "&slug=" + paramString2 + "&cursor=" + paramLong));
  }

  public PagableResponseList<UserList> getUserListSubscriptions(String paramString, long paramLong)
  {
    return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/subscriptions.json?screen_name=" + paramString + "&cursor=" + paramLong));
  }

  public ResponseList<UserList> getUserLists(long paramLong)
  {
    return this.factory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json?user_id=" + paramLong));
  }

  public ResponseList<UserList> getUserLists(String paramString)
  {
    return this.factory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json?screen_name=" + paramString));
  }

  public ResponseList<User> getUserSuggestions(String paramString)
  {
    try
    {
      HttpResponse localHttpResponse = get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(paramString, "UTF-8") + ".json");
      return this.factory.createUserListFromJSONArray_Users(localHttpResponse);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException);
    }
  }

  public ResponseList<Status> getUserTimeline()
  {
    return getUserTimeline(new Paging());
  }

  public ResponseList<Status> getUserTimeline(long paramLong)
  {
    return getUserTimeline(paramLong, new Paging());
  }

  public ResponseList<Status> getUserTimeline(long paramLong, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/user_timeline.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    arrayOfHttpParameter[1] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter, paramPaging.asPostParameterArray())));
  }

  public ResponseList<Status> getUserTimeline(String paramString)
  {
    return getUserTimeline(paramString, new Paging());
  }

  public ResponseList<Status> getUserTimeline(String paramString, Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/user_timeline.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("screen_name", paramString);
    arrayOfHttpParameter[1] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter, paramPaging.asPostParameterArray())));
  }

  public ResponseList<Status> getUserTimeline(Paging paramPaging)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/user_timeline.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatusList(get(str, mergeParameters(arrayOfHttpParameter, paramPaging.asPostParameterArray())));
  }

  public HelpResources help()
  {
    return this;
  }

  public ListsResources list()
  {
    return this;
  }

  public ResponseList<Friendship> lookupFriendships(long[] paramArrayOfLong)
  {
    return this.factory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?user_id=" + z_T4JInternalStringUtil.join(paramArrayOfLong)));
  }

  public ResponseList<Friendship> lookupFriendships(String[] paramArrayOfString)
  {
    return this.factory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?screen_name=" + z_T4JInternalStringUtil.join(paramArrayOfString)));
  }

  public ResponseList<User> lookupUsers(long[] paramArrayOfLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "users/lookup.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", z_T4JInternalStringUtil.join(paramArrayOfLong));
    return localz_T4JInternalFactory.createUserList(get(str, arrayOfHttpParameter));
  }

  public ResponseList<User> lookupUsers(String[] paramArrayOfString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "users/lookup.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("screen_name", z_T4JInternalStringUtil.join(paramArrayOfString));
    return localz_T4JInternalFactory.createUserList(get(str, arrayOfHttpParameter));
  }

  public PlacesGeoResources placesGeo()
  {
    return this;
  }

  public void removeProfileBanner()
  {
    post(this.conf.getRestBaseURL() + "account/remove_profile_banner.json");
  }

  public User reportSpam(long paramLong)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json?user_id=" + paramLong));
  }

  public User reportSpam(String paramString)
  {
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json?screen_name=" + paramString));
  }

  public Status retweetStatus(long paramLong)
  {
    return this.factory.createStatus(post(this.conf.getRestBaseURL() + "statuses/retweet/" + paramLong + ".json"));
  }

  public ResponseList<Place> reverseGeoCode(GeoQuery paramGeoQuery)
  {
    try
    {
      ResponseList localResponseList = this.factory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/reverse_geocode.json", paramGeoQuery.asHttpParameterArray()));
      return localResponseList;
    }
    catch (TwitterException localTwitterException)
    {
      if (localTwitterException.getStatusCode() == 404)
        return this.factory.createEmptyResponseList();
      throw localTwitterException;
    }
  }

  public SavedSearchesResources savedSearches()
  {
    return this;
  }

  public QueryResult search(Query paramQuery)
  {
    if (paramQuery.nextPage() != null)
      return this.factory.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json" + paramQuery.nextPage()), paramQuery);
    return this.factory.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json", paramQuery.asHttpParameterArray()), paramQuery);
  }

  public SearchResource search()
  {
    return this;
  }

  public ResponseList<Place> searchPlaces(GeoQuery paramGeoQuery)
  {
    return this.factory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/search.json", paramGeoQuery.asHttpParameterArray()));
  }

  public ResponseList<User> searchUsers(String paramString, int paramInt)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "users/search.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("q", paramString);
    arrayOfHttpParameter[1] = new HttpParameter("per_page", 20);
    arrayOfHttpParameter[2] = new HttpParameter("page", paramInt);
    return localz_T4JInternalFactory.createUserList(get(str, arrayOfHttpParameter));
  }

  public DirectMessage sendDirectMessage(long paramLong, String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "direct_messages/new.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("text", paramString);
    return localz_T4JInternalFactory.createDirectMessage(post(str, arrayOfHttpParameter));
  }

  public DirectMessage sendDirectMessage(String paramString1, String paramString2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "direct_messages/new.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("text", paramString2);
    return localz_T4JInternalFactory.createDirectMessage(post(str, arrayOfHttpParameter));
  }

  public DirectMessage showDirectMessage(long paramLong)
  {
    return this.factory.createDirectMessage(get(this.conf.getRestBaseURL() + "direct_messages/show.json?id=" + paramLong));
  }

  public Relationship showFriendship(long paramLong1, long paramLong2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "friendships/show.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("source_id", paramLong1);
    arrayOfHttpParameter[1] = new HttpParameter("target_id", paramLong2);
    return localz_T4JInternalFactory.createRelationship(get(str, arrayOfHttpParameter));
  }

  public Relationship showFriendship(String paramString1, String paramString2)
  {
    return this.factory.createRelationship(get(this.conf.getRestBaseURL() + "friendships/show.json", HttpParameter.getParameterArray("source_screen_name", paramString1, "target_screen_name", paramString2)));
  }

  public SavedSearch showSavedSearch(int paramInt)
  {
    return this.factory.createSavedSearch(get(this.conf.getRestBaseURL() + "saved_searches/show/" + paramInt + ".json"));
  }

  public Status showStatus(long paramLong)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/show/" + paramLong + ".json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = this.INCLUDE_MY_RETWEET;
    return localz_T4JInternalFactory.createStatus(get(str, arrayOfHttpParameter));
  }

  public User showUser(long paramLong)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "users/show.json?user_id=" + paramLong));
  }

  public User showUser(String paramString)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "users/show.json?screen_name=" + paramString));
  }

  public UserList showUserList(int paramInt)
  {
    return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?list_id=" + paramInt));
  }

  public UserList showUserList(long paramLong, String paramString)
  {
    return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?owner_id=" + paramLong + "&slug=" + paramString));
  }

  public UserList showUserList(String paramString1, String paramString2)
  {
    return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?owner_screen_name=" + paramString1 + "&slug=" + paramString2));
  }

  public User showUserListMembership(int paramInt, long paramLong)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?list_id=" + paramInt + "&user_id=" + paramLong));
  }

  public User showUserListMembership(long paramLong1, String paramString, long paramLong2)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?owner_id=" + paramLong1 + "&slug=" + paramString + "&user_id=" + paramLong2));
  }

  public User showUserListMembership(String paramString1, String paramString2, long paramLong)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?owner_screen_name=" + paramString1 + "&slug=" + paramString2 + "&user_id=" + paramLong));
  }

  public User showUserListSubscription(int paramInt, long paramLong)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?list_id=" + paramInt + "&user_id=" + paramLong));
  }

  public User showUserListSubscription(long paramLong1, String paramString, long paramLong2)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?owner_id=" + paramLong1 + "&slug=" + paramString + "&user_id=" + paramLong2));
  }

  public User showUserListSubscription(String paramString1, String paramString2, long paramLong)
  {
    return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?owner_screen_name=" + paramString1 + "&slug=" + paramString2 + "&user_id=" + paramLong));
  }

  public SpamReportingResource spamReporting()
  {
    return this;
  }

  public SuggestedUsersResources suggestedUsers()
  {
    return this;
  }

  public TimelinesResources timelines()
  {
    return this;
  }

  public String toString()
  {
    return "TwitterImpl{INCLUDE_MY_RETWEET=" + this.INCLUDE_MY_RETWEET + '}';
  }

  public TrendsResources trends()
  {
    return this;
  }

  public TweetsResources tweets()
  {
    return this;
  }

  public AccountSettings updateAccountSettings(Integer paramInteger, Boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ArrayList localArrayList = new ArrayList(6);
    if (paramInteger != null)
      localArrayList.add(new HttpParameter("trend_location_woeid", paramInteger.intValue()));
    if (paramBoolean != null)
      localArrayList.add(new HttpParameter("sleep_time_enabled", paramBoolean.toString()));
    if (paramString1 != null)
      localArrayList.add(new HttpParameter("start_sleep_time", paramString1));
    if (paramString2 != null)
      localArrayList.add(new HttpParameter("end_sleep_time", paramString2));
    if (paramString3 != null)
      localArrayList.add(new HttpParameter("time_zone", paramString3));
    if (paramString4 != null)
      localArrayList.add(new HttpParameter("lang", paramString4));
    return this.factory.createAccountSettings(post(this.conf.getRestBaseURL() + "account/settings.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
  }

  public Relationship updateFriendship(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "friendships/update.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("user_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("device", paramBoolean1);
    arrayOfHttpParameter[2] = new HttpParameter("retweets", paramBoolean2);
    return localz_T4JInternalFactory.createRelationship(post(str, arrayOfHttpParameter));
  }

  public Relationship updateFriendship(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "friendships/update.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[3];
    arrayOfHttpParameter[0] = new HttpParameter("screen_name", paramString);
    arrayOfHttpParameter[1] = new HttpParameter("device", paramBoolean1);
    arrayOfHttpParameter[2] = new HttpParameter("retweets", paramBoolean1);
    return localz_T4JInternalFactory.createRelationship(post(str, arrayOfHttpParameter));
  }

  public User updateProfile(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ArrayList localArrayList = new ArrayList(4);
    addParameterToList(localArrayList, "name", paramString1);
    addParameterToList(localArrayList, "url", paramString2);
    addParameterToList(localArrayList, "location", paramString3);
    addParameterToList(localArrayList, "description", paramString4);
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
  }

  public User updateProfileBackgroundImage(File paramFile, boolean paramBoolean)
  {
    checkFileValidity(paramFile);
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "account/update_profile_background_image.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("image", paramFile);
    arrayOfHttpParameter[1] = new HttpParameter("tile", paramBoolean);
    return localz_T4JInternalFactory.createUser(post(str, arrayOfHttpParameter));
  }

  public User updateProfileBackgroundImage(InputStream paramInputStream, boolean paramBoolean)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "account/update_profile_background_image.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("image", "image", paramInputStream);
    arrayOfHttpParameter[1] = new HttpParameter("tile", paramBoolean);
    return localz_T4JInternalFactory.createUser(post(str, arrayOfHttpParameter));
  }

  public void updateProfileBanner(File paramFile)
  {
    checkFileValidity(paramFile);
    String str = this.conf.getRestBaseURL() + "account/update_profile_banner.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("banner", paramFile);
    post(str, arrayOfHttpParameter);
  }

  public void updateProfileBanner(InputStream paramInputStream)
  {
    String str = this.conf.getRestBaseURL() + "account/update_profile_banner.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("banner", "banner", paramInputStream);
    post(str, arrayOfHttpParameter);
  }

  public User updateProfileColors(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    ArrayList localArrayList = new ArrayList(6);
    addParameterToList(localArrayList, "profile_background_color", paramString1);
    addParameterToList(localArrayList, "profile_text_color", paramString2);
    addParameterToList(localArrayList, "profile_link_color", paramString3);
    addParameterToList(localArrayList, "profile_sidebar_fill_color", paramString4);
    addParameterToList(localArrayList, "profile_sidebar_border_color", paramString5);
    return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_colors.json", (HttpParameter[])localArrayList.toArray(new HttpParameter[localArrayList.size()])));
  }

  public User updateProfileImage(File paramFile)
  {
    checkFileValidity(paramFile);
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "account/update_profile_image.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("image", paramFile);
    return localz_T4JInternalFactory.createUser(post(str, arrayOfHttpParameter));
  }

  public User updateProfileImage(InputStream paramInputStream)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "account/update_profile_image.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("image", "image", paramInputStream);
    return localz_T4JInternalFactory.createUser(post(str, arrayOfHttpParameter));
  }

  public Status updateStatus(String paramString)
  {
    z_T4JInternalFactory localz_T4JInternalFactory = this.factory;
    String str = this.conf.getRestBaseURL() + "statuses/update.json";
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("status", paramString);
    return localz_T4JInternalFactory.createStatus(post(str, arrayOfHttpParameter));
  }

  public Status updateStatus(StatusUpdate paramStatusUpdate)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(this.conf.getRestBaseURL());
    if (paramStatusUpdate.isWithMedia());
    for (String str1 = "statuses/update_with_media.json"; ; str1 = "statuses/update.json")
    {
      String str2 = str1;
      return this.factory.createStatus(post(str2, paramStatusUpdate.asHttpParameterArray()));
    }
  }

  public UserList updateUserList(int paramInt, String paramString1, boolean paramBoolean, String paramString2)
  {
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[1];
    arrayOfHttpParameter[0] = new HttpParameter("list_id", paramInt);
    return updateUserList(paramString1, paramBoolean, paramString2, arrayOfHttpParameter);
  }

  public UserList updateUserList(long paramLong, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_id", paramLong);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString1);
    return updateUserList(paramString2, paramBoolean, paramString3, arrayOfHttpParameter);
  }

  public UserList updateUserList(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    HttpParameter[] arrayOfHttpParameter = new HttpParameter[2];
    arrayOfHttpParameter[0] = new HttpParameter("owner_screen_name", paramString1);
    arrayOfHttpParameter[1] = new HttpParameter("slug", paramString2);
    return updateUserList(paramString3, paramBoolean, paramString4, arrayOfHttpParameter);
  }

  public UsersResources users()
  {
    return this;
  }

  public User verifyCredentials()
  {
    return super.fillInIDAndScreenName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.TwitterImpl
 * JD-Core Version:    0.6.2
 */