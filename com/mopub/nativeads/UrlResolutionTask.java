package com.mopub.nativeads;

import android.os.AsyncTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.IntentUtils;
import java.io.IOException;

class UrlResolutionTask extends AsyncTask<String, Void, String>
{
  private static final int REDIRECT_LIMIT = 10;
  private final UrlResolutionTask.UrlResolutionListener mListener;

  UrlResolutionTask(UrlResolutionTask.UrlResolutionListener paramUrlResolutionListener)
  {
    this.mListener = paramUrlResolutionListener;
  }

  // ERROR //
  private String getRedirectLocation(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 21	java/net/URL
    //   5: dup
    //   6: aload_1
    //   7: invokespecial 24	java/net/URL:<init>	(Ljava/lang/String;)V
    //   10: astore_3
    //   11: aload_3
    //   12: invokevirtual 28	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   15: checkcast 30	java/net/HttpURLConnection
    //   18: astore 5
    //   20: aload 5
    //   22: iconst_0
    //   23: invokevirtual 34	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   26: aload 5
    //   28: invokevirtual 38	java/net/HttpURLConnection:getResponseCode	()I
    //   31: istore 7
    //   33: iload 7
    //   35: sipush 300
    //   38: if_icmplt +33 -> 71
    //   41: iload 7
    //   43: sipush 400
    //   46: if_icmpge +25 -> 71
    //   49: aload 5
    //   51: ldc 40
    //   53: invokevirtual 43	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   56: astore 8
    //   58: aload 5
    //   60: ifnull +8 -> 68
    //   63: aload 5
    //   65: invokevirtual 46	java/net/HttpURLConnection:disconnect	()V
    //   68: aload 8
    //   70: areturn
    //   71: aload 5
    //   73: ifnull +8 -> 81
    //   76: aload 5
    //   78: invokevirtual 46	java/net/HttpURLConnection:disconnect	()V
    //   81: aconst_null
    //   82: areturn
    //   83: astore 4
    //   85: aload_2
    //   86: ifnull +7 -> 93
    //   89: aload_2
    //   90: invokevirtual 46	java/net/HttpURLConnection:disconnect	()V
    //   93: aload 4
    //   95: athrow
    //   96: astore 6
    //   98: aload 5
    //   100: astore_2
    //   101: aload 6
    //   103: astore 4
    //   105: goto -20 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   11	20	83	finally
    //   20	33	96	finally
    //   49	58	96	finally
  }

  public static void getResolvedUrl(String paramString, UrlResolutionTask.UrlResolutionListener paramUrlResolutionListener)
  {
    UrlResolutionTask localUrlResolutionTask = new UrlResolutionTask(paramUrlResolutionListener);
    try
    {
      AsyncTasks.safeExecuteOnExecutor(localUrlResolutionTask, new String[] { paramString });
      return;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Failed to resolve url", localException);
      paramUrlResolutionListener.onFailure();
    }
  }

  protected String doInBackground(String[] paramArrayOfString)
  {
    Object localObject1;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      localObject1 = null;
    Object localObject2;
    while (true)
    {
      return localObject1;
      try
      {
        String str1 = paramArrayOfString[0];
        int i = 0;
        localObject1 = str1;
        localObject2 = null;
        while (true)
        {
          if ((localObject1 == null) || (i >= 10))
            break label67;
          if (!IntentUtils.isHttpUrl((String)localObject1))
            break;
          String str2 = getRedirectLocation((String)localObject1);
          i++;
          localObject2 = localObject1;
          localObject1 = str2;
        }
      }
      catch (IOException localIOException)
      {
        return null;
      }
    }
    label67: return localObject2;
  }

  protected void onCancelled()
  {
    super.onCancelled();
    this.mListener.onFailure();
  }

  protected void onPostExecute(String paramString)
  {
    super.onPostExecute(paramString);
    if ((isCancelled()) || (paramString == null))
    {
      onCancelled();
      return;
    }
    this.mListener.onSuccess(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.UrlResolutionTask
 * JD-Core Version:    0.6.2
 */