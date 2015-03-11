package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataItem;

public class f$a
  implements DataApi.DataItemResult
{
  private final Status CM;
  private final DataItem avs;

  public f$a(Status paramStatus, DataItem paramDataItem)
  {
    this.CM = paramStatus;
    this.avs = paramDataItem;
  }

  public DataItem getDataItem()
  {
    return this.avs;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.f.a
 * JD-Core Version:    0.6.2
 */