package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new m();
  final int BR;
  String asB;
  String atB;
  int status;

  NotifyTransactionStatusRequest()
  {
    this.BR = 1;
  }

  NotifyTransactionStatusRequest(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.BR = paramInt1;
    this.asB = paramString1;
    this.status = paramInt2;
    this.atB = paramString2;
  }

  public static NotifyTransactionStatusRequest.Builder newBuilder()
  {
    NotifyTransactionStatusRequest localNotifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
    localNotifyTransactionStatusRequest.getClass();
    return new NotifyTransactionStatusRequest.Builder(localNotifyTransactionStatusRequest, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getDetailedReason()
  {
    return this.atB;
  }

  public final String getGoogleTransactionId()
  {
    return this.asB;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest
 * JD-Core Version:    0.6.2
 */