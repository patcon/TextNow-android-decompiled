package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.android.R.string;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.GraphUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class AuthorizationClient
  implements Serializable
{
  static final String EVENT_EXTRAS_APP_CALL_ID = "call_id";
  static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
  static final String EVENT_EXTRAS_IS_LEGACY = "is_legacy";
  static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
  static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
  static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
  static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
  static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
  static final String EVENT_EXTRAS_PROTOCOL_VERSION = "protocol_version";
  static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
  static final String EVENT_EXTRAS_SERVICE_DISABLED = "service_disabled";
  static final String EVENT_EXTRAS_TRY_LEGACY = "try_legacy";
  static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
  static final String EVENT_EXTRAS_WRITE_PRIVACY = "write_privacy";
  static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
  private static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
  private static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
  static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
  static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
  static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
  static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
  static final String EVENT_PARAM_EXTRAS = "6_extras";
  static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
  static final String EVENT_PARAM_METHOD = "3_method";
  private static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
  static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
  private static final String TAG = "Facebook-AuthorizationClient";
  private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
  private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
  private static final long serialVersionUID = 1L;
  private transient AppEventsLogger appEventsLogger;
  transient AuthorizationClient.BackgroundProcessingListener backgroundProcessingListener;
  transient boolean checkedInternetPermission;
  transient Context context;
  AuthorizationClient.AuthHandler currentHandler;
  List<AuthorizationClient.AuthHandler> handlersToTry;
  Map<String, String> loggingExtras;
  transient AuthorizationClient.OnCompletedListener onCompletedListener;
  AuthorizationClient.AuthorizationRequest pendingRequest;
  transient AuthorizationClient.StartActivityDelegate startActivityDelegate;

  private void addLoggingExtra(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.loggingExtras == null)
      this.loggingExtras = new HashMap();
    if ((this.loggingExtras.containsKey(paramString1)) && (paramBoolean))
      paramString2 = (String)this.loggingExtras.get(paramString1) + "," + paramString2;
    this.loggingExtras.put(paramString1, paramString2);
  }

  private void completeWithFailure()
  {
    complete(AuthorizationClient.Result.createErrorResult(this.pendingRequest, "Login attempt failed.", null));
  }

  private AppEventsLogger getAppEventsLogger()
  {
    if ((this.appEventsLogger == null) || (this.appEventsLogger.getApplicationId() != this.pendingRequest.getApplicationId()))
      this.appEventsLogger = AppEventsLogger.newLogger(this.context, this.pendingRequest.getApplicationId());
    return this.appEventsLogger;
  }

  private static String getE2E()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      label18: return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      break label18;
    }
  }

  private List<AuthorizationClient.AuthHandler> getHandlerTypes(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    ArrayList localArrayList = new ArrayList();
    SessionLoginBehavior localSessionLoginBehavior = paramAuthorizationRequest.getLoginBehavior();
    if (localSessionLoginBehavior.allowsKatanaAuth())
    {
      if (!paramAuthorizationRequest.isLegacy())
      {
        localArrayList.add(new AuthorizationClient.GetTokenAuthHandler(this));
        localArrayList.add(new AuthorizationClient.KatanaLoginDialogAuthHandler(this));
      }
      localArrayList.add(new AuthorizationClient.KatanaProxyAuthHandler(this));
    }
    if (localSessionLoginBehavior.allowsWebViewAuth())
      localArrayList.add(new AuthorizationClient.WebViewAuthHandler(this));
    return localArrayList;
  }

  private void logAuthorizationMethodComplete(String paramString, AuthorizationClient.Result paramResult, Map<String, String> paramMap)
  {
    logAuthorizationMethodComplete(paramString, paramResult.code.getLoggingValue(), paramResult.errorMessage, paramResult.errorCode, paramMap);
  }

  private void logAuthorizationMethodComplete(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    Bundle localBundle;
    if (this.pendingRequest == null)
    {
      localBundle = newAuthorizationLoggingBundle("");
      localBundle.putString("2_result", AuthorizationClient.Result.Code.ERROR.getLoggingValue());
      localBundle.putString("5_error_message", "Unexpected call to logAuthorizationMethodComplete with null pendingRequest.");
    }
    while (true)
    {
      localBundle.putString("3_method", paramString1);
      localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
      getAppEventsLogger().logSdkEvent("fb_mobile_login_method_complete", null, localBundle);
      return;
      localBundle = newAuthorizationLoggingBundle(this.pendingRequest.getAuthId());
      if (paramString2 != null)
        localBundle.putString("2_result", paramString2);
      if (paramString3 != null)
        localBundle.putString("5_error_message", paramString3);
      if (paramString4 != null)
        localBundle.putString("4_error_code", paramString4);
      if ((paramMap != null) && (!paramMap.isEmpty()))
        localBundle.putString("6_extras", new JSONObject(paramMap).toString());
    }
  }

  private void logAuthorizationMethodStart(String paramString)
  {
    Bundle localBundle = newAuthorizationLoggingBundle(this.pendingRequest.getAuthId());
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("3_method", paramString);
    getAppEventsLogger().logSdkEvent("fb_mobile_login_method_start", null, localBundle);
  }

  private void logWebLoginCompleted(String paramString1, String paramString2)
  {
    AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(this.context, paramString1);
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_web_login_e2e", paramString2);
    localBundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
    localBundle.putString("app_id", paramString1);
    localAppEventsLogger.logSdkEvent("fb_dialogs_web_login_dialog_complete", null, localBundle);
  }

  static Bundle newAuthorizationLoggingBundle(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("0_auth_logger_id", paramString);
    localBundle.putString("3_method", "");
    localBundle.putString("2_result", "");
    localBundle.putString("5_error_message", "");
    localBundle.putString("4_error_code", "");
    localBundle.putString("6_extras", "");
    return localBundle;
  }

  private void notifyBackgroundProcessingStart()
  {
    if (this.backgroundProcessingListener != null)
      this.backgroundProcessingListener.onBackgroundProcessingStarted();
  }

  private void notifyBackgroundProcessingStop()
  {
    if (this.backgroundProcessingListener != null)
      this.backgroundProcessingListener.onBackgroundProcessingStopped();
  }

  private void notifyOnCompleteListener(AuthorizationClient.Result paramResult)
  {
    if (this.onCompletedListener != null)
      this.onCompletedListener.onCompleted(paramResult);
  }

  void authorize(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    if (paramAuthorizationRequest == null);
    do
    {
      return;
      if (this.pendingRequest != null)
        throw new FacebookException("Attempted to authorize while a request is pending.");
    }
    while ((paramAuthorizationRequest.needsNewTokenValidation()) && (!checkInternetPermission()));
    this.pendingRequest = paramAuthorizationRequest;
    this.handlersToTry = getHandlerTypes(paramAuthorizationRequest);
    tryNextHandler();
  }

  void cancelCurrentHandler()
  {
    if (this.currentHandler != null)
      this.currentHandler.cancel();
  }

  boolean checkInternetPermission()
  {
    if (this.checkedInternetPermission)
      return true;
    if (checkPermission("android.permission.INTERNET") != 0)
    {
      String str1 = this.context.getString(R.string.com_facebook_internet_permission_error_title);
      String str2 = this.context.getString(R.string.com_facebook_internet_permission_error_message);
      complete(AuthorizationClient.Result.createErrorResult(this.pendingRequest, str1, str2));
      return false;
    }
    this.checkedInternetPermission = true;
    return true;
  }

  int checkPermission(String paramString)
  {
    return this.context.checkCallingOrSelfPermission(paramString);
  }

  void complete(AuthorizationClient.Result paramResult)
  {
    if (this.currentHandler != null)
      logAuthorizationMethodComplete(this.currentHandler.getNameForLogging(), paramResult, this.currentHandler.methodLoggingExtras);
    if (this.loggingExtras != null)
      paramResult.loggingExtras = this.loggingExtras;
    this.handlersToTry = null;
    this.currentHandler = null;
    this.pendingRequest = null;
    this.loggingExtras = null;
    notifyOnCompleteListener(paramResult);
  }

  void completeAndValidate(AuthorizationClient.Result paramResult)
  {
    if ((paramResult.token != null) && (this.pendingRequest.needsNewTokenValidation()))
    {
      validateSameFbidAndFinish(paramResult);
      return;
    }
    complete(paramResult);
  }

  void continueAuth()
  {
    if ((this.pendingRequest == null) || (this.currentHandler == null))
      throw new FacebookException("Attempted to continue authorization without a pending request.");
    if (this.currentHandler.needsRestart())
    {
      this.currentHandler.cancel();
      tryCurrentHandler();
    }
  }

  Request createGetPermissionsRequest(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id");
    localBundle.putString("access_token", paramString);
    return new Request(null, "me/permissions", localBundle, HttpMethod.GET, null);
  }

  Request createGetProfileIdRequest(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id");
    localBundle.putString("access_token", paramString);
    return new Request(null, "me", localBundle, HttpMethod.GET, null);
  }

  RequestBatch createReauthValidationBatch(final AuthorizationClient.Result paramResult)
  {
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    String str1 = paramResult.token.getToken();
    Request.Callback local3 = new Request.Callback()
    {
      public void onCompleted(Response paramAnonymousResponse)
      {
        try
        {
          GraphUser localGraphUser = (GraphUser)paramAnonymousResponse.getGraphObjectAs(GraphUser.class);
          if (localGraphUser != null)
            localArrayList1.add(localGraphUser.getId());
          return;
        }
        catch (Exception localException)
        {
        }
      }
    };
    String str2 = this.pendingRequest.getPreviousAccessToken();
    Request localRequest1 = createGetProfileIdRequest(str2);
    localRequest1.setCallback(local3);
    Request localRequest2 = createGetProfileIdRequest(str1);
    localRequest2.setCallback(local3);
    Request localRequest3 = createGetPermissionsRequest(str2);
    localRequest3.setCallback(new Request.Callback()
    {
      public void onCompleted(Response paramAnonymousResponse)
      {
        try
        {
          GraphMultiResult localGraphMultiResult = (GraphMultiResult)paramAnonymousResponse.getGraphObjectAs(GraphMultiResult.class);
          if (localGraphMultiResult != null)
          {
            GraphObjectList localGraphObjectList = localGraphMultiResult.getData();
            if ((localGraphObjectList != null) && (localGraphObjectList.size() == 1))
            {
              GraphObject localGraphObject = (GraphObject)localGraphObjectList.get(0);
              localArrayList2.addAll(localGraphObject.asMap().keySet());
            }
          }
          return;
        }
        catch (Exception localException)
        {
        }
      }
    });
    RequestBatch localRequestBatch = new RequestBatch(new Request[] { localRequest1, localRequest2, localRequest3 });
    localRequestBatch.setBatchApplicationId(this.pendingRequest.getApplicationId());
    localRequestBatch.addCallback(new RequestBatch.Callback()
    {
      public void onBatchCompleted(RequestBatch paramAnonymousRequestBatch)
      {
        try
        {
          AccessToken localAccessToken;
          if ((localArrayList1.size() == 2) && (localArrayList1.get(0) != null) && (localArrayList1.get(1) != null) && (((String)localArrayList1.get(0)).equals(localArrayList1.get(1))))
            localAccessToken = AccessToken.createFromTokenWithRefreshedPermissions(paramResult.token, localArrayList2);
          AuthorizationClient.Result localResult;
          for (Object localObject2 = AuthorizationClient.Result.createTokenResult(AuthorizationClient.this.pendingRequest, localAccessToken); ; localObject2 = localResult)
          {
            AuthorizationClient.this.complete((AuthorizationClient.Result)localObject2);
            return;
            localResult = AuthorizationClient.Result.createErrorResult(AuthorizationClient.this.pendingRequest, "User logged in as different Facebook user.", null);
          }
        }
        catch (Exception localException)
        {
          AuthorizationClient.this.complete(AuthorizationClient.Result.createErrorResult(AuthorizationClient.this.pendingRequest, "Caught exception", localException.getMessage()));
          return;
        }
        finally
        {
          AuthorizationClient.this.notifyBackgroundProcessingStop();
        }
      }
    });
    return localRequestBatch;
  }

  AuthorizationClient.BackgroundProcessingListener getBackgroundProcessingListener()
  {
    return this.backgroundProcessingListener;
  }

  boolean getInProgress()
  {
    return (this.pendingRequest != null) && (this.currentHandler != null);
  }

  AuthorizationClient.OnCompletedListener getOnCompletedListener()
  {
    return this.onCompletedListener;
  }

  AuthorizationClient.StartActivityDelegate getStartActivityDelegate()
  {
    if (this.startActivityDelegate != null)
      return this.startActivityDelegate;
    if (this.pendingRequest != null)
      return new AuthorizationClient.StartActivityDelegate()
      {
        public Activity getActivityContext()
        {
          return AuthorizationClient.this.pendingRequest.getStartActivityDelegate().getActivityContext();
        }

        public void startActivityForResult(Intent paramAnonymousIntent, int paramAnonymousInt)
        {
          AuthorizationClient.this.pendingRequest.getStartActivityDelegate().startActivityForResult(paramAnonymousIntent, paramAnonymousInt);
        }
      };
    return null;
  }

  boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == this.pendingRequest.getRequestCode())
      return this.currentHandler.onActivityResult(paramInt1, paramInt2, paramIntent);
    return false;
  }

  void setBackgroundProcessingListener(AuthorizationClient.BackgroundProcessingListener paramBackgroundProcessingListener)
  {
    this.backgroundProcessingListener = paramBackgroundProcessingListener;
  }

  void setContext(final Activity paramActivity)
  {
    this.context = paramActivity;
    this.startActivityDelegate = new AuthorizationClient.StartActivityDelegate()
    {
      public Activity getActivityContext()
      {
        return paramActivity;
      }

      public void startActivityForResult(Intent paramAnonymousIntent, int paramAnonymousInt)
      {
        paramActivity.startActivityForResult(paramAnonymousIntent, paramAnonymousInt);
      }
    };
  }

  void setContext(Context paramContext)
  {
    this.context = paramContext;
    this.startActivityDelegate = null;
  }

  void setOnCompletedListener(AuthorizationClient.OnCompletedListener paramOnCompletedListener)
  {
    this.onCompletedListener = paramOnCompletedListener;
  }

  void startOrContinueAuth(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    if (getInProgress())
    {
      continueAuth();
      return;
    }
    authorize(paramAuthorizationRequest);
  }

  boolean tryCurrentHandler()
  {
    if ((this.currentHandler.needsInternetPermission()) && (!checkInternetPermission()))
    {
      addLoggingExtra("no_internet_permission", "1", false);
      return false;
    }
    boolean bool = this.currentHandler.tryAuthorize(this.pendingRequest);
    if (bool)
    {
      logAuthorizationMethodStart(this.currentHandler.getNameForLogging());
      return bool;
    }
    addLoggingExtra("not_tried", this.currentHandler.getNameForLogging(), true);
    return bool;
  }

  void tryNextHandler()
  {
    if (this.currentHandler != null)
      logAuthorizationMethodComplete(this.currentHandler.getNameForLogging(), "skipped", null, null, this.currentHandler.methodLoggingExtras);
    do
    {
      if ((this.handlersToTry == null) || (this.handlersToTry.isEmpty()))
        break;
      this.currentHandler = ((AuthorizationClient.AuthHandler)this.handlersToTry.remove(0));
    }
    while (!tryCurrentHandler());
    while (this.pendingRequest == null)
      return;
    completeWithFailure();
  }

  void validateSameFbidAndFinish(AuthorizationClient.Result paramResult)
  {
    if (paramResult.token == null)
      throw new FacebookException("Can't validate without a token");
    RequestBatch localRequestBatch = createReauthValidationBatch(paramResult);
    notifyBackgroundProcessingStart();
    localRequestBatch.executeAsync();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient
 * JD-Core Version:    0.6.2
 */