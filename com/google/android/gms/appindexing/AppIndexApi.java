package com.google.android.gms.appindexing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

public abstract interface AppIndexApi
{
  public abstract PendingResult<Status> view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List<AppIndexApi.AppIndexingLink> paramList);

  public abstract PendingResult<Status> view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List<AppIndexApi.AppIndexingLink> paramList);

  public abstract PendingResult<Status> viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent);

  public abstract PendingResult<Status> viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appindexing.AppIndexApi
 * JD-Core Version:    0.6.2
 */