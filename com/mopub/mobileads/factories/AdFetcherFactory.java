package com.mopub.mobileads.factories;

import com.mopub.mobileads.AdFetcher;
import com.mopub.mobileads.AdViewController;

public class AdFetcherFactory
{
  protected static AdFetcherFactory instance = new AdFetcherFactory();

  public static AdFetcher create(AdViewController paramAdViewController, String paramString)
  {
    return instance.internalCreate(paramAdViewController, paramString);
  }

  @Deprecated
  public static void setInstance(AdFetcherFactory paramAdFetcherFactory)
  {
    instance = paramAdFetcherFactory;
  }

  protected AdFetcher internalCreate(AdViewController paramAdViewController, String paramString)
  {
    return new AdFetcher(paramAdViewController, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.AdFetcherFactory
 * JD-Core Version:    0.6.2
 */