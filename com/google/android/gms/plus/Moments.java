package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.moments.Moment;

public abstract interface Moments
{
  public abstract PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3);

  public abstract PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract PendingResult<Status> write(GoogleApiClient paramGoogleApiClient, Moment paramMoment);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Moments
 * JD-Core Version:    0.6.2
 */