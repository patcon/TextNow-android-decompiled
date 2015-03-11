package com.facebook;

public class FacebookServiceException extends FacebookException
{
  private static final long serialVersionUID = 1L;
  private final FacebookRequestError error;

  public FacebookServiceException(FacebookRequestError paramFacebookRequestError, String paramString)
  {
    super(paramString);
    this.error = paramFacebookRequestError;
  }

  public final FacebookRequestError getRequestError()
  {
    return this.error;
  }

  public final String toString()
  {
    return "{FacebookServiceException: " + "httpResponseCode: " + this.error.getRequestStatusCode() + ", facebookErrorCode: " + this.error.getErrorCode() + ", facebookErrorType: " + this.error.getErrorType() + ", message: " + this.error.getErrorMessage() + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookServiceException
 * JD-Core Version:    0.6.2
 */