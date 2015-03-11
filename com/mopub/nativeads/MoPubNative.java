package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask;
import com.mopub.common.DownloadTask.DownloadTaskListener;
import com.mopub.common.GpsHelper;
import com.mopub.common.HttpClient;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.ManifestUtils;
import com.mopub.common.util.ResponseHeader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

public class MoPubNative
{
  static final MoPubNative.MoPubNativeEventListener EMPTY_EVENT_LISTENER = new MoPubNative.MoPubNativeEventListener()
  {
    public final void onNativeClick(View paramAnonymousView)
    {
    }

    public final void onNativeImpression(View paramAnonymousView)
    {
    }
  };
  static final MoPubNative.MoPubNativeNetworkListener EMPTY_NETWORK_LISTENER = new MoPubNative.MoPubNativeNetworkListener()
  {
    public final void onNativeFail(NativeErrorCode paramAnonymousNativeErrorCode)
    {
    }

    public final void onNativeLoad(NativeResponse paramAnonymousNativeResponse)
    {
      paramAnonymousNativeResponse.destroy();
    }
  };
  private final String mAdUnitId;
  private final WeakReference<Context> mContext;
  private Map<String, Object> mLocalExtras;
  private MoPubNative.MoPubNativeEventListener mMoPubNativeEventListener;
  private MoPubNative.MoPubNativeNetworkListener mMoPubNativeNetworkListener;

  @Deprecated
  public MoPubNative(Context paramContext, String paramString, MoPubNative.MoPubNativeListener paramMoPubNativeListener)
  {
    this(paramContext, paramString, paramMoPubNativeListener);
    setNativeEventListener(paramMoPubNativeListener);
  }

