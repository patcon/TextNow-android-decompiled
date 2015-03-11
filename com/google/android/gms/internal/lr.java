package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

public class lr
  implements ActivityRecognitionApi
{
  public PendingResult<Status> removeActivityUpdates(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new lr.a(paramPendingIntent)
    {
      protected void a(lz paramAnonymouslz)
      {
        paramAnonymouslz.removeActivityUpdates(paramPendingIntent);
        b(Status.Jv);
      }
    });
  }

  public PendingResult<Status> requestActivityUpdates(GoogleApiClient paramGoogleApiClient, final long paramLong, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new lr.a(paramLong)
    {
      protected void a(lz paramAnonymouslz)
      {
        paramAnonymouslz.requestActivityUpdates(paramLong, this.aeC);
        b(Status.Jv);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lr
 * JD-Core Version:    0.6.2
 */