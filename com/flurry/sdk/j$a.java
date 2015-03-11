package com.flurry.sdk;

import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout.LayoutParams;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;

final class j$a extends j.c
{
  j$a()
  {
    super(null);
  }

  public final ViewGroup.LayoutParams a(AdSpaceLayout paramAdSpaceLayout)
  {
    eo.a(5, j.a(), "AbsoluteLayout is deprecated, please consider to use FrameLayout or RelativeLayout for banner ad container view");
    return new AbsoluteLayout.LayoutParams(b(paramAdSpaceLayout), c(paramAdSpaceLayout), 0, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j.a
 * JD-Core Version:    0.6.2
 */