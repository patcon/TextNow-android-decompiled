package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class Batch$Builder
{
  private List<PendingResult<?>> IG = new ArrayList();
  private Looper IH;

  public Batch$Builder(GoogleApiClient paramGoogleApiClient)
  {
    this.IH = paramGoogleApiClient.getLooper();
  }

  public final <R extends Result> BatchResultToken<R> add(PendingResult<R> paramPendingResult)
  {
    BatchResultToken localBatchResultToken = new BatchResultToken(this.IG.size());
    this.IG.add(paramPendingResult);
    return localBatchResultToken;
  }

  public final Batch build()
  {
    return new Batch(this.IG, this.IH, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Batch.Builder
 * JD-Core Version:    0.6.2
 */