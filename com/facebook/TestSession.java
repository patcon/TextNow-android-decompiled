package com.facebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestSession extends Session
{
  private static final String LOG_TAG = "FacebookSDK.TestSession";
  private static Map<String, TestSession.TestAccount> appTestAccounts;
  private static final long serialVersionUID = 1L;
  private static String testApplicationId;
  private static String testApplicationSecret;
  private final TestSession.Mode mode;
  private final List<String> requestedPermissions;
  private final String sessionUniqueUserTag;
  private String testAccountId;
  private boolean wasAskedToExtendAccessToken;

  static
  {
    if (!TestSession.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  TestSession(Activity paramActivity, List<String> paramList, TokenCachingStrategy paramTokenCachingStrategy, String paramString, TestSession.Mode paramMode)
  {
    super(paramActivity, testApplicationId, paramTokenCachingStrategy);
    Validate.notNull(paramList, "permissions");
    Validate.notNullOrEmpty(testApplicationId, "testApplicationId");
    Validate.notNullOrEmpty(testApplicationSecret, "testApplicationSecret");
    this.sessionUniqueUserTag = paramString;
    this.mode = paramMode;
    this.requestedPermissions = paramList;
  }

  public static TestSession createSessionWithPrivateUser(Activity paramActivity, List<String> paramList)
  {
    return createTestSession(paramActivity, paramList, TestSession.Mode.PRIVATE, null);
  }

  public static TestSession createSessionWithSharedUser(Activity paramActivity, List<String> paramList)
  {
    return createSessionWithSharedUser(paramActivity, paramList, null);
  }

  public static TestSession createSessionWithSharedUser(Activity paramActivity, List<String> paramList, String paramString)
  {
    return createTestSession(paramActivity, paramList, TestSession.Mode.SHARED, paramString);
  }

  private TestSession.TestAccount createTestAccountAndFinishAuth()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("installed", "true");
    localBundle.putString("permissions", getPermissionsString());
    localBundle.putString("access_token", getAppAccessToken());
    if (this.mode == TestSession.Mode.SHARED)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = getSharedTestAccountIdentifier();
      localBundle.putString("name", String.format("Shared %s Testuser", arrayOfObject2));
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = testApplicationId;
    Response localResponse = new Request(null, String.format("%s/accounts/test-users", arrayOfObject1), localBundle, HttpMethod.POST).executeAndWait();
    FacebookRequestError localFacebookRequestError = localResponse.getError();
    TestSession.TestAccount localTestAccount = (TestSession.TestAccount)localResponse.getGraphObjectAs(TestSession.TestAccount.class);
    if (localFacebookRequestError != null)
    {
      finishAuthOrReauth(null, localFacebookRequestError.getException());
      return null;
    }
    assert (localTestAccount != null);
    if (this.mode == TestSession.Mode.SHARED)
    {
      localTestAccount.setName(localBundle.getString("name"));
      storeTestAccount(localTestAccount);
    }
    finishAuthWithTestAccount(localTestAccount);
    return localTestAccount;
  }

  // ERROR //
  private static TestSession createTestSession(Activity paramActivity, List<String> paramList, TestSession.Mode paramMode, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 42	com/facebook/TestSession:testApplicationId	Ljava/lang/String;
    //   6: invokestatic 185	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   9: ifne +12 -> 21
    //   12: getstatic 60	com/facebook/TestSession:testApplicationSecret	Ljava/lang/String;
    //   15: invokestatic 185	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   18: ifeq +21 -> 39
    //   21: new 187	com/facebook/FacebookException
    //   24: dup
    //   25: ldc 189
    //   27: invokespecial 191	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   30: athrow
    //   31: astore 4
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload 4
    //   38: athrow
    //   39: aload_1
    //   40: invokestatic 194	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/util/Collection;)Z
    //   43: ifeq +50 -> 93
    //   46: iconst_2
    //   47: anewarray 118	java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: ldc 196
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: ldc 198
    //   59: aastore
    //   60: invokestatic 204	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   63: astore 5
    //   65: new 2	com/facebook/TestSession
    //   68: dup
    //   69: aload_0
    //   70: aload 5
    //   72: new 206	com/facebook/TestSession$TestTokenCachingStrategy
    //   75: dup
    //   76: aconst_null
    //   77: invokespecial 209	com/facebook/TestSession$TestTokenCachingStrategy:<init>	(Lcom/facebook/TestSession$1;)V
    //   80: aload_3
    //   81: aload_2
    //   82: invokespecial 211	com/facebook/TestSession:<init>	(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TokenCachingStrategy;Ljava/lang/String;Lcom/facebook/TestSession$Mode;)V
    //   85: astore 6
    //   87: ldc 2
    //   89: monitorexit
    //   90: aload 6
    //   92: areturn
    //   93: aload_1
    //   94: astore 5
    //   96: goto -31 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   3	21	31	finally
    //   21	31	31	finally
    //   39	65	31	finally
    //   65	87	31	finally
  }

  private void deleteTestAccount(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("access_token", paramString2);
    Response localResponse = new Request(null, paramString1, localBundle, HttpMethod.DELETE).executeAndWait();
    FacebookRequestError localFacebookRequestError = localResponse.getError();
    GraphObject localGraphObject = localResponse.getGraphObject();
    if (localFacebookRequestError != null)
    {
      arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = localFacebookRequestError.getException().toString();
      String.format("Could not delete test account %s: %s", arrayOfObject);
    }
    while (localGraphObject.getProperty("FACEBOOK_NON_JSON_RESULT") != Boolean.valueOf(false))
    {
      Object[] arrayOfObject;
      return;
    }
    String.format("Could not delete test account %s: unknown reason", new Object[] { paramString1 });
  }

  private void findOrCreateSharedTestAccount()
  {
    TestSession.TestAccount localTestAccount = findTestAccountMatchingIdentifier(getSharedTestAccountIdentifier());
    if (localTestAccount != null)
    {
      finishAuthWithTestAccount(localTestAccount);
      return;
    }
    createTestAccountAndFinishAuth();
  }

  private static TestSession.TestAccount findTestAccountMatchingIdentifier(String paramString)
  {
    try
    {
      retrieveTestAccountsForAppIfNeeded();
      Iterator localIterator = appTestAccounts.values().iterator();
      TestSession.TestAccount localTestAccount;
      boolean bool;
      do
      {
        if (!localIterator.hasNext())
          break;
        localTestAccount = (TestSession.TestAccount)localIterator.next();
        bool = localTestAccount.getName().contains(paramString);
      }
      while (!bool);
      while (true)
      {
        return localTestAccount;
        localTestAccount = null;
      }
    }
    finally
    {
    }
  }

  private void finishAuthWithTestAccount(TestSession.TestAccount paramTestAccount)
  {
    this.testAccountId = paramTestAccount.getId();
    finishAuthOrReauth(AccessToken.createFromString(paramTestAccount.getAccessToken(), this.requestedPermissions, AccessTokenSource.TEST_USER), null);
  }

  static final String getAppAccessToken()
  {
    return testApplicationId + "|" + testApplicationSecret;
  }

  private String getPermissionsString()
  {
    return TextUtils.join(",", this.requestedPermissions);
  }

  private String getSharedTestAccountIdentifier()
  {
    long l1 = 0xFFFFFFFF & getPermissionsString().hashCode();
    if (this.sessionUniqueUserTag != null);
    for (long l2 = 0xFFFFFFFF & this.sessionUniqueUserTag.hashCode(); ; l2 = 0L)
      return validNameStringFromInteger(l2 ^ l1);
  }

  public static String getTestApplicationId()
  {
    try
    {
      String str = testApplicationId;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String getTestApplicationSecret()
  {
    try
    {
      String str = testApplicationSecret;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void populateTestAccounts(Collection<TestSession.TestAccount> paramCollection, Collection<TestSession.UserAccount> paramCollection1)
  {
    try
    {
      Iterator localIterator1 = paramCollection.iterator();
      while (localIterator1.hasNext())
        storeTestAccount((TestSession.TestAccount)localIterator1.next());
    }
    finally
    {
    }
    Iterator localIterator2 = paramCollection1.iterator();
    while (localIterator2.hasNext())
    {
      TestSession.UserAccount localUserAccount = (TestSession.UserAccount)localIterator2.next();
      TestSession.TestAccount localTestAccount = (TestSession.TestAccount)appTestAccounts.get(localUserAccount.getUid());
      if (localTestAccount != null)
        localTestAccount.setName(localUserAccount.getName());
    }
  }

  // ERROR //
  private static void retrieveTestAccountsForAppIfNeeded()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 252	com/facebook/TestSession:appTestAccounts	Ljava/util/Map;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: new 346	java/util/HashMap
    //   18: dup
    //   19: invokespecial 347	java/util/HashMap:<init>	()V
    //   22: putstatic 252	com/facebook/TestSession:appTestAccounts	Ljava/util/Map;
    //   25: iconst_1
    //   26: anewarray 109	java/lang/Object
    //   29: astore_2
    //   30: aload_2
    //   31: iconst_0
    //   32: getstatic 42	com/facebook/TestSession:testApplicationId	Ljava/lang/String;
    //   35: aastore
    //   36: ldc_w 349
    //   39: aload_2
    //   40: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore_3
    //   44: new 89	android/os/Bundle
    //   47: dup
    //   48: invokespecial 91	android/os/Bundle:<init>	()V
    //   51: astore 4
    //   53: new 351	org/json/JSONObject
    //   56: dup
    //   57: invokespecial 352	org/json/JSONObject:<init>	()V
    //   60: astore 5
    //   62: aload 5
    //   64: ldc_w 354
    //   67: aload_3
    //   68: invokevirtual 358	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   71: pop
    //   72: aload 5
    //   74: ldc_w 360
    //   77: ldc_w 362
    //   80: invokevirtual 358	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   83: pop
    //   84: aload 4
    //   86: ldc_w 364
    //   89: aload 5
    //   91: invokevirtual 365	org/json/JSONObject:toString	()Ljava/lang/String;
    //   94: invokevirtual 98	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload 4
    //   99: ldc 104
    //   101: invokestatic 107	com/facebook/TestSession:getAppAccessToken	()Ljava/lang/String;
    //   104: invokevirtual 98	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: new 124	com/facebook/Request
    //   110: dup
    //   111: aconst_null
    //   112: ldc_w 367
    //   115: aload 4
    //   117: aconst_null
    //   118: invokespecial 135	com/facebook/Request:<init>	(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V
    //   121: invokevirtual 139	com/facebook/Request:executeAndWait	()Lcom/facebook/Response;
    //   124: astore 9
    //   126: aload 9
    //   128: invokevirtual 145	com/facebook/Response:getError	()Lcom/facebook/FacebookRequestError;
    //   131: ifnull +30 -> 161
    //   134: aload 9
    //   136: invokevirtual 145	com/facebook/Response:getError	()Lcom/facebook/FacebookRequestError;
    //   139: invokevirtual 157	com/facebook/FacebookRequestError:getException	()Lcom/facebook/FacebookException;
    //   142: athrow
    //   143: astore_0
    //   144: ldc 2
    //   146: monitorexit
    //   147: aload_0
    //   148: athrow
    //   149: astore 6
    //   151: new 187	com/facebook/FacebookException
    //   154: dup
    //   155: aload 6
    //   157: invokespecial 370	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   160: athrow
    //   161: aload 9
    //   163: ldc_w 372
    //   166: invokevirtual 151	com/facebook/Response:getGraphObjectAs	(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //   169: checkcast 372	com/facebook/TestSession$FqlResponse
    //   172: invokeinterface 376 1 0
    //   177: astore 10
    //   179: aload 10
    //   181: ifnull +14 -> 195
    //   184: aload 10
    //   186: invokeinterface 381 1 0
    //   191: iconst_2
    //   192: if_icmpeq +14 -> 206
    //   195: new 187	com/facebook/FacebookException
    //   198: dup
    //   199: ldc_w 383
    //   202: invokespecial 191	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   205: athrow
    //   206: aload 10
    //   208: iconst_0
    //   209: invokeinterface 386 2 0
    //   214: checkcast 388	com/facebook/TestSession$FqlResult
    //   217: invokeinterface 391 1 0
    //   222: ldc 147
    //   224: invokeinterface 395 2 0
    //   229: aload 10
    //   231: iconst_1
    //   232: invokeinterface 386 2 0
    //   237: checkcast 388	com/facebook/TestSession$FqlResult
    //   240: invokeinterface 391 1 0
    //   245: ldc_w 334
    //   248: invokeinterface 395 2 0
    //   253: invokestatic 397	com/facebook/TestSession:populateTestAccounts	(Ljava/util/Collection;Ljava/util/Collection;)V
    //   256: goto -245 -> 11
    //
    // Exception table:
    //   from	to	target	type
    //   3	7	143	finally
    //   15	53	143	finally
    //   53	84	143	finally
    //   84	143	143	finally
    //   151	161	143	finally
    //   161	179	143	finally
    //   184	195	143	finally
    //   195	206	143	finally
    //   206	256	143	finally
    //   53	84	149	org/json/JSONException
  }

  public static void setTestApplicationId(String paramString)
  {
    try
    {
      if ((testApplicationId != null) && (!testApplicationId.equals(paramString)))
        throw new FacebookException("Can't have more than one test application ID");
    }
    finally
    {
    }
    testApplicationId = paramString;
  }

  public static void setTestApplicationSecret(String paramString)
  {
    try
    {
      if ((testApplicationSecret != null) && (!testApplicationSecret.equals(paramString)))
        throw new FacebookException("Can't have more than one test application secret");
    }
    finally
    {
    }
    testApplicationSecret = paramString;
  }

  private static void storeTestAccount(TestSession.TestAccount paramTestAccount)
  {
    try
    {
      appTestAccounts.put(paramTestAccount.getId(), paramTestAccount);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private String validNameStringFromInteger(long paramLong)
  {
    String str = Long.toString(paramLong);
    StringBuilder localStringBuilder = new StringBuilder("Perm");
    char[] arrayOfChar = str.toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = arrayOfChar[j];
      if (m == k)
        m = (char)(m + 10);
      localStringBuilder.append((char)(-48 + (m + 97)));
      j++;
    }
    return localStringBuilder.toString();
  }

  void authorize(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    if (this.mode == TestSession.Mode.PRIVATE)
    {
      createTestAccountAndFinishAuth();
      return;
    }
    findOrCreateSharedTestAccount();
  }

  void extendAccessToken()
  {
    this.wasAskedToExtendAccessToken = true;
    super.extendAccessToken();
  }

  void fakeTokenRefreshAttempt()
  {
    setCurrentTokenRefreshRequest(new Session.TokenRefreshRequest(this));
  }

  void forceExtendAccessToken(boolean paramBoolean)
  {
    AccessToken localAccessToken = getTokenInfo();
    setTokenInfo(new AccessToken(localAccessToken.getToken(), new Date(), localAccessToken.getPermissions(), AccessTokenSource.TEST_USER, new Date(0L)));
    setLastAttemptedTokenExtendDate(new Date(0L));
  }

  public final String getTestUserId()
  {
    return this.testAccountId;
  }

  boolean getWasAskedToExtendAccessToken()
  {
    return this.wasAskedToExtendAccessToken;
  }

  void postStateChange(SessionState paramSessionState1, SessionState paramSessionState2, Exception paramException)
  {
    String str = this.testAccountId;
    super.postStateChange(paramSessionState1, paramSessionState2, paramException);
    if ((paramSessionState2.isClosed()) && (str != null) && (this.mode == TestSession.Mode.PRIVATE))
      deleteTestAccount(str, getAppAccessToken());
  }

  boolean shouldExtendAccessToken()
  {
    boolean bool = super.shouldExtendAccessToken();
    this.wasAskedToExtendAccessToken = false;
    return bool;
  }

  public final String toString()
  {
    String str = super.toString();
    return "{TestSession" + " testUserId:" + this.testAccountId + " " + str + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession
 * JD-Core Version:    0.6.2
 */