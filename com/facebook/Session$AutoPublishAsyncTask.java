package com.facebook;

import android.content.Context;
import android.os.AsyncTask;
import com.facebook.internal.Utility;

class Session$AutoPublishAsyncTask extends AsyncTask<Void, Void, Void>
{
  private final Context mApplicationContext;
  private final String mApplicationId;

  public Session$AutoPublishAsyncTask(Session paramSession, String paramString, Context paramContext)
  {
    this.mApplicationId = paramString;
    this.mApplicationContext = paramContext.getApplicationContext();
  }

  protected Void doInBackground(Void[] paramArrayOfVoid)
  {
    try
    {
      Settings.publishInstallAndWaitForResponse(this.mApplicationContext, this.mApplicationId, true);
      return null;
    }
    catch (Exception localException)
    {
      while (true)
        Utility.logd("Facebook-publish", localException);
    }
  }

  protected void onPostExecute(Void paramVoid)
  {
    synchronized (this.this$0)
    {
      Session.access$1802(this.this$0, null);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.Session.AutoPublishAsyncTask
 * JD-Core Version:    0.6.2
 */