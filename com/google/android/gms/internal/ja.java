package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

public class ja
  implements ActivityRecognitionApi
{
  public PendingResult<Status> removeActivityUpdates(GoogleApiClient paramGoogleApiClient, final PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new ja.a(paramPendingIntent)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.removeActivityUpdates(paramPendingIntent);
        b(Status.En);
      }
    });
  }

  public PendingResult<Status> requestActivityUpdates(GoogleApiClient paramGoogleApiClient, final long paramLong, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new ja.a(paramLong)
    {
      protected void a(jg paramAnonymousjg)
      {
        paramAnonymousjg.requestActivityUpdates(paramLong, this.Vu);
        b(Status.En);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ja
 * JD-Core Version:    0.6.2
 */