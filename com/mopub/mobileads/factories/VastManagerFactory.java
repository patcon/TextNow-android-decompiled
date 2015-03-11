package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.util.vast.VastManager;

public class VastManagerFactory
{
  protected static VastManagerFactory instance = new VastManagerFactory();

  public static VastManager create(Context paramContext)
  {
    return instance.internalCreate(paramContext);
  }

  @Deprecated
  public static void setInstance(VastManagerFactory paramVastManagerFactory)
  {
    instance = paramVastManagerFactory;
  }

  public VastManager internalCreate(Context paramContext)
  {
    return new VastManager(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.VastManagerFactory
 * JD-Core Version:    0.6.2
 */