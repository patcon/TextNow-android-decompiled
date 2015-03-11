package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;

@Deprecated
public final class AdapterHelper
{
  private final WeakReference<Activity> mActivity;
  private final Context mApplicationContext;
  private final int mInterval;
  private final int mStart;

  @Deprecated
  public AdapterHelper(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("Illegal argument: Context was null.");
    if (!(paramContext instanceof Activity))
      throw new IllegalArgumentException("Illegal argument: Context must be instance of Activity.");
    if (paramInt1 < 0)
      throw new IllegalArgumentException("Illegal argument: negative starting position.");
    if (paramInt2 < 2)
      throw new IllegalArgumentException("Illegal argument: interval must be at least 2.");
    this.mActivity = new WeakReference((Activity)paramContext);
    this.mApplicationContext = paramContext.getApplicationContext();
    this.mStart = paramInt1;
    this.mInterval = paramInt2;
  }

  private int numberOfAdsSeenUpToPosition(int paramInt)
  {
    if (paramInt <= this.mStart)
      return 0;
    return 1 + (int)Math.floor((paramInt - this.mStart) / this.mInterval);
  }

  private int numberOfAdsThatCouldFitWithContent(int paramInt)
  {
    if (paramInt <= this.mStart)
      return 0;
    int i = -1 + this.mInterval;
    if ((paramInt - this.mStart) % i == 0)
      return (paramInt - this.mStart) / i;
    return 1 + (int)Math.floor((paramInt - this.mStart) / i);
  }

  @Deprecated
  @VisibleForTesting
  final void clearActivityContext()
  {
    this.mActivity.clear();
  }

  @Deprecated
  public final View getAdView(View paramView, ViewGroup paramViewGroup, NativeResponse paramNativeResponse, ViewBinder paramViewBinder, MoPubNative.MoPubNativeListener paramMoPubNativeListener)
  {
    Activity localActivity = (Activity)this.mActivity.get();
    if (localActivity == null)
    {
      MoPubLog.d("Weak reference to Activity Context in AdapterHelper became null. Returning empty view.");
      return new View(this.mApplicationContext);
    }
    return NativeAdViewHelper.getAdView(paramView, paramViewGroup, localActivity, paramNativeResponse, paramViewBinder, paramMoPubNativeListener);
  }

  @Deprecated
  public final boolean isAdPosition(int paramInt)
  {
    if (paramInt < this.mStart);
    while ((paramInt - this.mStart) % this.mInterval != 0)
      return false;
    return true;
  }

  @Deprecated
  public final int shiftedCount(int paramInt)
  {
    return paramInt + numberOfAdsThatCouldFitWithContent(paramInt);
  }

  @Deprecated
  public final int shiftedPosition(int paramInt)
  {
    return paramInt - numberOfAdsSeenUpToPosition(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.AdapterHelper
 * JD-Core Version:    0.6.2
 */