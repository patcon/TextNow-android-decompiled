package com.mopub.common;

import android.graphics.Bitmap;
import textnow.e.e;

class CacheService$BitmapLruCache extends e<String, Bitmap>
{
  public CacheService$BitmapLruCache(int paramInt)
  {
    super(paramInt);
  }

  protected int sizeOf(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
      return paramBitmap.getRowBytes() * paramBitmap.getHeight();
    return super.sizeOf(paramString, paramBitmap);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.CacheService.BitmapLruCache
 * JD-Core Version:    0.6.2
 */