package com.appsflyer.cache;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CacheManager
{
  public static final String AF_CACHE_DIR = "AFRequestCache";
  public static final int CACHE_MAX_SIZE = 20;
  private static CacheManager ourInstance = new CacheManager();

  private File getCacheDir(Context paramContext)
  {
    return new File(paramContext.getFilesDir(), "AFRequestCache");
  }

  public static CacheManager getInstance()
  {
    return ourInstance;
  }

  private RequestCacheData loadRequestData(File paramFile)
  {
    try
    {
      FileReader localFileReader = new FileReader(paramFile);
      char[] arrayOfChar = new char[(int)paramFile.length()];
      localFileReader.read(arrayOfChar);
      RequestCacheData localRequestCacheData = new RequestCacheData(arrayOfChar);
      localRequestCacheData.setCacheKey(paramFile.getName());
      localFileReader.close();
      return localRequestCacheData;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public void cacheRequest(RequestCacheData paramRequestCacheData, Context paramContext)
  {
    try
    {
      File localFile1 = getCacheDir(paramContext);
      if (!localFile1.exists())
      {
        localFile1.mkdir();
        return;
      }
      if (localFile1.listFiles().length <= 20)
      {
        File localFile2 = new File(getCacheDir(paramContext), Long.toString(System.currentTimeMillis()));
        localFile2.createNewFile();
        OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(new FileOutputStream(localFile2.getPath(), true));
        localOutputStreamWriter.write("version=");
        localOutputStreamWriter.write(paramRequestCacheData.getVersion());
        localOutputStreamWriter.write(10);
        localOutputStreamWriter.write("url=");
        localOutputStreamWriter.write(paramRequestCacheData.getRequestURL());
        localOutputStreamWriter.write(10);
        localOutputStreamWriter.write("data=");
        localOutputStreamWriter.write(paramRequestCacheData.getPostData());
        localOutputStreamWriter.write(10);
        localOutputStreamWriter.flush();
        localOutputStreamWriter.close();
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public void deleteRequest(String paramString, Context paramContext)
  {
    File localFile = new File(getCacheDir(paramContext), paramString);
    new StringBuilder().append("Deleting ").append(paramString).append(" from cache").toString();
    if (localFile.exists());
    try
    {
      localFile.delete();
      return;
    }
    catch (Exception localException)
    {
      new StringBuilder().append("Could not delete ").append(paramString).append(" from cache").toString();
    }
  }

  public List<RequestCacheData> getCachedRequests(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      File localFile1 = getCacheDir(paramContext);
      if (!localFile1.exists())
      {
        localFile1.mkdir();
        return localArrayList;
      }
      for (File localFile2 : localFile1.listFiles())
      {
        new StringBuilder().append("Found cached request").append(localFile2.getName()).toString();
        localArrayList.add(loadRequestData(localFile2));
      }
    }
    catch (Exception localException)
    {
    }
    return localArrayList;
  }

  public void init(Context paramContext)
  {
    try
    {
      if (!getCacheDir(paramContext).exists())
        getCacheDir(paramContext).mkdir();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.cache.CacheManager
 * JD-Core Version:    0.6.2
 */