  public MoPubNative(Context paramContext, String paramString, MoPubNative.MoPubNativeNetworkListener paramMoPubNativeNetworkListener)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Context may not be null.");
    if (paramString == null)
      throw new IllegalArgumentException("AdUnitId may not be null.");
    if (paramMoPubNativeNetworkListener == null)
      throw new IllegalArgumentException("MoPubNativeNetworkListener may not be null.");
    ManifestUtils.checkNativeActivitiesDeclared(paramContext);
    this.mContext = new WeakReference(paramContext);
    this.mAdUnitId = paramString;
    this.mMoPubNativeNetworkListener = paramMoPubNativeNetworkListener;
    this.mMoPubNativeEventListener = EMPTY_EVENT_LISTENER;
    GpsHelper.asyncFetchAdvertisingInfo(paramContext);
  }

  private void downloadJson(HttpUriRequest paramHttpUriRequest)
  {
    DownloadTask localDownloadTask = new DownloadTask(new DownloadTask.DownloadTaskListener()
    {
      public void onComplete(String paramAnonymousString, final DownloadResponse paramAnonymousDownloadResponse)
      {
        if (paramAnonymousDownloadResponse == null)
          MoPubNative.this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.UNSPECIFIED);
        CustomEventNative.CustomEventNativeListener local1;
        Context localContext;
        do
        {
          return;
          if ((paramAnonymousDownloadResponse.getStatusCode() >= 500) && (paramAnonymousDownloadResponse.getStatusCode() < 600))
          {
            MoPubNative.this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.SERVER_ERROR_RESPONSE_CODE);
            return;
          }
          if (paramAnonymousDownloadResponse.getStatusCode() != 200)
          {
            MoPubNative.this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.UNEXPECTED_RESPONSE_CODE);
            return;
          }
          if (paramAnonymousDownloadResponse.getContentLength() == 0L)
          {
            MoPubNative.this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.EMPTY_AD_RESPONSE);
            return;
          }
          local1 = new CustomEventNative.CustomEventNativeListener()
          {
            public void onNativeAdFailed(NativeErrorCode paramAnonymous2NativeErrorCode)
            {
              MoPubNative.this.requestNativeAd(paramAnonymousDownloadResponse.getFirstHeader(ResponseHeader.FAIL_URL));
            }

            public void onNativeAdLoaded(NativeAdInterface paramAnonymous2NativeAdInterface)
            {
              Context localContext = MoPubNative.this.getContextOrDestroy();
              if (localContext == null)
                return;
              MoPubNative.this.mMoPubNativeNetworkListener.onNativeLoad(new NativeResponse(localContext, paramAnonymousDownloadResponse, MoPubNative.this.mAdUnitId, paramAnonymous2NativeAdInterface, MoPubNative.this.mMoPubNativeEventListener));
            }
          };
          localContext = MoPubNative.this.getContextOrDestroy();
        }
        while (localContext == null);
        CustomEventNativeAdapter.loadNativeAd(localContext, MoPubNative.this.mLocalExtras, paramAnonymousDownloadResponse, local1);
      }
    });
    try
    {
      AsyncTasks.safeExecuteOnExecutor(localDownloadTask, new HttpUriRequest[] { paramHttpUriRequest });
      return;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Failed to download json", localException);
      this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.UNSPECIFIED);
    }
  }

  public void destroy()
  {
    this.mContext.clear();
    this.mMoPubNativeNetworkListener = EMPTY_NETWORK_LISTENER;
    this.mMoPubNativeEventListener = EMPTY_EVENT_LISTENER;
  }

  Context getContextOrDestroy()
  {
    Context localContext = (Context)this.mContext.get();
    if (localContext == null)
    {
      destroy();
      MoPubLog.d("Weak reference to Activity Context in MoPubNative became null. This instance of MoPubNative is destroyed and No more requests will be processed.");
    }
    return localContext;
  }

  @Deprecated
  @VisibleForTesting
  MoPubNative.MoPubNativeEventListener getMoPubNativeEventListener()
  {
    return this.mMoPubNativeEventListener;
  }

  @Deprecated
  @VisibleForTesting
  MoPubNative.MoPubNativeNetworkListener getMoPubNativeNetworkListener()
  {
    return this.mMoPubNativeNetworkListener;
  }

  void loadNativeAd(RequestParameters paramRequestParameters)
  {
    loadNativeAd(paramRequestParameters, null);
  }

  void loadNativeAd(RequestParameters paramRequestParameters, Integer paramInteger)
  {
    Context localContext = getContextOrDestroy();
    if (localContext == null)
      return;
    NativeUrlGenerator localNativeUrlGenerator = new NativeUrlGenerator(localContext).withAdUnitId(this.mAdUnitId).withRequest(paramRequestParameters);
    if (paramInteger != null)
      localNativeUrlGenerator.withSequenceNumber(paramInteger.intValue());
    String str = localNativeUrlGenerator.generateUrlString("ads.mopub.com");
    if (str != null)
      MoPubLog.d("Loading ad from: " + str);
    requestNativeAd(str);
  }

  public void makeRequest()
  {
    makeRequest(null);
  }

  void makeRequest(MoPubNative.NativeGpsHelperListener paramNativeGpsHelperListener)
  {
    Context localContext = getContextOrDestroy();
    if (localContext == null)
      return;
    if (!DeviceUtils.isNetworkAvailable(localContext))
    {
      this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.CONNECTION_ERROR);
      return;
    }
    GpsHelper.asyncFetchAdvertisingInfoIfNotCached(localContext, paramNativeGpsHelperListener);
  }

  public void makeRequest(RequestParameters paramRequestParameters)
  {
    makeRequest(new MoPubNative.NativeGpsHelperListener(this, paramRequestParameters));
  }

  void requestNativeAd(String paramString)
  {
    Context localContext = getContextOrDestroy();
    if (localContext == null)
      return;
    if (paramString == null)
    {
      this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.INVALID_REQUEST_URL);
      return;
    }
    try
    {
      HttpGet localHttpGet = HttpClient.initializeHttpGet(paramString, localContext);
      downloadJson(localHttpGet);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.INVALID_REQUEST_URL);
    }
  }

  public void setLocalExtras(Map<String, Object> paramMap)
  {
    this.mLocalExtras = new HashMap(paramMap);
  }

  public void setNativeEventListener(MoPubNative.MoPubNativeEventListener paramMoPubNativeEventListener)
  {
    if (paramMoPubNativeEventListener == null)
      paramMoPubNativeEventListener = EMPTY_EVENT_LISTENER;
    this.mMoPubNativeEventListener = paramMoPubNativeEventListener;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNative
 * JD-Core Version:    0.6.2
 */