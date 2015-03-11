package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.data.Subscription.a;
import com.google.android.gms.fitness.request.af;
import com.google.android.gms.fitness.request.af.a;
import com.google.android.gms.fitness.request.aj;
import com.google.android.gms.fitness.request.aj.a;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.request.m.a;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public class lb
  implements RecordingApi
{
  private PendingResult<ListSubscriptionsResult> a(GoogleApiClient paramGoogleApiClient, final m paramm)
  {
    return paramGoogleApiClient.a(new kk.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        lb.a locala = new lb.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramm, locala, str);
      }

      protected ListSubscriptionsResult z(Status paramAnonymousStatus)
      {
        return ListSubscriptionsResult.G(paramAnonymousStatus);
      }
    });
  }

  public PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final af paramaf)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramaf, localb, str);
      }
    });
  }

  public PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final aj paramaj)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramaj, localb, str);
      }
    });
  }

  public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient, new m.a().jq());
  }

  public PendingResult<ListSubscriptionsResult> listSubscriptions(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return a(paramGoogleApiClient, new m.a().c(paramDataType).jq());
  }

  public PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    return a(paramGoogleApiClient, new af.a().b(new Subscription.a().b(paramDataSource).iZ()).jF());
  }

  public PendingResult<Status> subscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return a(paramGoogleApiClient, new af.a().b(new Subscription.a().b(paramDataType).iZ()).jF());
  }

  public PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    return a(paramGoogleApiClient, new aj.a().d(paramDataSource).jG());
  }

  public PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return a(paramGoogleApiClient, new aj.a().d(paramDataType).jG());
  }

  public PendingResult<Status> unsubscribe(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    if (paramSubscription.getDataType() == null)
      return unsubscribe(paramGoogleApiClient, paramSubscription.getDataSource());
    return unsubscribe(paramGoogleApiClient, paramSubscription.getDataType());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lb
 * JD-Core Version:    0.6.2
 */