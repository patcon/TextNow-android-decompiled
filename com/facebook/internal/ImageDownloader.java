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
    //   24: astore 11
    //   26: aload 11
    //   28: iconst_0
    //   29: invokevirtual 126	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   32: aload 11
    //   34: invokevirtual 130	java/net/HttpURLConnection:getResponseCode	()I
    //   37: lookupswitch	default:+35->72, 200:+247->284, 301:+143->180, 302:+143->180
    //   73: fconst_0
    //   74: invokevirtual 134	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   77: astore 25
    //   79: aload 25
    //   81: astore 6
    //   83: new 136	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   90: astore 26
    //   92: aload 6
    //   94: ifnull +263 -> 357
    //   97: new 139	java/io/InputStreamReader
    //   100: dup
    //   101: aload 6
    //   103: invokespecial 142	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   106: astore 27
    //   108: sipush 128
    //   111: newarray char
    //   113: astore 28
    //   115: aload 27
    //   117: aload 28
    //   119: iconst_0
    //   120: aload 28
    //   122: arraylength
    //   123: invokevirtual 146	java/io/InputStreamReader:read	([CII)I
    //   126: istore 29
    //   128: iload 29
    //   130: ifle +178 -> 308
    //   133: aload 26
    //   135: aload 28
    //   137: iconst_0
    //   138: iload 29
    //   140: invokevirtual 150	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: goto -29 -> 115
    //   147: astore 19
    //   149: aload 11
    //   151: astore 5
    //   153: aload 19
    //   155: astore 4
    //   157: aload 6
    //   159: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   162: aload 5
    //   164: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   167: iload_3
    //   168: ifeq +11 -> 179
    //   171: aload_0
    //   172: aload 4
    //   174: aload_2
    //   175: iconst_0
    //   176: invokestatic 164	com/facebook/internal/ImageDownloader:issueResponse	(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V
    //   179: return
    //   180: aload 11
    //   182: ldc 166
    //   184: invokevirtual 170	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   187: astore 22
    //   189: aload 22
    //   191: invokestatic 174	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   194: ifne +323 -> 517
    //   197: new 109	java/net/URI
    //   200: dup
    //   201: aload 22
    //   203: invokespecial 175	java/net/URI:<init>	(Ljava/lang/String;)V
    //   206: astore 23
    //   208: aload_1
    //   209: aload_0
    //   210: getfield 107	com/facebook/internal/ImageDownloader$RequestKey:uri	Ljava/net/URI;
    //   213: aload 23
    //   215: invokestatic 179	com/facebook/internal/UrlRedirectCache:cacheUriRedirect	(Landroid/content/Context;Ljava/net/URI;Ljava/net/URI;)V
    //   218: aload_0
    //   219: invokestatic 183	com/facebook/internal/ImageDownloader:removePendingRequest	(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    //   222: astore 24
    //   224: aload 24
    //   226: ifnull +33 -> 259
    //   229: aload 24
    //   231: getfield 88	com/facebook/internal/ImageDownloader$DownloaderContext:isCancelled	Z
    //   234: ifne +25 -> 259
    //   237: aload 24
    //   239: getfield 187	com/facebook/internal/ImageDownloader$DownloaderContext:request	Lcom/facebook/internal/ImageRequest;
    //   242: new 50	com/facebook/internal/ImageDownloader$RequestKey
    //   245: dup
    //   246: aload 23
    //   248: aload_0
    //   249: getfield 191	com/facebook/internal/ImageDownloader$RequestKey:tag	Ljava/lang/Object;
    //   252: invokespecial 63	com/facebook/internal/ImageDownloader$RequestKey:<init>	(Ljava/net/URI;Ljava/lang/Object;)V
    //   255: iconst_0
    //   256: invokestatic 195	com/facebook/internal/ImageDownloader:enqueueCacheRead	(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    //   259: iconst_0
    //   260: istore_3
    //   261: aconst_null
    //   262: astore 18
    //   264: aconst_null
    //   265: astore 6
    //   267: aload 6
    //   269: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   272: aload 11
    //   274: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   277: aload 18
    //   279: astore 4
    //   281: goto -114 -> 167
    //   284: aload_1
    //   285: aload 11
    //   287: invokestatic 199	com/facebook/internal/ImageResponseCache:interceptAndCacheImageStream	(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    //   290: astore 15
    //   292: aload 15
    //   294: astore 6
    //   296: aload 6
    //   298: invokestatic 205	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   301: astore_2
    //   302: aconst_null
    //   303: astore 18
    //   305: goto -38 -> 267
    //   308: aload 27
    //   310: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   313: new 207	com/facebook/FacebookException
    //   316: dup
    //   317: aload 26
    //   319: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   322: invokespecial 209	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   325: astore 18
    //   327: aconst_null
    //   328: astore_2
    //   329: goto -62 -> 267
    //   332: astore 17
    //   334: aload 11
    //   336: astore 7
    //   338: aload 17
    //   340: astore 4
    //   342: aload 6
    //   344: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   347: aload 7
    //   349: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   352: aconst_null
    //   353: astore_2
    //   354: goto -187 -> 167
    //   357: aload 26
    //   359: aload_1
    //   360: getstatic 214	com/facebook/android/R$string:com_facebook_image_download_unknown_error	I
    //   363: invokevirtual 220	android/content/Context:getString	(I)Ljava/lang/String;
    //   366: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: goto -57 -> 313
    //   373: astore 16
    //   375: aload 6
    //   377: astore 10
    //   379: aload 11
    //   381: astore 9
    //   383: aload 16
    //   385: astore 8
    //   387: aload 10
    //   389: invokestatic 156	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   392: aload 9
    //   394: invokestatic 160	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   397: aload 8
    //   399: athrow
    //   400: astore 8
    //   402: aconst_null
    //   403: astore 9
    //   405: aconst_null
    //   406: astore 10
    //   408: goto -21 -> 387
    //   411: astore 14
    //   413: aload 11
    //   415: astore 9
    //   417: aload 14
    //   419: astore 8
    //   421: aconst_null
    //   422: astore 10
    //   424: goto -37 -> 387
    //   427: astore 4
    //   429: aconst_null
    //   430: astore 7
    //   432: aconst_null
    //   433: astore 6
    //   435: goto -93 -> 342
    //   438: astore 13
    //   440: aload 11
    //   442: astore 7
    //   444: aload 13
    //   446: astore 4
    //   448: aconst_null
    //   449: astore 6
    //   451: goto -109 -> 342
    //   454: astore 21
    //   456: aload 11
    //   458: astore 7
    //   460: aload 21
    //   462: astore 4
    //   464: iconst_0
    //   465: istore_3
    //   466: aconst_null
    //   467: astore 6
    //   469: goto -127 -> 342
    //   472: astore 4
    //   474: aconst_null
    //   475: astore 5
    //   477: aconst_null
    //   478: astore 6
    //   480: goto -323 -> 157
    //   483: astore 12
    //   485: aload 11
    //   487: astore 5
    //   489: aload 12
    //   491: astore 4
    //   493: aconst_null
    //   494: astore 6
    //   496: goto -339 -> 157
    //   499: astore 20
    //   501: aload 11
    //   503: astore 5
    //   505: aload 20
    //   507: astore 4
    //   509: iconst_0
    //   510: istore_3
    //   511: aconst_null
    //   512: astore 6
    //   514: goto -357 -> 157
    //   517: iconst_0
    //   518: istore_3
    //   519: aconst_null
    //   520: astore_2
    //   521: aconst_null
    //   522: astore 18
    //   524: aconst_null
    //   525: astore 6
    //   527: goto -260 -> 267
    //
    // Exception table:
    //   from	to	target	type
    //   83	92	147	java/io/IOException
    //   97	115	147	java/io/IOException
    //   115	128	147	java/io/IOException
    //   133	144	147	java/io/IOException
    //   296	302	147	java/io/IOException
    //   308	313	147	java/io/IOException
    //   313	327	147	java/io/IOException
    //   357	370	147	java/io/IOException
    //   83	92	332	java/net/URISyntaxException
    //   97	115	332	java/net/URISyntaxException
    //   115	128	332	java/net/URISyntaxException
    //   133	144	332	java/net/URISyntaxException
    //   296	302	332	java/net/URISyntaxException
    //   308	313	332	java/net/URISyntaxException
    //   313	327	332	java/net/URISyntaxException
    //   357	370	332	java/net/URISyntaxException
    //   83	92	373	finally
    //   97	115	373	finally
    //   115	128	373	finally
    //   133	144	373	finally
    //   296	302	373	finally
    //   308	313	373	finally
    //   313	327	373	finally
    //   357	370	373	finally
    //   4	26	400	finally
    //   26	72	411	finally
    //   72	79	411	finally
    //   180	224	411	finally
    //   229	259	411	finally
    //   284	292	411	finally
    //   4	26	427	java/net/URISyntaxException
    //   26	72	438	java/net/URISyntaxException
    //   72	79	438	java/net/URISyntaxException
    //   284	292	438	java/net/URISyntaxException
    //   180	224	454	java/net/URISyntaxException
    //   229	259	454	java/net/URISyntaxException
    //   4	26	472	java/io/IOException
    //   26	72	483	java/io/IOException
    //   72	79	483	java/io/IOException
    //   284	292	483	java/io/IOException
    //   180	224	499	java/io/IOException
    //   229	259	499	java/io/IOException
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageDownloader
 * JD-Core Version:    0.6.2
 */