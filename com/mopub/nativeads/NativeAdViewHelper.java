package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.logging.MoPubLog;
import java.util.WeakHashMap;

@Deprecated
class NativeAdViewHelper
{
  private static final WeakHashMap<Context, ImpressionTracker> sImpressionTrackerMap = new WeakHashMap();

  private static void cleanUpImpressionTracking(Context paramContext, View paramView)
  {
    getImpressionTracker(paramContext).removeView(paramView);
  }

  @Deprecated
  static View getAdView(View paramView, ViewGroup paramViewGroup, Context paramContext, NativeResponse paramNativeResponse, ViewBinder paramViewBinder, MoPubNative.MoPubNativeListener paramMoPubNativeListener)
  {
    if (paramViewBinder == null)
    {
      MoPubLog.d("ViewBinder is null, returning empty view.");
      return new View(paramContext);
    }
    MoPubNativeAdRenderer localMoPubNativeAdRenderer = new MoPubNativeAdRenderer(paramViewBinder);
    if (paramView == null)
      paramView = localMoPubNativeAdRenderer.createAdView(paramContext, paramViewGroup);
    cleanUpImpressionTracking(paramContext, paramView);
    if (paramNativeResponse == null)
    {
      MoPubLog.d("NativeResponse is null, returning hidden view.");
      paramView.setVisibility(8);
      return paramView;
    }
    if (paramNativeResponse.isDestroyed())
    {
      MoPubLog.d("NativeResponse is destroyed, returning hidden view.");
      paramView.setVisibility(8);
      return paramView;
    }
    localMoPubNativeAdRenderer.renderAdView(paramView, paramNativeResponse);
    prepareImpressionTracking(paramContext, paramView, paramNativeResponse);
    return paramView;
  }

  private static ImpressionTracker getImpressionTracker(Context paramContext)
  {
    ImpressionTracker localImpressionTracker = (ImpressionTracker)sImpressionTrackerMap.get(paramContext);
    if (localImpressionTracker == null)
    {
      localImpressionTracker = new ImpressionTracker(paramContext);
      sImpressionTrackerMap.put(paramContext, localImpressionTracker);
    }
    return localImpressionTracker;
  }

  private static void prepareImpressionTracking(Context paramContext, View paramView, NativeResponse paramNativeResponse)
  {
    getImpressionTracker(paramContext).addView(paramView, paramNativeResponse);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeAdViewHelper
 * JD-Core Version:    0.6.2
 */