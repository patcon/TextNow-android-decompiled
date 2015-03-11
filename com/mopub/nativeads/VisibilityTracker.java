package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

class VisibilityTracker
{

  @VisibleForTesting
  static final int NUM_ACCESSES_BEFORE_TRIMMING = 50;
  private static final int VISIBILITY_THROTTLE_MILLIS = 100;
  private long mAccessCounter = 0L;
  private boolean mIsVisibilityScheduled;

  @VisibleForTesting
  ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;

  @VisibleForTesting
  final WeakReference<View> mRootView;
  private final Map<View, VisibilityTracker.TrackingInfo> mTrackedViews;
  private final ArrayList<View> mTrimmedViews;
  private final VisibilityTracker.VisibilityChecker mVisibilityChecker;
  private final Handler mVisibilityHandler;
  private final VisibilityTracker.VisibilityRunnable mVisibilityRunnable;
  private VisibilityTracker.VisibilityTrackerListener mVisibilityTrackerListener;

  public VisibilityTracker(Context paramContext)
  {
    this(paramContext, new WeakHashMap(10), new VisibilityTracker.VisibilityChecker(), new Handler());
  }

  @VisibleForTesting
  VisibilityTracker(Context paramContext, Map<View, VisibilityTracker.TrackingInfo> paramMap, VisibilityTracker.VisibilityChecker paramVisibilityChecker, Handler paramHandler)
  {
    this.mTrackedViews = paramMap;
    this.mVisibilityChecker = paramVisibilityChecker;
    this.mVisibilityHandler = paramHandler;
    this.mVisibilityRunnable = new VisibilityTracker.VisibilityRunnable(this);
    this.mTrimmedViews = new ArrayList(50);
    View localView = ((Activity)paramContext).getWindow().getDecorView();
    this.mRootView = new WeakReference(localView);
    ViewTreeObserver localViewTreeObserver = localView.getViewTreeObserver();
    if (!localViewTreeObserver.isAlive())
    {
      MoPubLog.w("Visibility Tracker was unable to track views because the root view tree observer was not alive");
      return;
    }
    this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener()
    {
      public boolean onPreDraw()
      {
        VisibilityTracker.this.scheduleVisibilityCheck();
        return true;
      }
    };
    localViewTreeObserver.addOnPreDrawListener(this.mOnPreDrawListener);
  }

  private void trimTrackedViews(long paramLong)
  {
    Iterator localIterator1 = this.mTrackedViews.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      if (((VisibilityTracker.TrackingInfo)localEntry.getValue()).mAccessOrder < paramLong)
        this.mTrimmedViews.add(localEntry.getKey());
    }
    Iterator localIterator2 = this.mTrimmedViews.iterator();
    while (localIterator2.hasNext())
      removeView((View)localIterator2.next());
    this.mTrimmedViews.clear();
  }

  void addView(View paramView, int paramInt)
  {
    VisibilityTracker.TrackingInfo localTrackingInfo = (VisibilityTracker.TrackingInfo)this.mTrackedViews.get(paramView);
    if (localTrackingInfo == null)
    {
      localTrackingInfo = new VisibilityTracker.TrackingInfo();
      this.mTrackedViews.put(paramView, localTrackingInfo);
      scheduleVisibilityCheck();
    }
    localTrackingInfo.mMinViewablePercent = paramInt;
    localTrackingInfo.mAccessOrder = this.mAccessCounter;
    this.mAccessCounter = (1L + this.mAccessCounter);
    if (this.mAccessCounter % 50L == 0L)
      trimTrackedViews(this.mAccessCounter - 50L);
  }

  void clear()
  {
    this.mTrackedViews.clear();
    this.mVisibilityHandler.removeMessages(0);
    this.mIsVisibilityScheduled = false;
  }

  void destroy()
  {
    clear();
    View localView = (View)this.mRootView.get();
    if ((localView != null) && (this.mOnPreDrawListener != null))
    {
      ViewTreeObserver localViewTreeObserver = localView.getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
      this.mOnPreDrawListener = null;
    }
    this.mVisibilityTrackerListener = null;
  }

  void removeView(View paramView)
  {
    this.mTrackedViews.remove(paramView);
  }

  void scheduleVisibilityCheck()
  {
    if (this.mIsVisibilityScheduled)
      return;
    this.mIsVisibilityScheduled = true;
    this.mVisibilityHandler.postDelayed(this.mVisibilityRunnable, 100L);
  }

  void setVisibilityTrackerListener(VisibilityTracker.VisibilityTrackerListener paramVisibilityTrackerListener)
  {
    this.mVisibilityTrackerListener = paramVisibilityTrackerListener;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.VisibilityTracker
 * JD-Core Version:    0.6.2
 */