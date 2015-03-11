package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.SymbolEntity;
import twitter4j.TwitterException;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

final class StatusJSONImpl extends TwitterResponseImpl
  implements Serializable, Status
{
  private static final Logger logger = Logger.getLogger(StatusJSONImpl.class);
  private static final long serialVersionUID = 7548618898682727465L;
  private long[] contributorsIDs;
  private Date createdAt;
  private long currentUserRetweetId = -1L;
  private int favoriteCount;
  private GeoLocation geoLocation = null;
  private HashtagEntity[] hashtagEntities;
  private long id;
  private String inReplyToScreenName;
  private long inReplyToStatusId;
  private long inReplyToUserId;
  private boolean isFavorited;
  private boolean isPossiblySensitive;
  private boolean isRetweeted;
  private boolean isTruncated;
  private String isoLanguageCode;
  private MediaEntity[] mediaEntities;
  private Place place = null;
  private long retweetCount;
  private Status retweetedStatus;
  private String source;
  private SymbolEntity[] symbolEntities;
  private String text;
  private URLEntity[] urlEntities;
  private User user = null;
  private UserMentionEntity[] userMentionEntities;

  StatusJSONImpl()
  {
  }

  StatusJSONImpl(HttpResponse paramHttpResponse, Configuration paramConfiguration)
  {
    super(paramHttpResponse);
    JSONObject localJSONObject = paramHttpResponse.asJSONObject();
    init(localJSONObject);
    if (paramConfiguration.isJSONStoreEnabled())
    {
      DataObjectFactoryUtil.clearThreadLocalMap();
      DataObjectFactoryUtil.registerJSONObject(this, localJSONObject);
    }
  }

  StatusJSONImpl(JSONObject paramJSONObject)
  {
    init(paramJSONObject);
  }

  StatusJSONImpl(JSONObject paramJSONObject, Configuration paramConfiguration)
  {
    init(paramJSONObject);
    if (paramConfiguration.isJSONStoreEnabled())
      DataObjectFactoryUtil.registerJSONObject(this, paramJSONObject);
  }

  static ResponseList<Status> createStatusList(HttpResponse paramHttpResponse, Configuration paramConfiguration)
  {
    try
    {
      if (paramConfiguration.isJSONStoreEnabled())
        DataObjectFactoryUtil.clearThreadLocalMap();
      JSONArray localJSONArray = paramHttpResponse.asJSONArray();
      int i = localJSONArray.length();
      ResponseListImpl localResponseListImpl = new ResponseListImpl(i, paramHttpResponse);
      for (int j = 0; j < i; j++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(j);
        StatusJSONImpl localStatusJSONImpl = new StatusJSONImpl(localJSONObject);
        if (paramConfiguration.isJSONStoreEnabled())
          DataObjectFactoryUtil.registerJSONObject(localStatusJSONImpl, localJSONObject);
        localResponseListImpl.add(localStatusJSONImpl);
      }
      if (paramConfiguration.isJSONStoreEnabled())
        DataObjectFactoryUtil.registerJSONObject(localResponseListImpl, localJSONArray);
      return localResponseListImpl;
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  private void init(JSONObject paramJSONObject)
  {
    int i = 0;
    this.id = z_T4JInternalParseUtil.getLong("id", paramJSONObject);
    this.source = z_T4JInternalParseUtil.getUnescapedString("source", paramJSONObject);
    this.createdAt = z_T4JInternalParseUtil.getDate("created_at", paramJSONObject);
    this.isTruncated = z_T4JInternalParseUtil.getBoolean("truncated", paramJSONObject);
    this.inReplyToStatusId = z_T4JInternalParseUtil.getLong("in_reply_to_status_id", paramJSONObject);
    this.inReplyToUserId = z_T4JInternalParseUtil.getLong("in_reply_to_user_id", paramJSONObject);
    this.isFavorited = z_T4JInternalParseUtil.getBoolean("favorited", paramJSONObject);
    this.isRetweeted = z_T4JInternalParseUtil.getBoolean("retweeted", paramJSONObject);
    this.inReplyToScreenName = z_T4JInternalParseUtil.getUnescapedString("in_reply_to_screen_name", paramJSONObject);
    this.retweetCount = z_T4JInternalParseUtil.getLong("retweet_count", paramJSONObject);
    this.favoriteCount = z_T4JInternalParseUtil.getInt("favorite_count", paramJSONObject);
    this.isPossiblySensitive = z_T4JInternalParseUtil.getBoolean("possibly_sensitive", paramJSONObject);
    try
    {
      if (!paramJSONObject.isNull("user"))
        this.user = new UserJSONImpl(paramJSONObject.getJSONObject("user"));
      this.geoLocation = z_T4JInternalJSONImplFactory.createGeoLocation(paramJSONObject);
      if (!paramJSONObject.isNull("place"))
        this.place = new PlaceJSONImpl(paramJSONObject.getJSONObject("place"));
      if (!paramJSONObject.isNull("retweeted_status"))
        this.retweetedStatus = new StatusJSONImpl(paramJSONObject.getJSONObject("retweeted_status"));
      if (!paramJSONObject.isNull("contributors"))
      {
        JSONArray localJSONArray6 = paramJSONObject.getJSONArray("contributors");
        this.contributorsIDs = new long[localJSONArray6.length()];
        for (int i6 = 0; i6 < localJSONArray6.length(); i6++)
          this.contributorsIDs[i6] = Long.parseLong(localJSONArray6.getString(i6));
      }
      this.contributorsIDs = new long[0];
      if (!paramJSONObject.isNull("entities"))
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject("entities");
        if (!localJSONObject.isNull("user_mentions"))
        {
          JSONArray localJSONArray5 = localJSONObject.getJSONArray("user_mentions");
          int i4 = localJSONArray5.length();
          this.userMentionEntities = new UserMentionEntity[i4];
          for (int i5 = 0; i5 < i4; i5++)
            this.userMentionEntities[i5] = new UserMentionEntityJSONImpl(localJSONArray5.getJSONObject(i5));
        }
        if (!localJSONObject.isNull("urls"))
        {
          JSONArray localJSONArray4 = localJSONObject.getJSONArray("urls");
          int i2 = localJSONArray4.length();
          this.urlEntities = new URLEntity[i2];
          for (int i3 = 0; i3 < i2; i3++)
            this.urlEntities[i3] = new URLEntityJSONImpl(localJSONArray4.getJSONObject(i3));
        }
        if (!localJSONObject.isNull("hashtags"))
        {
          JSONArray localJSONArray3 = localJSONObject.getJSONArray("hashtags");
          int n = localJSONArray3.length();
          this.hashtagEntities = new HashtagEntity[n];
          for (int i1 = 0; i1 < n; i1++)
            this.hashtagEntities[i1] = new HashtagEntityJSONImpl(localJSONArray3.getJSONObject(i1));
        }
        if (!localJSONObject.isNull("symbols"))
        {
          JSONArray localJSONArray2 = localJSONObject.getJSONArray("symbols");
          int k = localJSONArray2.length();
          this.symbolEntities = new SymbolEntity[k];
          for (int m = 0; m < k; m++)
            this.symbolEntities[m] = new HashtagEntityJSONImpl(localJSONArray2.getJSONObject(m));
        }
        if (!localJSONObject.isNull("media"))
        {
          JSONArray localJSONArray1 = localJSONObject.getJSONArray("media");
          int j = localJSONArray1.length();
          this.mediaEntities = new MediaEntity[j];
          while (i < j)
          {
            this.mediaEntities[i] = new MediaEntityJSONImpl(localJSONArray1.getJSONObject(i));
            i++;
          }
        }
      }
      this.isoLanguageCode = z_T4JInternalParseUtil.getRawString("lang", paramJSONObject);
      UserMentionEntity[] arrayOfUserMentionEntity;
      URLEntity[] arrayOfURLEntity;
      label705: HashtagEntity[] arrayOfHashtagEntity;
      label724: SymbolEntity[] arrayOfSymbolEntity;
      if (this.userMentionEntities == null)
      {
        arrayOfUserMentionEntity = new UserMentionEntity[0];
        this.userMentionEntities = arrayOfUserMentionEntity;
        if (this.urlEntities != null)
          break label834;
        arrayOfURLEntity = new URLEntity[0];
        this.urlEntities = arrayOfURLEntity;
        if (this.hashtagEntities != null)
          break label843;
        arrayOfHashtagEntity = new HashtagEntity[0];
        this.hashtagEntities = arrayOfHashtagEntity;
        if (this.symbolEntities != null)
          break label852;
        arrayOfSymbolEntity = new SymbolEntity[0];
        label743: this.symbolEntities = arrayOfSymbolEntity;
        if (this.mediaEntities != null)
          break label861;
      }
      label834: label843: label852: label861: for (MediaEntity[] arrayOfMediaEntity = new MediaEntity[0]; ; arrayOfMediaEntity = this.mediaEntities)
      {
        this.mediaEntities = arrayOfMediaEntity;
        this.text = HTMLEntity.unescapeAndSlideEntityIncdices(paramJSONObject.getString("text"), this.userMentionEntities, this.urlEntities, this.hashtagEntities, this.mediaEntities);
        if (paramJSONObject.isNull("current_user_retweet"))
          return;
        this.currentUserRetweetId = paramJSONObject.getJSONObject("current_user_retweet").getLong("id");
        return;
        arrayOfUserMentionEntity = this.userMentionEntities;
        break;
        arrayOfURLEntity = this.urlEntities;
        break label705;
        arrayOfHashtagEntity = this.hashtagEntities;
        break label724;
        arrayOfSymbolEntity = this.symbolEntities;
        break label743;
      }
    }
    catch (JSONException localJSONException)
    {
      throw new TwitterException(localJSONException);
    }
  }

  public final int compareTo(Status paramStatus)
  {
    long l = this.id - paramStatus.getId();
    if (l < -2147483648L)
      return -2147483648;
    if (l > 2147483647L)
      return 2147483647;
    return (int)l;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    do
    {
      return false;
      if (this == paramObject)
        return true;
    }
    while ((!(paramObject instanceof Status)) || (((Status)paramObject).getId() != this.id));
    return true;
  }

  public final long[] getContributors()
  {
    return this.contributorsIDs;
  }

  public final Date getCreatedAt()
  {
    return this.createdAt;
  }

  public final long getCurrentUserRetweetId()
  {
    return this.currentUserRetweetId;
  }

  public final int getFavoriteCount()
  {
    return this.favoriteCount;
  }

  public final GeoLocation getGeoLocation()
  {
    return this.geoLocation;
  }

  public final HashtagEntity[] getHashtagEntities()
  {
    return this.hashtagEntities;
  }

  public final long getId()
  {
    return this.id;
  }

  public final String getInReplyToScreenName()
  {
    return this.inReplyToScreenName;
  }

  public final long getInReplyToStatusId()
  {
    return this.inReplyToStatusId;
  }

  public final long getInReplyToUserId()
  {
    return this.inReplyToUserId;
  }

  public final String getIsoLanguageCode()
  {
    return this.isoLanguageCode;
  }

  public final MediaEntity[] getMediaEntities()
  {
    return this.mediaEntities;
  }

  public final Place getPlace()
  {
    return this.place;
  }

  public final int getRetweetCount()
  {
    return (int)this.retweetCount;
  }

  public final Status getRetweetedStatus()
  {
    return this.retweetedStatus;
  }

  public final String getSource()
  {
    return this.source;
  }

  public final SymbolEntity[] getSymbolEntities()
  {
    return this.symbolEntities;
  }

  public final String getText()
  {
    return this.text;
  }

  public final URLEntity[] getURLEntities()
  {
    return this.urlEntities;
  }

  public final User getUser()
  {
    return this.user;
  }

  public final UserMentionEntity[] getUserMentionEntities()
  {
    return this.userMentionEntities;
  }

  public final int hashCode()
  {
    return (int)this.id;
  }

  public final boolean isFavorited()
  {
    return this.isFavorited;
  }

  public final boolean isPossiblySensitive()
  {
    return this.isPossiblySensitive;
  }

  public final boolean isRetweet()
  {
    return this.retweetedStatus != null;
  }

  public final boolean isRetweeted()
  {
    return this.isRetweeted;
  }

  public final boolean isRetweetedByMe()
  {
    return this.currentUserRetweetId != -1L;
  }

  public final boolean isTruncated()
  {
    return this.isTruncated;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder().append("StatusJSONImpl{createdAt=").append(this.createdAt).append(", id=").append(this.id).append(", text='").append(this.text).append('\'').append(", source='").append(this.source).append('\'').append(", isTruncated=").append(this.isTruncated).append(", inReplyToStatusId=").append(this.inReplyToStatusId).append(", inReplyToUserId=").append(this.inReplyToUserId).append(", isFavorited=").append(this.isFavorited).append(", isRetweeted=").append(this.isRetweeted).append(", favoriteCount=").append(this.favoriteCount).append(", inReplyToScreenName='").append(this.inReplyToScreenName).append('\'').append(", geoLocation=").append(this.geoLocation).append(", place=").append(this.place).append(", retweetCount=").append(this.retweetCount).append(", isPossiblySensitive=").append(this.isPossiblySensitive).append(", isoLanguageCode=").append(this.isoLanguageCode).append(", contributorsIDs=").append(this.contributorsIDs).append(", retweetedStatus=").append(this.retweetedStatus).append(", userMentionEntities=");
    Object localObject1;
    Object localObject2;
    label294: Object localObject3;
    label318: StringBuilder localStringBuilder4;
    Object localObject4;
    if (this.userMentionEntities == null)
    {
      localObject1 = null;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(localObject1).append(", urlEntities=");
      if (this.urlEntities != null)
        break label400;
      localObject2 = null;
      StringBuilder localStringBuilder3 = localStringBuilder2.append(localObject2).append(", hashtagEntities=");
      if (this.hashtagEntities != null)
        break label412;
      localObject3 = null;
      localStringBuilder4 = localStringBuilder3.append(localObject3).append(", mediaEntities=");
      MediaEntity[] arrayOfMediaEntity = this.mediaEntities;
      localObject4 = null;
      if (arrayOfMediaEntity != null)
        break label424;
    }
    while (true)
    {
      return localObject4 + ", currentUserRetweetId=" + this.currentUserRetweetId + ", user=" + this.user + '}';
      localObject1 = Arrays.asList(this.userMentionEntities);
      break;
      label400: localObject2 = Arrays.asList(this.urlEntities);
      break label294;
      label412: localObject3 = Arrays.asList(this.hashtagEntities);
      break label318;
      label424: localObject4 = Arrays.asList(this.mediaEntities);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.json.StatusJSONImpl
 * JD-Core Version:    0.6.2
 */