package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.l;
import com.google.android.gms.fitness.data.l.a;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.o;
import com.google.android.gms.fitness.request.q;
import com.google.android.gms.fitness.result.DataSourcesResult;

public class lc
  implements SensorsApi
{
  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final o paramo)
  {
    return paramGoogleApiClient.a(new lc.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramo, localb, str);
      }

      protected Status d(Status paramAnonymousStatus)
      {
        return paramAnonymousStatus;
      }
    });
  }

  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final q paramq, final lc.b paramb)
  {
    return paramGoogleApiClient.b(new lc.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        lc.d locald = new lc.d(this, paramb, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramq, locald, str);
      }

      protected Status d(Status paramAnonymousStatus)
      {
        return paramAnonymousStatus;
      }
    });
  }

  public PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent)
  {
    return a(paramGoogleApiClient, new o(paramSensorRequest, null, paramPendingIntent));
  }

  public PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener)
  {
    return a(paramGoogleApiClient, new o(paramSensorRequest, l.a.iV().a(paramOnDataPointListener), null));
  }

  public PendingResult<DataSourcesResult> findDataSources(GoogleApiClient paramGoogleApiClient, final DataSourcesRequest paramDataSourcesRequest)
  {
    return paramGoogleApiClient.a(new lc.a()
    {
      protected DataSourcesResult A(Status paramAnonymousStatus)
      {
        return DataSourcesResult.E(paramAnonymousStatus);
      }

      protected void a(kk paramAnonymouskk)
      {
        lc.c localc = new lc.c(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramDataSourcesRequest, localc, str);
      }
    });
  }

  public PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return a(paramGoogleApiClient, new q(null, paramPendingIntent), null);
  }

  public PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, final OnDataPointListener paramOnDataPointListener)
  {
    l locall = l.a.iV().b(paramOnDataPointListener);
    if (locall == null)
      return new ku(Status.Jv);
    return a(paramGoogleApiClient, new q(locall, null), new lc.b()
    {
      public void jd()
      {
        l.a.iV().c(paramOnDataPointListener);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lc
 * JD-Core Version:    0.6.2
 */