package com.facebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphUser;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
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
  private String testAccountUserName;
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
    //   3: getstatic 43	com/facebook/TestSession:testApplicationId	Ljava/lang/String;
    //   6: invokestatic 186	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   9: ifne +12 -> 21
    //   12: getstatic 61	com/facebook/TestSession:testApplicationSecret	Ljava/lang/String;
    //   15: invokestatic 186	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   18: ifeq +21 -> 39
    //   21: new 188	com/facebook/FacebookException
    //   24: dup
    //   25: ldc 190
    //   27: invokespecial 192	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   30: athrow
    //   31: astore 4
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload 4
    //   38: athrow
    //   39: aload_1
    //   40: invokestatic 195	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/util/Collection;)Z
    //   43: ifeq +50 -> 93
    //   46: iconst_2
    //   47: anewarray 119	java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: ldc 197
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: ldc 199
    //   59: aastore
    //   60: invokestatic 205	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   63: astore 5
    //   65: new 2	com/facebook/TestSession
    //   68: dup
    //   69: aload_0
    //   70: aload 5
    //   72: new 207	com/facebook/TestSession$TestTokenCachingStrategy
    //   75: dup
    //   76: aconst_null
    //   77: invokespecial 210	com/facebook/TestSession$TestTokenCachingStrategy:<init>	(Lcom/facebook/TestSession$1;)V
    //   80: aload_3
    //   81: aload_2
    //   82: invokespecial 212	com/facebook/TestSession:<init>	(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TokenCachingStrategy;Ljava/lang/String;Lcom/facebook/TestSession$Mode;)V
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
    while ((localGraphObject.getProperty("FACEBOOK_NON_JSON_RESULT") != Boolean.valueOf(false)) && (localGraphObject.getProperty("success") != Boolean.valueOf(false)))
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
    this.testAccountUserName = paramTestAccount.getName();
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

  private static void populateTestAccounts(Collection<TestSession.TestAccount> paramCollection, GraphObject paramGraphObject)
  {
    try
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        TestSession.TestAccount localTestAccount = (TestSession.TestAccount)localIterator.next();
        localTestAccount.setName(((GraphUser)paramGraphObject.getPropertyAs(localTestAccount.getId(), GraphUser.class)).getName());
        storeTestAccount(localTestAccount);
      }
    }
    finally
    {
    }
  }

  private static void retrieveTestAccountsForAppIfNeeded()
  {
    while (true)
    {
      List localList;
      try
      {
        Map localMap = appTestAccounts;
        if (localMap != null)
          return;
        appTestAccounts = new HashMap();
        Request.setDefaultBatchApplicationId(testApplicationId);
        Bundle localBundle1 = new Bundle();
        localBundle1.putString("access_token", getAppAccessToken());
        Request localRequest1 = new Request(null, "app/accounts/test-users", localBundle1, null);
        localRequest1.setBatchEntryName("testUsers");
        localRequest1.setBatchEntryOmitResultOnSuccess(false);
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("access_token", getAppAccessToken());
        localBundle2.putString("ids", "{result=testUsers:$.data.*.id}");
        localBundle2.putString("fields", "name");
        Request localRequest2 = new Request(null, "", localBundle2, null);
        localRequest2.setBatchEntryDependsOn("testUsers");
        localList = Request.executeBatchAndWait(new Request[] { localRequest1, localRequest2 });
        if ((localList == null) || (localList.size() != 2))
          throw new FacebookException("Unexpected number of results from TestUsers batch query");
      }
      finally
      {
      }
      populateTestAccounts(((TestSession.TestAccountsResponse)((Response)localList.get(0)).getGraphObjectAs(TestSession.TestAccountsResponse.class)).getData(), ((Response)localList.get(1)).getGraphObject());
    }
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
    setTokenInfo(new AccessToken(localAccessToken.getToken(), new Date(), localAccessToken.getPermissions(), localAccessToken.getDeclinedPermissions(), AccessTokenSource.TEST_USER, new Date(0L)));
    setLastAttemptedTokenExtendDate(new Date(0L));
  }

  public final String getTestUserId()
  {
    return this.testAccountId;
  }

  public final String getTestUserName()
  {
    return this.testAccountUserName;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession
 * JD-Core Version:    0.6.2
 */