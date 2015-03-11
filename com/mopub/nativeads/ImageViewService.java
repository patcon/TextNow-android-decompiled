package com.mopub.nativeads;

import android.widget.ImageView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Utils;
import java.util.Arrays;
import java.util.WeakHashMap;

class ImageViewService
{
  private static final WeakHashMap<ImageView, Long> sImageViewRequestIds = new WeakHashMap();

  @Deprecated
  @VisibleForTesting
  static Long getImageViewUniqueId(ImageView paramImageView)
  {
    return (Long)sImageViewRequestIds.get(paramImageView);
  }

  static void loadImageView(String paramString, ImageView paramImageView)
  {
    if (paramImageView == null)
      MoPubLog.d("Attempted to load an image into a null ImageView");
    do
    {
      return;
      paramImageView.setImageDrawable(null);
    }
    while (paramString == null);
    long l = Utils.generateUniqueId();
    sImageViewRequestIds.put(paramImageView, Long.valueOf(l));
    ImageService.get(Arrays.asList(new String[] { paramString }), new ImageViewService.MyImageViewServiceListener(paramString, paramImageView, l));
  }

  @Deprecated
  @VisibleForTesting
  static void setImageViewUniqueId(ImageView paramImageView, long paramLong)
  {
    sImageViewRequestIds.put(paramImageView, Long.valueOf(paramLong));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageViewService
 * JD-Core Version:    0.6.2
 */