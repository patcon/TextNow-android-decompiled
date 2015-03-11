package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AuthorizationClient$GetTokenAuthHandler extends AuthorizationClient.AuthHandler
{
  private static final long serialVersionUID = 1L;
  private transient GetTokenClient getTokenClient;

  AuthorizationClient$GetTokenAuthHandler(AuthorizationClient paramAuthorizationClient)
  {
    super(paramAuthorizationClient);
  }

  void cancel()
  {
    if (this.getTokenClient != null)
    {
      this.getTokenClient.cancel();
      this.getTokenClient = null;
    }
  }

  String getNameForLogging()
  {
    return "get_token";
  }

  void getTokenCompleted(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest, Bundle paramBundle)
  {
    this.getTokenClient = null;
    AuthorizationClient.access$000(this.this$0);
    if (paramBundle != null)
    {
      ArrayList localArrayList1 = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      List localList = paramAuthorizationRequest.getPermissions();
      if ((localArrayList1 != null) && ((localList == null) || (localArrayList1.containsAll(localList))))
      {
        AccessToken localAccessToken = AccessToken.createFromNativeLogin(paramBundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE);
        AuthorizationClient.Result localResult = AuthorizationClient.Result.createTokenResult(this.this$0.pendingRequest, localAccessToken);
        this.this$0.completeAndValidate(localResult);
        return;
      }
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!localArrayList1.contains(str))
          localArrayList2.add(str);
      }
      if (!localArrayList2.isEmpty())
        addLoggingExtra("new_permissions", TextUtils.join(",", localArrayList2));
      paramAuthorizationRequest.setPermissions(localArrayList2);
    }
    this.this$0.tryNextHandler();
  }

  boolean needsRestart()
  {
    return this.getTokenClient == null;
  }

  boolean tryAuthorize(final AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    this.getTokenClient = new GetTokenClient(this.this$0.context, paramAuthorizationRequest.getApplicationId());
    if (!this.getTokenClient.start())
      return false;
    AuthorizationClient.access$300(this.this$0);
    PlatformServiceClient.CompletedListener local1 = new PlatformServiceClient.CompletedListener()
    {
      public void completed(Bundle paramAnonymousBundle)
      {
        AuthorizationClient.GetTokenAuthHandler.this.getTokenCompleted(paramAuthorizationRequest, paramAnonymousBundle);
      }
    };
    this.getTokenClient.setCompletedListener(local1);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.GetTokenAuthHandler
 * JD-Core Version:    0.6.2
 */