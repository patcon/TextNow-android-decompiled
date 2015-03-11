package com.mopub.nativeads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CacheService;
import com.mopub.common.DownloadResponse;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.VersionCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ImageService
{
  private static final int TWO_MEGABYTES = 2097152;
  private static int sTargetWidth = -1;

  public static Bitmap asBitmap(DownloadResponse paramDownloadResponse, int paramInt)
  {
    if (paramDownloadResponse == null)
      return null;
    return byteArrayToBitmap(paramDownloadResponse.getByteArray(), paramInt);
  }

  public static Bitmap byteArrayToBitmap(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt <= 0);
    Bitmap localBitmap1;
    do
    {
      return null;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
      for (localOptions.inSampleSize = calculateInSampleSize(localOptions.outWidth, paramInt); getMemBytes(localOptions) > 2097152L; localOptions.inSampleSize = (2 * localOptions.inSampleSize));
      localOptions.inJustDecodeBounds = false;
      localBitmap1 = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, localOptions);
    }
    while (localBitmap1 == null);
    if (localBitmap1.getWidth() > paramInt)
    {
      Bitmap localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, paramInt, (int)(localBitmap1.getHeight() * paramInt / localBitmap1.getWidth()), true);
      localBitmap1.recycle();
      return localBitmap2;
    }
    return localBitmap1;
  }

  public static int calculateInSampleSize(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt1 > paramInt2)
    {
      int j = paramInt1 / 2;
      while (j / i >= paramInt2)
        i *= 2;
    }
    return i;
  }

  @VisibleForTesting
  static void clear()
  {
    sTargetWidth = -1;
  }

  static void get(Context paramContext, List<String> paramList, ImageService.ImageServiceListener paramImageServiceListener)
  {
    initialize(paramContext);
    CacheService.initialize(paramContext);
    get(paramList, paramImageServiceListener);
  }

  static void get(List<String> paramList, ImageService.ImageServiceListener paramImageServiceListener)
  {
    HashMap localHashMap = new HashMap(paramList.size());
    List localList = getBitmapsFromMemoryCache(paramList, localHashMap);
    if (localList.isEmpty())
    {
      paramImageServiceListener.onSuccess(localHashMap);
      return;
    }
    try
    {
      ImageDiskTaskManager localImageDiskTaskManager = new ImageDiskTaskManager(localList, new ImageService.ImageDiskTaskManagerListener(paramImageServiceListener, localHashMap), sTargetWidth);
      localImageDiskTaskManager.execute();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      MoPubLog.d("Unable to initialize ImageDiskTaskManager", localIllegalArgumentException);
      paramImageServiceListener.onFail();
    }
  }

  @Deprecated
  static Bitmap getBitmapFromDiskCache(String paramString)
  {
    byte[] arrayOfByte = CacheService.getFromDiskCache(paramString);
    Bitmap localBitmap = null;
    if (arrayOfByte != null)
      localBitmap = byteArrayToBitmap(arrayOfByte, sTargetWidth);
    return localBitmap;
  }

  static Bitmap getBitmapFromMemoryCache(String paramString)
  {
    return CacheService.getFromBitmapCache(paramString);
  }

  static List<String> getBitmapsFromMemoryCache(List<String> paramList, Map<String, Bitmap> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Bitmap localBitmap = getBitmapFromMemoryCache(str);
      if (localBitmap != null)
        paramMap.put(str, localBitmap);
      else
        localArrayList.add(str);
    }
    return localArrayList;
  }

  public static long getMemBytes(BitmapFactory.Options paramOptions)
  {
    return 4L * paramOptions.outWidth * paramOptions.outHeight / paramOptions.inSampleSize / paramOptions.inSampleSize;
  }

  @VisibleForTesting
  static int getTargetWidth()
  {
    return sTargetWidth;
  }

  @TargetApi(13)
  @VisibleForTesting
  static void initialize(Context paramContext)
  {
    Display localDisplay;
    Point localPoint;
    if (sTargetWidth == -1)
    {
      localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      localPoint = new Point();
      if (!VersionCode.currentApiLevel().isBelow(VersionCode.HONEYCOMB_MR2))
        break label69;
      localPoint.set(localDisplay.getWidth(), localDisplay.getHeight());
    }
    while (true)
    {
      sTargetWidth = Math.min(localPoint.x, localPoint.y);
      return;
      label69: localDisplay.getSize(localPoint);
    }
  }

  static void putBitmapInCache(String paramString, Bitmap paramBitmap)
  {
    CacheService.putToBitmapCache(paramString, paramBitmap);
  }

  static void putDataInCache(String paramString, Bitmap paramBitmap, byte[] paramArrayOfByte)
  {
    CacheService.putToBitmapCache(paramString, paramBitmap);
    CacheService.putToDiskCacheAsync(paramString, paramArrayOfByte);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImageService
 * JD-Core Version:    0.6.2
 */