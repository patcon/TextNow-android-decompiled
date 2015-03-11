package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public class ag$a
  implements MessageApi.SendMessageResult
{
  private final Status CM;
  private final int uQ;

  public ag$a(Status paramStatus, int paramInt)
  {
    this.CM = paramStatus;
    this.uQ = paramInt;
  }

  public int getRequestId()
  {
    return this.uQ;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ag.a
 * JD-Core Version:    0.6.2
 */