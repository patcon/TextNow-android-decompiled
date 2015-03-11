package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.e.a;
import com.google.android.gms.fitness.result.DataReadResult;

public class kz
  implements HistoryApi
{
  public PendingResult<Status> deleteData(GoogleApiClient paramGoogleApiClient, final DataDeleteRequest paramDataDeleteRequest)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramDataDeleteRequest, localb, str);
      }
    });
  }

  public PendingResult<Status> insertData(GoogleApiClient paramGoogleApiClient, final DataSet paramDataSet)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new e.a().b(paramDataSet).jj(), localb, str);
      }
    });
  }

  public PendingResult<DataReadResult> readData(GoogleApiClient paramGoogleApiClient, final DataReadRequest paramDataReadRequest)
  {
    return paramGoogleApiClient.a(new kk.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        kz.a locala = new kz.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramDataReadRequest, locala, str);
      }

      protected DataReadResult y(Status paramAnonymousStatus)
      {
        return DataReadResult.a(paramAnonymousStatus, paramDataReadRequest);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kz
 * JD-Core Version:    0.6.2
 */