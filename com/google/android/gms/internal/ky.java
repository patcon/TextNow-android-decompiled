package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.result.DataTypeResult;

public class ky
  implements ConfigApi
{
  public PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient paramGoogleApiClient, final DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    return paramGoogleApiClient.b(new kk.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        ky.a locala = new ky.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramDataTypeCreateRequest, locala, str);
      }

      protected DataTypeResult x(Status paramAnonymousStatus)
      {
        return DataTypeResult.F(paramAnonymousStatus);
      }
    });
  }

  public PendingResult<Status> disableFit(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(localb, str);
      }
    });
  }

  public PendingResult<DataTypeResult> readDataType(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.a(new kk.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        ky.a locala = new ky.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(this.TG, locala, str);
      }

      protected DataTypeResult x(Status paramAnonymousStatus)
      {
        return DataTypeResult.F(paramAnonymousStatus);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ky
 * JD-Core Version:    0.6.2
 */