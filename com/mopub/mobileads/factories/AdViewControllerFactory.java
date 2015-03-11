package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.AdViewController;
import com.mopub.mobileads.MoPubView;

public class AdViewControllerFactory
{
  protected static AdViewControllerFactory instance = new AdViewControllerFactory();

  public static AdViewController create(Context paramContext, MoPubView paramMoPubView)
  {
    return instance.internalCreate(paramContext, paramMoPubView);
  }

  @Deprecated
  public static void setInstance(AdViewControllerFactory paramAdViewControllerFactory)
  {
    instance = paramAdViewControllerFactory;
  }

  protected AdViewController internalCreate(Context paramContext, MoPubView paramMoPubView)
  {
    return new AdViewController(paramContext, paramMoPubView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.AdViewControllerFactory
 * JD-Core Version:    0.6.2
 */