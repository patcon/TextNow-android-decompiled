package com.mopub.nativeads;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;

class VisibilityTracker$VisibilityChecker
{
  private final Rect mClipRect = new Rect();

  boolean hasRequiredTimeElapsed(long paramLong, int paramInt)
  {
    return SystemClock.uptimeMillis() - paramLong >= paramInt;
  }

  boolean isVisible(View paramView, int paramInt)
  {
    if ((paramView == null) || (paramView.getVisibility() != 0) || (paramView.getParent() == null));
    long l1;
    long l2;
    do
    {
      do
        return false;
      while (!paramView.getGlobalVisibleRect(this.mClipRect));
      l1 = this.mClipRect.height() * this.mClipRect.width();
      l2 = paramView.getHeight() * paramView.getWidth();
    }
    while ((l2 <= 0L) || (l1 * 100L < l2 * paramInt));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.VisibilityTracker.VisibilityChecker
 * JD-Core Version:    0.6.2
 */