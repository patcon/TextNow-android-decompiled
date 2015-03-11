package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Request.Callback;
import com.facebook.RequestBatch;
import com.facebook.Response;

abstract class LikeActionController$AbstractRequestWrapper
{
  FacebookRequestError error;
  protected String objectId;
  private Request request;

  protected LikeActionController$AbstractRequestWrapper(LikeActionController paramLikeActionController, String paramString)
  {
    this.objectId = paramString;
  }

  void addToBatch(RequestBatch paramRequestBatch)
  {
    paramRequestBatch.add(this.request);
  }

  protected void processError(FacebookRequestError paramFacebookRequestError)
  {
    LoggingBehavior localLoggingBehavior = LoggingBehavior.REQUESTS;
    String str = LikeActionController.access$1000();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.objectId;
    arrayOfObject[1] = paramFacebookRequestError;
    Logger.log(localLoggingBehavior, str, "Error running request for object '%s' : %s", arrayOfObject);
  }

  protected abstract void processSuccess(Response paramResponse);

  protected void setRequest(Request paramRequest)
  {
    this.request = paramRequest;
    paramRequest.setVersion("v2.2");
    paramRequest.setCallback(new Request.Callback()
    {
      public void onCompleted(Response paramAnonymousResponse)
      {
        LikeActionController.AbstractRequestWrapper.this.error = paramAnonymousResponse.getError();
        if (LikeActionController.AbstractRequestWrapper.this.error != null)
        {
          LikeActionController.AbstractRequestWrapper.this.processError(LikeActionController.AbstractRequestWrapper.this.error);
          return;
        }
        LikeActionController.AbstractRequestWrapper.this.processSuccess(paramAnonymousResponse);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LikeActionController.AbstractRequestWrapper
 * JD-Core Version:    0.6.2
 */