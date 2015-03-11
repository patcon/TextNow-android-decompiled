package com.flurry.sdk;

import com.flurry.android.AdCreative;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.ScreenOrientationType;
import java.util.List;

public final class cc
{
  public static AdCreative a(AdSpaceLayout paramAdSpaceLayout)
  {
    if (paramAdSpaceLayout == null)
      return null;
    return new AdCreative(paramAdSpaceLayout.c().intValue(), paramAdSpaceLayout.b().intValue(), paramAdSpaceLayout.e().toString(), paramAdSpaceLayout.d().toString(), paramAdSpaceLayout.f().toString());
  }

  public static AdCreative a(AdUnit paramAdUnit)
  {
    if (paramAdUnit == null)
      return null;
    List localList = paramAdUnit.d();
    if ((localList == null) || (localList.isEmpty()))
      return null;
    AdFrame localAdFrame = (AdFrame)localList.get(0);
    if (localAdFrame == null)
      return null;
    AdSpaceLayout localAdSpaceLayout = localAdFrame.e();
    if (localAdSpaceLayout == null)
      return null;
    return a(localAdSpaceLayout);
  }

  public static ScreenOrientationType a()
  {
    int i = fc.i();
    if (i == 1)
      return ScreenOrientationType.a;
    if (i == 2)
      return ScreenOrientationType.b;
    return ScreenOrientationType.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cc
 * JD-Core Version:    0.6.2
 */