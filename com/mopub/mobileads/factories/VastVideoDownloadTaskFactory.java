package com.mopub.mobileads.factories;

import com.mopub.mobileads.VastVideoDownloadTask;
import com.mopub.mobileads.VastVideoDownloadTask.VastVideoDownloadTaskListener;

public class VastVideoDownloadTaskFactory
{
  private static VastVideoDownloadTaskFactory instance = new VastVideoDownloadTaskFactory();

  public static VastVideoDownloadTask create(VastVideoDownloadTask.VastVideoDownloadTaskListener paramVastVideoDownloadTaskListener)
  {
    return instance.internalCreate(paramVastVideoDownloadTaskListener);
  }

  @Deprecated
  public static void setInstance(VastVideoDownloadTaskFactory paramVastVideoDownloadTaskFactory)
  {
    instance = paramVastVideoDownloadTaskFactory;
  }

  protected VastVideoDownloadTask internalCreate(VastVideoDownloadTask.VastVideoDownloadTaskListener paramVastVideoDownloadTaskListener)
  {
    return new VastVideoDownloadTask(paramVastVideoDownloadTaskListener);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.VastVideoDownloadTaskFactory
 * JD-Core Version:    0.6.2
 */