package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.mopub.common.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class NativeAdSource
{
  private static final int CACHE_LIMIT = 3;
  private static final int DEFAULT_RETRY_TIME_MILLISECONDS = 1000;
  private static final int EXPIRATION_TIME_MILLISECONDS = 900000;
  private static final double EXPONENTIAL_BACKOFF_FACTOR = 2.0D;
  private static final int MAXIMUM_RETRY_TIME_MILLISECONDS = 300000;
  private NativeAdSource.AdSourceListener mAdSourceListener;
  private MoPubNative mMoPubNative;
  private final MoPubNative.MoPubNativeNetworkListener mMoPubNativeNetworkListener;
  private final List<TimestampWrapper<NativeResponse>> mNativeAdCache;
  private final Handler mReplenishCacheHandler;
  private final Runnable mReplenishCacheRunnable;

  @VisibleForTesting
  boolean mRequestInFlight;
  private RequestParameters mRequestParameters;

  @VisibleForTesting
  boolean mRetryInFlight;

  @VisibleForTesting
  int mRetryTimeMilliseconds;

  @VisibleForTesting
  int mSequenceNumber;

  NativeAdSource()
  {
    this(new ArrayList(3), new Handler());
  }

  @VisibleForTesting
  NativeAdSource(List<TimestampWrapper<NativeResponse>> paramList, Handler paramHandler)
  {
    this.mNativeAdCache = paramList;
    this.mReplenishCacheHandler = paramHandler;
    this.mReplenishCacheRunnable = new Runnable()
    {
      public void run()
      {
        NativeAdSource.this.mRetryInFlight = false;
        NativeAdSource.this.replenishCache();
      }
    };
    this.mMoPubNativeNetworkListener = new MoPubNative.MoPubNativeNetworkListener()
    {
      public void onNativeFail(NativeErrorCode paramAnonymousNativeErrorCode)
      {
        NativeAdSource.this.mRequestInFlight = false;
        if (NativeAdSource.this.mRetryTimeMilliseconds >= 300000)
        {
          NativeAdSource.this.resetRetryTime();
          return;
        }
        NativeAdSource.this.updateRetryTime();
        NativeAdSource.this.mRetryInFlight = true;
        NativeAdSource.this.mReplenishCacheHandler.postDelayed(NativeAdSource.this.mReplenishCacheRunnable, NativeAdSource.this.mRetryTimeMilliseconds);
      }

      public void onNativeLoad(NativeResponse paramAnonymousNativeResponse)
      {
        if (NativeAdSource.this.mMoPubNative == null)
          return;
        NativeAdSource.this.mRequestInFlight = false;
        NativeAdSource localNativeAdSource = NativeAdSource.this;
        localNativeAdSource.mSequenceNumber = (1 + localNativeAdSource.mSequenceNumber);
        NativeAdSource.this.resetRetryTime();
        NativeAdSource.this.mNativeAdCache.add(new TimestampWrapper(paramAnonymousNativeResponse));
        if ((NativeAdSource.this.mNativeAdCache.size() == 1) && (NativeAdSource.this.mAdSourceListener != null))
          NativeAdSource.this.mAdSourceListener.onAdsAvailable();
        NativeAdSource.this.replenishCache();
      }
    };
    this.mSequenceNumber = 0;
    this.mRetryTimeMilliseconds = 1000;
  }

  void clear()
  {
    if (this.mMoPubNative != null)
    {
      this.mMoPubNative.destroy();
      this.mMoPubNative = null;
    }
    this.mRequestParameters = null;
    Iterator localIterator = this.mNativeAdCache.iterator();
    while (localIterator.hasNext())
      ((NativeResponse)((TimestampWrapper)localIterator.next()).mInstance).destroy();
    this.mNativeAdCache.clear();
    this.mReplenishCacheHandler.removeMessages(0);
    this.mRequestInFlight = false;
    this.mSequenceNumber = 0;
    resetRetryTime();
  }

  NativeResponse dequeueAd()
  {
    long l = SystemClock.uptimeMillis();
    if ((!this.mRequestInFlight) && (!this.mRetryInFlight))
      this.mReplenishCacheHandler.post(this.mReplenishCacheRunnable);
    while (!this.mNativeAdCache.isEmpty())
    {
      TimestampWrapper localTimestampWrapper = (TimestampWrapper)this.mNativeAdCache.remove(0);
      if (l - localTimestampWrapper.mCreatedTimestamp < 900000L)
        return (NativeResponse)localTimestampWrapper.mInstance;
    }
    return null;
  }

  @Deprecated
  @VisibleForTesting
  MoPubNative.MoPubNativeNetworkListener getMoPubNativeNetworkListener()
  {
    return this.mMoPubNativeNetworkListener;
  }

  void loadAds(Context paramContext, String paramString, RequestParameters paramRequestParameters)
  {
    loadAds(paramRequestParameters, new MoPubNative(paramContext, paramString, this.mMoPubNativeNetworkListener));
  }

  @VisibleForTesting
  void loadAds(RequestParameters paramRequestParameters, MoPubNative paramMoPubNative)
  {
    clear();
    this.mRequestParameters = paramRequestParameters;
    this.mMoPubNative = paramMoPubNative;
    replenishCache();
  }

  @VisibleForTesting
  void replenishCache()
  {
    if ((!this.mRequestInFlight) && (this.mMoPubNative != null) && (this.mNativeAdCache.size() < 3))
    {
      this.mRequestInFlight = true;
      this.mMoPubNative.loadNativeAd(this.mRequestParameters, Integer.valueOf(this.mSequenceNumber));
    }
  }

  @VisibleForTesting
  void resetRetryTime()
  {
    this.mRetryTimeMilliseconds = 1000;
  }

  void setAdSourceListener(NativeAdSource.AdSourceListener paramAdSourceListener)
  {
    this.mAdSourceListener = paramAdSourceListener;
  }

  @Deprecated
  @VisibleForTesting
  void setMoPubNative(MoPubNative paramMoPubNative)
  {
    this.mMoPubNative = paramMoPubNative;
  }

  @VisibleForTesting
  void updateRetryTime()
  {
    this.mRetryTimeMilliseconds = ((int)(2.0D * this.mRetryTimeMilliseconds));
    if (this.mRetryTimeMilliseconds > 300000)
      this.mRetryTimeMilliseconds = 300000;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeAdSource
 * JD-Core Version:    0.6.2
 */