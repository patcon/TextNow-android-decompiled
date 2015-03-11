package com.mopub.mobileads;

import com.mopub.common.GpsHelper.GpsHelperListener;

class AdViewController$AdViewControllerGpsHelperListener
  implements GpsHelper.GpsHelperListener
{
  AdViewController$AdViewControllerGpsHelperListener(AdViewController paramAdViewController)
  {
  }

  public void onFetchAdInfoCompleted()
  {
    String str = this.this$0.generateAdUrl();
    this.this$0.loadNonJavascript(str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdViewController.AdViewControllerGpsHelperListener
 * JD-Core Version:    0.6.2
 */