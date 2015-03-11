package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.internal.hm;

public final class NotifyTransactionStatusRequest$Builder
{
  private NotifyTransactionStatusRequest$Builder(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
  }

  public final NotifyTransactionStatusRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (!TextUtils.isEmpty(this.ajS.aiQ))
    {
      bool2 = bool1;
      hm.b(bool2, "googleTransactionId is required");
      if ((this.ajS.status <= 0) || (this.ajS.status > 8))
        break label61;
    }
    while (true)
    {
      hm.b(bool1, "status is an unrecognized value");
      return this.ajS;
      bool2 = false;
      break;
      label61: bool1 = false;
    }
  }

  public final Builder setDetailedReason(String paramString)
  {
    this.ajS.ajR = paramString;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.ajS.aiQ = paramString;
    return this;
  }

  public final Builder setStatus(int paramInt)
  {
    this.ajS.status = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder
 * JD-Core Version:    0.6.2
 */