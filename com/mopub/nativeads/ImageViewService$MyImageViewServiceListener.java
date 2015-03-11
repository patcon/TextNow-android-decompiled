package com.mopub.nativeads;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

class ImageViewService$MyImageViewServiceListener
  implements ImageService.ImageServiceListener
{
  private final WeakReference<ImageView> mImageView;
  private final long mUniqueId;
  private final String mUrl;

  ImageViewService$MyImageViewServiceListener(String paramString, ImageView paramImageView, long paramLong)
  {
    this.mUrl = paramString;
    this.mImageView = new WeakReference(paramImageView);
    this.mUniqueId = paramLong;
  }

  public void onFail()
  {
    MoPubLog.d("Failed to load image for ImageView");
  }

  public void onSuccess(Map<String, Bitmap> paramMap)
  {
    ImageView localImageView = (ImageView)this.mImageView.get();
    if ((localImageView == null) || (paramMap == null) || (!paramMap.containsKey(this.mUrl)));
    Long localLong;
    do
    {
      return;
      localLong = (Long)ImageViewService.access$000().get(localImageView);
    }
    while ((localLong == null) || (this.mUniqueId != localLong.longValue()));
    localImageView.setImageBitmap((Bitmap)paramMap.get(this.mUrl));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageViewService.MyImageViewServiceListener
 * JD-Core Version:    0.6.2
 */