package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.Settings;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class FileLruCache
{
  private static final String HEADER_CACHEKEY_KEY = "key";
  private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
  static final String TAG = FileLruCache.class.getSimpleName();
  private static final AtomicLong bufferIndex = new AtomicLong();
  private final File directory;
  private boolean isTrimPending;
  private AtomicLong lastClearCacheTime = new AtomicLong(0L);
  private final FileLruCache.Limits limits;
  private final Object lock;
  private final String tag;

  public FileLruCache(Context paramContext, String paramString, FileLruCache.Limits paramLimits)
  {
    this.tag = paramString;
    this.limits = paramLimits;
    this.directory = new File(paramContext.getCacheDir(), paramString);
    this.lock = new Object();
    if ((this.directory.mkdirs()) || (this.directory.isDirectory()))
      FileLruCache.BufferFile.deleteAll(this.directory);
  }

  private void postTrim()
  {
    synchronized (this.lock)
    {
      if (!this.isTrimPending)
      {
        this.isTrimPending = true;
        Settings.getExecutor().execute(new Runnable()
        {
          public void run()
          {
            FileLruCache.this.trim();
          }
        });
      }
      return;
    }
  }

  private void renameToTargetAndTrim(String paramString, File paramFile)
  {
    if (!paramFile.renameTo(new File(this.directory, Utility.md5hash(paramString))))
      paramFile.delete();
    postTrim();
  }

  private void trim()
  {
    try
    {
      Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
      PriorityQueue localPriorityQueue = new PriorityQueue();
      l1 = 0L;
      l2 = 0L;
      File[] arrayOfFile = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        int j = 0;
        while (j < i)
        {
          File localFile1 = arrayOfFile[j];
          FileLruCache.ModifiedFile localModifiedFile = new FileLruCache.ModifiedFile(localFile1);
          localPriorityQueue.add(localModifiedFile);
          Logger.log(LoggingBehavior.CACHE, TAG, "  trim considering time=" + Long.valueOf(localModifiedFile.getModified()) + " name=" + localModifiedFile.getFile().getName());
          long l3 = l1 + localFile1.length();
          long l4 = l2 + 1L;
          j++;
          l2 = l4;
          l1 = l3;
        }
        Object localObject4;
        Object localObject5;
        while ((localObject4 > this.limits.getByteCount()) || (localObject5 > this.limits.getFileCount()))
        {
          File localFile2 = ((FileLruCache.ModifiedFile)localPriorityQueue.remove()).getFile();
          Logger.log(LoggingBehavior.CACHE, TAG, "  trim removing " + localFile2.getName());
          localObject4 -= localFile2.length();
          long l8 = localObject5 - 1L;
          localFile2.delete();
          l7 = l8;
        }
        synchronized (this.lock)
        {
          this.isTrimPending = false;
          this.lock.notifyAll();
          return;
        }
      }
    }
    finally
    {
      while (true)
      {
        long l1;
        long l2;
        synchronized (this.lock)
        {
          this.isTrimPending = false;
          this.lock.notifyAll();
          throw localObject1;
        }
        long l5 = l2;
        long l6 = l1;
        long l7 = l5;
      }
    }
  }

  public final void clearCache()
  {
    final File[] arrayOfFile = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
    this.lastClearCacheTime.set(System.currentTimeMillis());
    if (arrayOfFile != null)
      Settings.getExecutor().execute(new Runnable()
      {
        public void run()
        {
          File[] arrayOfFile = arrayOfFile;
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            arrayOfFile[j].delete();
        }
      });
  }

  public final InputStream get(String paramString)
  {
    return get(paramString, null);
  }

  public final InputStream get(String paramString1, String paramString2)
  {
    File localFile = new File(this.directory, Utility.md5hash(paramString1));
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream, 8192);
      try
      {
        JSONObject localJSONObject = FileLruCache.StreamHeader.readHeader(localBufferedInputStream);
        if (localJSONObject == null)
          return null;
        String str1 = localJSONObject.optString("key");
        if (str1 != null)
        {
          boolean bool1 = str1.equals(paramString1);
          if (bool1);
        }
        else
        {
          return null;
        }
        String str2 = localJSONObject.optString("tag", null);
        if ((paramString2 != null) || (str2 == null))
        {
          if (paramString2 != null)
          {
            boolean bool2 = paramString2.equals(str2);
            if (bool2);
          }
        }
        else
          return null;
        long l = new Date().getTime();
        Logger.log(LoggingBehavior.CACHE, TAG, "Setting lastModified to " + Long.valueOf(l) + " for " + localFile.getName());
        localFile.setLastModified(l);
        return localBufferedInputStream;
      }
      finally
      {
        localBufferedInputStream.close();
      }
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  public final InputStream interceptAndPut(String paramString, InputStream paramInputStream)
  {
    return new FileLruCache.CopyingInputStream(paramInputStream, openPutStream(paramString));
  }

  final OutputStream openPutStream(String paramString)
  {
    return openPutStream(paramString, null);
  }

  // ERROR //
  public final OutputStream openPutStream(final String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/facebook/internal/FileLruCache:directory	Ljava/io/File;
    //   4: invokestatic 302	com/facebook/internal/FileLruCache$BufferFile:newFile	(Ljava/io/File;)Ljava/io/File;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 126	java/io/File:delete	()Z
    //   12: pop
    //   13: aload_3
    //   14: invokevirtual 305	java/io/File:createNewFile	()Z
    //   17: ifne +34 -> 51
    //   20: new 236	java/io/IOException
    //   23: dup
    //   24: new 163	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 164	java/lang/StringBuilder:<init>	()V
    //   31: ldc_w 307
    //   34: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: aload_3
    //   38: invokevirtual 310	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: new 315	java/io/FileOutputStream
    //   54: dup
    //   55: aload_3
    //   56: invokespecial 316	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   59: astore 5
    //   61: new 318	java/io/BufferedOutputStream
    //   64: dup
    //   65: new 320	com/facebook/internal/FileLruCache$CloseCallbackOutputStream
    //   68: dup
    //   69: aload 5
    //   71: new 322	com/facebook/internal/FileLruCache$1
    //   74: dup
    //   75: aload_0
    //   76: invokestatic 221	java/lang/System:currentTimeMillis	()J
    //   79: aload_3
    //   80: aload_1
    //   81: invokespecial 325	com/facebook/internal/FileLruCache$1:<init>	(Lcom/facebook/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    //   84: invokespecial 328	com/facebook/internal/FileLruCache$CloseCallbackOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V
    //   87: sipush 8192
    //   90: invokespecial 331	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   93: astore 6
    //   95: new 255	org/json/JSONObject
    //   98: dup
    //   99: invokespecial 332	org/json/JSONObject:<init>	()V
    //   102: astore 7
    //   104: aload 7
    //   106: ldc 8
    //   108: aload_1
    //   109: invokevirtual 336	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   112: pop
    //   113: aload_2
    //   114: invokestatic 340	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   117: ifne +12 -> 129
    //   120: aload 7
    //   122: ldc 11
    //   124: aload_2
    //   125: invokevirtual 336	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   128: pop
    //   129: aload 6
    //   131: aload 7
    //   133: invokestatic 344	com/facebook/internal/FileLruCache$StreamHeader:writeHeader	(Ljava/io/OutputStream;Lorg/json/JSONObject;)V
    //   136: aload 6
    //   138: areturn
    //   139: astore 12
    //   141: getstatic 134	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   144: iconst_5
    //   145: getstatic 33	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   148: new 163	java/lang/StringBuilder
    //   151: dup
    //   152: invokespecial 164	java/lang/StringBuilder:<init>	()V
    //   155: ldc_w 346
    //   158: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 12
    //   163: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 349	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   172: new 236	java/io/IOException
    //   175: dup
    //   176: aload 12
    //   178: invokevirtual 352	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   181: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   184: athrow
    //   185: astore 9
    //   187: getstatic 134	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   190: iconst_5
    //   191: getstatic 33	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   194: new 163	java/lang/StringBuilder
    //   197: dup
    //   198: invokespecial 164	java/lang/StringBuilder:<init>	()V
    //   201: ldc_w 354
    //   204: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: aload 9
    //   209: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   212: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: invokestatic 349	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   218: new 236	java/io/IOException
    //   221: dup
    //   222: aload 9
    //   224: invokevirtual 355	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   227: invokespecial 313	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   230: athrow
    //   231: astore 8
    //   233: aload 6
    //   235: invokevirtual 356	java/io/BufferedOutputStream:close	()V
    //   238: aload 8
    //   240: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   51	61	139	java/io/FileNotFoundException
    //   95	129	185	org/json/JSONException
    //   129	136	185	org/json/JSONException
    //   95	129	231	finally
    //   129	136	231	finally
    //   187	231	231	finally
  }

  final long sizeInBytesForTest()
  {
    long l1;
    synchronized (this.lock)
    {
      while (true)
      {
        boolean bool = this.isTrimPending;
        if (!bool)
          break;
        try
        {
          this.lock.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
      File[] arrayOfFile = this.directory.listFiles();
      l1 = 0L;
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          long l2 = l1 + arrayOfFile[j].length();
          j++;
          l1 = l2;
        }
      }
    }
    return l1;
  }

  public final String toString()
  {
    return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache
 * JD-Core Version:    0.6.2
 */