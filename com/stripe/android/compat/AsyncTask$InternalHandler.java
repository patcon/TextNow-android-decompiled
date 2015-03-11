package com.stripe.android.compat;

import android.os.Handler;
import android.os.Message;

class AsyncTask$InternalHandler extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    AsyncTask.AsyncTaskResult localAsyncTaskResult = (AsyncTask.AsyncTaskResult)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      AsyncTask.access$500(localAsyncTaskResult.mTask, localAsyncTaskResult.mData[0]);
      return;
    case 2:
    }
    localAsyncTaskResult.mTask.onProgressUpdate(localAsyncTaskResult.mData);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.compat.AsyncTask.InternalHandler
 * JD-Core Version:    0.6.2
 */