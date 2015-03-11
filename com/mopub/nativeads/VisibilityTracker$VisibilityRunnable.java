package com.mopub.nativeads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class VisibilityTracker$VisibilityRunnable
  implements Runnable
{
  private final ArrayList<View> mInvisibleViews = new ArrayList();
  private final ArrayList<View> mVisibleViews = new ArrayList();

  VisibilityTracker$VisibilityRunnable(VisibilityTracker paramVisibilityTracker)
  {
  }

  public void run()
  {
    VisibilityTracker.access$002(this.this$0, false);
    Iterator localIterator = VisibilityTracker.access$100(this.this$0).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      View localView = (View)localEntry.getKey();
      int i = ((VisibilityTracker.TrackingInfo)localEntry.getValue()).mMinViewablePercent;
      if (VisibilityTracker.access$200(this.this$0).isVisible(localView, i))
        this.mVisibleViews.add(localView);
      else
        this.mInvisibleViews.add(localView);
    }
    if (VisibilityTracker.access$300(this.this$0) != null)
      VisibilityTracker.access$300(this.this$0).onVisibilityChanged(this.mVisibleViews, this.mInvisibleViews);
    this.mVisibleViews.clear();
    this.mInvisibleViews.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.VisibilityTracker.VisibilityRunnable
 * JD-Core Version:    0.6.2
 */