package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

public abstract interface SensorsApi
{
  public abstract PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent);

  public abstract PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener);

  public abstract PendingResult<DataSourcesResult> findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest);

  public abstract PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);

  public abstract PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, OnDataPointListener paramOnDataPointListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.SensorsApi
 * JD-Core Version:    0.6.2
 */