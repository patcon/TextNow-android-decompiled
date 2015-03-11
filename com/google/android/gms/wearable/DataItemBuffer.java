package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import com.google.android.gms.wearable.internal.o;

public class DataItemBuffer extends g<DataItem>
  implements Result
{
  private final Status CM;

  public DataItemBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.CM = new Status(paramDataHolder.getStatusCode());
  }

  protected String gD()
  {
    return "path";
  }

  public Status getStatus()
  {
    return this.CM;
  }

  protected DataItem q(int paramInt1, int paramInt2)
  {
    return new o(this.II, paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataItemBuffer
 * JD-Core Version:    0.6.2
 */