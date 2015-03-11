package com.mopub.mobileads;

import com.mopub.common.GpsHelper.GpsHelperListener;

class MoPubConversionTracker$ConversionTrackerGpsHelperListener
  implements GpsHelper.GpsHelperListener
{
  MoPubConversionTracker$ConversionTrackerGpsHelperListener(MoPubConversionTracker paramMoPubConversionTracker)
  {
  }

  public void onFetchAdInfoCompleted()
  {
    new Thread(new MoPubConversionTracker.TrackOpen(this.this$0, null)).start();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubConversionTracker.ConversionTrackerGpsHelperListener
 * JD-Core Version:    0.6.2
 */