package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;

public abstract interface HistoryApi
{
  public abstract PendingResult<Status> deleteData(GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest);

  public abstract PendingResult<Status> insertData(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet);

  public abstract PendingResult<DataReadResult> readData(GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.HistoryApi
 * JD-Core Version:    0.6.2
 */