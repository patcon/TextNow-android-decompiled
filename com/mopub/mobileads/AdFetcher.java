package com.mopub.mobileads;

import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.mobileads.factories.AdFetchTaskFactory;

public class AdFetcher
{
  public static final String AD_CONFIGURATION_KEY = "Ad-Configuration";
  public static final String CLICKTHROUGH_URL_KEY = "Clickthrough-Url";
  public static final String HTML_RESPONSE_BODY_KEY = "Html-Response-Body";
  public static final String REDIRECT_URL_KEY = "Redirect-Url";
  public static final String SCROLLABLE_KEY = "Scrollable";
  private AdViewController mAdViewController;
  private AdFetchTask mCurrentTask;
  private final TaskTracker mTaskTracker;
  private int mTimeoutMilliseconds = 10000;
  private String mUserAgent;

  public AdFetcher(AdViewController paramAdViewController, String paramString)
  {
    this.mAdViewController = paramAdViewController;
    this.mUserAgent = paramString;
    this.mTaskTracker = new TaskTracker();
  }

  private long getCurrentTaskId()
  {
    return this.mTaskTracker.getCurrentTaskId();
  }

  public void cancelFetch()
  {
    if (this.mCurrentTask != null)
    {
      MoPubLog.i("Canceling fetch ad for task #" + getCurrentTaskId());
      this.mCurrentTask.cancel(true);
    }
  }

  void cleanup()
  {
    cancelFetch();
    this.mAdViewController = null;
    this.mUserAgent = "";
  }

  public void fetchAdForUrl(String paramString)
  {
    this.mTaskTracker.newTaskStarted();
    MoPubLog.i("Fetching ad for task #" + getCurrentTaskId());
    if (this.mCurrentTask != null)
      this.mCurrentTask.cancel(true);
    this.mCurrentTask = AdFetchTaskFactory.create(this.mTaskTracker, this.mAdViewController, this.mUserAgent, this.mTimeoutMilliseconds);
    try
    {
      AsyncTasks.safeExecuteOnExecutor(this.mCurrentTask, new String[] { paramString });
      return;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Error executing AdFetchTask", localException);
    }
  }

  protected void setTimeout(int paramInt)
  {
    this.mTimeoutMilliseconds = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdFetcher
 * JD-Core Version:    0.6.2
 */