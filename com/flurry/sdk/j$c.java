package com.flurry.sdk;

import android.view.ViewGroup.LayoutParams;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;

abstract class j$c
{
  private static boolean h(AdSpaceLayout paramAdSpaceLayout)
  {
    return paramAdSpaceLayout.b().intValue() != 0;
  }

  private static boolean i(AdSpaceLayout paramAdSpaceLayout)
  {
    return paramAdSpaceLayout.c().intValue() != 0;
  }

  public abstract ViewGroup.LayoutParams a(AdSpaceLayout paramAdSpaceLayout);

  public int b(AdSpaceLayout paramAdSpaceLayout)
  {
    if (h(paramAdSpaceLayout))
      return d(paramAdSpaceLayout);
    return f(paramAdSpaceLayout);
  }

  public int c(AdSpaceLayout paramAdSpaceLayout)
  {
    if (i(paramAdSpaceLayout))
      return e(paramAdSpaceLayout);
    return g(paramAdSpaceLayout);
  }

  public int d(AdSpaceLayout paramAdSpaceLayout)
  {
    return fc.b(paramAdSpaceLayout.b().intValue());
  }

  public int e(AdSpaceLayout paramAdSpaceLayout)
  {
    return fc.b(paramAdSpaceLayout.c().intValue());
  }

  public int f(AdSpaceLayout paramAdSpaceLayout)
  {
    return -1;
  }

  public int g(AdSpaceLayout paramAdSpaceLayout)
  {
    return -2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j.c
 * JD-Core Version:    0.6.2
 */