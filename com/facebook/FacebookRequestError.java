package com.facebook;

import com.facebook.android.R.string;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError
{
  private static final String BODY_KEY = "body";
  private static final String CODE_KEY = "code";
  private static final int EC_APP_NOT_INSTALLED = 458;
  private static final int EC_APP_TOO_MANY_CALLS = 4;
  private static final int EC_EXPIRED = 463;
  private static final int EC_INVALID_SESSION = 102;
  private static final int EC_INVALID_TOKEN = 190;
  private static final int EC_PASSWORD_CHANGED = 460;
  private static final int EC_PERMISSION_DENIED = 10;
  private static final FacebookRequestError.Range EC_RANGE_PERMISSION = new FacebookRequestError.Range(200, 299, null);
  private static final int EC_SERVICE_UNAVAILABLE = 2;
  private static final int EC_UNCONFIRMED_USER = 464;
  private static final int EC_UNKNOWN_ERROR = 1;
  private static final int EC_USER_CHECKPOINTED = 459;
  private static final int EC_USER_TOO_MANY_CALLS = 17;
  private static final String ERROR_CODE_FIELD_KEY = "code";
  private static final String ERROR_CODE_KEY = "error_code";
  private static final String ERROR_KEY = "error";
  private static final String ERROR_MESSAGE_FIELD_KEY = "message";
  private static final String ERROR_MSG_KEY = "error_msg";
  private static final String ERROR_REASON_KEY = "error_reason";
  private static final String ERROR_SUB_CODE_KEY = "error_subcode";
  private static final String ERROR_TYPE_FIELD_KEY = "type";
  private static final FacebookRequestError.Range HTTP_RANGE_CLIENT_ERROR = new FacebookRequestError.Range(400, 499, null);
  private static final FacebookRequestError.Range HTTP_RANGE_SERVER_ERROR = new FacebookRequestError.Range(500, 599, null);
  private static final FacebookRequestError.Range HTTP_RANGE_SUCCESS = new FacebookRequestError.Range(200, 299, null);
  public static final int INVALID_ERROR_CODE = -1;
  public static final int INVALID_HTTP_STATUS_CODE = -1;
  private static final int INVALID_MESSAGE_ID;
  private final Object batchRequestResult;
  private final FacebookRequestError.Category category;
  private final HttpURLConnection connection;
  private final int errorCode;
  private final String errorMessage;
  private final String errorType;
  private final FacebookException exception;
  private final JSONObject requestResult;
  private final JSONObject requestResultBody;
  private final int requestStatusCode;
  private final boolean shouldNotifyUser;
  private final int subErrorCode;
  private final int userActionMessageId;

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    this(paramInt1, paramInt2, paramInt3, paramString1, paramString2, paramJSONObject1, paramJSONObject2, paramObject, paramHttpURLConnection, null);
  }

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    this.requestStatusCode = paramInt1;
    this.errorCode = paramInt2;
    this.subErrorCode = paramInt3;
    this.errorType = paramString1;
    this.errorMessage = paramString2;
    this.requestResultBody = paramJSONObject1;
    this.requestResult = paramJSONObject2;
    this.batchRequestResult = paramObject;
    this.connection = paramHttpURLConnection;
    int i;
    FacebookRequestError.Category localCategory;
    int j;
    if (paramFacebookException != null)
    {
      this.exception = paramFacebookException;
      i = 1;
      if (i == 0)
        break label124;
      localCategory = FacebookRequestError.Category.CLIENT;
      j = 0;
    }
    label350: label360: 
    while (true)
    {
      this.category = localCategory;
      this.userActionMessageId = j;
      this.shouldNotifyUser = bool;
      return;
      this.exception = new FacebookServiceException(this, paramString2);
      i = 0;
      break;
      label124: if ((paramInt2 == 1) || (paramInt2 == 2))
      {
        localCategory = FacebookRequestError.Category.SERVER;
        j = 0;
      }
      while (true)
      {
        if (localCategory != null)
          break label360;
        if (HTTP_RANGE_CLIENT_ERROR.contains(paramInt1))
        {
          localCategory = FacebookRequestError.Category.BAD_REQUEST;
          break;
          if ((paramInt2 == 4) || (paramInt2 == 17))
          {
            localCategory = FacebookRequestError.Category.THROTTLING;
            bool = false;
            j = 0;
            continue;
          }
          if ((paramInt2 == 10) || (EC_RANGE_PERMISSION.contains(paramInt2)))
          {
            localCategory = FacebookRequestError.Category.PERMISSION;
            j = R.string.com_facebook_requesterror_permissions;
            bool = false;
            continue;
          }
          if ((paramInt2 != 102) && (paramInt2 != 190))
            break label350;
          if ((paramInt3 == 459) || (paramInt3 == 464))
          {
            localCategory = FacebookRequestError.Category.AUTHENTICATION_RETRY;
            j = R.string.com_facebook_requesterror_web_login;
            bool = true;
            continue;
          }
          localCategory = FacebookRequestError.Category.AUTHENTICATION_REOPEN_SESSION;
          if ((paramInt3 == 458) || (paramInt3 == 463))
          {
            j = R.string.com_facebook_requesterror_relogin;
            bool = false;
            continue;
          }
          if (paramInt3 == 460)
          {
            j = R.string.com_facebook_requesterror_password_changed;
            bool = false;
            continue;
          }
          j = R.string.com_facebook_requesterror_reconnect;
          bool = true;
          continue;
        }
        if (HTTP_RANGE_SERVER_ERROR.contains(paramInt1))
        {
          localCategory = FacebookRequestError.Category.SERVER;
          break;
        }
        localCategory = FacebookRequestError.Category.OTHER;
        break;
        bool = false;
        j = 0;
        localCategory = null;
      }
    }
  }

  public FacebookRequestError(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, null, null, null);
  }

  FacebookRequestError(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
  }

  static FacebookRequestError checkResponseAndCreateError(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    while (true)
    {
      try
      {
        if (paramJSONObject.has("code"))
        {
          int i = paramJSONObject.getInt("code");
          Object localObject = Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          if ((localObject != null) && ((localObject instanceof JSONObject)))
          {
            JSONObject localJSONObject2 = (JSONObject)localObject;
            if (localJSONObject2.has("error"))
            {
              JSONObject localJSONObject3 = (JSONObject)Utility.getStringPropertyAsJSON(localJSONObject2, "error", null);
              String str3 = localJSONObject3.optString("type", null);
              str2 = localJSONObject3.optString("message", null);
              int i1 = localJSONObject3.optInt("code", -1);
              k = localJSONObject3.optInt("error_subcode", -1);
              n = 1;
              m = i1;
              str1 = str3;
              if (n != 0)
                return new FacebookRequestError(i, m, k, str1, str2, localJSONObject2, paramJSONObject, paramObject, paramHttpURLConnection);
            }
            else
            {
              if ((!localJSONObject2.has("error_code")) && (!localJSONObject2.has("error_msg")) && (!localJSONObject2.has("error_reason")))
                break label294;
              str1 = localJSONObject2.optString("error_reason", null);
              str2 = localJSONObject2.optString("error_msg", null);
              int j = localJSONObject2.optInt("error_code", -1);
              k = localJSONObject2.optInt("error_subcode", -1);
              m = j;
              n = 1;
              continue;
            }
          }
          if (!HTTP_RANGE_SUCCESS.contains(i))
          {
            if (!paramJSONObject.has("body"))
              break label288;
            localJSONObject1 = (JSONObject)Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            FacebookRequestError localFacebookRequestError = new FacebookRequestError(i, -1, -1, null, null, localJSONObject1, paramJSONObject, paramObject, paramHttpURLConnection);
            return localFacebookRequestError;
          }
        }
      }
      catch (JSONException localJSONException)
      {
      }
      return null;
      label288: JSONObject localJSONObject1 = null;
      continue;
      label294: int n = 0;
      int m = 0;
      int k = 0;
      String str1 = null;
      String str2 = null;
    }
  }

  public final Object getBatchRequestResult()
  {
    return this.batchRequestResult;
  }

  public final FacebookRequestError.Category getCategory()
  {
    return this.category;
  }

  public final HttpURLConnection getConnection()
  {
    return this.connection;
  }

  public final int getErrorCode()
  {
    return this.errorCode;
  }

  public final String getErrorMessage()
  {
    if (this.errorMessage != null)
      return this.errorMessage;
    return this.exception.getLocalizedMessage();
  }

  public final String getErrorType()
  {
    return this.errorType;
  }

  public final FacebookException getException()
  {
    return this.exception;
  }

  public final JSONObject getRequestResult()
  {
    return this.requestResult;
  }

  public final JSONObject getRequestResultBody()
  {
    return this.requestResultBody;
  }

  public final int getRequestStatusCode()
  {
    return this.requestStatusCode;
  }

  public final int getSubErrorCode()
  {
    return this.subErrorCode;
  }

  public final int getUserActionMessageId()
  {
    return this.userActionMessageId;
  }

  public final boolean shouldNotifyUser()
  {
    return this.shouldNotifyUser;
  }

  public final String toString()
  {
    return "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError
 * JD-Core Version:    0.6.2
 */