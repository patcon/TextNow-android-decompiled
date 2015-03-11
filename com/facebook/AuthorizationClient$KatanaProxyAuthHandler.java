package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

class AuthorizationClient$KatanaProxyAuthHandler extends AuthorizationClient.KatanaAuthHandler
{
  private static final long serialVersionUID = 1L;
  private String applicationId;

  AuthorizationClient$KatanaProxyAuthHandler(AuthorizationClient paramAuthorizationClient)
  {
    super(paramAuthorizationClient);
  }

  private AuthorizationClient.Result handleResultOk(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str1 = localBundle.getString("error");
    if (str1 == null)
      str1 = localBundle.getString("error_type");
    String str2 = localBundle.getString("error_code");
    String str3 = localBundle.getString("error_message");
    if (str3 == null)
      str3 = localBundle.getString("error_description");
    String str4 = localBundle.getString("e2e");
    if (!Utility.isNullOrEmpty(str4))
      AuthorizationClient.access$200(this.this$0, this.applicationId, str4);
    if ((str1 == null) && (str2 == null) && (str3 == null))
    {
      AccessToken localAccessToken = AccessToken.createFromWebBundle(this.this$0.pendingRequest.getPermissions(), localBundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB);
      return AuthorizationClient.Result.createTokenResult(this.this$0.pendingRequest, localAccessToken);
    }
    if (ServerProtocol.errorsProxyAuthDisabled.contains(str1))
      return null;
    if (ServerProtocol.errorsUserCanceled.contains(str1))
      return AuthorizationClient.Result.createCancelResult(this.this$0.pendingRequest, null);
    return AuthorizationClient.Result.createErrorResult(this.this$0.pendingRequest, str1, str3, str2);
  }

  String getNameForLogging()
  {
    return "katana_proxy_auth";
  }

  boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AuthorizationClient.Result localResult;
    if (paramIntent == null)
    {
      localResult = AuthorizationClient.Result.createCancelResult(this.this$0.pendingRequest, "Operation canceled");
      if (localResult == null)
        break label92;
      this.this$0.completeAndValidate(localResult);
    }
    while (true)
    {
      return true;
      if (paramInt2 == 0)
      {
        localResult = AuthorizationClient.Result.createCancelResult(this.this$0.pendingRequest, paramIntent.getStringExtra("error"));
        break;
      }
      if (paramInt2 != -1)
      {
        localResult = AuthorizationClient.Result.createErrorResult(this.this$0.pendingRequest, "Unexpected resultCode from authorization.", null);
        break;
      }
      localResult = handleResultOk(paramIntent);
      break;
      label92: this.this$0.tryNextHandler();
    }
  }

  boolean tryAuthorize(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    this.applicationId = paramAuthorizationRequest.getApplicationId();
    String str = AuthorizationClient.access$100();
    Intent localIntent = NativeProtocol.createProxyAuthIntent(this.this$0.context, paramAuthorizationRequest.getApplicationId(), paramAuthorizationRequest.getPermissions(), str);
    addLoggingExtra("e2e", str);
    return tryIntent(localIntent, paramAuthorizationRequest.getRequestCode());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.KatanaProxyAuthHandler
 * JD-Core Version:    0.6.2
 */