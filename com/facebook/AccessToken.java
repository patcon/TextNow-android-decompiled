package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class AccessToken
  implements Serializable
{
  static final String ACCESS_TOKEN_KEY = "access_token";
  private static final Date ALREADY_EXPIRED_EXPIRATION_TIME;
  private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
  private static final Date DEFAULT_EXPIRATION_TIME;
  private static final Date DEFAULT_LAST_REFRESH_TIME;
  static final String EXPIRES_IN_KEY = "expires_in";
  private static final Date MAX_DATE;
  private static final Date MIN_DATE;
  private static final long serialVersionUID = 1L;
  private final Date expires;
  private final Date lastRefresh;
  private final List<String> permissions;
  private final AccessTokenSource source;
  private final String token;

  static
  {
    if (!AccessToken.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      MIN_DATE = new Date(-9223372036854775808L);
      Date localDate = new Date(9223372036854775807L);
      MAX_DATE = localDate;
      DEFAULT_EXPIRATION_TIME = localDate;
      DEFAULT_LAST_REFRESH_TIME = new Date();
      DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
      ALREADY_EXPIRED_EXPIRATION_TIME = MIN_DATE;
      return;
    }
  }

  AccessToken(String paramString, Date paramDate1, List<String> paramList, AccessTokenSource paramAccessTokenSource, Date paramDate2)
  {
    if (paramList == null)
      paramList = Collections.emptyList();
    this.expires = paramDate1;
    this.permissions = Collections.unmodifiableList(paramList);
    this.token = paramString;
    this.source = paramAccessTokenSource;
    this.lastRefresh = paramDate2;
  }

  private void appendPermissions(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(" permissions:");
    if (this.permissions == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    paramStringBuilder.append("[");
    paramStringBuilder.append(TextUtils.join(", ", this.permissions));
    paramStringBuilder.append("]");
  }

  static AccessToken createEmptyToken(List<String> paramList)
  {
    return new AccessToken("", ALREADY_EXPIRED_EXPIRATION_TIME, paramList, AccessTokenSource.NONE, DEFAULT_LAST_REFRESH_TIME);
  }

  private static AccessToken createFromBundle(List<String> paramList, Bundle paramBundle, AccessTokenSource paramAccessTokenSource, Date paramDate)
  {
    String str = paramBundle.getString("access_token");
    Date localDate = getBundleLongAsDate(paramBundle, "expires_in", paramDate);
    if ((Utility.isNullOrEmpty(str)) || (localDate == null))
      return null;
    return new AccessToken(str, localDate, paramList, paramAccessTokenSource, new Date());
  }

  static AccessToken createFromCache(Bundle paramBundle)
  {
    ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
    if (localArrayList == null);
    for (List localList = Collections.emptyList(); ; localList = Collections.unmodifiableList(new ArrayList(localArrayList)))
      return new AccessToken(paramBundle.getString("com.facebook.TokenCachingStrategy.Token"), TokenCachingStrategy.getDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), localList, TokenCachingStrategy.getSource(paramBundle), TokenCachingStrategy.getDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
  }

  public static AccessToken createFromExistingAccessToken(String paramString, Date paramDate1, Date paramDate2, AccessTokenSource paramAccessTokenSource, List<String> paramList)
  {
    if (paramDate1 == null);
    for (Date localDate1 = DEFAULT_EXPIRATION_TIME; ; localDate1 = paramDate1)
    {
      if (paramDate2 == null);
      for (Date localDate2 = DEFAULT_LAST_REFRESH_TIME; ; localDate2 = paramDate2)
      {
        if (paramAccessTokenSource == null);
        for (AccessTokenSource localAccessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE; ; localAccessTokenSource = paramAccessTokenSource)
          return new AccessToken(paramString, localDate1, paramList, localAccessTokenSource, localDate2);
      }
    }
  }

  public static AccessToken createFromNativeLinkingIntent(Intent paramIntent)
  {
    Validate.notNull(paramIntent, "intent");
    if (paramIntent.getExtras() == null)
      return null;
    return createFromBundle(null, paramIntent.getExtras(), AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date());
  }

  static AccessToken createFromNativeLogin(Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    Date localDate = getBundleLongAsDate(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
    return createNew(paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS"), paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), localDate, paramAccessTokenSource);
  }

  @SuppressLint({"FieldGetter"})
  static AccessToken createFromRefresh(AccessToken paramAccessToken, Bundle paramBundle)
  {
    assert ((paramAccessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_WEB) || (paramAccessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_NATIVE) || (paramAccessToken.source == AccessTokenSource.FACEBOOK_APPLICATION_SERVICE));
    Date localDate = getBundleLongAsDate(paramBundle, "expires_in", new Date(0L));
    String str = paramBundle.getString("access_token");
    return createNew(paramAccessToken.getPermissions(), str, localDate, paramAccessToken.source);
  }

  static AccessToken createFromString(String paramString, List<String> paramList, AccessTokenSource paramAccessTokenSource)
  {
    return new AccessToken(paramString, DEFAULT_EXPIRATION_TIME, paramList, paramAccessTokenSource, DEFAULT_LAST_REFRESH_TIME);
  }

  static AccessToken createFromTokenWithRefreshedPermissions(AccessToken paramAccessToken, List<String> paramList)
  {
    return new AccessToken(paramAccessToken.token, paramAccessToken.expires, paramList, paramAccessToken.source, paramAccessToken.lastRefresh);
  }

  static AccessToken createFromWebBundle(List<String> paramList, Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    Date localDate = getBundleLongAsDate(paramBundle, "expires_in", new Date());
    return createNew(paramList, paramBundle.getString("access_token"), localDate, paramAccessTokenSource);
  }

  private static AccessToken createNew(List<String> paramList, String paramString, Date paramDate, AccessTokenSource paramAccessTokenSource)
  {
    if ((Utility.isNullOrEmpty(paramString)) || (paramDate == null))
      return createEmptyToken(paramList);
    return new AccessToken(paramString, paramDate, paramList, paramAccessTokenSource, new Date());
  }

  private static Date getBundleLongAsDate(Bundle paramBundle, String paramString, Date paramDate)
  {
    if (paramBundle == null)
      return null;
    Object localObject = paramBundle.get(paramString);
    long l2;
    if ((localObject instanceof Long))
      l2 = ((Long)localObject).longValue();
    while (true)
    {
      if (l2 != 0L)
        break label75;
      return new Date(9223372036854775807L);
      if ((localObject instanceof String))
        try
        {
          long l1 = Long.parseLong((String)localObject);
          l2 = l1;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          return null;
        }
    }
    return null;
    label75: return new Date(paramDate.getTime() + l2 * 1000L);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Cannot readObject, serialization proxy required");
  }

  private String tokenToString()
  {
    if (this.token == null)
      return "null";
    if (Settings.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
      return this.token;
    return "ACCESS_TOKEN_REMOVED";
  }

  private Object writeReplace()
  {
    return new AccessToken.SerializationProxyV1(this.token, this.expires, this.permissions, this.source, this.lastRefresh, null);
  }

  public final Date getExpires()
  {
    return this.expires;
  }

  public final Date getLastRefresh()
  {
    return this.lastRefresh;
  }

  public final List<String> getPermissions()
  {
    return this.permissions;
  }

  public final AccessTokenSource getSource()
  {
    return this.source;
  }

  public final String getToken()
  {
    return this.token;
  }

  final boolean isInvalid()
  {
    return (Utility.isNullOrEmpty(this.token)) || (new Date().after(this.expires));
  }

  final Bundle toCacheBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.TokenCachingStrategy.Token", this.token);
    TokenCachingStrategy.putDate(localBundle, "com.facebook.TokenCachingStrategy.ExpirationDate", this.expires);
    localBundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(this.permissions));
    localBundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", this.source);
    TokenCachingStrategy.putDate(localBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", this.lastRefresh);
    return localBundle;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{AccessToken");
    localStringBuilder.append(" token:").append(tokenToString());
    appendPermissions(localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AccessToken
 * JD-Core Version:    0.6.2
 */