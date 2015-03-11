package com.mopub.mobileads.util.vast;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import com.mopub.common.util.Strings;
import java.lang.ref.WeakReference;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

public class VastXmlManagerAggregator extends AsyncTask<String, Void, List<VastXmlManager>>
{
  static final int MAX_TIMES_TO_FOLLOW_VAST_REDIRECT = 20;
  private int mTimesFollowedVastRedirect;
  private final WeakReference<VastXmlManagerAggregator.VastXmlManagerAggregatorListener> mVastXmlManagerAggregatorListener;

  VastXmlManagerAggregator(VastXmlManagerAggregator.VastXmlManagerAggregatorListener paramVastXmlManagerAggregatorListener)
  {
    this.mVastXmlManagerAggregatorListener = new WeakReference(paramVastXmlManagerAggregatorListener);
  }

  // ERROR //
  protected List<VastXmlManager> doInBackground(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 39	com/mopub/common/HttpClient:getHttpClient	()Landroid/net/http/AndroidHttpClient;
    //   5: astore 8
    //   7: aload 8
    //   9: astore 4
    //   11: aload_1
    //   12: ifnull +190 -> 202
    //   15: aload_1
    //   16: arraylength
    //   17: ifle +185 -> 202
    //   20: aload_1
    //   21: iconst_0
    //   22: aaload
    //   23: astore 10
    //   25: new 41	java/util/ArrayList
    //   28: dup
    //   29: invokespecial 42	java/util/ArrayList:<init>	()V
    //   32: astore 11
    //   34: aload 10
    //   36: ifnull +64 -> 100
    //   39: aload 10
    //   41: invokevirtual 48	java/lang/String:length	()I
    //   44: ifle +56 -> 100
    //   47: aload_0
    //   48: invokevirtual 52	com/mopub/mobileads/util/vast/VastXmlManagerAggregator:isCancelled	()Z
    //   51: ifne +49 -> 100
    //   54: new 54	com/mopub/mobileads/util/vast/VastXmlManager
    //   57: dup
    //   58: invokespecial 55	com/mopub/mobileads/util/vast/VastXmlManager:<init>	()V
    //   61: astore 13
    //   63: aload 13
    //   65: aload 10
    //   67: invokevirtual 59	com/mopub/mobileads/util/vast/VastXmlManager:parseVastXml	(Ljava/lang/String;)V
    //   70: aload 11
    //   72: aload 13
    //   74: invokeinterface 65 2 0
    //   79: pop
    //   80: aload_0
    //   81: aload 4
    //   83: aload 13
    //   85: invokevirtual 69	com/mopub/mobileads/util/vast/VastXmlManager:getVastAdTagURI	()Ljava/lang/String;
    //   88: invokevirtual 73	com/mopub/mobileads/util/vast/VastXmlManagerAggregator:followVastRedirect	(Landroid/net/http/AndroidHttpClient;Ljava/lang/String;)Ljava/lang/String;
    //   91: astore 15
    //   93: aload 15
    //   95: astore 10
    //   97: goto -63 -> 34
    //   100: aload 11
    //   102: astore 7
    //   104: aload 4
    //   106: ifnull +8 -> 114
    //   109: aload 4
    //   111: invokevirtual 78	android/net/http/AndroidHttpClient:close	()V
    //   114: aload 7
    //   116: areturn
    //   117: astore 5
    //   119: aload 5
    //   121: astore 6
    //   123: aconst_null
    //   124: astore 7
    //   126: ldc 80
    //   128: aload 6
    //   130: invokestatic 86	com/mopub/common/logging/MoPubLog:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   133: aload_2
    //   134: ifnull -20 -> 114
    //   137: aload_2
    //   138: invokevirtual 78	android/net/http/AndroidHttpClient:close	()V
    //   141: aload 7
    //   143: areturn
    //   144: astore_3
    //   145: aconst_null
    //   146: astore 4
    //   148: aload 4
    //   150: ifnull +8 -> 158
    //   153: aload 4
    //   155: invokevirtual 78	android/net/http/AndroidHttpClient:close	()V
    //   158: aload_3
    //   159: athrow
    //   160: astore_3
    //   161: goto -13 -> 148
    //   164: astore_3
    //   165: aload_2
    //   166: astore 4
    //   168: goto -20 -> 148
    //   171: astore 9
    //   173: aload 4
    //   175: astore_2
    //   176: aload 9
    //   178: astore 6
    //   180: aconst_null
    //   181: astore 7
    //   183: goto -57 -> 126
    //   186: astore 12
    //   188: aload 4
    //   190: astore_2
    //   191: aload 12
    //   193: astore 6
    //   195: aload 11
    //   197: astore 7
    //   199: goto -73 -> 126
    //   202: aconst_null
    //   203: astore 7
    //   205: goto -101 -> 104
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	117	java/lang/Exception
    //   2	7	144	finally
    //   15	34	160	finally
    //   39	93	160	finally
    //   126	133	164	finally
    //   15	34	171	java/lang/Exception
    //   39	93	186	java/lang/Exception
  }

  String followVastRedirect(AndroidHttpClient paramAndroidHttpClient, String paramString)
  {
    String str = null;
    if (paramString != null)
    {
      int i = this.mTimesFollowedVastRedirect;
      str = null;
      if (i < 20)
      {
        this.mTimesFollowedVastRedirect = (1 + this.mTimesFollowedVastRedirect);
        HttpEntity localHttpEntity = paramAndroidHttpClient.execute(new HttpGet(paramString)).getEntity();
        str = null;
        if (localHttpEntity != null)
          str = Strings.fromStream(localHttpEntity.getContent());
      }
    }
    return str;
  }

  protected void onCancelled()
  {
    VastXmlManagerAggregator.VastXmlManagerAggregatorListener localVastXmlManagerAggregatorListener = (VastXmlManagerAggregator.VastXmlManagerAggregatorListener)this.mVastXmlManagerAggregatorListener.get();
    if (localVastXmlManagerAggregatorListener != null)
      localVastXmlManagerAggregatorListener.onAggregationComplete(null);
  }

  protected void onPostExecute(List<VastXmlManager> paramList)
  {
    VastXmlManagerAggregator.VastXmlManagerAggregatorListener localVastXmlManagerAggregatorListener = (VastXmlManagerAggregator.VastXmlManagerAggregatorListener)this.mVastXmlManagerAggregatorListener.get();
    if (localVastXmlManagerAggregatorListener != null)
      localVastXmlManagerAggregatorListener.onAggregationComplete(paramList);
  }

  @Deprecated
  void setTimesFollowedVastRedirect(int paramInt)
  {
    this.mTimesFollowedVastRedirect = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastXmlManagerAggregator
 * JD-Core Version:    0.6.2
 */