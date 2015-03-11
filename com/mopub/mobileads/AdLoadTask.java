package com.mopub.mobileads;

import java.lang.ref.WeakReference;
import org.apache.http.HttpResponse;

abstract class AdLoadTask
{
  WeakReference<AdViewController> mWeakAdViewController;

  AdLoadTask(AdViewController paramAdViewController)
  {
    this.mWeakAdViewController = new WeakReference(paramAdViewController);
  }

  static AdLoadTask fromHttpResponse(HttpResponse paramHttpResponse, AdViewController paramAdViewController)
  {
    return new AdLoadTask.TaskExtractor(paramHttpResponse, paramAdViewController).extract();
  }

  abstract void cleanup();

  abstract void execute();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdLoadTask
 * JD-Core Version:    0.6.2
 */