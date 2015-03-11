package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

public abstract interface DataItemAsset extends Freezable<DataItemAsset>
{
  public abstract String getDataItemKey();

  public abstract String getId();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataItemAsset
 * JD-Core Version:    0.6.2
 */