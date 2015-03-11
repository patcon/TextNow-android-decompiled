package com.mopub.mobileads.factories;

import android.content.Context;
import android.view.View;
import com.mopub.mobileads.AdConfiguration;
import com.mopub.mobileads.ViewGestureDetector;

public class ViewGestureDetectorFactory
{
  protected static ViewGestureDetectorFactory instance = new ViewGestureDetectorFactory();

  public static ViewGestureDetector create(Context paramContext, View paramView, AdConfiguration paramAdConfiguration)
  {
    return instance.internalCreate(paramContext, paramView, paramAdConfiguration);
  }

  @Deprecated
  public static void setInstance(ViewGestureDetectorFactory paramViewGestureDetectorFactory)
  {
    instance = paramViewGestureDetectorFactory;
  }

  protected ViewGestureDetector internalCreate(Context paramContext, View paramView, AdConfiguration paramAdConfiguration)
  {
    return new ViewGestureDetector(paramContext, paramView, paramAdConfiguration);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.ViewGestureDetectorFactory
 * JD-Core Version:    0.6.2
 */