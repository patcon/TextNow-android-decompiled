package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.mopub.common.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

class ImpressionTracker
{
  private static final int PERIOD = 250;
  private final Handler mPollHandler;
  private final ImpressionTracker.PollingRunnable mPollingRunnable;
  private final Map<View, TimestampWrapper<NativeResponse>> mPollingViews;
  private final Map<View, NativeResponse> mTrackedViews;
  private final VisibilityTracker.VisibilityChecker mVisibilityChecker;
  private final VisibilityTracker mVisibilityTracker;
  private VisibilityTracker.VisibilityTrackerListener mVisibilityTrackerListener;

  ImpressionTracker(Context paramContext)
  {
    this(new WeakHashMap(), new WeakHashMap(), new VisibilityTracker.VisibilityChecker(), new VisibilityTracker(paramContext), new Handler());
  }

  @VisibleForTesting
  ImpressionTracker(Map<View, NativeResponse> paramMap, Map<View, TimestampWrapper<NativeResponse>> paramMap1, VisibilityTracker.VisibilityChecker paramVisibilityChecker, VisibilityTracker paramVisibilityTracker, Handler paramHandler)
  {
    this.mTrackedViews = paramMap;
    this.mPollingViews = paramMap1;
    this.mVisibilityChecker = paramVisibilityChecker;
    this.mVisibilityTracker = paramVisibilityTracker;
    this.mVisibilityTrackerListener = new VisibilityTracker.VisibilityTrackerListener()
    {
      public void onVisibilityChanged(List<View> paramAnonymousList1, List<View> paramAnonymousList2)
      {
        Iterator localIterator1 = paramAnonymousList1.iterator();
        while (localIterator1.hasNext())
        {
          View localView2 = (View)localIterator1.next();
          NativeResponse localNativeResponse = (NativeResponse)ImpressionTracker.this.mTrackedViews.get(localView2);
          if (localNativeResponse == null)
          {
            ImpressionTracker.this.removeView(localView2);
          }
          else
          {
            TimestampWrapper localTimestampWrapper = (TimestampWrapper)ImpressionTracker.this.mPollingViews.get(localView2);
            if ((localTimestampWrapper == null) || (!localNativeResponse.equals(localTimestampWrapper.mInstance)))
              ImpressionTracker.this.mPollingViews.put(localView2, new TimestampWrapper(localNativeResponse));
          }
        }
        Iterator localIterator2 = paramAnonymousList2.iterator();
        while (localIterator2.hasNext())
        {
          View localView1 = (View)localIterator2.next();
          ImpressionTracker.this.mPollingViews.remove(localView1);
        }
        ImpressionTracker.this.scheduleNextPoll();
      }
    };
    this.mVisibilityTracker.setVisibilityTrackerListener(this.mVisibilityTrackerListener);
    this.mPollHandler = paramHandler;
    this.mPollingRunnable = new ImpressionTracker.PollingRunnable(this);
  }

  private void removePollingView(View paramView)
  {
    this.mPollingViews.remove(paramView);
  }

  void addView(View paramView, NativeResponse paramNativeResponse)
  {
    if (this.mTrackedViews.get(paramView) == paramNativeResponse);
    do
    {
      return;
      removeView(paramView);
    }
    while ((paramNativeResponse.getRecordedImpression()) || (paramNativeResponse.isDestroyed()));
    this.mTrackedViews.put(paramView, paramNativeResponse);
    this.mVisibilityTracker.addView(paramView, paramNativeResponse.getImpressionMinPercentageViewed());
  }

  void clear()
  {
    this.mTrackedViews.clear();
    this.mPollingViews.clear();
    this.mVisibilityTracker.clear();
    this.mPollHandler.removeMessages(0);
  }

  void destroy()
  {
    clear();
    this.mVisibilityTracker.destroy();
    this.mVisibilityTrackerListener = null;
  }

  @Deprecated
  @VisibleForTesting
  VisibilityTracker.VisibilityTrackerListener getVisibilityTrackerListener()
  {
    return this.mVisibilityTrackerListener;
  }

  void removeView(View paramView)
  {
    this.mTrackedViews.remove(paramView);
    removePollingView(paramView);
    this.mVisibilityTracker.removeView(paramView);
  }

  @VisibleForTesting
  void scheduleNextPoll()
  {
    if (this.mPollHandler.hasMessages(0))
      return;
    this.mPollHandler.postDelayed(this.mPollingRunnable, 250L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImpressionTracker
 * JD-Core Version:    0.6.2
 */