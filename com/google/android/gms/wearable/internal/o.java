package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

public final class o extends d
  implements DataItem
{
  private final int aaK;

  public o(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.aaK = paramInt2;
  }

  public final Map<String, DataItemAsset> getAssets()
  {
    HashMap localHashMap = new HashMap(this.aaK);
    for (int i = 0; i < this.aaK; i++)
    {
      k localk = new k(this.II, i + this.JX);
      if (localk.getDataItemKey() != null)
        localHashMap.put(localk.getDataItemKey(), localk);
    }
    return localHashMap;
  }

  public final byte[] getData()
  {
    return getByteArray("data");
  }

  public final Uri getUri()
  {
    return Uri.parse(getString("path"));
  }

  public final DataItem pY()
  {
    return new l(this);
  }

  public final DataItem setData(byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.o
 * JD-Core Version:    0.6.2
 */