package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

public class f$b
  implements DataApi.DeleteDataItemsResult
{
  private final Status CM;
  private final int avt;

  public f$b(Status paramStatus, int paramInt)
  {
    this.CM = paramStatus;
    this.avt = paramInt;
  }

  public int getNumDeleted()
  {
    return this.avt;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.f.b
 * JD-Core Version:    0.6.2
 */