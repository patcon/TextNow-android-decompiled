package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.mobileads.AdConfiguration;
import com.mopub.mobileads.MraidView;
import com.mopub.mobileads.MraidView.ExpansionStyle;
import com.mopub.mobileads.MraidView.NativeCloseButtonStyle;
import com.mopub.mobileads.MraidView.PlacementType;

public class MraidViewFactory
{
  protected static MraidViewFactory instance = new MraidViewFactory();

  public static MraidView create(Context paramContext, AdConfiguration paramAdConfiguration)
  {
    return instance.internalCreate(paramContext, paramAdConfiguration);
  }

  public static MraidView create(Context paramContext, AdConfiguration paramAdConfiguration, MraidView.ExpansionStyle paramExpansionStyle, MraidView.NativeCloseButtonStyle paramNativeCloseButtonStyle, MraidView.PlacementType paramPlacementType)
  {
    return instance.internalCreate(paramContext, paramAdConfiguration, paramExpansionStyle, paramNativeCloseButtonStyle, paramPlacementType);
  }

  @Deprecated
  public static void setInstance(MraidViewFactory paramMraidViewFactory)
  {
    instance = paramMraidViewFactory;
  }

  protected MraidView internalCreate(Context paramContext, AdConfiguration paramAdConfiguration)
  {
    return new MraidView(paramContext, paramAdConfiguration);
  }

  protected MraidView internalCreate(Context paramContext, AdConfiguration paramAdConfiguration, MraidView.ExpansionStyle paramExpansionStyle, MraidView.NativeCloseButtonStyle paramNativeCloseButtonStyle, MraidView.PlacementType paramPlacementType)
  {
    return new MraidView(paramContext, paramAdConfiguration, paramExpansionStyle, paramNativeCloseButtonStyle, paramPlacementType);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.MraidViewFactory
 * JD-Core Version:    0.6.2
 */