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
  private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
  private static final String ERROR_KEY = "error";
  private static final String ERROR_MESSAGE_FIELD_KEY = "message";
  private static final String ERROR_MSG_KEY = "error_msg";
  private static final String ERROR_REASON_KEY = "error_reason";
  private static final String ERROR_SUB_CODE_KEY = "error_subcode";
  private static final String ERROR_TYPE_FIELD_KEY = "type";
  private static final String ERROR_USER_MSG_KEY = "error_user_msg";
  private static final String ERROR_USER_TITLE_KEY = "error_user_title";
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
  private final boolean errorIsTransient;
  private final String errorMessage;
  private final String errorType;
  private final String errorUserMessage;
  private final String errorUserTitle;
  private final FacebookException exception;
  private final JSONObject requestResult;
  private final JSONObject requestResultBody;
  private final int requestStatusCode;
  private final boolean shouldNotifyUser;
  private final int subErrorCode;
  private final int userActionMessageId;

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    this(paramInt1, paramInt2, paramInt3, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramJSONObject1, paramJSONObject2, paramObject, paramHttpURLConnection, null);
  }

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
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
    this.errorUserTitle = paramString3;
    this.errorUserMessage = paramString4;
    this.errorIsTransient = paramBoolean;
    int i;
    int j;
    Object localObject;
    int k;
    if (paramFacebookException != null)
    {
      this.exception = paramFacebookException;
      i = 1;
      j = 0;
      if (i == 0)
        break label158;
      localObject = FacebookRequestError.Category.CLIENT;
      k = 0;
    }
    while (true)
    {
      label103: if ((paramString4 != null) && (paramString4.length() > 0));
      label158: FacebookRequestError.Category localCategory;
      for (boolean bool = true; ; bool = false)
      {
        this.category = ((FacebookRequestError.Category)localObject);
        this.userActionMessageId = k;
        this.shouldNotifyUser = bool;
        return;
        this.exception = new FacebookServiceException(this, paramString2);
        i = 0;
        break;
        if ((paramInt2 == 1) || (paramInt2 == 2))
          localCategory = FacebookRequestError.Category.SERVER;
        while (true)
        {
          if (localCategory != null)
            break label387;
          if (!HTTP_RANGE_CLIENT_ERROR.contains(paramInt1))
            break label347;
          localObject = FacebookRequestError.Category.BAD_REQUEST;
          k = j;
          break;
          if ((paramInt2 == 4) || (paramInt2 == 17))
          {
            localCategory = FacebookRequestError.Category.THROTTLING;
            j = 0;
          }
          else if ((paramInt2 == 10) || (EC_RANGE_PERMISSION.contains(paramInt2)))
          {
            localCategory = FacebookRequestError.Category.PERMISSION;
            j = R.string.com_facebook_requesterror_permissions;
          }
          else if (paramInt2 != 102)
          {
            j = 0;
            localCategory = null;
            if (paramInt2 != 190);
          }
          else if ((paramInt3 == 459) || (paramInt3 == 464))
          {
            localCategory = FacebookRequestError.Category.AUTHENTICATION_RETRY;
            j = R.string.com_facebook_requesterror_web_login;
          }
          else
          {
            localCategory = FacebookRequestError.Category.AUTHENTICATION_REOPEN_SESSION;
            if ((paramInt3 == 458) || (paramInt3 == 463))
              j = R.string.com_facebook_requesterror_relogin;
            else if (paramInt3 == 460)
              j = R.string.com_facebook_requesterror_password_changed;
            else
              j = R.string.com_facebook_requesterror_reconnect;
          }
        }
        label347: if (HTTP_RANGE_SERVER_ERROR.contains(paramInt1))
        {
          localObject = FacebookRequestError.Category.SERVER;
          k = j;
          break label103;
        }
        localObject = FacebookRequestError.Category.OTHER;
        k = j;
        break label103;
      }
      label387: localObject = localCategory;
      k = j;
    }
  }

  public FacebookRequestError(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
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
            String str1;
            String str2;
            int j;
            int k;
            String str4;
            String str3;
            boolean bool1;
            int m;
            if (localJSONObject2.has("error"))
            {
              JSONObject localJSONObject3 = (JSONObject)Utility.getStringPropertyAsJSON(localJSONObject2, "error", null);
              str1 = localJSONObject3.optString("type", null);
              str2 = localJSONObject3.optString("message", null);
              j = localJSONObject3.optInt("code", -1);
              k = localJSONObject3.optInt("error_subcode", -1);
              str4 = localJSONObject3.optString("error_user_msg", null);
              str3 = localJSONObject3.optString("error_user_title", null);
              bool1 = localJSONObject3.optBoolean("is_transient", false);
              m = 1;
              if (m != 0)
                return new FacebookRequestError(i, j, k, str1, str2, str3, str4, bool1, localJSONObject2, paramJSONObject, paramObject, paramHttpURLConnection);
            }
            else
            {
              if ((!localJSONObject2.has("error_code")) && (!localJSONObject2.has("error_msg")))
              {
                boolean bool2 = localJSONObject2.has("error_reason");
                m = 0;
                j = 0;
                k = 0;
                str1 = null;
                str2 = null;
                str3 = null;
                str4 = null;
                bool1 = false;
                if (!bool2)
                  continue;
              }
              str1 = localJSONObject2.optString("error_reason", null);
              str2 = localJSONObject2.optString("error_msg", null);
              j = localJSONObject2.optInt("error_code", -1);
              k = localJSONObject2.optInt("error_subcode", -1);
              m = 1;
              str3 = null;
              str4 = null;
              bool1 = false;
              continue;
            }
          }
          if (!HTTP_RANGE_SUCCESS.contains(i))
          {
            if (!paramJSONObject.has("body"))
              break label352;
            localJSONObject1 = (JSONObject)Utility.getStringPropertyAsJSON(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            FacebookRequestError localFacebookRequestError = new FacebookRequestError(i, -1, -1, null, null, null, null, false, localJSONObject1, paramJSONObject, paramObject, paramHttpURLConnection);
            return localFacebookRequestError;
          }
        }
      }
      catch (JSONException localJSONException)
      {
      }
      return null;
      label352: JSONObject localJSONObject1 = null;
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

  public final boolean getErrorIsTransient()
  {
    return this.errorIsTransient;
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

  public final String getErrorUserMessage()
  {
    return this.errorUserMessage;
  }

  public final String getErrorUserTitle()
  {
    return this.errorUserTitle;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookRequestError
 * JD-Core Version:    0.6.2
 */