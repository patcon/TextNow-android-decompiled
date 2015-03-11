package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

public abstract interface SessionsApi
{
  public abstract PendingResult<Status> insertSession(GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest);

  public abstract PendingResult<SessionReadResult> readSession(GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest);

  public abstract PendingResult<Status> registerForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);

  public abstract PendingResult<Status> startSession(GoogleApiClient paramGoogleApiClient, Session paramSession);

  public abstract PendingResult<SessionStopResult> stopSession(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract PendingResult<Status> unregisterForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.SessionsApi
 * JD-Core Version:    0.6.2
 */