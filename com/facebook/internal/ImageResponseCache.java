package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

class ImageResponseCache
{
  static final String TAG = ImageResponseCache.class.getSimpleName();
  private static volatile FileLruCache imageCache;

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
      if (imageCache == null)
        imageCache = new FileLruCache(paramContext.getApplicationContext(), TAG, new FileLruCache.Limits());
      FileLruCache localFileLruCache = imageCache;
      return localFileLruCache;
    }
    finally
    {
    }
  }

  static InputStream getCachedImageStream(URI paramURI, Context paramContext)
  {
    Object localObject = null;
    if (paramURI != null)
    {
      boolean bool = isCDNURL(paramURI);
      localObject = null;
      if (!bool);
    }
    try
    {
      InputStream localInputStream = getCache(paramContext).get(paramURI.toString());
      localObject = localInputStream;
      return localObject;
    }
    catch (IOException localIOException)
    {
      Logger.log(LoggingBehavior.CACHE, 5, TAG, localIOException.toString());
    }
    return null;
  }

  static InputStream interceptAndCacheImageStream(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    int i = paramHttpURLConnection.getResponseCode();
    Object localObject = null;
    URL localURL;
    if (i == 200)
    {
      localURL = paramHttpURLConnection.getURL();
      localObject = paramHttpURLConnection.getInputStream();
    }
    try
    {
      if (isCDNURL(localURL.toURI()))
      {
        InputStream localInputStream = getCache(paramContext).interceptAndPut(localURL.toString(), new ImageResponseCache.BufferedHttpInputStream((InputStream)localObject, paramHttpURLConnection));
        localObject = localInputStream;
      }
      return localObject;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      return localObject;
    }
    catch (IOException localIOException)
    {
    }
    return localObject;
  }

  private static boolean isCDNURL(URI paramURI)
  {
    if (paramURI != null)
    {
      String str = paramURI.getHost();
      if (str.endsWith("fbcdn.net"));
      while ((str.startsWith("fbcdn")) && (str.endsWith("akamaihd.net")))
        return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageResponseCache
 * JD-Core Version:    0.6.2
 */