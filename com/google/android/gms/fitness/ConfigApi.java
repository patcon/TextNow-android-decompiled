package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

public abstract interface ConfigApi
{
  public abstract PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest);

  public abstract PendingResult<Status> disableFit(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<DataTypeResult> readDataType(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.ConfigApi
 * JD-Core Version:    0.6.2
 */