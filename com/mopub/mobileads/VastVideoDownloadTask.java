package com.mopub.mobileads;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import com.mopub.common.CacheService;
import com.mopub.common.HttpClient;
import com.mopub.common.logging.MoPubLog;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

public class VastVideoDownloadTask extends AsyncTask<String, Void, Boolean>
{
  private static final int MAX_VIDEO_SIZE = 26214400;
  private final VastVideoDownloadTask.VastVideoDownloadTaskListener mVastVideoDownloadTaskListener;

  public VastVideoDownloadTask(VastVideoDownloadTask.VastVideoDownloadTaskListener paramVastVideoDownloadTaskListener)
  {
    this.mVastVideoDownloadTaskListener = paramVastVideoDownloadTaskListener;
  }

  protected Boolean doInBackground(String[] paramArrayOfString)
  {
    Object localObject1;
    if ((paramArrayOfString == null) || (paramArrayOfString[0] == null))
      localObject1 = Boolean.valueOf(false);
    AndroidHttpClient localAndroidHttpClient;
    do
    {
      String str;
      HttpResponse localHttpResponse;
      while (true)
      {
        return localObject1;
        str = paramArrayOfString[0];
        localAndroidHttpClient = null;
        try
        {
          localAndroidHttpClient = HttpClient.getHttpClient();
          localHttpResponse = localAndroidHttpClient.execute(new HttpGet(str));
          if ((localHttpResponse == null) || (localHttpResponse.getEntity() == null))
            throw new IOException("Obtained null response from video url: " + str);
        }
        catch (Exception localException)
        {
          MoPubLog.d("Failed to download video: " + localException.getMessage());
          Boolean localBoolean1 = Boolean.valueOf(false);
          localObject1 = localBoolean1;
          return localObject1;
          if (localHttpResponse.getEntity().getContentLength() > 26214400L)
            throw new IOException("Video exceeded max download size");
        }
        finally
        {
          if (localAndroidHttpClient != null)
            localAndroidHttpClient.close();
        }
      }
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localHttpResponse.getEntity().getContent());
      boolean bool = CacheService.putToDiskCache(str, localBufferedInputStream);
      localBufferedInputStream.close();
      Boolean localBoolean2 = Boolean.valueOf(bool);
      localObject1 = localBoolean2;
    }
    while (localAndroidHttpClient == null);
    localAndroidHttpClient.close();
    return localObject1;
  }

  protected void onCancelled()
  {
    onPostExecute(Boolean.valueOf(false));
  }

  protected void onPostExecute(Boolean paramBoolean)
  {
    if (this.mVastVideoDownloadTaskListener != null)
      this.mVastVideoDownloadTaskListener.onComplete(paramBoolean.booleanValue());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.VastVideoDownloadTask
 * JD-Core Version:    0.6.2
 */