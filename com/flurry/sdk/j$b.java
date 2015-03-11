package com.flurry.sdk;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;

final class j$b extends j.c
{
  j$b()
  {
    super(null);
  }

  public final ViewGroup.LayoutParams a(AdSpaceLayout paramAdSpaceLayout)
  {
    return new FrameLayout.LayoutParams(b(paramAdSpaceLayout), c(paramAdSpaceLayout), 17);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j.b
 * JD-Core Version:    0.6.2
 */