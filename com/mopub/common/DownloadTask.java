package com.mopub.common;

import android.os.AsyncTask;
import org.apache.http.client.methods.HttpUriRequest;

public class DownloadTask extends AsyncTask<HttpUriRequest, Void, DownloadResponse>
{
  private final DownloadTask.DownloadTaskListener mDownloadTaskListener;
  private String mUrl;

  public DownloadTask(DownloadTask.DownloadTaskListener paramDownloadTaskListener)
  {
    if (paramDownloadTaskListener == null)
      throw new IllegalArgumentException("DownloadTaskListener must not be null.");
    this.mDownloadTaskListener = paramDownloadTaskListener;
  }

  // ERROR //
  protected DownloadResponse doInBackground(HttpUriRequest[] paramArrayOfHttpUriRequest)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +14 -> 15
    //   4: aload_1
    //   5: arraylength
    //   6: ifeq +9 -> 15
    //   9: aload_1
    //   10: iconst_0
    //   11: aaload
    //   12: ifnonnull +12 -> 24
    //   15: ldc 29
    //   17: invokestatic 34	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;)V
    //   20: aconst_null
    //   21: astore_2
    //   22: aload_2
    //   23: areturn
    //   24: aload_1
    //   25: iconst_0
    //   26: aaload
    //   27: astore_3
    //   28: aload_0
    //   29: aload_3
    //   30: invokeinterface 40 1 0
    //   35: invokevirtual 46	java/net/URI:toString	()Ljava/lang/String;
    //   38: putfield 48	com/mopub/common/DownloadTask:mUrl	Ljava/lang/String;
    //   41: invokestatic 54	com/mopub/common/HttpClient:getHttpClient	()Landroid/net/http/AndroidHttpClient;
    //   44: astore 8
    //   46: aload 8
    //   48: astore 5
    //   50: new 56	com/mopub/common/DownloadResponse
    //   53: dup
    //   54: aload 5
    //   56: aload_3
    //   57: invokevirtual 62	android/net/http/AndroidHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   60: invokespecial 65	com/mopub/common/DownloadResponse:<init>	(Lorg/apache/http/HttpResponse;)V
    //   63: astore_2
    //   64: aload 5
    //   66: ifnull -44 -> 22
    //   69: aload 5
    //   71: invokevirtual 68	android/net/http/AndroidHttpClient:close	()V
    //   74: aload_2
    //   75: areturn
    //   76: astore 6
    //   78: aconst_null
    //   79: astore 5
    //   81: ldc 70
    //   83: aload 6
    //   85: invokestatic 73	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   88: aload_0
    //   89: iconst_1
    //   90: invokevirtual 77	com/mopub/common/DownloadTask:cancel	(Z)Z
    //   93: pop
    //   94: aload 5
    //   96: ifnull +8 -> 104
    //   99: aload 5
    //   101: invokevirtual 68	android/net/http/AndroidHttpClient:close	()V
    //   104: aconst_null
    //   105: areturn
    //   106: astore 4
    //   108: aconst_null
    //   109: astore 5
    //   111: aload 5
    //   113: ifnull +8 -> 121
    //   116: aload 5
    //   118: invokevirtual 68	android/net/http/AndroidHttpClient:close	()V
    //   121: aload 4
    //   123: athrow
    //   124: astore 4
    //   126: goto -15 -> 111
    //   129: astore 6
    //   131: goto -50 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   41	46	76	java/lang/Exception
    //   41	46	106	finally
    //   50	64	124	finally
    //   81	94	124	finally
    //   50	64	129	java/lang/Exception
  }

  protected void onCancelled()
  {
    this.mDownloadTaskListener.onComplete(this.mUrl, null);
  }

  protected void onPostExecute(DownloadResponse paramDownloadResponse)
  {
    if (isCancelled())
    {
      onCancelled();
      return;
    }
    this.mDownloadTaskListener.onComplete(this.mUrl, paramDownloadResponse);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.DownloadTask
 * JD-Core Version:    0.6.2
 */