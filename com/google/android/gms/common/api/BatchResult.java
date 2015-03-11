package com.google.android.gms.common.api;

import com.google.android.gms.internal.hm;
import java.util.concurrent.TimeUnit;

public final class BatchResult
  implements Result
{
  private final PendingResult<?>[] DC;
  private final Status yz;

  BatchResult(Status paramStatus, PendingResult<?>[] paramArrayOfPendingResult)
  {
    this.yz = paramStatus;
    this.DC = paramArrayOfPendingResult;
  }

  public final Status getStatus()
  {
    return this.yz;
  }

  public final <R extends Result> R take(BatchResultToken<R> paramBatchResultToken)
  {
    if (paramBatchResultToken.mId < this.DC.length);
    for (boolean bool = true; ; bool = false)
    {
      hm.b(bool, "The result token does not belong to this batch");
      return this.DC[paramBatchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BatchResult
 * JD-Core Version:    0.6.2
 */