package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.aa;
import com.google.android.gms.fitness.request.u;
import com.google.android.gms.fitness.request.w.a;
import com.google.android.gms.fitness.request.y.a;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

public class ld
  implements SessionsApi
{
  private PendingResult<SessionStopResult> a(GoogleApiClient paramGoogleApiClient, final String paramString1, final String paramString2)
  {
    return paramGoogleApiClient.b(new kk.a()
    {
      protected SessionStopResult B(Status paramAnonymousStatus)
      {
        return SessionStopResult.I(paramAnonymousStatus);
      }

      protected void a(kk paramAnonymouskk)
      {
        ld.b localb = new ld.b(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new y.a().bu(paramString1).bv(paramString2).jB(), localb, str);
      }
    });
  }

  public PendingResult<Status> insertSession(GoogleApiClient paramGoogleApiClient, final SessionInsertRequest paramSessionInsertRequest)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramSessionInsertRequest, localb, str);
      }
    });
  }

  public PendingResult<SessionReadResult> readSession(GoogleApiClient paramGoogleApiClient, final SessionReadRequest paramSessionReadRequest)
  {
    return paramGoogleApiClient.a(new kk.a()
    {
      protected SessionReadResult C(Status paramAnonymousStatus)
      {
        return SessionReadResult.H(paramAnonymousStatus);
      }

      protected void a(kk paramAnonymouskk)
      {
        ld.a locala = new ld.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramSessionReadRequest, locala, str);
      }
    });
  }

  public PendingResult<Status> registerForSessions(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        u localu = new u(paramPendingIntent);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(localu, localb, str);
      }
    });
  }

  public PendingResult<Status> startSession(GoogleApiClient paramGoogleApiClient, final Session paramSession)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new w.a().b(paramSession).jA(), localb, str);
      }
    });
  }

  public PendingResult<SessionStopResult> stopSession(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return a(paramGoogleApiClient, null, paramString);
  }

  public PendingResult<Status> unregisterForSessions(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        aa localaa = new aa(paramPendingIntent);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(localaa, localb, str);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ld
 * JD-Core Version:    0.6.2
 */