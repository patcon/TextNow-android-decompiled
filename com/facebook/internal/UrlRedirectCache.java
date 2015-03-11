package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;

class UrlRedirectCache
{
  private static final String REDIRECT_CONTENT_TAG = TAG + "_Redirect";
  static final String TAG = UrlRedirectCache.class.getSimpleName();
  private static volatile FileLruCache urlRedirectCache;

  // ERROR //
  static void cacheUriRedirect(Context paramContext, java.net.URI paramURI1, java.net.URI paramURI2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_2
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: aconst_null
    //   10: astore_3
    //   11: aload_0
    //   12: invokestatic 44	com/facebook/internal/UrlRedirectCache:getCache	(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //   15: aload_1
    //   16: invokevirtual 47	java/net/URI:toString	()Ljava/lang/String;
    //   19: getstatic 35	com/facebook/internal/UrlRedirectCache:REDIRECT_CONTENT_TAG	Ljava/lang/String;
    //   22: invokevirtual 53	com/facebook/internal/FileLruCache:openPutStream	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //   25: astore 8
    //   27: aload 8
    //   29: astore_3
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 47	java/net/URI:toString	()Ljava/lang/String;
    //   35: invokevirtual 59	java/lang/String:getBytes	()[B
    //   38: invokevirtual 65	java/io/OutputStream:write	([B)V
    //   41: aload_3
    //   42: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   45: return
    //   46: astore 7
    //   48: aload_3
    //   49: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   52: return
    //   53: astore 4
    //   55: aconst_null
    //   56: astore 5
    //   58: aload 4
    //   60: astore 6
    //   62: aload 5
    //   64: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   67: aload 6
    //   69: athrow
    //   70: astore 9
    //   72: aload_3
    //   73: astore 5
    //   75: aload 9
    //   77: astore 6
    //   79: goto -17 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   11	27	46	java/io/IOException
    //   30	41	46	java/io/IOException
    //   11	27	53	finally
    //   30	41	70	finally
  }

  static void clearCache(Context paramContext)
  {
    try
    {
      getCache(paramContext).clearCache();
      return;
    }
    catch (IOException localIOException)
    {
      Logger.log(LoggingBehavior.CACHE, 5, TAG, "clearCache failed " + localIOException.getMessage());
    }
  }

  static FileLruCache getCache(Context paramContext)
  {
    try
    {
      if (urlRedirectCache == null)
        urlRedirectCache = new FileLruCache(paramContext.getApplicationContext(), TAG, new FileLruCache.Limits());
      FileLruCache localFileLruCache = urlRedirectCache;
      return localFileLruCache;
    }
    finally
    {
    }
  }

  // ERROR //
  static java.net.URI getRedirectedUri(Context paramContext, java.net.URI paramURI)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: ifnonnull +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_1
    //   9: invokevirtual 47	java/net/URI:toString	()Ljava/lang/String;
    //   12: astore_3
    //   13: aload_0
    //   14: invokestatic 44	com/facebook/internal/UrlRedirectCache:getCache	(Landroid/content/Context;)Lcom/facebook/internal/FileLruCache;
    //   17: astore 9
    //   19: aload_3
    //   20: astore 10
    //   22: aconst_null
    //   23: astore 11
    //   25: aload 9
    //   27: aload 10
    //   29: getstatic 35	com/facebook/internal/UrlRedirectCache:REDIRECT_CONTENT_TAG	Ljava/lang/String;
    //   32: invokevirtual 114	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   35: astore 14
    //   37: aload 14
    //   39: ifnull +96 -> 135
    //   42: new 116	java/io/InputStreamReader
    //   45: dup
    //   46: aload 14
    //   48: invokespecial 119	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   51: astore 5
    //   53: sipush 128
    //   56: newarray char
    //   58: astore 17
    //   60: new 21	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 24	java/lang/StringBuilder:<init>	()V
    //   67: astore 18
    //   69: aload 5
    //   71: aload 17
    //   73: iconst_0
    //   74: aload 17
    //   76: arraylength
    //   77: invokevirtual 123	java/io/InputStreamReader:read	([CII)I
    //   80: istore 19
    //   82: iload 19
    //   84: ifle +26 -> 110
    //   87: aload 18
    //   89: aload 17
    //   91: iconst_0
    //   92: iload 19
    //   94: invokevirtual 126	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: goto -29 -> 69
    //   101: astore 16
    //   103: aload 5
    //   105: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   108: aconst_null
    //   109: areturn
    //   110: aload 5
    //   112: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   115: aload 18
    //   117: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: astore 21
    //   122: aload 21
    //   124: astore 10
    //   126: aload 5
    //   128: astore 11
    //   130: iconst_1
    //   131: istore_2
    //   132: goto -107 -> 25
    //   135: iload_2
    //   136: ifeq +22 -> 158
    //   139: new 46	java/net/URI
    //   142: dup
    //   143: aload 10
    //   145: invokespecial 129	java/net/URI:<init>	(Ljava/lang/String;)V
    //   148: astore 22
    //   150: aload 11
    //   152: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   155: aload 22
    //   157: areturn
    //   158: aload 11
    //   160: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   163: aconst_null
    //   164: areturn
    //   165: astore 8
    //   167: aconst_null
    //   168: astore 5
    //   170: aload 5
    //   172: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   175: aconst_null
    //   176: areturn
    //   177: astore 6
    //   179: aconst_null
    //   180: astore 5
    //   182: aload 6
    //   184: astore 7
    //   186: aload 5
    //   188: invokestatic 71	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   191: aload 7
    //   193: athrow
    //   194: astore 7
    //   196: goto -10 -> 186
    //   199: astore 7
    //   201: aload 11
    //   203: astore 5
    //   205: goto -19 -> 186
    //   208: astore 15
    //   210: goto -40 -> 170
    //   213: astore 13
    //   215: aload 11
    //   217: astore 5
    //   219: goto -49 -> 170
    //   222: astore 4
    //   224: aconst_null
    //   225: astore 5
    //   227: goto -124 -> 103
    //   230: astore 12
    //   232: aload 11
    //   234: astore 5
    //   236: goto -133 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   53	69	101	java/net/URISyntaxException
    //   69	82	101	java/net/URISyntaxException
    //   87	98	101	java/net/URISyntaxException
    //   110	122	101	java/net/URISyntaxException
    //   13	19	165	java/io/IOException
    //   13	19	177	finally
    //   53	69	194	finally
    //   69	82	194	finally
    //   87	98	194	finally
    //   110	122	194	finally
    //   25	37	199	finally
    //   42	53	199	finally
    //   139	150	199	finally
    //   53	69	208	java/io/IOException
    //   69	82	208	java/io/IOException
    //   87	98	208	java/io/IOException
    //   110	122	208	java/io/IOException
    //   25	37	213	java/io/IOException
    //   42	53	213	java/io/IOException
    //   139	150	213	java/io/IOException
    //   13	19	222	java/net/URISyntaxException
    //   25	37	230	java/net/URISyntaxException
    //   42	53	230	java/net/URISyntaxException
    //   139	150	230	java/net/URISyntaxException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.UrlRedirectCache
 * JD-Core Version:    0.6.2
 */