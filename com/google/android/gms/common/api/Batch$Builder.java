package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class Batch$Builder
{
  private List<PendingResult<?>> DE = new ArrayList();
  private Looper DF;

  public Batch$Builder(GoogleApiClient paramGoogleApiClient)
  {
    this.DF = paramGoogleApiClient.getLooper();
  }

  public final <R extends Result> BatchResultToken<R> add(PendingResult<R> paramPendingResult)
  {
    BatchResultToken localBatchResultToken = new BatchResultToken(this.DE.size());
    this.DE.add(paramPendingResult);
    return localBatchResultToken;
  }

  public final Batch build()
  {
    return new Batch(this.DE, this.DF, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Batch.Builder
 * JD-Core Version:    0.6.2
 */