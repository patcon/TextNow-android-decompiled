package com.mopub.nativeads;

import com.mopub.common.Preconditions.NoThrow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoPubNativeAdPositioning$MoPubClientPositioning
{
  public static final int NO_REPEAT = 2147483647;
  private final ArrayList<Integer> mFixedPositions = new ArrayList();
  private int mRepeatInterval = 2147483647;

  public MoPubClientPositioning addFixedPosition(int paramInt)
  {
    boolean bool;
    if (paramInt >= 0)
    {
      bool = true;
      if (Preconditions.NoThrow.checkArgument(bool))
        break label20;
    }
    label20: int i;
    do
    {
      return this;
      bool = false;
      break;
      i = Collections.binarySearch(this.mFixedPositions, Integer.valueOf(paramInt));
    }
    while (i >= 0);
    this.mFixedPositions.add(i ^ 0xFFFFFFFF, Integer.valueOf(paramInt));
    return this;
  }

  public MoPubClientPositioning enableRepeatingPositions(int paramInt)
  {
    int i = 1;
    if (paramInt > i);
    while (!Preconditions.NoThrow.checkArgument(i, "Repeating interval must be greater than 1"))
    {
      this.mRepeatInterval = 2147483647;
      return this;
      i = 0;
    }
    this.mRepeatInterval = paramInt;
    return this;
  }

  List<Integer> getFixedPositions()
  {
    return this.mFixedPositions;
  }

  int getRepeatingInterval()
  {
    return this.mRepeatInterval;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning
 * JD-Core Version:    0.6.2
 */