package com.mopub.nativeads;

import android.view.View;
import com.mopub.common.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
class ImpressionTracker$PollingRunnable
  implements Runnable
{
  private final ArrayList<View> mRemovedViews = new ArrayList();

  ImpressionTracker$PollingRunnable(ImpressionTracker paramImpressionTracker)
  {
  }

  public void run()
  {
    Iterator localIterator1 = ImpressionTracker.access$100(this.this$0).entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      View localView2 = (View)localEntry.getKey();
      TimestampWrapper localTimestampWrapper = (TimestampWrapper)localEntry.getValue();
      if (ImpressionTracker.access$200(this.this$0).hasRequiredTimeElapsed(localTimestampWrapper.mCreatedTimestamp, ((NativeResponse)localTimestampWrapper.mInstance).getImpressionMinTimeViewed()))
      {
        ((NativeResponse)localTimestampWrapper.mInstance).recordImpression(localView2);
        this.mRemovedViews.add(localView2);
      }
    }
    Iterator localIterator2 = this.mRemovedViews.iterator();
    while (localIterator2.hasNext())
    {
      View localView1 = (View)localIterator2.next();
      this.this$0.removeView(localView1);
    }
    this.mRemovedViews.clear();
    if (!ImpressionTracker.access$100(this.this$0).isEmpty())
      this.this$0.scheduleNextPoll();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ImpressionTracker.PollingRunnable
 * JD-Core Version:    0.6.2
 */