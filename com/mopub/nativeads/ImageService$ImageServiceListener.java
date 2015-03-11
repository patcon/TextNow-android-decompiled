package com.mopub.nativeads;

import android.graphics.Bitmap;
import java.util.Map;

abstract interface ImageService$ImageServiceListener
{
  public abstract void onFail();

  public abstract void onSuccess(Map<String, Bitmap> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageService.ImageServiceListener
 * JD-Core Version:    0.6.2
 */