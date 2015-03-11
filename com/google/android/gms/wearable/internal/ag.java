package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public final class ag
  implements MessageApi
{
  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, final MessageApi.MessageListener paramMessageListener, final IntentFilter[] paramArrayOfIntentFilter)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramMessageListener, paramArrayOfIntentFilter);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }

  public final PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener)
  {
    return a(paramGoogleApiClient, paramMessageListener, null);
  }

  public final PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, final MessageApi.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramMessageListener);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }

  public final PendingResult<MessageApi.SendMessageResult> sendMessage(GoogleApiClient paramGoogleApiClient, final String paramString1, final String paramString2, final byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramString1, paramString2, paramArrayOfByte);
      }

      protected MessageApi.SendMessageResult aJ(Status paramAnonymousStatus)
      {
        return new ag.a(paramAnonymousStatus, -1);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ag
 * JD-Core Version:    0.6.2
 */