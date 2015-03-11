package com.mopub.common;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.ResponseHeader;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpClient
{
  private static final int CONNECTION_TIMEOUT = 10000;
  private static final int SOCKET_TIMEOUT = 10000;
  private static String sWebViewUserAgent;

  public static AndroidHttpClient getHttpClient()
  {
    AndroidHttpClient localAndroidHttpClient = AndroidHttpClient.newInstance(DeviceUtils.getUserAgent());
    HttpParams localHttpParams = localAndroidHttpClient.getParams();
    HttpConnectionParams.setConnectionTimeout(localHttpParams, 10000);
    HttpConnectionParams.setSoTimeout(localHttpParams, 10000);
    HttpClientParams.setRedirecting(localHttpParams, true);
    return localAndroidHttpClient;
  }

  public static String getWebViewUserAgent()
  {
    try
    {
      String str = sWebViewUserAgent;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static HttpGet initializeHttpGet(String paramString, Context paramContext)
  {
    HttpGet localHttpGet = new HttpGet(paramString);
    if ((getWebViewUserAgent() == null) && (paramContext != null))
      setWebViewUserAgent(new WebView(paramContext).getSettings().getUserAgentString());
    String str = getWebViewUserAgent();
    if (str != null)
      localHttpGet.addHeader(ResponseHeader.USER_AGENT.getKey(), str);
    return localHttpGet;
  }

  public static void makeTrackingHttpRequest(Iterable<String> paramIterable, Context paramContext)
  {
    if ((paramIterable == null) || (paramContext == null))
      return;
    final DownloadTask.DownloadTaskListener local1 = new DownloadTask.DownloadTaskListener()
    {
      public final void onComplete(String paramAnonymousString, DownloadResponse paramAnonymousDownloadResponse)
      {
        if ((paramAnonymousDownloadResponse == null) || (paramAnonymousDownloadResponse.getStatusCode() != 200))
        {
          MoPubLog.d("Failed to hit tracking endpoint: " + paramAnonymousString);
          return;
        }
        if (HttpResponses.asResponseString(paramAnonymousDownloadResponse) != null)
        {
          MoPubLog.d("Successfully hit tracking endpoint: " + paramAnonymousString);
          return;
        }
        MoPubLog.d("Failed to hit tracking endpoint: " + paramAnonymousString);
      }
    };
    Runnable local2 = new Runnable()
    {
      public final void run()
      {
        Iterator localIterator = HttpClient.this.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          try
          {
            HttpGet localHttpGet = HttpClient.initializeHttpGet(str, this.val$appContext);
            AsyncTasks.safeExecuteOnExecutor(new DownloadTask(local1), new HttpUriRequest[] { localHttpGet });
          }
          catch (Exception localException)
          {
            MoPubLog.d("Failed to hit tracking endpoint: " + str);
          }
        }
      }
    };
    new Handler(Looper.getMainLooper()).post(local2);
  }

  public static void makeTrackingHttpRequest(String paramString, Context paramContext)
  {
    makeTrackingHttpRequest(Arrays.asList(new String[] { paramString }), paramContext);
  }

  public static void setWebViewUserAgent(String paramString)
  {
    try
    {
      sWebViewUserAgent = paramString;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.HttpClient
 * JD-Core Version:    0.6.2
 */