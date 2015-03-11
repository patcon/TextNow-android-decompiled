package com.mopub.nativeads;

import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

class ImageDownloadTaskManager extends TaskManager<DownloadResponse>
{
  private final Map<HttpUriRequest, DownloadTask> mDownloadTasks;
  private final int mRequestedWidth;

  ImageDownloadTaskManager(List<String> paramList, TaskManager.TaskManagerListener<DownloadResponse> paramTaskManagerListener, int paramInt)
  {
    super(paramList, paramTaskManagerListener);
    this.mRequestedWidth = paramInt;
    ImageDownloadTaskManager.ImageDownloadTaskListener localImageDownloadTaskListener = new ImageDownloadTaskManager.ImageDownloadTaskListener(this, null);
    this.mDownloadTasks = new HashMap(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      HttpGet localHttpGet = new HttpGet((String)localIterator.next());
      this.mDownloadTasks.put(localHttpGet, new DownloadTask(localImageDownloadTaskListener));
    }
  }

  void execute()
  {
    if (this.mDownloadTasks.isEmpty())
      this.mImageTaskManagerListener.onSuccess(this.mResults);
    Iterator localIterator = this.mDownloadTasks.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      HttpUriRequest localHttpUriRequest = (HttpUriRequest)localEntry.getKey();
      DownloadTask localDownloadTask = (DownloadTask)localEntry.getValue();
      try
      {
        AsyncTasks.safeExecuteOnExecutor(localDownloadTask, new HttpUriRequest[] { localHttpUriRequest });
      }
      catch (Exception localException)
      {
        MoPubLog.d("Failed to download image", localException);
        this.mImageTaskManagerListener.onFail();
      }
    }
  }

  void failAllTasks()
  {
    if (this.mFailed.compareAndSet(false, true))
    {
      Iterator localIterator = this.mDownloadTasks.values().iterator();
      while (localIterator.hasNext())
        ((DownloadTask)localIterator.next()).cancel(true);
      this.mImageTaskManagerListener.onFail();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageDownloadTaskManager
 * JD-Core Version:    0.6.2
 */