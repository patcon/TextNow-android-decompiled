package com.mopub.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

public abstract class CustomEventNative
{
  protected abstract void loadNativeAd(Context paramContext, CustomEventNative.CustomEventNativeListener paramCustomEventNativeListener, Map<String, Object> paramMap, Map<String, String> paramMap1);

  final void preCacheImages(Context paramContext, List<String> paramList, final CustomEventNative.ImageListener paramImageListener)
  {
    ImageService.get(paramContext, paramList, new ImageService.ImageServiceListener()
    {
      public void onFail()
      {
        paramImageListener.onImagesFailedToCache(NativeErrorCode.IMAGE_DOWNLOAD_FAILURE);
      }

      public void onSuccess(Map<String, Bitmap> paramAnonymousMap)
      {
        paramImageListener.onImagesCached();
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.CustomEventNative
 * JD-Core Version:    0.6.2
 */