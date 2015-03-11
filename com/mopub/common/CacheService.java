package com.mopub.common;

import android.content.Context;
import android.graphics.Bitmap;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Utils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import textnow.e.e;

public class CacheService
{
  private static final int APP_VERSION = 1;
  private static final int DISK_CACHE_INDEX = 0;
  static final String UNIQUE_CACHE_NAME = "mopub-cache";
  private static final int VALUE_COUNT = 1;
  private static CacheService.BitmapLruCache sBitmapLruCache;
  private static DiskLruCache sDiskLruCache;

  @Deprecated
  @VisibleForTesting
  public static void clearAndNullCaches()
  {
    if (sDiskLruCache != null);
    try
    {
      sDiskLruCache.delete();
      sDiskLruCache = null;
      if (sBitmapLruCache != null)
      {
        sBitmapLruCache.evictAll();
        sBitmapLruCache = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        sDiskLruCache = null;
    }
  }

  public static boolean containsKeyDiskCache(String paramString)
  {
    if (sDiskLruCache == null);
    while (true)
    {
      return false;
      try
      {
        DiskLruCache.Snapshot localSnapshot = sDiskLruCache.get(createValidDiskCacheKey(paramString));
        if (localSnapshot != null)
          return true;
      }
      catch (Exception localException)
      {
      }
    }
    return false;
  }

  public static String createValidDiskCacheKey(String paramString)
  {
    return Utils.sha1(paramString);
  }

  @Deprecated
  @VisibleForTesting
  public static e<String, Bitmap> getBitmapLruCache()
  {
    return sBitmapLruCache;
  }

  public static File getDiskCacheDirectory(Context paramContext)
  {
    String str = paramContext.getCacheDir().getPath();
    return new File(str + File.separator + "mopub-cache");
  }

  @Deprecated
  @VisibleForTesting
  public static DiskLruCache getDiskLruCache()
  {
    return sDiskLruCache;
  }

  public static String getFilePathDiskCache(String paramString)
  {
    if (sDiskLruCache == null)
      return null;
    return sDiskLruCache.getDirectory() + File.separator + createValidDiskCacheKey(paramString) + "." + 0;
  }

  public static Bitmap getFromBitmapCache(String paramString)
  {
    if (sBitmapLruCache == null)
      return null;
    return (Bitmap)sBitmapLruCache.get(paramString);
  }

  // ERROR //
  public static byte[] getFromDiskCache(String paramString)
  {
    // Byte code:
    //   0: getstatic 29	com/mopub/common/CacheService:sDiskLruCache	Lcom/mopub/common/DiskLruCache;
    //   3: astore_1
    //   4: aconst_null
    //   5: astore_2
    //   6: aload_1
    //   7: ifnonnull +5 -> 12
    //   10: aload_2
    //   11: areturn
    //   12: getstatic 29	com/mopub/common/CacheService:sDiskLruCache	Lcom/mopub/common/DiskLruCache;
    //   15: aload_0
    //   16: invokestatic 49	com/mopub/common/CacheService:createValidDiskCacheKey	(Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual 53	com/mopub/common/DiskLruCache:get	(Ljava/lang/String;)Lcom/mopub/common/DiskLruCache$Snapshot;
    //   22: astore 7
    //   24: aload 7
    //   26: astore 4
    //   28: aload 4
    //   30: ifnonnull +17 -> 47
    //   33: aconst_null
    //   34: astore_2
    //   35: aload 4
    //   37: ifnull -27 -> 10
    //   40: aload 4
    //   42: invokevirtual 118	com/mopub/common/DiskLruCache$Snapshot:close	()V
    //   45: aconst_null
    //   46: areturn
    //   47: aload 4
    //   49: iconst_0
    //   50: invokevirtual 122	com/mopub/common/DiskLruCache$Snapshot:getInputStream	(I)Ljava/io/InputStream;
    //   53: astore 8
    //   55: aconst_null
    //   56: astore_2
    //   57: aload 8
    //   59: ifnull +40 -> 99
    //   62: aload 4
    //   64: iconst_0
    //   65: invokevirtual 126	com/mopub/common/DiskLruCache$Snapshot:getLength	(I)J
    //   68: l2i
    //   69: newarray byte
    //   71: astore 9
    //   73: new 128	java/io/BufferedInputStream
    //   76: dup
    //   77: aload 8
    //   79: invokespecial 131	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   82: astore 10
    //   84: aload 10
    //   86: aload 9
    //   88: invokestatic 137	com/mopub/common/util/Streams:readStream	(Ljava/io/InputStream;[B)V
    //   91: aload 10
    //   93: invokestatic 141	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   96: aload 9
    //   98: astore_2
    //   99: aload 4
    //   101: ifnull -91 -> 10
    //   104: aload 4
    //   106: invokevirtual 118	com/mopub/common/DiskLruCache$Snapshot:close	()V
    //   109: aload_2
    //   110: areturn
    //   111: astore 11
    //   113: aload 10
    //   115: invokestatic 141	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   118: aload 11
    //   120: athrow
    //   121: astore 12
    //   123: aload 9
    //   125: astore_2
    //   126: aload 12
    //   128: astore_3
    //   129: ldc 143
    //   131: aload_3
    //   132: invokestatic 149	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   135: aload 4
    //   137: ifnull -127 -> 10
    //   140: aload 4
    //   142: invokevirtual 118	com/mopub/common/DiskLruCache$Snapshot:close	()V
    //   145: aload_2
    //   146: areturn
    //   147: astore 6
    //   149: aconst_null
    //   150: astore 4
    //   152: aload 6
    //   154: astore 5
    //   156: aload 4
    //   158: ifnull +8 -> 166
    //   161: aload 4
    //   163: invokevirtual 118	com/mopub/common/DiskLruCache$Snapshot:close	()V
    //   166: aload 5
    //   168: athrow
    //   169: astore 5
    //   171: goto -15 -> 156
    //   174: astore_3
    //   175: aconst_null
    //   176: astore_2
    //   177: aconst_null
    //   178: astore 4
    //   180: goto -51 -> 129
    //   183: astore_3
    //   184: aconst_null
    //   185: astore_2
    //   186: goto -57 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   84	91	111	finally
    //   73	84	121	java/lang/Exception
    //   91	96	121	java/lang/Exception
    //   113	121	121	java/lang/Exception
    //   12	24	147	finally
    //   47	55	169	finally
    //   62	73	169	finally
    //   73	84	169	finally
    //   91	96	169	finally
    //   113	121	169	finally
    //   129	135	169	finally
    //   12	24	174	java/lang/Exception
    //   47	55	183	java/lang/Exception
    //   62	73	183	java/lang/Exception
  }

  public static void getFromDiskCacheAsync(String paramString, CacheService.DiskLruCacheGetListener paramDiskLruCacheGetListener)
  {
    new CacheService.DiskLruCacheGetTask(paramString, paramDiskLruCacheGetListener).execute(new Void[0]);
  }

  public static void initialize(Context paramContext)
  {
    initializeBitmapCache(paramContext);
    initializeDiskCache(paramContext);
  }

  public static boolean initializeBitmapCache(Context paramContext)
  {
    if (paramContext == null)
      return false;
    if (sBitmapLruCache == null)
      sBitmapLruCache = new CacheService.BitmapLruCache(DeviceUtils.memoryCacheSizeBytes(paramContext));
    return true;
  }

  public static boolean initializeDiskCache(Context paramContext)
  {
    boolean bool = true;
    if (paramContext == null)
      bool = false;
    while (sDiskLruCache != null)
      return bool;
    File localFile = getDiskCacheDirectory(paramContext);
    long l = DeviceUtils.diskCacheSizeBytes(localFile);
    try
    {
      sDiskLruCache = DiskLruCache.open(localFile, 1, 1, l);
      return bool;
    }
    catch (IOException localIOException)
    {
      MoPubLog.d("Unable to create DiskLruCache", localIOException);
    }
    return bool;
  }

  public static void putToBitmapCache(String paramString, Bitmap paramBitmap)
  {
    if (sBitmapLruCache == null)
      return;
    sBitmapLruCache.put(paramString, paramBitmap);
  }

  public static boolean putToDiskCache(String paramString, InputStream paramInputStream)
  {
    if (sDiskLruCache == null);
    DiskLruCache.Editor localEditor;
    do
      while (true)
      {
        return false;
        localEditor = null;
        try
        {
          localEditor = sDiskLruCache.edit(createValidDiskCacheKey(paramString));
          if (localEditor != null)
          {
            BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(localEditor.newOutputStream(0));
            Streams.copyContent(paramInputStream, localBufferedOutputStream);
            localBufferedOutputStream.flush();
            localBufferedOutputStream.close();
            sDiskLruCache.flush();
            localEditor.commit();
            return true;
          }
        }
        catch (Exception localException)
        {
          MoPubLog.d("Unable to put to DiskLruCache", localException);
        }
      }
    while (localEditor == null);
    try
    {
      localEditor.abort();
      return false;
    }
    catch (IOException localIOException)
    {
    }
    return false;
  }

  public static boolean putToDiskCache(String paramString, byte[] paramArrayOfByte)
  {
    return putToDiskCache(paramString, new ByteArrayInputStream(paramArrayOfByte));
  }

  public static void putToDiskCacheAsync(String paramString, byte[] paramArrayOfByte)
  {
    new CacheService.DiskLruCachePutTask(paramString, paramArrayOfByte).execute(new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.CacheService
 * JD-Core Version:    0.6.2
 */