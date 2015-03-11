package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.o;

public final class NotifyTransactionStatusRequest$Builder
{
  private NotifyTransactionStatusRequest$Builder(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
  }

  public final NotifyTransactionStatusRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (!TextUtils.isEmpty(this.atC.asB))
    {
      bool2 = bool1;
      o.b(bool2, "googleTransactionId is required");
      if ((this.atC.status <= 0) || (this.atC.status > 8))
        break label61;
    }
    while (true)
    {
      o.b(bool1, "status is an unrecognized value");
      return this.atC;
      bool2 = false;
      break;
      label61: bool1 = false;
    }
  }

  public final Builder setDetailedReason(String paramString)
  {
    this.atC.atB = paramString;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.atC.asB = paramString;
    return this;
  }

  public final Builder setStatus(int paramInt)
  {
    this.atC.status = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder
 * JD-Core Version:    0.6.2
 */