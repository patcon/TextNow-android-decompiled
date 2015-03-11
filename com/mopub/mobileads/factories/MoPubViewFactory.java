package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.MoPubView;

public class MoPubViewFactory
{
  protected static MoPubViewFactory instance = new MoPubViewFactory();

  public static MoPubView create(Context paramContext)
  {
    return instance.internalCreate(paramContext);
  }

  @Deprecated
  public static void setInstance(MoPubViewFactory paramMoPubViewFactory)
  {
    instance = paramMoPubViewFactory;
  }

  protected MoPubView internalCreate(Context paramContext)
  {
    return new MoPubView(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.MoPubViewFactory
 * JD-Core Version:    0.6.2
 */