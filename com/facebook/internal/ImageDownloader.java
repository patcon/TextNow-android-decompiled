package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class ImageDownloader
{
  private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
  private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
  private static WorkQueue cacheReadQueue = new WorkQueue(2);
  private static WorkQueue downloadQueue = new WorkQueue(8);
  private static Handler handler;
  private static final Map<ImageDownloader.RequestKey, ImageDownloader.DownloaderContext> pendingRequests = new HashMap();

  public static boolean cancelRequest(ImageRequest paramImageRequest)
  {
    ImageDownloader.RequestKey localRequestKey = new ImageDownloader.RequestKey(paramImageRequest.getImageUri(), paramImageRequest.getCallerTag());
    while (true)
    {
      synchronized (pendingRequests)
      {
        ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.get(localRequestKey);
        if (localDownloaderContext != null)
        {
          if (localDownloaderContext.workItem.cancel())
          {
            pendingRequests.remove(localRequestKey);
            bool = true;
            return bool;
          }
          localDownloaderContext.isCancelled = true;
          bool = true;
        }
      }
      boolean bool = false;
    }
  }

  public static void clearCache(Context paramContext)
  {
    ImageResponseCache.clearCache(paramContext);
    UrlRedirectCache.clearCache(paramContext);
  }

  // ERROR //
  private static void download(ImageDownloader.RequestKey paramRequestKey, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: istore_3
    //   4: new 103	java/net/URL
    //   7: dup
    //   8: aload_0
    //   9: getfield 107	com/facebook/internal/ImageDownloader$RequestKey:uri	Ljava/net/URI;
    //   12: invokevirtual 113	java/net/URI:toString	()Ljava/lang/String;
    //   15: invokespecial 116	java/net/URL:<init>	(Ljava/lang/String;)V
    //   18: invokevirtual 120	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   21: checkcast 122	java/net/HttpURLConnection
    //   24: astore 10
    //   26: aload 10
    //   28: iconst_0
    //   29: invokevirtual 126	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   32: aload 10
    //   34: invokevirtual 130	java/net/HttpURLConnection:getResponseCode	()I
    //   37: lookupswitch	default:+35->72, 200:+242->279, 301:+138->175, 302:+138->175
    //   73: lconst_1
    //   74: invokevirtual 134	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   77: astore 24
    //   79: aload 24
    //   81: astore 6
    //   83: new 136	java/io/InputStreamReader
    //   86: dup
    //   87: aload 6
    //   89: invokespecial 139	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   92: astore 25
    //   94: sipush 128
    //   97: newarray char
    //   99: astore 26
    //   101: new 141	java/lang/StringBuilder
    //   104: dup
    //   105: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   108: astore 27
    //   110: aload 25
    //   112: aload 26
    //   114: iconst_0
    //   115: aload 26
    //   117: arraylength
    //   118: invokevirtual 146	java/io/InputStreamReader:read	([CII)I
    //   121: istore 28
    //   123: iload 28
    //   125: ifle +178 -> 303
    //   128: aload 27
    //   130: aload 26
    //   132: iconst_0
    //   133: iload 28
    //   135: invokevirtual 150	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: goto -29 -> 110
    //   142: astore 18
    //   144: aload 10
    //   146: astore 5
    //   148: aload 18
    //   150: astore 4
    //   152: aload 6
    //   154: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   157: aload 5
    //   159: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   162: iload_3
    //   163: ifeq +11 -> 174
    //   166: aload_0
    //   167: aload 4
    //   169: aload_2
    //   170: iconst_0
    //   171: invokestatic 164	com/facebook/internal/ImageDownloader:issueResponse	(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V
    //   174: return
    //   175: aload 10
    //   177: ldc 166
    //   179: invokevirtual 170	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   182: astore 21
    //   184: aload 21
    //   186: invokestatic 174	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   189: ifne +301 -> 490
    //   192: new 109	java/net/URI
    //   195: dup
    //   196: aload 21
    //   198: invokespecial 175	java/net/URI:<init>	(Ljava/lang/String;)V
    //   201: astore 22
    //   203: aload_1
    //   204: aload_0
    //   205: getfield 107	com/facebook/internal/ImageDownloader$RequestKey:uri	Ljava/net/URI;
    //   208: aload 22
    //   210: invokestatic 179	com/facebook/internal/UrlRedirectCache:cacheUriRedirect	(Landroid/content/Context;Ljava/net/URI;Ljava/net/URI;)V
    //   213: aload_0
    //   214: invokestatic 183	com/facebook/internal/ImageDownloader:removePendingRequest	(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    //   217: astore 23
    //   219: aload 23
    //   221: ifnull +33 -> 254
    //   224: aload 23
    //   226: getfield 88	com/facebook/internal/ImageDownloader$DownloaderContext:isCancelled	Z
    //   229: ifne +25 -> 254
    //   232: aload 23
    //   234: getfield 187	com/facebook/internal/ImageDownloader$DownloaderContext:request	Lcom/facebook/internal/ImageRequest;
    //   237: new 50	com/facebook/internal/ImageDownloader$RequestKey
    //   240: dup
    //   241: aload 22
    //   243: aload_0
    //   244: getfield 191	com/facebook/internal/ImageDownloader$RequestKey:tag	Ljava/lang/Object;
    //   247: invokespecial 63	com/facebook/internal/ImageDownloader$RequestKey:<init>	(Ljava/net/URI;Ljava/lang/Object;)V
    //   250: iconst_0
    //   251: invokestatic 195	com/facebook/internal/ImageDownloader:enqueueCacheRead	(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    //   254: iconst_0
    //   255: istore_3
    //   256: aconst_null
    //   257: astore 17
    //   259: aconst_null
    //   260: astore 6
    //   262: aload 6
    //   264: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   267: aload 10
    //   269: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   272: aload 17
    //   274: astore 4
    //   276: goto -114 -> 162
    //   279: aload_1
    //   280: aload 10
    //   282: invokestatic 199	com/facebook/internal/ImageResponseCache:interceptAndCacheImageStream	(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    //   285: astore 14
    //   287: aload 14
    //   289: astore 6
    //   291: aload 6
    //   293: invokestatic 205	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   296: astore_2
    //   297: aconst_null
    //   298: astore 17
    //   300: goto -38 -> 262
    //   303: aload 25
    //   305: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   308: new 207	com/facebook/FacebookException
    //   311: dup
    //   312: aload 27
    //   314: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokespecial 209	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   320: astore 17
    //   322: aconst_null
    //   323: astore_2
    //   324: goto -62 -> 262
    //   327: astore 16
    //   329: aload 10
    //   331: astore 7
    //   333: aload 16
    //   335: astore 4
    //   337: aload 6
    //   339: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   342: aload 7
    //   344: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   347: aconst_null
    //   348: astore_2
    //   349: goto -187 -> 162
    //   352: astore 8
    //   354: aconst_null
    //   355: astore 9
    //   357: aload_2
    //   358: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   361: aload 9
    //   363: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   366: aload 8
    //   368: athrow
    //   369: astore 13
    //   371: aload 10
    //   373: astore 9
    //   375: aload 13
    //   377: astore 8
    //   379: aconst_null
    //   380: astore_2
    //   381: goto -24 -> 357
    //   384: astore 15
    //   386: aload 6
    //   388: astore_2
    //   389: aload 10
    //   391: astore 9
    //   393: aload 15
    //   395: astore 8
    //   397: goto -40 -> 357
    //   400: astore 4
    //   402: aconst_null
    //   403: astore 7
    //   405: aconst_null
    //   406: astore 6
    //   408: goto -71 -> 337
    //   411: astore 12
    //   413: aload 10
    //   415: astore 7
    //   417: aload 12
    //   419: astore 4
    //   421: aconst_null
    //   422: astore 6
    //   424: goto -87 -> 337
    //   427: astore 20
    //   429: aload 10
    //   431: astore 7
    //   433: aload 20
    //   435: astore 4
    //   437: iconst_0
    //   438: istore_3
    //   439: aconst_null
    //   440: astore 6
    //   442: goto -105 -> 337
    //   445: astore 4
    //   447: aconst_null
    //   448: astore 5
    //   450: aconst_null
    //   451: astore 6
    //   453: goto -301 -> 152
    //   456: astore 11
    //   458: aload 10
    //   460: astore 5
    //   462: aload 11
    //   464: astore 4
    //   466: aconst_null
    //   467: astore 6
    //   469: goto -317 -> 152
    //   472: astore 19
    //   474: aload 10
    //   476: astore 5
    //   478: aload 19
    //   480: astore 4
    //   482: iconst_0
    //   483: istore_3
    //   484: aconst_null
    //   485: astore 6
    //   487: goto -335 -> 152
    //   490: iconst_0
    //   491: istore_3
    //   492: aconst_null
    //   493: astore_2
    //   494: aconst_null
    //   495: astore 17
    //   497: aconst_null
    //   498: astore 6
    //   500: goto -238 -> 262
    //
    // Exception table:
    //   from	to	target	type
    //   83	110	142	java/io/IOException
    //   110	123	142	java/io/IOException
    //   128	139	142	java/io/IOException
    //   291	297	142	java/io/IOException
    //   303	322	142	java/io/IOException
    //   83	110	327	java/net/URISyntaxException
    //   110	123	327	java/net/URISyntaxException
    //   128	139	327	java/net/URISyntaxException
    //   291	297	327	java/net/URISyntaxException
    //   303	322	327	java/net/URISyntaxException
    //   4	26	352	finally
    //   26	72	369	finally
    //   72	79	369	finally
    //   175	219	369	finally
    //   224	254	369	finally
    //   279	287	369	finally
    //   83	110	384	finally
    //   110	123	384	finally
    //   128	139	384	finally
    //   291	297	384	finally
    //   303	322	384	finally
    //   4	26	400	java/net/URISyntaxException
    //   26	72	411	java/net/URISyntaxException
    //   72	79	411	java/net/URISyntaxException
    //   279	287	411	java/net/URISyntaxException
    //   175	219	427	java/net/URISyntaxException
    //   224	254	427	java/net/URISyntaxException
    //   4	26	445	java/io/IOException
    //   26	72	456	java/io/IOException
    //   72	79	456	java/io/IOException
    //   279	287	456	java/io/IOException
    //   175	219	472	java/io/IOException
    //   224	254	472	java/io/IOException
  }

  public static void downloadAsync(ImageRequest paramImageRequest)
  {
    if (paramImageRequest == null)
      return;
    ImageDownloader.RequestKey localRequestKey = new ImageDownloader.RequestKey(paramImageRequest.getImageUri(), paramImageRequest.getCallerTag());
    while (true)
    {
      synchronized (pendingRequests)
      {
        ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.get(localRequestKey);
        if (localDownloaderContext != null)
        {
          localDownloaderContext.request = paramImageRequest;
          localDownloaderContext.isCancelled = false;
          localDownloaderContext.workItem.moveToFront();
          return;
        }
      }
      enqueueCacheRead(paramImageRequest, localRequestKey, paramImageRequest.isCachedRedirectAllowed());
    }
  }

  private static void enqueueCacheRead(ImageRequest paramImageRequest, ImageDownloader.RequestKey paramRequestKey, boolean paramBoolean)
  {
    enqueueRequest(paramImageRequest, paramRequestKey, cacheReadQueue, new ImageDownloader.CacheReadWorkItem(paramImageRequest.getContext(), paramRequestKey, paramBoolean));
  }

  private static void enqueueDownload(ImageRequest paramImageRequest, ImageDownloader.RequestKey paramRequestKey)
  {
    enqueueRequest(paramImageRequest, paramRequestKey, downloadQueue, new ImageDownloader.DownloadImageWorkItem(paramImageRequest.getContext(), paramRequestKey));
  }

  private static void enqueueRequest(ImageRequest paramImageRequest, ImageDownloader.RequestKey paramRequestKey, WorkQueue paramWorkQueue, Runnable paramRunnable)
  {
    synchronized (pendingRequests)
    {
      ImageDownloader.DownloaderContext localDownloaderContext = new ImageDownloader.DownloaderContext(null);
      localDownloaderContext.request = paramImageRequest;
      pendingRequests.put(paramRequestKey, localDownloaderContext);
      localDownloaderContext.workItem = paramWorkQueue.addActiveWorkItem(paramRunnable);
      return;
    }
  }

  private static Handler getHandler()
  {
    try
    {
      if (handler == null)
        handler = new Handler(Looper.getMainLooper());
      Handler localHandler = handler;
      return localHandler;
    }
    finally
    {
    }
  }

  private static void issueResponse(ImageDownloader.RequestKey paramRequestKey, final Exception paramException, final Bitmap paramBitmap, final boolean paramBoolean)
  {
    ImageDownloader.DownloaderContext localDownloaderContext = removePendingRequest(paramRequestKey);
    if ((localDownloaderContext != null) && (!localDownloaderContext.isCancelled))
    {
      ImageRequest localImageRequest = localDownloaderContext.request;
      final ImageRequest.Callback localCallback = localImageRequest.getCallback();
      if (localCallback != null)
        getHandler().post(new Runnable()
        {
          public final void run()
          {
            ImageResponse localImageResponse = new ImageResponse(ImageDownloader.this, paramException, paramBoolean, paramBitmap);
            localCallback.onCompleted(localImageResponse);
          }
        });
    }
  }

  public static void prioritizeRequest(ImageRequest paramImageRequest)
  {
    ImageDownloader.RequestKey localRequestKey = new ImageDownloader.RequestKey(paramImageRequest.getImageUri(), paramImageRequest.getCallerTag());
    synchronized (pendingRequests)
    {
      ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.get(localRequestKey);
      if (localDownloaderContext != null)
        localDownloaderContext.workItem.moveToFront();
      return;
    }
  }

  private static void readFromCache(ImageDownloader.RequestKey paramRequestKey, Context paramContext, boolean paramBoolean)
  {
    boolean bool3;
    InputStream localInputStream1;
    if (paramBoolean)
    {
      URI localURI = UrlRedirectCache.getRedirectedUri(paramContext, paramRequestKey.uri);
      if (localURI != null)
      {
        InputStream localInputStream2 = ImageResponseCache.getCachedImageStream(localURI, paramContext);
        boolean bool2 = false;
        if (localInputStream2 != null)
          bool2 = true;
        bool3 = bool2;
        localInputStream1 = localInputStream2;
      }
    }
    for (boolean bool1 = bool3; ; bool1 = false)
    {
      if (!bool1)
        localInputStream1 = ImageResponseCache.getCachedImageStream(paramRequestKey.uri, paramContext);
      if (localInputStream1 != null)
      {
        Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream1);
        Utility.closeQuietly(localInputStream1);
        issueResponse(paramRequestKey, null, localBitmap, bool1);
      }
      ImageDownloader.DownloaderContext localDownloaderContext;
      do
      {
        return;
        localDownloaderContext = removePendingRequest(paramRequestKey);
      }
      while ((localDownloaderContext == null) || (localDownloaderContext.isCancelled));
      enqueueDownload(localDownloaderContext.request, paramRequestKey);
      return;
      localInputStream1 = null;
    }
  }

  private static ImageDownloader.DownloaderContext removePendingRequest(ImageDownloader.RequestKey paramRequestKey)
  {
    synchronized (pendingRequests)
    {
      ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.remove(paramRequestKey);
      return localDownloaderContext;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageDownloader
 * JD-Core Version:    0.6.2
 */