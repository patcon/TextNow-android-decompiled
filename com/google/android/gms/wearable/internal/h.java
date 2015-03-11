package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class h extends d
  implements DataEvent
{
  private final int aaK;

  public h(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.aaK = paramInt2;
  }

  public final DataItem getDataItem()
  {
    return new o(this.II, this.JX, this.aaK);
  }

  public final int getType()
  {
    return getInteger("event_type");
  }

  public final DataEvent pW()
  {
    return new g(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.h
 * JD-Core Version:    0.6.2
 */