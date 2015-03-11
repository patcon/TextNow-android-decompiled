package com.mopub.nativeads;

import android.graphics.Bitmap;
import com.mopub.common.CacheService.DiskLruCacheGetListener;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class ImageDiskTaskManager$ImageDiskTaskListener
  implements CacheService.DiskLruCacheGetListener
{
  private final int mTargetWidth;

  ImageDiskTaskManager$ImageDiskTaskListener(ImageDiskTaskManager paramImageDiskTaskManager, int paramInt)
  {
    this.mTargetWidth = paramInt;
  }

  public void onComplete(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString == null)
      this.this$0.failAllTasks();
    do
    {
      return;
      Bitmap localBitmap = null;
      if (paramArrayOfByte != null)
        localBitmap = ImageService.byteArrayToBitmap(paramArrayOfByte, this.mTargetWidth);
      this.this$0.mResults.put(paramString, localBitmap);
    }
    while (this.this$0.mCompletedCount.incrementAndGet() != this.this$0.mSize);
    this.this$0.mImageTaskManagerListener.onSuccess(this.this$0.mResults);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageDiskTaskManager.ImageDiskTaskListener
 * JD-Core Version:    0.6.2
 */