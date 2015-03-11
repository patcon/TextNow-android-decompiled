package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

class AuthorizationClient$KatanaLoginDialogAuthHandler extends AuthorizationClient.KatanaAuthHandler
{
  private static final long serialVersionUID = 1L;
  private String applicationId;
  private String callId;

  AuthorizationClient$KatanaLoginDialogAuthHandler(AuthorizationClient paramAuthorizationClient)
  {
    super(paramAuthorizationClient);
  }

  private AuthorizationClient.Result createCancelOrErrorResult(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str1 = localBundle.getString("com.facebook.platform.status.ERROR_TYPE");
    if (("UserCanceled".equals(str1)) || ("PermissionDenied".equals(str1)))
      return AuthorizationClient.Result.createCancelResult(paramAuthorizationRequest, paramIntent.getStringExtra("com.facebook.platform.status.ERROR_DESCRIPTION"));
    String str2 = localBundle.getString("com.facebook.platform.status.ERROR_JSON");
    Object localObject = null;
    if (str2 != null);
    try
    {
      String str3 = new JSONObject(str2).getString("error_code");
      localObject = str3;
      return AuthorizationClient.Result.createErrorResult(paramAuthorizationRequest, str1, paramIntent.getStringExtra("com.facebook.platform.status.ERROR_DESCRIPTION"), localObject);
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localObject = null;
    }
  }

  private AuthorizationClient.Result handleResultOk(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    String str = localBundle.getString("com.facebook.platform.status.ERROR_TYPE");
    if (str == null)
      return AuthorizationClient.Result.createTokenResult(this.this$0.pendingRequest, AccessToken.createFromNativeLogin(localBundle, AccessTokenSource.FACEBOOK_APPLICATION_NATIVE));
    if ("ServiceDisabled".equals(str))
    {
      addLoggingExtra("service_disabled", "1");
      return null;
    }
    return createCancelOrErrorResult(this.this$0.pendingRequest, paramIntent);
  }

  private void logEvent(String paramString1, String paramString2, String paramString3)
  {
    if (paramString3 != null)
    {
      AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(this.this$0.context, this.applicationId);
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", this.applicationId);
      localBundle.putString("action_id", paramString3);
      localBundle.putLong(paramString2, System.currentTimeMillis());
      localAppEventsLogger.logSdkEvent(paramString1, null, localBundle);
    }
  }

  String getNameForLogging()
  {
    return "katana_login_dialog";
  }

  boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    logEvent("fb_dialogs_native_login_dialog_complete", "fb_native_login_dialog_complete_time", this.callId);
    AuthorizationClient.Result localResult;
    if (paramIntent == null)
    {
      localResult = AuthorizationClient.Result.createCancelResult(this.this$0.pendingRequest, "Operation canceled");
      if (localResult == null)
        break label114;
      this.this$0.completeAndValidate(localResult);
    }
    while (true)
    {
      return true;
      boolean bool = NativeProtocol.isServiceDisabledResult20121101(paramIntent);
      localResult = null;
      if (bool)
        break;
      if (paramInt2 == 0)
      {
        localResult = createCancelOrErrorResult(this.this$0.pendingRequest, paramIntent);
        break;
      }
      if (paramInt2 != -1)
      {
        localResult = AuthorizationClient.Result.createErrorResult(this.this$0.pendingRequest, "Unexpected resultCode from authorization.", null);
        break;
      }
      localResult = handleResultOk(paramIntent);
      break;
      label114: this.this$0.tryNextHandler();
    }
  }

  boolean tryAuthorize(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    this.applicationId = paramAuthorizationRequest.getApplicationId();
    Intent localIntent = NativeProtocol.createLoginDialog20121101Intent(this.this$0.context, paramAuthorizationRequest.getApplicationId(), new ArrayList(paramAuthorizationRequest.getPermissions()), paramAuthorizationRequest.getDefaultAudience().getNativeProtocolAudience());
    if (localIntent == null)
      return false;
    this.callId = localIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
    addLoggingExtra("call_id", this.callId);
    addLoggingExtra("protocol_version", Integer.valueOf(localIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0)));
    addLoggingExtra("permissions", TextUtils.join(",", localIntent.getStringArrayListExtra("com.facebook.platform.extra.PERMISSIONS")));
    addLoggingExtra("write_privacy", localIntent.getStringExtra("com.facebook.platform.extra.WRITE_PRIVACY"));
    logEvent("fb_dialogs_native_login_dialog_start", "fb_native_login_dialog_start_time", this.callId);
    return tryIntent(localIntent, paramAuthorizationRequest.getRequestCode());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.KatanaLoginDialogAuthHandler
 * JD-Core Version:    0.6.2
 */