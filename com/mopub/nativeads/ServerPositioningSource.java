package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask;
import com.mopub.common.DownloadTask.DownloadTaskListener;
import com.mopub.common.HttpClient;
import com.mopub.common.HttpResponses;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ServerPositioningSource
  implements PositioningSource
{
  private static final double DEFAULT_RETRY_TIME_MILLISECONDS = 1000.0D;
  private static final double EXPONENTIAL_BACKOFF_FACTOR = 2.0D;
  private static final String FIXED_KEY = "fixed";
  private static final String INTERVAL_KEY = "interval";

  @VisibleForTesting
  static int MAXIMUM_RETRY_TIME_MILLISECONDS = 0;
  private static final int MAX_VALUE = 65536;
  private static final String POSITION_KEY = "position";
  private static final String REPEATING_KEY = "repeating";
  private static final String SECTION_KEY = "section";
  private final Context mContext;
  private DownloadTask mDownloadTask;
  private final ServerPositioningSource.DownloadTaskProvider mDownloadTaskProvider;
  private PositioningSource.PositioningListener mListener;
  private int mRetryCount;
  private final Handler mRetryHandler;
  private final Runnable mRetryRunnable;
  private String mRetryUrl;
  private DownloadTask.DownloadTaskListener mTaskListener = new DownloadTask.DownloadTaskListener()
  {
    public void onComplete(String paramAnonymousString, DownloadResponse paramAnonymousDownloadResponse)
    {
      if (paramAnonymousDownloadResponse == null)
        return;
      ServerPositioningSource.access$102(ServerPositioningSource.this, null);
      if (paramAnonymousDownloadResponse.getStatusCode() != 200)
      {
        MoPubLog.e("Invalid positioning download response ");
        ServerPositioningSource.this.handleFailure();
        return;
      }
      String str = HttpResponses.asResponseString(paramAnonymousDownloadResponse);
      try
      {
        MoPubNativeAdPositioning.MoPubClientPositioning localMoPubClientPositioning = ServerPositioningSource.this.parseJsonResponse(str);
        ServerPositioningSource.this.handleSuccess(localMoPubClientPositioning);
        return;
      }
      catch (JSONException localJSONException)
      {
        MoPubLog.e("Error parsing JSON: ", localJSONException);
        ServerPositioningSource.this.handleFailure();
      }
    }
  };

  ServerPositioningSource(Context paramContext)
  {
    this(paramContext, new ServerPositioningSource.DownloadTaskProvider());
  }

  @VisibleForTesting
  ServerPositioningSource(Context paramContext, ServerPositioningSource.DownloadTaskProvider paramDownloadTaskProvider)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mDownloadTaskProvider = paramDownloadTaskProvider;
    this.mRetryHandler = new Handler();
    this.mRetryRunnable = new Runnable()
    {
      public void run()
      {
        ServerPositioningSource.this.requestPositioningInternal();
      }
    };
  }

  private void handleFailure()
  {
    int i = (int)(1000.0D * Math.pow(2.0D, 1 + this.mRetryCount));
    if (i >= MAXIMUM_RETRY_TIME_MILLISECONDS)
    {
      MoPubLog.d("Error downloading positioning information");
      this.mListener.onFailed();
      this.mListener = null;
      return;
    }
    this.mRetryCount = (1 + this.mRetryCount);
    this.mRetryHandler.postDelayed(this.mRetryRunnable, i);
  }

  private void handleSuccess(MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    this.mListener.onLoad(paramMoPubClientPositioning);
    this.mListener = null;
    this.mRetryCount = 0;
  }

  private void parseFixedJson(JSONArray paramJSONArray, MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      int j = localJSONObject.optInt("section", 0);
      if (j < 0)
        throw new JSONException("Invalid section " + j + " in JSON response");
      if (j <= 0)
      {
        int k = localJSONObject.getInt("position");
        if ((k < 0) || (k > 65536))
          throw new JSONException("Invalid position " + k + " in JSON response");
        paramMoPubClientPositioning.addFixedPosition(k);
      }
    }
  }

  private void parseRepeatingJson(JSONObject paramJSONObject, MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    int i = paramJSONObject.getInt("interval");
    if ((i < 2) || (i > 65536))
      throw new JSONException("Invalid interval " + i + " in JSON response");
    paramMoPubClientPositioning.enableRepeatingPositions(i);
  }

  private void requestPositioningInternal()
  {
    MoPubLog.d("Loading positioning from: " + this.mRetryUrl);
    this.mDownloadTask = this.mDownloadTaskProvider.get(this.mTaskListener);
    HttpGet localHttpGet = HttpClient.initializeHttpGet(this.mRetryUrl, this.mContext);
    AsyncTasks.safeExecuteOnExecutor(this.mDownloadTask, new HttpUriRequest[] { localHttpGet });
  }

  public void loadPositions(String paramString, PositioningSource.PositioningListener paramPositioningListener)
  {
    if (this.mDownloadTask != null)
    {
      this.mDownloadTask.cancel(true);
      this.mDownloadTask = null;
    }
    if (this.mRetryCount > 0)
    {
      this.mRetryHandler.removeCallbacks(this.mRetryRunnable);
      this.mRetryCount = 0;
    }
    this.mListener = paramPositioningListener;
    this.mRetryUrl = new PositioningUrlGenerator(this.mContext).withAdUnitId(paramString).generateUrlString("ads.mopub.com");
    requestPositioningInternal();
  }

  @VisibleForTesting
  MoPubNativeAdPositioning.MoPubClientPositioning parseJsonResponse(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      throw new JSONException("Empty response");
    JSONObject localJSONObject1 = new JSONObject(paramString);
    String str = localJSONObject1.optString("error", null);
    if (str != null)
      throw new JSONException(str);
    JSONArray localJSONArray = localJSONObject1.optJSONArray("fixed");
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("repeating");
    MoPubNativeAdPositioning.MoPubClientPositioning localMoPubClientPositioning = new MoPubNativeAdPositioning.MoPubClientPositioning();
    if ((localJSONArray == null) && (localJSONObject2 == null))
      throw new JSONException("Must contain fixed or repeating positions");
    if (localJSONArray != null)
      parseFixedJson(localJSONArray, localMoPubClientPositioning);
    if (localJSONObject2 != null)
      parseRepeatingJson(localJSONObject2, localMoPubClientPositioning);
    return localMoPubClientPositioning;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ServerPositioningSource
 * JD-Core Version:    0.6.2
 */