package com.flurry.sdk;

import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;

final class j$d extends j.c
{
  j$d()
  {
    super(null);
  }

  public final ViewGroup.LayoutParams a(AdSpaceLayout paramAdSpaceLayout)
  {
    return new LinearLayout.LayoutParams(b(paramAdSpaceLayout), c(paramAdSpaceLayout));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j.d
 * JD-Core Version:    0.6.2
 */