package com.mopub.mobileads;

import java.lang.ref.WeakReference;
import java.util.Map;

class AdLoadTask$CustomEventAdLoadTask extends AdLoadTask
{
  private Map<String, String> mParamsMap;

  public AdLoadTask$CustomEventAdLoadTask(AdViewController paramAdViewController, Map<String, String> paramMap)
  {
    super(paramAdViewController);
    this.mParamsMap = paramMap;
  }

  void cleanup()
  {
    this.mParamsMap = null;
  }

  void execute()
  {
    AdViewController localAdViewController = (AdViewController)this.mWeakAdViewController.get();
    if ((localAdViewController == null) || (localAdViewController.isDestroyed()))
      return;
    localAdViewController.setNotLoading();
    localAdViewController.getMoPubView().loadCustomEvent(this.mParamsMap);
  }

  @Deprecated
  Map<String, String> getParamsMap()
  {
    return this.mParamsMap;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdLoadTask.CustomEventAdLoadTask
 * JD-Core Version:    0.6.2
 */