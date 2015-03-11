package com.mopub.nativeads;

import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask.DownloadTaskListener;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class ImageDownloadTaskManager$ImageDownloadTaskListener
  implements DownloadTask.DownloadTaskListener
{
  private ImageDownloadTaskManager$ImageDownloadTaskListener(ImageDownloadTaskManager paramImageDownloadTaskManager)
  {
  }

  public void onComplete(String paramString, DownloadResponse paramDownloadResponse)
  {
    if ((paramDownloadResponse == null) || (paramDownloadResponse.getStatusCode() != 200))
    {
      MoPubLog.d("Failed to download image: " + paramString);
      this.this$0.failAllTasks();
    }
    do
    {
      return;
      MoPubLog.d("Successfully downloaded image bye array: " + paramString);
      this.this$0.mResults.put(paramString, paramDownloadResponse);
    }
    while (this.this$0.mCompletedCount.incrementAndGet() != this.this$0.mSize);
    this.this$0.mImageTaskManagerListener.onSuccess(this.this$0.mResults);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageDownloadTaskManager.ImageDownloadTaskListener
 * JD-Core Version:    0.6.2
 */