package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.kr;

public final class MomentBuffer extends DataBuffer<Moment>
{
  public MomentBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  public final Moment get(int paramInt)
  {
    return new kr(this.DG, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.MomentBuffer
 * JD-Core Version:    0.6.2
 */