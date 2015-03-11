package com.mopub.mobileads.factories;

import com.mopub.mobileads.AdFetchTask;
import com.mopub.mobileads.AdViewController;
import com.mopub.mobileads.TaskTracker;

public class AdFetchTaskFactory
{
  protected static AdFetchTaskFactory instance = new AdFetchTaskFactory();

  public static AdFetchTask create(TaskTracker paramTaskTracker, AdViewController paramAdViewController, String paramString, int paramInt)
  {
    return instance.internalCreate(paramTaskTracker, paramAdViewController, paramString, paramInt);
  }

  @Deprecated
  public static void setInstance(AdFetchTaskFactory paramAdFetchTaskFactory)
  {
    instance = paramAdFetchTaskFactory;
  }

  protected AdFetchTask internalCreate(TaskTracker paramTaskTracker, AdViewController paramAdViewController, String paramString, int paramInt)
  {
    return new AdFetchTask(paramTaskTracker, paramAdViewController, paramString, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.AdFetchTaskFactory
 * JD-Core Version:    0.6.2
 */