package com.mopub.nativeads;

import android.graphics.Bitmap;
import com.mopub.common.logging.MoPubLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ImageService$ImageDiskTaskManagerListener
  implements TaskManager.TaskManagerListener<Bitmap>
{
  private final Map<String, Bitmap> mBitmaps;
  private final ImageService.ImageServiceListener mImageServiceListener;

  ImageService$ImageDiskTaskManagerListener(ImageService.ImageServiceListener paramImageServiceListener, Map<String, Bitmap> paramMap)
  {
    this.mImageServiceListener = paramImageServiceListener;
    this.mBitmaps = paramMap;
  }

  public void onFail()
  {
    this.mImageServiceListener.onFail();
  }

  public void onSuccess(Map<String, Bitmap> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry.getValue() == null)
      {
        localArrayList.add(localEntry.getKey());
      }
      else
      {
        ImageService.putBitmapInCache((String)localEntry.getKey(), (Bitmap)localEntry.getValue());
        this.mBitmaps.put(localEntry.getKey(), localEntry.getValue());
      }
    }
    if (localArrayList.isEmpty())
    {
      this.mImageServiceListener.onSuccess(this.mBitmaps);
      return;
    }
    try
    {
      ImageDownloadTaskManager localImageDownloadTaskManager = new ImageDownloadTaskManager(localArrayList, new ImageService.ImageDownloadResponseListener(this.mImageServiceListener, this.mBitmaps), ImageService.access$000());
      localImageDownloadTaskManager.execute();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      MoPubLog.d("Unable to initialize ImageDownloadTaskManager", localIllegalArgumentException);
      this.mImageServiceListener.onFail();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageService.ImageDiskTaskManagerListener
 * JD-Core Version:    0.6.2
 */